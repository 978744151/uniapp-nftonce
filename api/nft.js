import http from '@/utils/http'

export const nftApi = {
	// 获取NFT列表
	getNFTList(params) {
		return http.get('/nft/list', params)
	},
	
	// 获取NFT详情
	getNFTDetail(id) {
		return http.get(`/nft/detail/${id}`)
	},
	
	// 创建NFT
	createNFT(data) {
		return http.post('/nft/create', data)
	}
}