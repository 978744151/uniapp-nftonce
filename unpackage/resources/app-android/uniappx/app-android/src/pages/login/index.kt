@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER", "NAME_SHADOWING")
package uni.UNI77FDAAC
import io.dcloud.uniapp.*
import io.dcloud.uniapp.extapi.*
import io.dcloud.uniapp.framework.*
import io.dcloud.uniapp.runtime.*
import io.dcloud.uniapp.vue.*
import io.dcloud.uniapp.vue.shared.*
import io.dcloud.uts.*
import io.dcloud.uts.Map
import io.dcloud.uts.Set
import io.dcloud.uts.UTSAndroid
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
open class GenPagesLoginIndex : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLoginIndex) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesLoginIndex
            val _cache = __ins.renderCache
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "login-container"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "login-background"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "login-shape")),
                        createElementVNode("view", utsMapOf("class" to "login-shape"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "login-form"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "header"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "title"), "NFT-Once")
                        )),
                        createElementVNode("view", utsMapOf("class" to "form-item"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "label"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "required"), "*"),
                                "邮箱"
                            )),
                            createElementVNode("input", utsMapOf("class" to "input", "type" to "text", "placeholder" to "请输入邮箱", "modelValue" to _ctx.formState.email, "onInput" to fun(`$event`: InputEvent){
                                _ctx.formState.email = `$event`.detail.value
                            }
                            ), null, 40, utsArrayOf(
                                "modelValue",
                                "onInput"
                            ))
                        )),
                        createElementVNode("view", utsMapOf("class" to "form-item"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "label"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "required"), "*"),
                                "密码"
                            )),
                            createElementVNode("input", utsMapOf("class" to "input", "type" to "password", "placeholder" to "请输入密码,不少于6位数", "modelValue" to _ctx.formState.password, "onInput" to fun(`$event`: InputEvent){
                                _ctx.formState.password = `$event`.detail.value
                            }
                            ), null, 40, utsArrayOf(
                                "modelValue",
                                "onInput"
                            ))
                        )),
                        createElementVNode("text", utsMapOf("class" to "auto-register"), "未注册用户 自动注册"),
                        createElementVNode("button", utsMapOf("class" to "login-btn", "onClick" to _ctx.handleLogin), "登 录", 8, utsArrayOf(
                            "onClick"
                        ))
                    ))
                ))
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ), utsArrayOf(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("login-container" to padStyleMapOf(utsMapOf("position" to "relative", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "login-background" to utsMapOf("" to utsMapOf("position" to "fixed", "width" to "100%", "height" to "100%", "top" to 0, "left" to 0, "zIndex" to -1)), "login-shape" to utsMapOf("" to utsMapOf("position" to "absolute")), "header" to utsMapOf("" to utsMapOf("textAlign" to "center", "marginBottom" to "40rpx", "marginTop" to "40rpx")), "title" to utsMapOf("" to utsMapOf("fontSize" to "96rpx", "fontWeight" to "bold", "marginBottom" to "30rpx", "textShadow" to "2rpx 2rpx 10rpx rgba(0,0,0,0.1)")), "subtitle" to utsMapOf("" to utsMapOf("fontSize" to "44rpx", "color" to "#666666", "textShadow" to "1rpx 1rpx 5rpx rgba(0,0,0,0.05)")), "login-form" to utsMapOf("" to utsMapOf("backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.9)", "backdropFilter" to "blur(10rpx)", "borderTopLeftRadius" to "32rpx", "borderTopRightRadius" to "32rpx", "borderBottomRightRadius" to "32rpx", "borderBottomLeftRadius" to "32rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx", "marginTop" to 0, "marginRight" to "auto", "marginBottom" to 0, "marginLeft" to "auto", "width" to "90%", "boxShadow" to "0 8rpx 32rpx rgba(0,0,0,0.1)")), "form-item" to utsMapOf("" to utsMapOf("marginBottom" to "60rpx")), "label" to utsMapOf("" to utsMapOf("fontSize" to "32rpx", "color" to "#333333", "marginBottom" to "24rpx")), "required" to utsMapOf("" to utsMapOf("color" to "#ff4d4f", "marginRight" to "8rpx", "fontSize" to "32rpx")), "input" to utsMapOf("" to utsMapOf("width" to "100%", "height" to "90rpx", "borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "rgba(0,0,0,0.1)", "borderRightColor" to "rgba(0,0,0,0.1)", "borderBottomColor" to "rgba(0,0,0,0.1)", "borderLeftColor" to "rgba(0,0,0,0.1)", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx", "paddingTop" to 0, "paddingRight" to "30rpx", "paddingBottom" to 0, "paddingLeft" to "30rpx", "fontSize" to "28rpx", "backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.8)", "transitionDuration" to "0.3s", "transitionTimingFunction" to "ease", "borderTopColor:focus" to "#2196F3", "borderRightColor:focus" to "#2196F3", "borderBottomColor:focus" to "#2196F3", "borderLeftColor:focus" to "#2196F3", "backgroundImage:focus" to "none", "backgroundColor:focus" to "#ffffff")), "auto-register" to utsMapOf("" to utsMapOf("fontSize" to "28rpx", "color" to "#666666", "marginTop" to "40rpx", "marginRight" to 0, "marginBottom" to "60rpx", "marginLeft" to 0, "textAlign" to "center")), "login-btn" to utsMapOf("" to utsMapOf("width" to "100%", "height" to "90rpx", "backgroundImage" to "linear-gradient(90deg, #2196F3 0%, #00BCD4 100%)", "backgroundColor" to "rgba(0,0,0,0)", "borderTopLeftRadius" to "45rpx", "borderTopRightRadius" to "45rpx", "borderBottomRightRadius" to "45rpx", "borderBottomLeftRadius" to "45rpx", "color" to "#ffffff", "fontSize" to "32rpx", "borderTopWidth" to "medium", "borderRightWidth" to "medium", "borderBottomWidth" to "medium", "borderLeftWidth" to "medium", "borderTopStyle" to "none", "borderRightStyle" to "none", "borderBottomStyle" to "none", "borderLeftStyle" to "none", "borderTopColor" to "#000000", "borderRightColor" to "#000000", "borderBottomColor" to "#000000", "borderLeftColor" to "#000000", "boxShadow" to "0 4rpx 16rpx rgba(33,150,243,0.3)", "transitionDuration" to "0.3s", "transitionTimingFunction" to "ease", "transform:active" to "scale(0.98)", "boxShadow:active" to "0 2rpx 8rpx rgba(33,150,243,0.2)")))), "@TRANSITION" to utsMapOf("input" to utsMapOf("duration" to "0.3s", "timingFunction" to "ease"), "login-btn" to utsMapOf("duration" to "0.3s", "timingFunction" to "ease")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = utsMapOf()
        var emits: Map<String, Any?> = utsMapOf()
        var props = normalizePropsOptions(utsMapOf())
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf()
        var components: Map<String, CreateVueComponent> = utsMapOf()
    }
}
