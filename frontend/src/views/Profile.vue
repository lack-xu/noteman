<template>
  <v-main>
    <v-row justify="center">
      <span
          class="text-center text-lg-h3"
      >
        User Profile Page
      </span>
    </v-row>
  </v-main>
</template>

<script>
import axios from "axios";

export default {
  name: 'Profile',
  props: {},
  components: {},
  data: () => ({
    userInfo: {
      username: null,
      email: null
    },
    users: null,
    books: null
  }),
  methods: {},
  mounted() {
    axios.get('/getUser')
        .then(res => {
          this.userInfo.username = res.data.username
          this.userInfo.email = res.data.email
        })
  }
}
</script>
