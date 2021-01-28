import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    meta: {
      requireAuth: true
    },
    component: () => import('@/views/Home'),
    children: [
      {
        path: '',
        name: 'Title',
        component: () => import('@/views/Title')
      },
      {
        path: 'about',
        name: 'About',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () => import(/* webpackChunkName: "about" */ '@/views/About')
      },
      {
        path: 'profile',
        name: 'profile',
        component: () => import('@/views/Profile'),
      },
      {
        path: 'todolist',
        name: 'todolist',
        props: true,
        component: () => import('@/views/Todolist'),
      },
      {
        path: 'books',
        name: 'books',
        component: () => import('@/views/Books'),
        children: [
          {
            path: '',
            name: 'listBooks',
            component: () => import('@/views/listBooks')
          },
        ]
      },
      {
        path: 'addBooks',
        name: 'addBooks',
        component: () => import('@/views/addBooks')
      },
      {
        path:'/update',
        component: () => import('@/views/updateBook'),
        show:false
      },
      {
        path: 'addNotes',
        name: 'addNotes',
        component: () => import('@/views/addNotes')
      },
      {
        path: 'notes',
        name: 'notes',
        component: () => import('@/views/Notes'),
      },
      {
        path: 'hello',
        name: 'Hello',
        component: () => import('@/views/Hello')
      },
    ]
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('@/views/Login')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
