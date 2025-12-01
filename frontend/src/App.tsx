import '@src/App.less';
import '@src/AppV2.less';

import { ApolloClient, ApolloProvider, InMemoryCache, ServerError, createHttpLink } from '@apollo/client';
import { setContext } from '@apollo/client/link/context';
import { onError } from '@apollo/client/link/error';
import Cookies from 'js-cookie';
import React from 'react';
import { Helmet, HelmetProvider } from 'react-helmet-async';
import { BrowserRouter as Router } from 'react-router-dom';

import { GlobalStyles } from '@components/components/GlobalStyles';

import { Routes } from '@app/Routes';
import { isLoggedInVar } from '@app/auth/checkAuthStatus';
import { ErrorCodes } from '@app/shared/constants';
import { PageRoutes } from '@conf/Global';
import CustomThemeProvider from '@src/CustomThemeProvider';
import { GlobalCfg } from '@src/conf';
import { useCustomTheme } from '@src/customThemeContext';
import possibleTypesResult from '@src/possibleTypes.generated';
import { getRuntimeBasePath, removeRuntimePath, resolveRuntimePath } from '@utils/runtimeBasePath';

/*
    Construct Apollo Client
*/
const httpLink = createHttpLink({
    uri: resolveRuntimePath(import.meta.env.VITE_GRAPHQL_ENDPOINT || '/api/graphql'),
});

const errorLink = onError((error) => {
    const { networkError } = error;
    if (networkError) {
        const serverError = networkError as ServerError;
        if (serverError.statusCode === ErrorCodes.Unauthorized) {
            isLoggedInVar(false);
            Cookies.remove(GlobalCfg.CLIENT_AUTH_COOKIE);
            const currentPath = removeRuntimePath(window.location.pathname) + window.location.search;
            const authUrl = resolveRuntimePath(PageRoutes.LOG_IN);
            window.location.replace(`${authUrl}?redirect_uri=${encodeURIComponent(currentPath)}`);
        }
    }
    // Disabled behavior for now -> Components are expected to handle their errors.
    // if (graphQLErrors && graphQLErrors.length) {
    //     const firstError = graphQLErrors[0];
    //     const { extensions } = firstError;
    //     const errorCode = extensions && (extensions.code as number);
    //     // Fallback in case the calling component does not handle.
    //     message.error(`${firstError.message} (code ${errorCode})`, 3); // TODO: Decide if we want this back.
    // }
});

// 优化：使用闭包缓存 token，避免每次请求都读取 localStorage
let cachedToken: string | null = null;
let tokenCacheTime = 0;
const TOKEN_CACHE_TTL = 5000; // 缓存5秒，降低 localStorage 访问频率

// 监听 token 变化事件，立即更新缓存
window.addEventListener('accessTokenChanged', ((event: CustomEvent) => {
    cachedToken = event.detail;
    tokenCacheTime = Date.now();
}) as EventListener);

const authLink = setContext((_, { headers }) => {
    // 检查缓存是否有效（5秒内重用缓存值）
    const now = Date.now();
    if (!cachedToken || now - tokenCacheTime > TOKEN_CACHE_TTL) {
        cachedToken = localStorage.getItem('accessToken');
        tokenCacheTime = now;
    }

    // Return the headers to the context so httpLink can read them
    return {
        headers: {
            ...headers,
            authorization: cachedToken ? `Bearer ${cachedToken}` : '',
        },
    };
});

const client = new ApolloClient({
    connectToDevTools: true,
    link: errorLink.concat(authLink).concat(httpLink),
    cache: new InMemoryCache({
        typePolicies: {
            Query: {
                fields: {
                    dataset: {
                        merge: (oldObj, newObj) => {
                            return { ...oldObj, ...newObj };
                        },
                    },
                    entity: {
                        merge: (oldObj, newObj) => {
                            return { ...oldObj, ...newObj };
                        },
                    },
                },
            },
        },
        // need to define possibleTypes to allow us to use Apollo cache with union types
        possibleTypes: possibleTypesResult.possibleTypes,
    }),
    credentials: 'include',
    defaultOptions: {
        watchQuery: {
            fetchPolicy: 'cache-first',  // ✅ 优先使用缓存，大幅提升性能
            nextFetchPolicy: 'cache-first',
        },
        query: {
            fetchPolicy: 'cache-first',  // ✅ 优先使用缓存
        },
        mutate: {
            fetchPolicy: 'no-cache',  // Mutation 仍然不缓存（正确）
        },
    },
});

export const InnerApp: React.VFC = () => {
    return (
        <HelmetProvider>
            <CustomThemeProvider>
                <GlobalStyles />

                <Helmet>
                    <title>{useCustomTheme().theme?.content?.title}</title>
                </Helmet>
                <Router basename={getRuntimeBasePath()}>
                    <Routes />
                </Router>
            </CustomThemeProvider>
        </HelmetProvider>
    );
};

export const App: React.VFC = () => {
    return (
        <ApolloProvider client={client}>
            <InnerApp />
        </ApolloProvider>
    );
};
