import { userApi } from '@/api/user'



const __sfc__ = defineComponent({
  __name: 'index',
  setup(__props): any | null {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

const formState = reactive({
	email: '',
	password: ''
})

const handleLogin = async () => {
	try {  
		if (!formState.email || !formState.password) {
			uni.showToast({
				title: '请填写完整信息',
				icon: 'none'
			})
			return
		}
		const res = await userApi.login(formState)
		console.log('登录成功：', res)
		// TODO: 调用登录接口
        uni.showToast({
			title: '登录成功',
			icon: 'success'
		})
		setTimeout(() => {
			router.push('/pages/home/index')
		}, 1000)
		// 登录成功后跳转
	} catch (error) {
		uni.showToast({
			title: '登录失败',
			icon: 'none'
		})
	}
}


return (): any | null => {

  return createElementVNode("view", utsMapOf({ class: "login-container" }), [
    createElementVNode("view", utsMapOf({ class: "login-background" }), [
      createElementVNode("view", utsMapOf({ class: "login-shape" })),
      createElementVNode("view", utsMapOf({ class: "login-shape" }))
    ]),
    createElementVNode("view", utsMapOf({ class: "login-form" }), [
      createElementVNode("view", utsMapOf({ class: "header" }), [
        createElementVNode("text", utsMapOf({ class: "title" }), "NFT-Once")
      ]),
      createElementVNode("view", utsMapOf({ class: "form-item" }), [
        createElementVNode("text", utsMapOf({ class: "label" }), [
          createElementVNode("text", utsMapOf({ class: "required" }), "*"),
          "邮箱"
        ]),
        createElementVNode("input", utsMapOf({
          class: "input",
          type: "text",
          placeholder: "请输入邮箱",
          modelValue: unref(formState).email,
          onInput: ($event: InputEvent) => {(unref(formState).email) = $event.detail.value}
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
      ]),
      createElementVNode("view", utsMapOf({ class: "form-item" }), [
        createElementVNode("text", utsMapOf({ class: "label" }), [
          createElementVNode("text", utsMapOf({ class: "required" }), "*"),
          "密码"
        ]),
        createElementVNode("input", utsMapOf({
          class: "input",
          type: "password",
          placeholder: "请输入密码,不少于6位数",
          modelValue: unref(formState).password,
          onInput: ($event: InputEvent) => {(unref(formState).password) = $event.detail.value}
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
      ]),
      createElementVNode("text", utsMapOf({ class: "auto-register" }), "未注册用户 自动注册"),
      createElementVNode("button", utsMapOf({
        class: "login-btn",
        onClick: handleLogin
      }), "登 录")
    ])
  ])
}
}

})
export default __sfc__
const GenPagesLoginIndexStyles = [utsMapOf([["login-container", padStyleMapOf(utsMapOf([["position", "relative"], ["display", "flex"], ["alignItems", "center"], ["justifyContent", "center"], ["login-background", utsMapOf([["", utsMapOf([["position", "fixed"], ["width", "100%"], ["height", "100%"], ["top", 0], ["left", 0], ["zIndex", -1]])]])], ["login-shape", utsMapOf([["", utsMapOf([["position", "absolute"]])]])], ["header", utsMapOf([["", utsMapOf([["textAlign", "center"], ["marginBottom", "40rpx"], ["marginTop", "40rpx"]])]])], ["title", utsMapOf([["", utsMapOf([["fontSize", "96rpx"], ["fontWeight", "bold"], ["marginBottom", "30rpx"], ["textShadow", "2rpx 2rpx 10rpx rgba(0,0,0,0.1)"]])]])], ["subtitle", utsMapOf([["", utsMapOf([["fontSize", "44rpx"], ["color", "#666666"], ["textShadow", "1rpx 1rpx 5rpx rgba(0,0,0,0.05)"]])]])], ["login-form", utsMapOf([["", utsMapOf([["backgroundImage", "none"], ["backgroundColor", "rgba(255,255,255,0.9)"], ["backdropFilter", "blur(10rpx)"], ["borderTopLeftRadius", "32rpx"], ["borderTopRightRadius", "32rpx"], ["borderBottomRightRadius", "32rpx"], ["borderBottomLeftRadius", "32rpx"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"], ["marginTop", 0], ["marginRight", "auto"], ["marginBottom", 0], ["marginLeft", "auto"], ["width", "90%"], ["boxShadow", "0 8rpx 32rpx rgba(0,0,0,0.1)"]])]])], ["form-item", utsMapOf([["", utsMapOf([["marginBottom", "60rpx"]])]])], ["label", utsMapOf([["", utsMapOf([["fontSize", "32rpx"], ["color", "#333333"], ["marginBottom", "24rpx"]])]])], ["required", utsMapOf([["", utsMapOf([["color", "#ff4d4f"], ["marginRight", "8rpx"], ["fontSize", "32rpx"]])]])], ["input", utsMapOf([["", utsMapOf([["width", "100%"], ["height", "90rpx"], ["borderTopWidth", "2rpx"], ["borderRightWidth", "2rpx"], ["borderBottomWidth", "2rpx"], ["borderLeftWidth", "2rpx"], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "rgba(0,0,0,0.1)"], ["borderRightColor", "rgba(0,0,0,0.1)"], ["borderBottomColor", "rgba(0,0,0,0.1)"], ["borderLeftColor", "rgba(0,0,0,0.1)"], ["borderTopLeftRadius", "16rpx"], ["borderTopRightRadius", "16rpx"], ["borderBottomRightRadius", "16rpx"], ["borderBottomLeftRadius", "16rpx"], ["paddingTop", 0], ["paddingRight", "30rpx"], ["paddingBottom", 0], ["paddingLeft", "30rpx"], ["fontSize", "28rpx"], ["backgroundImage", "none"], ["backgroundColor", "rgba(255,255,255,0.8)"], ["transitionDuration", "0.3s"], ["transitionTimingFunction", "ease"], ["borderTopColor:focus", "#2196F3"], ["borderRightColor:focus", "#2196F3"], ["borderBottomColor:focus", "#2196F3"], ["borderLeftColor:focus", "#2196F3"], ["backgroundImage:focus", "none"], ["backgroundColor:focus", "#ffffff"]])]])], ["auto-register", utsMapOf([["", utsMapOf([["fontSize", "28rpx"], ["color", "#666666"], ["marginTop", "40rpx"], ["marginRight", 0], ["marginBottom", "60rpx"], ["marginLeft", 0], ["textAlign", "center"]])]])], ["login-btn", utsMapOf([["", utsMapOf([["width", "100%"], ["height", "90rpx"], ["backgroundImage", "linear-gradient(90deg, #2196F3 0%, #00BCD4 100%)"], ["backgroundColor", "rgba(0,0,0,0)"], ["borderTopLeftRadius", "45rpx"], ["borderTopRightRadius", "45rpx"], ["borderBottomRightRadius", "45rpx"], ["borderBottomLeftRadius", "45rpx"], ["color", "#ffffff"], ["fontSize", "32rpx"], ["borderTopWidth", "medium"], ["borderRightWidth", "medium"], ["borderBottomWidth", "medium"], ["borderLeftWidth", "medium"], ["borderTopStyle", "none"], ["borderRightStyle", "none"], ["borderBottomStyle", "none"], ["borderLeftStyle", "none"], ["borderTopColor", "#000000"], ["borderRightColor", "#000000"], ["borderBottomColor", "#000000"], ["borderLeftColor", "#000000"], ["boxShadow", "0 4rpx 16rpx rgba(33,150,243,0.3)"], ["transitionDuration", "0.3s"], ["transitionTimingFunction", "ease"], ["transform:active", "scale(0.98)"], ["boxShadow:active", "0 2rpx 8rpx rgba(33,150,243,0.2)"]])]])]]))], ["@TRANSITION", utsMapOf([["input", utsMapOf([["duration", "0.3s"], ["timingFunction", "ease"]])], ["login-btn", utsMapOf([["duration", "0.3s"], ["timingFunction", "ease"]])]])]])]
