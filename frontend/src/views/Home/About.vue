<template>
  <v-main>
    <v-col cols="12">
      <v-row
          justify="center"
          align="center"
      >
        <h1 class="text">
          {{ msg }}
        </h1>
        <v-text-field v-model="postId" full-width></v-text-field>
        <h3>{{ postId }}</h3>
        <v-btn @click="sentPostId()">SentId</v-btn>
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
    aboutList: null,
    msg: null,
    postId: null,
    loading: true,
    errored: false
  }),
  filters: {},
  methods: {
    sentPostId: () => (
        axios.post('http://localhost:8098/api/aboutType', this.postId)
            .then(response => this.msg = response.data.context)
    )
  },
  mounted() {
    axios.get('http://localhost:8098/api/aboutType')
        .then(response => {
          // this.aboutList = response.data
          // this.msg = this.aboutList[0];
          this.msg = response.data.context
        })
        .catch(error => {
          console.log(error)
          this.errored = true
        })
        .finally(() => this.loading = false)
  },
}
</script>
