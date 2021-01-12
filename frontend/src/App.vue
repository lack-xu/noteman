<template>
  <v-app>
    <v-main>

      <v-container fluid class="fill-height">
        <router-view/>
      </v-container>

      <v-footer>
        <v-row
            justify="center"
            align="center"
        >
          powered by vue+vuetify+spring boot
        </v-row>
      </v-footer>

    </v-main>
  </v-app>
</template>

<script>
export default {
  data: () => ({})
}
</script>

