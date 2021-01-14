<template>
  <v-main class="Title">
    <v-row
        align="center"
        justify="center"
    >
      <v-img
          max-width="16%"
          max-height="16%"
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
      <v-col cols="12">
        <v-row
            justify="center"
            align="center"
        >
          <h1 class="text">
            Noteman 一个简易个人笔记管理网站
          </h1>
        </v-row>
      </v-col>
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

<style scoped>
/*.text {*/
/*  overflow: hidden; !* Ensures the content is not revealed until the animation *!*/
/*  white-space: nowrap; !* Keeps the content on a single line *!*/
/*  margin: 0 auto; !* Gives that scrolling effect as the typing happens *!*/
/*  animation: typing 2.0s steps(20, end);*/
/*}*/

/*!* The typing effect *!*/
/*@keyframes typing {*/
/*  from {*/
/*    width: 0*/
/*  }*/
/*  to {*/
/*    width: 45%*/
/*  }*/
/*}*/
</style>
