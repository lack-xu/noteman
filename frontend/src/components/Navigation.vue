<template>
  <v-navigation-drawer
      permanent
      expand-on-hover
      fixed
      width="150"
  >
    <v-list
        nav
        dense
    >
      <v-list-item
          link
          v-for="item in items"
          :key="item.url"
          :to="item.url">
        <v-list-item-icon>
          <v-icon>{{ item.icon }}</v-icon>
        </v-list-item-icon>
        <v-list-item-title>{{ item.title }}</v-list-item-title>
      </v-list-item>
    </v-list>
  </v-navigation-drawer>
</template>

<script>
export default {
  name: 'Navigation',
  props: ['items'],
}
</script>
