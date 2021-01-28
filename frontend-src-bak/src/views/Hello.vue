<template>
  <v-main>
    <h3>INFO: </h3>
    <h3 v-for="i in 30" :key="i">{{ info }}</h3>
  </v-main>
</template>

<script>
// import api from "@/cors/backend-api"
import axios from "axios";

export default {
  name: "Hello",
  data() {
    return {
      info: null,
      res: null,
      len: null,
      loading: true,
      errored: false
    }
  },
  filters: {
    currencydecimal(value) {
      return value.toFixed(2)
    }
  },
  mounted() {
    axios.get('http://localhost:8098/api/hello')
        .then(response => {
          this.info = response.data
          this.len = this.info.length
        })
        .catch(error => {
          console.log(error)
          this.errored = true
        })
        .finally(() => this.loading = false)
  },
}
</script>

<style scoped>

</style>