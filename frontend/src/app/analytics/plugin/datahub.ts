import analyticsConfig from '@conf/analytics';
import { authFetch } from '@utils/authFetch';
import { resolveRuntimePath } from '@utils/runtimeBasePath';

const { datahub } = analyticsConfig;
const isEnabled: boolean = (datahub && datahub.enabled) || false;

const track = (payload) => {
    // 使用 authFetch 自动添加 Authorization header
    authFetch(resolveRuntimePath('/openapi/v1/tracking/track'), {
        method: 'POST',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json',
        },
        referrerPolicy: 'no-referrer',
        body: JSON.stringify(payload),
    }).catch((error) => {
        // 静默处理 tracking 错误，避免影响用户体验
        console.debug('Analytics tracking failed:', error);
    });
};

const datahubPlugin = () => {
    return {
        /* All plugins require a name */
        name: 'datahub',
        initialize: () => {},
        identify: () => {},
        loaded: () => {
            return true;
        },
        page: ({ payload }) => {
            track(payload.properties);
        },
        track: ({ payload }) => {
            track(payload.properties);
        },
    };
};

export default {
    isEnabled,
    plugin: isEnabled && datahubPlugin(),
};
