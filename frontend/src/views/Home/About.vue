<template>
  <v-main>
    <v-col cols="12">
      <v-row
          justify="center"
          align="center"
      >
        <h1 class="text">
          {{ info }} This is an about page
        </h1>
      </v-row>
    </v-col>
  </v-main>
</template>

<script>
// import api from "@/cors/backend-api"
import axios from "axios";

export default {
  name: "About",
  data() {
    return {
      info: null,
      loading: true,
      errored: false
    }
  },
  filters: {},
  mounted() {
    axios.get('http://localhost:8098/api/about')
        .then(response => {
          this.info = response.data
        })
        .catch(error => {
          console.log(error)
          this.errored = true
        })
        .finally(() => this.loading = false)
  },
}
</script>


<!--<style scoped>-->
<!--.text {-->
<!--  overflow: hidden; /* Ensures the content is not revealed until the animation */-->
<!--  white-space: nowrap; /* Keeps the content on a single line */-->
<!--  margin: 0 auto; /* Gives that scrolling effect as the typing happens */-->
<!--  animation: typing 2.0s steps(20, end);-->
<!--}-->

<!--/* The typing effect */-->
<!--@keyframes typing {-->
<!--  from {-->
<!--    width: 0-->
<!--  }-->
<!--  to {-->
<!--    width: 21%-->
<!--  }-->
<!--}-->
<!--</style>-->
