import Vue from 'vue'
import App from './App.vue'
import router from './router'
// elementUI导入
import store from './store'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
Vue.use(ElementUI)

Vue.config.productionTip = false

new Vue({
  el: '#app',
  router,
  store,
  comments: { App },
  template: '<App/>',
  render: h => h(App)
}).$mount('#app')