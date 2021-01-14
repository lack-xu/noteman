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
        component: () => import('../views/Title.vue')
      },
      {
        path: 'about',
        name: 'About',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
      },
      {
        path: 'profile',
        name: 'profile',
        component: () => import('../views/Profile.vue'),
      },
      {
        path: 'todolist',
        name: 'todolist',
        component: () => import('../views/Todolist.vue'),
      },
      {
        path: 'books',
        name: 'books',
        component: () => import('../views/Books.vue'),
      },
      {
        path: 'notes',
        name: 'notes',
        component: () => import('../views/Notes.vue'),
      },
      {
        path: 'hello',
        name: 'Hello',
        component: () => import('../views/Hello.vue')
      },
    ]
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
