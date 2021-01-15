<template>
  <v-main class="Title">
    <v-row
        align="center"
        justify="space-around"
    >
      <v-img
          max-width="18%"
          max-height="18%"
          alt="logo"
          src="@/assets/logo.png">
        <template v-slot:placeholder>
          <v-row
              class="fill-height ma-0"
              align="center"
              justify="center"
          >
            <v-progress-circular
                indeterminate
                color="grey lighten-5"
            ></v-progress-circular>
          </v-row>
        </template>
      </v-img>
      <span class="text-center text-lg-h4">
        Noteman 一个简易个人笔记管理网站
      </span>
    </v-row>
  </v-main>
</template>

<script>
export default {
  name: 'Title',

  /* props, make msg transported from upper stage layer to lower stage layer */
  props: [],

  data: () => ({
    //
  }),

  methods: {}
}
</script>
