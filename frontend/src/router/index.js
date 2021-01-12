import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
    children: [
      {
        path: '',
        name: 'HomeTitle',
        component: () => import('../views/Home/HomeTitle.vue')
      },
      {
        path: 'login',
        name: 'Login',
        component: () => import('../views/Home/Login.vue')
      },
      {
        path: 'about',
        name: 'About',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () => import(/* webpackChunkName: "about" */ '../views/Home/About.vue')
      },
      {
        path: 'hello',
        name: 'Hello',
        component: () => import('../views/Home/Hello.vue')
      }
    ]
  },
  {
    path: '/user',
    name: 'User',
    component: () => import('../views/User.vue'),
    children: [
      {
        path: '',
        name: 'profile',
        component: () => import('../views/Home/About.vue'),
      },
      {
        path: 'profile',
        name: 'profile',
        component: () => import('../views/Profile.vue'),
      }
    ]
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
