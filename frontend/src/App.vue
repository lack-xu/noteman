<template>
  <v-app>
    <v-main>

      <v-container fluid class="fill-height">
        <router-view/>
      </v-container>

      <Footer msg="POWERED BY VUE+VUETIFY+SPRING BOOT"/>

    </v-main>
  </v-app>
</template>

<script>
import Footer from "@/components/Footer";
export default {
  components: {Footer},
  data: () => ({})
}
</script>

