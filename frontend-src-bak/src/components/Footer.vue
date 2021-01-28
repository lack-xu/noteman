<template>
  <v-footer>
    <v-row
        justify="center"
        align="center"
    >
      {{ msg }}
    </v-row>
  </v-footer>
</template>

<script>
export default {
  name: "Footer",
  props: ['msg']
}
</script>

<style scoped>

</style>