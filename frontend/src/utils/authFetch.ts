/**
 * 统一的认证 HTTP 客户端
 *
 * 自动为所有请求添加 Authorization header，确保认证一致性
 *
 * @example
 * ```typescript
 * import { authFetch } from '@utils/authFetch';
 *
 * // 简单的 GET 请求
 * const response = await authFetch('/api/data');
 * const data = await response.json();
 *
 * // POST 请求
 * const response = await authFetch('/api/data', {
 *   method: 'POST',
 *   body: JSON.stringify({ key: 'value' }),
 *   headers: { 'Content-Type': 'application/json' }
 * });
 * ```
 */

/**
 * 从 localStorage 获取访问令牌
 * @returns 访问令牌或 null
 */
export const getAccessToken = (): string | null => {
    return localStorage.getItem('accessToken');
};

/**
 * 带认证的 fetch 封装
 *
 * 自动从 localStorage 读取 accessToken 并添加到 Authorization header
 *
 * @param url - 请求 URL
 * @param options - fetch 选项
 * @returns Promise<Response>
 */
export const authFetch = (url: string, options: RequestInit = {}): Promise<Response> => {
    const token = getAccessToken();

    // 合并 headers，确保 Authorization 正确设置
    const headers: HeadersInit = {
        ...options.headers,
    };

    // 只在有 token 时添加 Authorization header
    if (token) {
        (headers as Record<string, string>)['Authorization'] = `Bearer ${token}`;
    }

    return fetch(url, {
        ...options,
        headers,
    });
};

/**
 * 带认证的 JSON API 请求封装
 *
 * 自动设置 Content-Type 为 application/json，并自动解析响应
 *
 * @param url - 请求 URL
 * @param options - fetch 选项
 * @returns Promise<T> - 解析后的 JSON 数据
 * @throws 如果响应不是 2xx 状态码
 */
export const authFetchJson = async <T = any>(
    url: string,
    options: RequestInit = {}
): Promise<T> => {
    const headers: HeadersInit = {
        'Content-Type': 'application/json',
        ...options.headers,
    };

    const response = await authFetch(url, {
        ...options,
        headers,
    });

    if (!response.ok) {
        throw new Error(`HTTP ${response.status}: ${response.statusText}`);
    }

    return response.json();
};

/**
 * 清除访问令牌
 */
export const clearAccessToken = (): void => {
    localStorage.removeItem('accessToken');
    // 触发自定义事件，通知 App.tsx 中的 authLink 缓存失效
    window.dispatchEvent(new CustomEvent('accessTokenChanged', { detail: null }));
};

/**
 * 设置访问令牌
 * @param token - 访问令牌
 */
export const setAccessToken = (token: string): void => {
    localStorage.setItem('accessToken', token);
    // 触发自定义事件，通知 App.tsx 中的 authLink 缓存失效
    window.dispatchEvent(new CustomEvent('accessTokenChanged', { detail: token }));
};
