<template>
  <v-layout fill-height>
    <v-col>
      <v-card>
        <v-row
            justify="center"
            align="center"
            class="text-center"
        >
          <v-col
              cols="16"
          >
            <h1 class="text-lg-h3 pa-10 align-self-center justify-center">
              TODO List
            </h1>
            <v-row
                justify="center"
            >
              <v-col
                  cols="6"
              >
                <v-flex
                    align-self-center
                    class="d-flex align-self-center align-self-auto"
                >
                  <div>
                    <v-checkbox
                        class="px-4"
                        v-if="todo.context.length > 0"
                    />
                    <v-icon
                        v-else
                        class="pa-5"
                    >
                      mdi-check
                    </v-icon>
                  </div>
                  <v-text-field
                      class="pa-0"
                      full-width
                      color="black"
                      label="Name"
                      type="text"
                      clearable
                      solo
                      v-model="todo.context"
                      prepend-inner-icon="mdi-format-list-checks"
                  />
                </v-flex>
              </v-col>
            </v-row>
          </v-col>
        </v-row>
        <v-row
            justify="center"
            align="center"
        >
          <v-col
              cols="6"
          >
            <v-card
            >
              <v-flex
                  align-self-center
                  class="d-flex align-self-center align-self-auto"
              >
                <v-list
                    class="fill-height"
                >
                  <v-list-item>
                    <v-checkbox
                    />
                    <v-list-item-title
                        class="px-6"
                    >
                      {{ todo.context }}
                    </v-list-item-title>
                  </v-list-item>
                </v-list>
              </v-flex>
            </v-card>
          </v-col>
        </v-row>
      </v-card>
    </v-col>
  </v-layout>
</template>

<script>
export default {
  name: 'Todolist',
  data() {
    return {
      checkbox: true,
      todo: {
        status: false,
        context: ''
      },
    }
  },
}
</script>
