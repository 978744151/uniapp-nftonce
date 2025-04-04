import FloatingTabbar from '@/components/floating-tabbar/index.uvue'


const __sfc__ = defineComponent({
  __name: 'index',
  setup(__props): any | null {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;


return (): any | null => {

  return createElementVNode("view", utsMapOf({ class: "container" }), [
    createElementVNode("view", utsMapOf({ class: "feature-grid" }), [
      createElementVNode("view", utsMapOf({
        class: "feature-item",
        onClick: _ctx.navigateToForum
      }), [
        createElementVNode("text", utsMapOf({ class: "feature-text" }), "盈亏论坛")
      ], 8 /* PROPS */, ["onClick"]),
      createElementVNode("view", utsMapOf({
        class: "feature-item",
        onClick: _ctx.navigateToNFT
      }), [
        createElementVNode("text", utsMapOf({ class: "feature-text" }), "数字藏品")
      ], 8 /* PROPS */, ["onClick"]),
      createElementVNode("view", utsMapOf({
        class: "feature-item",
        onClick: _ctx.navigateToAnnouncement
      }), [
        createElementVNode("text", utsMapOf({ class: "feature-text" }), "公告管理")
      ], 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "section-header" }), [
      createElementVNode("text", utsMapOf({ class: "section-title" }), "最新文章"),
      createElementVNode("text", utsMapOf({
        class: "see-more",
        onClick: _ctx.seeMore
      }), "查看更多", 8 /* PROPS */, ["onClick"])
    ]),
    createVNode(unref(FloatingTabbar), utsMapOf({ "current-tab": 0 }))
  ])
}
}

})
export default __sfc__
const GenPagesHomeIndexStyles = [utsMapOf([["feature-grid", padStyleMapOf(utsMapOf([["gridTemplateColumns", "repeat(3, 1fr)"], ["gap", "20px"], ["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20], ["marginBottom", 20]]))], ["feature-item", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["borderTopLeftRadius", 12], ["borderTopRightRadius", 12], ["borderBottomRightRadius", 12], ["borderBottomLeftRadius", 12], ["boxShadow", "0 2px 8px rgba(0,0,0,0.05)"]]))], ["feature-icon", padStyleMapOf(utsMapOf([["width", 40], ["height", 40], ["marginBottom", 8]]))], ["feature-text", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#333333"]]))], ["section-header", padStyleMapOf(utsMapOf([["display", "flex"], ["justifyContent", "space-between"], ["alignItems", "center"], ["paddingTop", 0], ["paddingRight", 15], ["paddingBottom", 0], ["paddingLeft", 15], ["marginBottom", 15]]))], ["section-title", padStyleMapOf(utsMapOf([["fontSize", 18], ["fontWeight", "bold"], ["color", "#333333"]]))], ["see-more", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#666666"]]))], ["container", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 75], ["paddingLeft", 15], ["backgroundColor", "#F8F8F8"]]))], ["search-bar", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["gap", "10px"], ["marginBottom", 15]]))], ["search-input", padStyleMapOf(utsMapOf([["flex", 1], ["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["backgroundColor", "#F5F5F5"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["paddingTop", 8], ["paddingRight", 12], ["paddingBottom", 8], ["paddingLeft", 12]]))], ["search-icon", padStyleMapOf(utsMapOf([["width", 20], ["height", 20], ["marginRight", 8]]))], ["filter-btn", padStyleMapOf(utsMapOf([["width", 40], ["height", 40], ["backgroundColor", "#F5F5F5"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["display", "flex"], ["alignItems", "center"], ["justifyContent", "center"]]))], ["category-scroll", padStyleMapOf(utsMapOf([["marginBottom", 15]]))], ["category-list", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["gap", "10px"], ["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0]]))], ["category-item", utsMapOf([["", utsMapOf([["paddingTop", 8], ["paddingRight", 16], ["paddingBottom", 8], ["paddingLeft", 16], ["backgroundColor", "#F5F5F5"], ["borderTopLeftRadius", 20], ["borderTopRightRadius", 20], ["borderBottomRightRadius", 20], ["borderBottomLeftRadius", 20], ["fontSize", 14], ["color", "#666666"]])], [".active", utsMapOf([["backgroundColor", "#000000"], ["color", "#FFFFFF"]])]])], ["nft-grid", padStyleMapOf(utsMapOf([["gridTemplateColumns", "repeat(2, 1fr)"], ["gap", "15px"]]))], ["nft-card", padStyleMapOf(utsMapOf([["backgroundColor", "#FFFFFF"], ["borderTopLeftRadius", 12], ["borderTopRightRadius", 12], ["borderBottomRightRadius", 12], ["borderBottomLeftRadius", 12], ["overflow", "hidden"], ["boxShadow", "0 2px 8px rgba(0,0,0,0.1)"]]))], ["nft-image", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 150], ["objectFit", "cover"]]))], ["nft-info", padStyleMapOf(utsMapOf([["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["nft-title", padStyleMapOf(utsMapOf([["fontSize", 14], ["fontWeight", "bold"], ["color", "#333333"], ["marginBottom", 5]]))], ["nft-price", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["gap", "5px"]]))], ["eth-icon", padStyleMapOf(utsMapOf([["width", 16], ["height", 16]]))]])]
