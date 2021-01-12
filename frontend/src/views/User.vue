<template>
  <v-container fluid>
    <Navigation :items="items"/>
    <router-view/>
  </v-container>
</template>

<script>
import Navigation from "../components/Navigation";

export default {
  name: 'Login',
  components: {
    Navigation
  },
  data: () => ({
    items: [
      {url: '/', icon: 'mdi-home', title: '首页'},
      {url: '/user/profile', icon: 'mdi-account-box-multiple', title: '个人信息'},
      {url: '/user/add', icon: 'mdi-plus-box', title: '添加'},
      {url: '/user/search', icon: 'mdi-magnify', title: '查找'},
      {url: '/user/update', icon: 'mdi-delete', title: '删除'},
    ]
  })
}
</script>

<style>
</style>
