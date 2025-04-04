import App from './App.uvue'

import { createSSRApp } from 'vue'
export function createApp() {
	const app = createSSRApp(App)
	return {
		app
	}
}
export function main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    (createApp()['app'] as VueApp).mount(app, GenUniApp());
}

export class UniAppConfig extends io.dcloud.uniapp.appframe.AppConfig {
    override name: string = "NFT.ONCE"
    override appid: string = "__UNI__77FDAAC"
    override versionName: string = "1.0.0"
    override versionCode: string = "100"
    override uniCompilerVersion: string = "4.57"
    
    constructor() { super() }
}

import GenPagesHomeIndexClass from './pages/home/index.uvue?type=page'
import GenPagesLoginIndexClass from './pages/login/index.uvue?type=page'
import GenPagesMineIndexClass from './pages/mine/index.uvue?type=page'
import GenPagesBlogIndexClass from './pages/blog/index.uvue?type=page'
import GenPagesNftIndexClass from './pages/nft/index.uvue?type=page'
function definePageRoutes() {
__uniRoutes.push({ path: "pages/home/index", component: GenPagesHomeIndexClass, meta: { isQuit: true } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","首页"],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/login/index", component: GenPagesLoginIndexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText",""],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/mine/index", component: GenPagesMineIndexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","我的"],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/blog/index", component: GenPagesBlogIndexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","博客"],["navigationStyle","custom"]]) } as UniPageRoute)
__uniRoutes.push({ path: "pages/nft/index", component: GenPagesNftIndexClass, meta: { isQuit: false } as UniPageMeta, style: utsMapOf([["navigationBarTitleText","NFT"],["navigationStyle","custom"]]) } as UniPageRoute)
}
const __uniTabBar: Map<string, any | null> | null = utsMapOf([["color","#999999"],["selectedColor","#333333"],["backgroundColor","#FFFFFF"],["borderStyle","black"]])
const __uniLaunchPage: Map<string, any | null> = utsMapOf([["url","pages/home/index"],["style",utsMapOf([["navigationBarTitleText","首页"],["navigationStyle","custom"]])]])
function defineAppConfig(){
  __uniConfig.entryPagePath = '/pages/home/index'
  __uniConfig.globalStyle = utsMapOf([["navigationBarTextStyle","black"],["navigationBarTitleText","uni-app x"],["navigationBarBackgroundColor","#F8F8F8"],["backgroundColor","#F8F8F8"]])
  __uniConfig.getTabBarConfig = ():Map<string, any> | null =>  utsMapOf([["color","#999999"],["selectedColor","#333333"],["backgroundColor","#FFFFFF"],["borderStyle","black"]])
  __uniConfig.tabBar = __uniConfig.getTabBarConfig()
  __uniConfig.conditionUrl = ''
  __uniConfig.uniIdRouter = utsMapOf()
  
  __uniConfig.ready = true
}
