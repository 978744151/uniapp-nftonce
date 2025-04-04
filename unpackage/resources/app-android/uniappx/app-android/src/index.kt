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
import io.dcloud.uniapp.extapi.exit as uni_exit
import io.dcloud.uniapp.extapi.showToast as uni_showToast
val runBlock1 = run {
    __uniConfig.getAppStyles = fun(): Map<String, Map<String, Map<String, Any>>> {
        return GenApp.styles
    }
}
var firstBackTime: Number = 0
open class GenApp : BaseApp {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLaunch(fun(_: OnLaunchOptions) {
            console.log("App Launch")
        }
        , __ins)
        onAppShow(fun(_: OnShowOptions) {
            console.log("App Show")
        }
        , __ins)
        onAppHide(fun() {
            console.log("App Hide")
        }
        , __ins)
        onLastPageBackPress(fun() {
            console.log("App LastPageBackPress")
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"))
                firstBackTime = Date.now()
                setTimeout(fun(){
                    firstBackTime = 0
                }, 2000)
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now()
                uni_exit(null)
            }
        }
        , __ins)
        onExit(fun() {
            console.log("App Exit")
        }
        , __ins)
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-column" to padStyleMapOf(utsMapOf("flexDirection" to "column")))
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "app", name = "", inheritAttrs = true, inject = Map(), props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles)
}
, fun(instance): GenApp {
    return GenApp(instance)
}
)
val GenComponentsFloatingTabbarIndexClass = CreateVueComponent(GenComponentsFloatingTabbarIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsFloatingTabbarIndex.inheritAttrs, inject = GenComponentsFloatingTabbarIndex.inject, props = GenComponentsFloatingTabbarIndex.props, propsNeedCastKeys = GenComponentsFloatingTabbarIndex.propsNeedCastKeys, emits = GenComponentsFloatingTabbarIndex.emits, components = GenComponentsFloatingTabbarIndex.components, styles = GenComponentsFloatingTabbarIndex.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenComponentsFloatingTabbarIndex.setup(props as GenComponentsFloatingTabbarIndex)
    }
    )
}
, fun(instance): GenComponentsFloatingTabbarIndex {
    return GenComponentsFloatingTabbarIndex(instance)
}
)
val GenPagesHomeIndexClass = CreateVueComponent(GenPagesHomeIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesHomeIndex.inheritAttrs, inject = GenPagesHomeIndex.inject, props = GenPagesHomeIndex.props, propsNeedCastKeys = GenPagesHomeIndex.propsNeedCastKeys, emits = GenPagesHomeIndex.emits, components = GenPagesHomeIndex.components, styles = GenPagesHomeIndex.styles)
}
, fun(instance): GenPagesHomeIndex {
    return GenPagesHomeIndex(instance)
}
)
val GenPagesLoginIndexClass = CreateVueComponent(GenPagesLoginIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesLoginIndex.inheritAttrs, inject = GenPagesLoginIndex.inject, props = GenPagesLoginIndex.props, propsNeedCastKeys = GenPagesLoginIndex.propsNeedCastKeys, emits = GenPagesLoginIndex.emits, components = GenPagesLoginIndex.components, styles = GenPagesLoginIndex.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesLoginIndex.setup(props as GenPagesLoginIndex)
    }
    )
}
, fun(instance): GenPagesLoginIndex {
    return GenPagesLoginIndex(instance)
}
)
val GenPagesMineIndexClass = CreateVueComponent(GenPagesMineIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesMineIndex.inheritAttrs, inject = GenPagesMineIndex.inject, props = GenPagesMineIndex.props, propsNeedCastKeys = GenPagesMineIndex.propsNeedCastKeys, emits = GenPagesMineIndex.emits, components = GenPagesMineIndex.components, styles = GenPagesMineIndex.styles)
}
, fun(instance): GenPagesMineIndex {
    return GenPagesMineIndex(instance)
}
)
val GenPagesBlogIndexClass = CreateVueComponent(GenPagesBlogIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesBlogIndex.inheritAttrs, inject = GenPagesBlogIndex.inject, props = GenPagesBlogIndex.props, propsNeedCastKeys = GenPagesBlogIndex.propsNeedCastKeys, emits = GenPagesBlogIndex.emits, components = GenPagesBlogIndex.components, styles = GenPagesBlogIndex.styles)
}
, fun(instance): GenPagesBlogIndex {
    return GenPagesBlogIndex(instance)
}
)
val GenPagesNftIndexClass = CreateVueComponent(GenPagesNftIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesNftIndex.inheritAttrs, inject = GenPagesNftIndex.inject, props = GenPagesNftIndex.props, propsNeedCastKeys = GenPagesNftIndex.propsNeedCastKeys, emits = GenPagesNftIndex.emits, components = GenPagesNftIndex.components, styles = GenPagesNftIndex.styles)
}
, fun(instance): GenPagesNftIndex {
    return GenPagesNftIndex(instance)
}
)
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass)
    return UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "app",
            app
        )
    )))
}
fun main(app: IApp) {
    definePageRoutes()
    defineAppConfig()
    (createApp()["app"] as VueApp).mount(app, GenUniApp())
}
open class UniAppConfig : io.dcloud.uniapp.appframe.AppConfig {
    override var name: String = "NFT.ONCE"
    override var appid: String = "__UNI__77FDAAC"
    override var versionName: String = "1.0.0"
    override var versionCode: String = "100"
    override var uniCompilerVersion: String = "4.57"
    constructor() : super() {}
}
fun definePageRoutes() {
    __uniRoutes.push(UniPageRoute(path = "pages/home/index", component = GenPagesHomeIndexClass, meta = UniPageMeta(isQuit = true), style = utsMapOf("navigationBarTitleText" to "首页", "navigationStyle" to "custom")))
    __uniRoutes.push(UniPageRoute(path = "pages/login/index", component = GenPagesLoginIndexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "", "navigationStyle" to "custom")))
    __uniRoutes.push(UniPageRoute(path = "pages/mine/index", component = GenPagesMineIndexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "我的", "navigationStyle" to "custom")))
    __uniRoutes.push(UniPageRoute(path = "pages/blog/index", component = GenPagesBlogIndexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "博客", "navigationStyle" to "custom")))
    __uniRoutes.push(UniPageRoute(path = "pages/nft/index", component = GenPagesNftIndexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "NFT", "navigationStyle" to "custom")))
}
val __uniTabBar: Map<String, Any?>? = utsMapOf("color" to "#999999", "selectedColor" to "#333333", "backgroundColor" to "#FFFFFF", "borderStyle" to "black")
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/home/index", "style" to utsMapOf("navigationBarTitleText" to "首页", "navigationStyle" to "custom"))
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/home/index"
    __uniConfig.globalStyle = utsMapOf("navigationBarTextStyle" to "black", "navigationBarTitleText" to "uni-app x", "navigationBarBackgroundColor" to "#F8F8F8", "backgroundColor" to "#F8F8F8")
    __uniConfig.getTabBarConfig = fun(): Map<String, Any>? {
        return utsMapOf("color" to "#999999", "selectedColor" to "#333333", "backgroundColor" to "#FFFFFF", "borderStyle" to "black")
    }
    __uniConfig.tabBar = __uniConfig.getTabBarConfig()
    __uniConfig.conditionUrl = ""
    __uniConfig.uniIdRouter = utsMapOf()
    __uniConfig.ready = true
}
open class GenUniApp : UniAppImpl() {
    open val vm: GenApp?
        get() {
            return getAppVm() as GenApp?
        }
    open val `$vm`: GenApp?
        get() {
            return getAppVm() as GenApp?
        }
}
fun getApp(): GenUniApp {
    return getUniApp() as GenUniApp
}
