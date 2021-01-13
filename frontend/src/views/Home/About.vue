<template>
  <v-main>
    <v-col cols="12">
      <v-row
          justify="center"
          align="center"
      >
        <h1>
          errors: {{ errored }}
        </h1>
        <v-spacer/>
        <h1 class="text">
          msg: {{ msg }}
        </h1>
        <v-spacer/>
        <h1 class="text">
          msg_2: {{ msg_2 }}
        </h1>
        <!--        <v-text-field v-model="postId" full-width></v-text-field>-->
        <!--        <h3>PostId: {{ postId }}</h3>-->
        <v-spacer/>
        <v-btn @click="sentPostId()">SentPostID</v-btn>
        <v-spacer/>
        <h1>{{ postId }}</h1>
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
    msg_2: null,
    postId: 1,
    loading: true,
    errored: false
  }),
  filters: {},
  methods: {
    sentPostId: () => (
        axios.post('http://localhost:8098/api/aboutType', {
          params: {
            id: this.postId
          }
        })
            .then(response => this.msg_2 = response.data)
            .catch(error => {
              console.log(error);
              this.errored = true;
            })
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
