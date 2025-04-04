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
open class GenPagesNftIndex : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_floating_tabbar = resolveComponent("floating-tabbar")
        return createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "search-bar"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "search-input"), utsArrayOf(
                    createElementVNode("image", utsMapOf("class" to "search-icon", "src" to "/static/search.svg")),
                    createElementVNode("input", utsMapOf("type" to "text", "placeholder" to "搜索NFT", "modelValue" to _ctx.searchText, "onInput" to fun(`$event`: InputEvent){
                        _ctx.searchText = `$event`.detail.value
                    }
                    ), null, 40, utsArrayOf(
                        "modelValue",
                        "onInput"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "filter-btn"), utsArrayOf(
                    createElementVNode("image", utsMapOf("src" to "/static/filter.svg"))
                ))
            )),
            createElementVNode("scroll-view", utsMapOf("class" to "category-scroll", "scroll-x" to "true", "show-scrollbar" to "false"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "category-list"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.categories, fun(item, index, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("key" to index, "class" to normalizeClass(utsArrayOf(
                            "category-item",
                            if (_ctx.selectedCategory === index) {
                                "active"
                            } else {
                                ""
                            }
                        )), "onClick" to fun(){
                            _ctx.selectCategory(index)
                        }
                        ), toDisplayString(item), 11, utsArrayOf(
                            "onClick"
                        ))
                    }
                    ), 128)
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "nft-grid"), utsArrayOf(
                createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.nftList, fun(item, index, __index, _cached): Any {
                    return createElementVNode("view", utsMapOf("key" to index, "class" to "nft-card"), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "nft-image", "src" to item.image), null, 8, utsArrayOf(
                            "src"
                        )),
                        createElementVNode("view", utsMapOf("class" to "nft-info"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "nft-title"), toDisplayString(item.title), 1),
                            createElementVNode("view", utsMapOf("class" to "nft-price"), utsArrayOf(
                                createElementVNode("image", utsMapOf("class" to "eth-icon", "src" to "/static/eth.svg")),
                                createElementVNode("text", null, toDisplayString(item.price), 1)
                            ))
                        ))
                    ))
                }
                ), 128)
            )),
            createVNode(_component_floating_tabbar, utsMapOf("current-tab" to 1))
        ))
    }
    open var searchText: String by `$data`
    open var selectedCategory: Number by `$data`
    open var categories: UTSArray<String> by `$data`
    open var nftList: UTSArray<UTSJSONObject> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("searchText" to "", "selectedCategory" to 0, "categories" to utsArrayOf(
            "全部",
            "艺术",
            "收藏品",
            "音乐",
            "体育",
            "游戏",
            "摄影"
        ), "nftList" to utsArrayOf(
            object : UTSJSONObject() {
                var image = "/static/nft1.png"
                var title = "Bored Ape #1234"
                var price = "2.5"
            },
            object : UTSJSONObject() {
                var image = "/static/nft2.png"
                var title = "CryptoPunk #5678"
                var price = "3.2"
            },
            object : UTSJSONObject() {
                var image = "/static/nft3.png"
                var title = "Doodle #9012"
                var price = "1.8"
            },
            object : UTSJSONObject() {
                var image = "/static/nft4.png"
                var title = "Azuki #3456"
                var price = "4.1"
            }
        ))
    }
    override fun `$initMethods`() {
        this.selectCategory = fun(index) {
            this.selectedCategory = index
        }
    }
    open lateinit var selectCategory: (index) -> Unit
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ), utsArrayOf(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("container" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "search-bar" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "gap" to "10px", "marginBottom" to 15)), "search-input" to padStyleMapOf(utsMapOf("flex" to 1, "display" to "flex", "flexDirection" to "row", "alignItems" to "center", "backgroundColor" to "#F5F5F5", "borderTopLeftRadius" to 8, "borderTopRightRadius" to 8, "borderBottomRightRadius" to 8, "borderBottomLeftRadius" to 8, "paddingTop" to 8, "paddingRight" to 12, "paddingBottom" to 8, "paddingLeft" to 12)), "search-icon" to padStyleMapOf(utsMapOf("width" to 20, "height" to 20, "marginRight" to 8)), "filter-btn" to padStyleMapOf(utsMapOf("width" to 40, "height" to 40, "backgroundColor" to "#F5F5F5", "borderTopLeftRadius" to 8, "borderTopRightRadius" to 8, "borderBottomRightRadius" to 8, "borderBottomLeftRadius" to 8, "display" to "flex", "alignItems" to "center", "justifyContent" to "center")), "category-scroll" to padStyleMapOf(utsMapOf("marginBottom" to 15)), "category-list" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "gap" to "10px", "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0)), "category-item" to utsMapOf("" to utsMapOf("paddingTop" to 8, "paddingRight" to 16, "paddingBottom" to 8, "paddingLeft" to 16, "backgroundColor" to "#F5F5F5", "borderTopLeftRadius" to 20, "borderTopRightRadius" to 20, "borderBottomRightRadius" to 20, "borderBottomLeftRadius" to 20, "fontSize" to 14, "color" to "#666666"), ".active" to utsMapOf("backgroundColor" to "#000000", "color" to "#FFFFFF")), "nft-grid" to padStyleMapOf(utsMapOf("gridTemplateColumns" to "repeat(2, 1fr)", "gap" to "15px")), "nft-card" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFFFF", "borderTopLeftRadius" to 12, "borderTopRightRadius" to 12, "borderBottomRightRadius" to 12, "borderBottomLeftRadius" to 12, "overflow" to "hidden", "boxShadow" to "0 2px 8px rgba(0,0,0,0.1)")), "nft-image" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 150, "objectFit" to "cover")), "nft-info" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "nft-title" to padStyleMapOf(utsMapOf("fontSize" to 14, "fontWeight" to "bold", "color" to "#333333", "marginBottom" to 5)), "nft-price" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "gap" to "5px")), "eth-icon" to padStyleMapOf(utsMapOf("width" to 16, "height" to 16)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = utsMapOf()
        var emits: Map<String, Any?> = utsMapOf()
        var props = normalizePropsOptions(utsMapOf())
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf()
        var components: Map<String, CreateVueComponent> = utsMapOf("FloatingTabbar" to GenComponentsFloatingTabbarIndexClass)
    }
}
