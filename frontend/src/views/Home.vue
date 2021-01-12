<template>
  <v-main class="home">
    <v-container class="fill-height">

      <Navigation :items="items"/>
      <router-view/>

    </v-container>
  </v-main>
</template>

<script>
// import HomeTitle from "../components/HomeTitle";
import axios from 'axios'
import Navigation from "../components/Navigation";

export default {
  name: 'Home',
  components: {
    // HomeTitle,
    Navigation
  },
  data: () => ({
    items: [
      {url: '/', icon: 'mdi-home', title: '首页'},
      {url: '/login', icon: 'mdi-login', title: '登录'},
      {url: '/about', icon: 'mdi-help-circle', title: '关于'},
      {url: '/hello', icon: 'mdi-car', title: 'HELLO'},
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

<style lang="scss" scoped>
</style>
