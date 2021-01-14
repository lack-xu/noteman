<template>
  <v-main>
    <v-col cols="12">
      <v-row
          justify="center"
          align="center"
      >
        <v-btn depressed color="white" @click="selectAboutList()">
          <h1>{{ msg }}</h1>
        </v-btn>
      </v-row>
    </v-col>

  </v-main>
</template>

<script>
// import api from "@/cors/backend-api"
import axios from "axios";

export default {
  name: "About",
  data: () => ({
    baseList: 'http://localhost:8098/api/about',
    aboutList: null,
    msg: null,
    index: 0,
    postId: 1,
    loading: true,
    errored: false
  }),
  filters: {},
  methods: {
    getAbout() {
      axios.get(this.baseList + "/getList")
          .then(response => {
            this.AboutList = response.data
          })
          .catch(error => {
            console.log(error)
            this.errored = true
          })
          .finally(() => this.loading = false)
    },
    selectAboutList() {
      if (this.index === 0)
        this.index = 1
      else
        this.index = 0
      this.msg = this.AboutList[this.index].context
    },
  },
  mounted() {
    axios.get(this.baseList + '/getList')
        .then(response => {
          this.AboutList = response.data
          this.msg = this.AboutList[0].context
        })
        .catch(error => {
          console.log(error)
          this.errored = true
        })
        .finally(() => this.loading = false)
  },
}
</script>