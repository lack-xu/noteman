<template>
  <v-container fluid>
    <v-parallax
        src="@/assets/undraw_learning.svg"
        height="700"
    >

      <v-row
          justify="center"
          align="center"
      >
        <v-card
            min-height="40%"
            min-width="38%"
            max-height="48%"
            max-width="38%"
            elevation="2"
            loader-height="2"
            loding
        >
          <v-row
              justify="center"
              align="center"
          >
            <v-col
                cols="8"
            >

              <v-container fluid style="padding-bottom: 20px;">

                <div class="v-text-field--filled">
                  <v-text-field
                      color="black"
                      v-for="text in texts"
                      :key="text.label"
                      :label="text.label"
                      :hint="text.hint"
                      :type="text.type"
                  ></v-text-field>
                  <!--                  <v-text-field color="black"-->
                  <!--                                label="邮箱或用户名"-->
                  <!--                                hint="邮箱或用户名规则"-->
                  <!--                                type="text">-->
                  <!--                  </v-text-field>-->

                  <!--                  <v-text-field color="black"-->
                  <!--                                label="密码"-->
                  <!--                                hint="密码规则"-->
                  <!--                                type="password">-->
                  <!--                  </v-text-field>-->
                </div>

                <v-card-text style="color: gray; padding-bottom: 20px;">
                  *没有账号？请
                  <router-link
                      style="color: gray;"
                      to="/register">
                    注册
                  </router-link>
                </v-card-text>

                <v-row
                    justify="space-around"
                >
                  <v-btn
                      depressed
                      color="white"
                      v-for="item in items"
                      :key="item.url"
                      :to="item.url">
                    <v-icon>{{ item.icon }}</v-icon>
                    {{ item.text }}
                  </v-btn>
                </v-row>

              </v-container>

            </v-col>
          </v-row>
        </v-card>
      </v-row>

    </v-parallax>
  </v-container>
</template>

<script>
export default {
  name: 'Login',
  components: {},
  data: () => ({
    texts: [
      {label: '邮箱或用户名', hint: '邮箱或用户名规则', type: 'text'},
      {label: '密码', hint: '密码规则', type: 'password'}
    ],
    items: [
      {url: '/user', icon: 'mdi-check', text: '登录'},
      {url: '/', icon: 'mdi-close', text: '取消'}
    ]
  })
}
</script>

<style>
</style>