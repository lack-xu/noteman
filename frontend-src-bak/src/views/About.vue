<template>
  <v-main>
    <v-row justify="center">
      <span class="text-center text-lg-h3">
        {{ msg }}
      </span>
    </v-row>
  </v-main>
</template>

<script>
// import api from "@/cors/backend-api"
import axios from "axios";

export default {
  name: "About",
  data: () => ({
    aboutList: null,
    msg: null,
    index: 0,
    postId: 1,
    loading: true,
    errored: false
  }),
  filters: {},
  created() {
    axios.get("/getAbout")
        .then(response => {
          this.msg = response.data[0].context;
        })
        .catch(error => {
          console.log(error)
          this.errored = true
        })
        .finally(() => this.loading = false)
  },
  methods: {
    getAbout() {
      axios.get("/getAbout")
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
}
</script>
