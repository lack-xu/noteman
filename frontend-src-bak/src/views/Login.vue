<template>
  <v-main>
    <v-container>
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
          <span class="text-lg-h3">
            Noteman
          </span>
          <v-text-field
              color="black"
              label="Name"
              v-model="user.username"
          />
          <v-text-field
              color="black"
              label="Password"
              v-model="user.password"
          />
          <v-row
              justify="center"
              align="center"
          >
            <v-hover>
              <v-btn
                  depressed
                  color="white"
                  @click="login"
              >
                <span>
                  Login
                </span>
              </v-btn>
            </v-hover>
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
      username: 'DemoUser',
      password: 'demo_user'
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
