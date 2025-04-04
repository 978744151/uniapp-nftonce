import http from '@/utils/http'

export const userApi = {
	// 用户登录
	login(data) {
		return http.post('/auth/login', data)
	},
	
	// 用户注册
	register(data) {
		return http.post('/user/register', data)
	},
	
	// 获取用户信息
	getUserInfo() {
		return http.get('/user/info')
	}
}