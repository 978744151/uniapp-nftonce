
import FloatingTabbar from '@/components/floating-tabbar/index.uvue'

const __sfc__ = defineComponent({
	components: {
		FloatingTabbar
	},
	data() {
		return {
			searchText: '',
			selectedCategory: 0,
			categories: ['全部', '艺术', '收藏品', '音乐', '体育', '游戏', '摄影'],
			nftList: [
				{
					image: '/static/nft1.png',
					title: 'Bored Ape #1234',
					price: '2.5'
				},
				{
					image: '/static/nft2.png',
					title: 'CryptoPunk #5678',
					price: '3.2'
				},
				{
					image: '/static/nft3.png',
					title: 'Doodle #9012',
					price: '1.8'
				},
				{
					image: '/static/nft4.png',
					title: 'Azuki #3456',
					price: '4.1'
				}
			]
		}
	},
	methods: {
		selectCategory(index) {
			this.selectedCategory = index
		}
	}
})

export default __sfc__
function GenPagesNftIndexRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_floating_tabbar = resolveComponent("floating-tabbar")

  return createElementVNode("view", utsMapOf({ class: "container" }), [
    createElementVNode("view", utsMapOf({ class: "search-bar" }), [
      createElementVNode("view", utsMapOf({ class: "search-input" }), [
        createElementVNode("image", utsMapOf({
          class: "search-icon",
          src: "/static/search.svg"
        })),
        createElementVNode("input", utsMapOf({
          type: "text",
          placeholder: "搜索NFT",
          modelValue: _ctx.searchText,
          onInput: ($event: InputEvent) => {(_ctx.searchText) = $event.detail.value}
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
      ]),
      createElementVNode("view", utsMapOf({ class: "filter-btn" }), [
        createElementVNode("image", utsMapOf({ src: "/static/filter.svg" }))
      ])
    ]),
    createElementVNode("scroll-view", utsMapOf({
      class: "category-scroll",
      "scroll-x": "true",
      "show-scrollbar": "false"
    }), [
      createElementVNode("view", utsMapOf({ class: "category-list" }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.categories, (item, index, __index, _cached): any => {
          return createElementVNode("view", utsMapOf({
            key: index,
            class: normalizeClass(['category-item', _ctx.selectedCategory === index ? 'active' : '']),
            onClick: () => {_ctx.selectCategory(index)}
          }), toDisplayString(item), 11 /* TEXT, CLASS, PROPS */, ["onClick"])
        }), 128 /* KEYED_FRAGMENT */)
      ])
    ]),
    createElementVNode("view", utsMapOf({ class: "nft-grid" }), [
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.nftList, (item, index, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({
          key: index,
          class: "nft-card"
        }), [
          createElementVNode("view", utsMapOf({ class: "nft-info" }), [
            createElementVNode("text", utsMapOf({ class: "nft-title" }), toDisplayString(item.title), 1 /* TEXT */),
            createElementVNode("view", utsMapOf({ class: "nft-price" }), [
              createElementVNode("image", utsMapOf({
                class: "eth-icon",
                src: "/static/eth.svg"
              })),
              createElementVNode("text", null, toDisplayString(item.price), 1 /* TEXT */)
            ])
          ])
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ]),
    createVNode(_component_floating_tabbar, utsMapOf({ "current-tab": 1 }))
  ])
}
const GenPagesNftIndexStyles = [utsMapOf([["container", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["search-bar", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["gap", "10px"], ["marginBottom", 15]]))], ["search-input", padStyleMapOf(utsMapOf([["flex", 1], ["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["backgroundColor", "#F5F5F5"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["paddingTop", 8], ["paddingRight", 12], ["paddingBottom", 8], ["paddingLeft", 12]]))], ["search-icon", padStyleMapOf(utsMapOf([["width", 20], ["height", 20], ["marginRight", 8]]))], ["filter-btn", padStyleMapOf(utsMapOf([["width", 40], ["height", 40], ["backgroundColor", "#F5F5F5"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["display", "flex"], ["alignItems", "center"], ["justifyContent", "center"]]))], ["category-scroll", padStyleMapOf(utsMapOf([["marginBottom", 15]]))], ["category-list", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["gap", "10px"], ["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0]]))], ["category-item", utsMapOf([["", utsMapOf([["paddingTop", 8], ["paddingRight", 16], ["paddingBottom", 8], ["paddingLeft", 16], ["backgroundColor", "#F5F5F5"], ["borderTopLeftRadius", 20], ["borderTopRightRadius", 20], ["borderBottomRightRadius", 20], ["borderBottomLeftRadius", 20], ["fontSize", 14], ["color", "#666666"]])], [".active", utsMapOf([["backgroundColor", "#000000"], ["color", "#FFFFFF"]])]])], ["nft-grid", padStyleMapOf(utsMapOf([["gridTemplateColumns", "repeat(2, 1fr)"], ["gap", "15px"]]))], ["nft-card", padStyleMapOf(utsMapOf([["backgroundColor", "#FFFFFF"], ["borderTopLeftRadius", 12], ["borderTopRightRadius", 12], ["borderBottomRightRadius", 12], ["borderBottomLeftRadius", 12], ["overflow", "hidden"], ["boxShadow", "0 2px 8px rgba(0,0,0,0.1)"]]))], ["nft-image", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 150], ["objectFit", "cover"]]))], ["nft-info", padStyleMapOf(utsMapOf([["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["nft-title", padStyleMapOf(utsMapOf([["fontSize", 14], ["fontWeight", "bold"], ["color", "#333333"], ["marginBottom", 5]]))], ["nft-price", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["gap", "5px"]]))], ["eth-icon", padStyleMapOf(utsMapOf([["width", 16], ["height", 16]]))]])]
