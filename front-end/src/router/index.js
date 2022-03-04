import Vue from 'vue'
import VueRouter from 'vue-router'
import login from '@/components/login.vue'
import Home from '@/components/home.vue'

Vue.use(VueRouter)
const routes = [
  {
  // 这里需要将根目录默认为Home，方便实现用户在保持登录 状态下再次登录时直接跳转至主页面
    path: '/',
    redirect: {
      name: 'Home',
      meta: {keepAlive : true}
    }
  },
  {
    path: '/Home',
    name: 'Home',
    component: Home,
    meta: {keepAlive : true}
  },
  {
    path: '/login',
    name: 'login',
    component: login,
    meta: {keepAlive: false}
  },
  {
    path: '/register',
    name: 'register',
    component: () =>{
      return import('@/components/register.vue')
    },
    meta: {keepAlive: false}
  },
  {
    path:'/message',
    name:'message',
    component: () => {
      return import ('@/components/message')
    },
    meta: {keepAlive : true}
  },
  {
    path: '/message/myApply',
    name:'myApply',
    component:() =>{
      return import('@/components/message_myApply')
    },
    meta: {keepAlive : true}
  },
  {
    path: '/message/myPublish',
    name:'myPublish',
    component:() =>{
      return import('@/components/message_myPublish')
    },
    meta: {keepAlive : true}
  },
  {
    path: '/myTeam',
    name:'myTeam',
    component:() =>{
      return import('@/components/apply_for_team')
    },
    meta: {keepAlive : true}
  },
  {
    path: '/user',
    name:'user',
    component:() =>{
      return import('@/components/userInformation')
    },
    meta: {keepAlive : true}
  }
]
const router = new VueRouter({
  base: process.env.BASE_URL,
  routes
})

// router.beforeEach((to, from, next) => {
//   //登录及注册页面可以直接进入,而主页面需要分情况
//   if(to.path == '/login')
//   {
//     next()
//     console.log(localStorage.s)
//   }
//   else if(to.path == '/register')
//   {
//     next()
//   }
//   else
//   {
//     if(from.path == '/login')// 从登录页面可以直接通过登录进入主页面
//     {
//       next()
//     }
//     else{
//       // 从/进入,如果登录状态是true，则直接next进入主页面
//       if(localStorage.s === 'true')
//       {
//         next()
//         console.log(localStorage['s'])
//       }
//       else {// 如果登录状态是false，那么跳转至登录页面,需要登录才能进入主页面
//         next('/login')
//         console.log('需要登录')
//       }
//     }
//   }
// })
// export default router;

router.beforeEach((to, from, next) => {
  console.log(sessionStorage.getItem("token"))
  console.log(to.meta.keepAlive)
  if (to.meta.keepAlive) { 
    // 判断该路由是否需要登录权限
    if (sessionStorage.getItem("token") == 'true') { 
      // 判断本地是否存在token
      next()
    } 
    else {
      // 本地不存在token
      // 未登录,跳转到登陆页面
      next({
        path: "/login"
      })
    }
  } 
  else {//不需要登录权限
    if (sessionStorage.getItem("token") == 'true') { 
      // 判断本地是否存在token
      next({
        path: "/Home"
      })
    } 
    else{
      next()
    }
  }
})

export default router;



