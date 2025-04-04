const __sfc__ = defineComponent({
  __name: 'index',
  props: {
	currentTab: {
		type: Number,
		default: 0
	}
},
  emits: ['switchTab'],
  setup(__props): any | null {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

const props = __props
function emit(event: string, ...do_not_transform_spread: Array<any | null>) {
__ins.emit(event, ...do_not_transform_spread)
}
const switchTab =  (index) => {
			const routes = ['/pages/home/index', '/pages/nft/index', '/pages/blog/index', '/pages/mine/index'];
			uni.navigateTo({
				url: routes[index]
			});
		}


return (): any | null => {

  return createElementVNode("view", utsMapOf({ class: "floating-tab-bar" }), [
    createElementVNode("view", utsMapOf({
      class: normalizeClass(["tab-item", utsMapOf({ active: _ctx.currentTab === 0 })]),
      onClick: () => {switchTab(0)}
    }), [
      createElementVNode("image", utsMapOf({
        class: "tab-icon",
        src: _ctx.currentTab === 0 ? '/static/tabbar/home-active.svg' : '/static/tabbar/home.svg'
      }), null, 8 /* PROPS */, ["src"]),
      createElementVNode("text", utsMapOf({ class: "tab-text" }), "首页")
    ], 10 /* CLASS, PROPS */, ["onClick"]),
    createElementVNode("view", utsMapOf({
      class: normalizeClass(["tab-item", utsMapOf({ active: _ctx.currentTab === 1 })]),
      onClick: () => {switchTab(1)}
    }), [
      createElementVNode("image", utsMapOf({
        class: "tab-icon",
        src: _ctx.currentTab === 1 ? '/static/tabbar/eth-active.svg' : '/static/tabbar/eth.svg'
      }), null, 8 /* PROPS */, ["src"]),
      createElementVNode("text", utsMapOf({ class: "tab-text" }), "藏品")
    ], 10 /* CLASS, PROPS */, ["onClick"]),
    createElementVNode("view", utsMapOf({
      class: normalizeClass(["tab-item", utsMapOf({ active: _ctx.currentTab === 2 })]),
      onClick: () => {switchTab(2)}
    }), [
      createElementVNode("image", utsMapOf({
        class: "tab-icon",
        src: _ctx.currentTab === 2 ? '/static/tabbar/community-active.svg' : '/static/tabbar/community.svg'
      }), null, 8 /* PROPS */, ["src"]),
      createElementVNode("text", utsMapOf({ class: "tab-text" }), "社区")
    ], 10 /* CLASS, PROPS */, ["onClick"]),
    createElementVNode("view", utsMapOf({
      class: normalizeClass(["tab-item", utsMapOf({ active: _ctx.currentTab === 3 })]),
      onClick: () => {switchTab(3)}
    }), [
      createElementVNode("image", utsMapOf({
        class: "tab-icon",
        src: _ctx.currentTab === 3 ? '/static/tabbar/mine-active.svg' : '/static/tabbar/mine.svg'
      }), null, 8 /* PROPS */, ["src"]),
      createElementVNode("text", utsMapOf({ class: "tab-text" }), "我的")
    ], 10 /* CLASS, PROPS */, ["onClick"])
  ])
}
}

})
export default __sfc__
const GenComponentsFloatingTabbarIndexStyles = [utsMapOf([["floating-tab-bar", padStyleMapOf(utsMapOf([["position", "fixed"], ["bottom", 20], ["left", "50%"], ["transform", "translateX(-50%)"], ["width", "90%"], ["height", 60], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"], ["borderTopLeftRadius", 30], ["borderTopRightRadius", 30], ["borderBottomRightRadius", 30], ["borderBottomLeftRadius", 30], ["display", "flex"], ["justifyContent", "space-around"], ["alignItems", "center"], ["boxShadow", "0 4px 16px rgba(0,0,0,0.1)"], ["zIndex", 100], ["flexDirection", "row"]]))], ["tab-item", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["paddingTop", 8], ["paddingRight", 0], ["paddingBottom", 8], ["paddingLeft", 0]]))], ["tab-icon", utsMapOf([["", utsMapOf([["width", 24], ["height", 24], ["marginBottom", 4]])], [".tab-item.active ", utsMapOf([["width", 24], ["height", 24]])]])], ["tab-text", utsMapOf([["", utsMapOf([["fontSize", 12], ["color", "#999999"]])], [".tab-item.active ", utsMapOf([["color", "#2196F3"]])]])]])]
