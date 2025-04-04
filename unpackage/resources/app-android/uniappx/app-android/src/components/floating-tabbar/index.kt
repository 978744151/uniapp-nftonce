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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
open class GenComponentsFloatingTabbarIndex : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var currentTab: Number by `$props`
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenComponentsFloatingTabbarIndex) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenComponentsFloatingTabbarIndex
            val _cache = __ins.renderCache
            val switchTab = fun(index){
                val routes = utsArrayOf(
                    "/pages/home/index",
                    "/pages/nft/index",
                    "/pages/blog/index",
                    "/pages/mine/index"
                )
                uni_navigateTo(NavigateToOptions(url = routes[index]))
            }
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "floating-tab-bar"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                        "tab-item",
                        utsMapOf("active" to (_ctx.currentTab === 0))
                    )), "onClick" to fun(){
                        switchTab(0)
                    }
                    ), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "tab-icon", "src" to if (_ctx.currentTab === 0) {
                            "/static/tabbar/home-active.svg"
                        } else {
                            "/static/tabbar/home.svg"
                        }
                        ), null, 8, utsArrayOf(
                            "src"
                        )),
                        createElementVNode("text", utsMapOf("class" to "tab-text"), "首页")
                    ), 10, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                        "tab-item",
                        utsMapOf("active" to (_ctx.currentTab === 1))
                    )), "onClick" to fun(){
                        switchTab(1)
                    }
                    ), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "tab-icon", "src" to if (_ctx.currentTab === 1) {
                            "/static/tabbar/eth-active.svg"
                        } else {
                            "/static/tabbar/eth.svg"
                        }
                        ), null, 8, utsArrayOf(
                            "src"
                        )),
                        createElementVNode("text", utsMapOf("class" to "tab-text"), "藏品")
                    ), 10, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                        "tab-item",
                        utsMapOf("active" to (_ctx.currentTab === 2))
                    )), "onClick" to fun(){
                        switchTab(2)
                    }
                    ), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "tab-icon", "src" to if (_ctx.currentTab === 2) {
                            "/static/tabbar/community-active.svg"
                        } else {
                            "/static/tabbar/community.svg"
                        }
                        ), null, 8, utsArrayOf(
                            "src"
                        )),
                        createElementVNode("text", utsMapOf("class" to "tab-text"), "社区")
                    ), 10, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                        "tab-item",
                        utsMapOf("active" to (_ctx.currentTab === 3))
                    )), "onClick" to fun(){
                        switchTab(3)
                    }
                    ), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "tab-icon", "src" to if (_ctx.currentTab === 3) {
                            "/static/tabbar/mine-active.svg"
                        } else {
                            "/static/tabbar/mine.svg"
                        }
                        ), null, 8, utsArrayOf(
                            "src"
                        )),
                        createElementVNode("text", utsMapOf("class" to "tab-text"), "我的")
                    ), 10, utsArrayOf(
                        "onClick"
                    ))
                ))
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("floating-tab-bar" to padStyleMapOf(utsMapOf("position" to "fixed", "bottom" to 20, "left" to "50%", "transform" to "translateX(-50%)", "width" to "90%", "height" to 60, "backgroundImage" to "none", "backgroundColor" to "#FFFFFF", "borderTopLeftRadius" to 30, "borderTopRightRadius" to 30, "borderBottomRightRadius" to 30, "borderBottomLeftRadius" to 30, "display" to "flex", "justifyContent" to "space-around", "alignItems" to "center", "boxShadow" to "0 4px 16px rgba(0,0,0,0.1)", "zIndex" to 100, "flexDirection" to "row")), "tab-item" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "column", "alignItems" to "center", "paddingTop" to 8, "paddingRight" to 0, "paddingBottom" to 8, "paddingLeft" to 0)), "tab-icon" to utsMapOf("" to utsMapOf("width" to 24, "height" to 24, "marginBottom" to 4), ".tab-item.active " to utsMapOf("width" to 24, "height" to 24)), "tab-text" to utsMapOf("" to utsMapOf("fontSize" to 12, "color" to "#999999"), ".tab-item.active " to utsMapOf("color" to "#2196F3")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = utsMapOf()
        var emits: Map<String, Any?> = utsMapOf("switchTab" to null)
        var props = normalizePropsOptions(utsMapOf("currentTab" to utsMapOf("type" to "Number", "default" to 0)))
        var propsNeedCastKeys = utsArrayOf(
            "currentTab"
        )
        var components: Map<String, CreateVueComponent> = utsMapOf()
    }
}
