<template>
  <v-main>
    <v-container class="fill-height">
      <Navigation :items="items"/>
      <router-view/>
    </v-container>
  </v-main>
</template>

<script>
import axios from 'axios'
import Navigation from "@/components/Navigation";

export default {
  name: 'Home',
  components: {
    // HomeTitle,
    Navigation
  },
  data: () => ({
    items: [
      {url: '/', icon: 'mdi-home', title: '网站首页'},
      {url: '/profile', icon: 'mdi-account-box-multiple', title: '个人信息'},
      {
        url: '/todolist', icon: 'mdi-checkbox-multiple-marked', title:
            '待办事项'
      },
      {url: '/books', icon: 'mdi-book-open-page-variant', title: '相关书籍'},
      {url: '/notes', icon: 'mdi-notebook', title: '个人笔记'},
      {url: '/about', icon: 'mdi-help-circle', title: '关于网站'},
    ],
    posts: [],
    response: [],
    errors: []
  }),
  methods: {
    callRestService: () => (
        axios.get(`/hello`)
            .then(response => {
              // JSON responses are automatically parsed.
              this.response = response.data
            })
            .catch(e => {
              this.errors.push(e)
            })
    )
  }
}
</script>

<style scoped>

</style>