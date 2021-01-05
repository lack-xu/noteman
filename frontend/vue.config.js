module.exports = {
  // Change build paths to make them Maven compatible
  // see https://cli.vuejs.org/config/
  outputDir: 'target/dist',
  assetsDir: 'static',

  "transpileDependencies": [
    "vuetify"
  ],

  pluginOptions: {
    webpack: {
      dir: [
        './webpack'
      ]
    }
  },

}
