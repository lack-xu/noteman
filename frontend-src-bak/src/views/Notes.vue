<template>
  <v-row
      justify="center"
  >
    <v-card>
      <v-container>
        <v-simple-table>
          <template v-slot:default>
            <thead>
            <tr>
              <th class="text-center">
                title
              </th>
              <th class="text-center">
                description
              </th>
              <th class="text-center">
                context
              </th>
              <th class="text-center">
                function
              </th>
            </tr>
            </thead>
            <tbody>
            <tr
                v-for="note in notes"
                :key="note.title"
            >
              <td>{{ note.title }}</td>
              <td>{{ note.description }}</td>
              <td>{{ note.context }}</td>
              <td>
                <v-btn text color="dark">Update</v-btn>
                <v-btn text color="error">delete</v-btn>
              </td>
            </tr>
            </tbody>
          </template>
        </v-simple-table>
      </v-container>
    </v-card>
  </v-row>
</template>

<script>
import axios from "axios";

export default {
  name: "Notes",
  data: () => ({
    notes: {
      title: null,
      description: null,
      context: null,
    }
  }),
  created() {
    // Pageable
    axios.get('/getNoteList')
        .then(res => {
          this.notes = res.data
        }).catch(err => console.log(err))
  }
}
</script>

<style scoped>

</style>
