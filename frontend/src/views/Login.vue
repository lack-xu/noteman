<template>
  <v-main>
    <v-container class="fill-height">
      <v-row
          justify="center"
          align="center"
          class="text-center"
      >
        <v-col
            cols="8"
            md="4"
            sm="8"
        >
          <span class="text-lg-h3 text-sm-h4">
            Noteman
          </span>
          <v-text-field
              color="black"
              label="Name"
              type="email"
              v-model="user.username"
          />
          <v-text-field
              color="black"
              label="Password"
              type="password"
              v-model="user.password"
          />
          <v-row
              justify="center"
              align="center"
          >
            <v-btn
                text
                @click="login"
            >
                <span>
                  Login
                </span>
            </v-btn>
          </v-row>
        </v-col>
      </v-row>
    </v-container>
  </v-main>
</template>

<script>
export default {
  name: "Login",
  data: () => ({
    user: {
      username: '',
      password: ''
    },
  }),
  mounted() {
  },
  methods: {
    login() {
      let _this = this
      console.log(this.$store.state)
      this.$axios
          .post('/login', {
            username: this.user.username,
            password: this.user.password
          })
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              // var data = this.loginForm
              _this.$store.commit('login', _this.user)
              let path = this.$route.query.redirect
              console.log(this.$store.state)
              this.$router.replace({path: path === '/' || path === undefined ? '/' : path})
            }
          })
          .catch(error => {
            console.log(error)
          })
    }
  }
}
</script>

<style scoped>

</style>
