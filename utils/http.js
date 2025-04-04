import { baseUrl } from '@/config'

const http = {
	request(options = {}) {
		return new Promise((resolve, reject) => {
			uni.request({
				url: baseUrl + options.url,
				method: options.method || 'GET',
				data: options.data || {},
				header: {
					'content-type': 'application/json',
					...options.header
				},
				success: (res) => {
                    console.log(res)
					if (res.statusCode === 200) {
						if (res.data.success) {
							resolve(res.data)
						} else {
							uni.showToast({
								title: res.data.message || '请求失败',
								icon: 'none'
							})
							reject(res.data)
						}
					} else {
						uni.showToast({
							title: '网络错误',
							icon: 'none'
						})
						reject(res)
					}
				},
				fail: (err) => {
					uni.showToast({
						title: '请求失败',
						icon: 'none'
					})
					reject(err)
				}
			})
		})
	},
	
	get(url, data = {}, options = {}) {
		return this.request({
			url,
			data,
			method: 'GET',
			...options
		})
	},
	
	post(url, data = {}, options = {}) {
		return this.request({
			url,
			data,
			method: 'POST',
			...options
		})
	}
}

export default http