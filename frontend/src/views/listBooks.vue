<template>
  <v-container>
<!--      <el-table-->
<!--          :data="tableData"-->
<!--          border-->
<!--          style="width: 70%">-->
<!--        <el-table-column-->
<!--            prop="id"-->
<!--            label="编号"-->
<!--            width="150">-->
<!--        </el-table-column>-->
<!--        <el-table-column-->
<!--            prop="title"-->
<!--            label="图书名"-->
<!--            width="120">-->
<!--        </el-table-column>-->
<!--        <el-table-column-->
<!--            prop="author"-->
<!--            label="作者"-->
<!--            width="120">-->
<!--        </el-table-column>-->
<!--        <el-table-column-->
<!--            prop="description"-->
<!--            label="出版社"-->
<!--            width="120">-->
<!--        </el-table-column>-->
<!--        <el-table-column-->
<!--            fixed="right"-->
<!--            label="操作"-->
<!--            width="100">-->
<!--          &lt;!&ndash;!!!&ndash;&gt;-->
<!--          <template slot-scope="scope">-->
<!--            <el-button @click="edit(scope.row)" type="text" size="small">-->
<!--              修改-->
<!--            </el-button>-->
<!--            <el-button @click="deleteBook(scope.row)" type="text"-->
<!--                       size="small" onclick="return confirm('确认是否删除此图书？')">-->
<!--              删除-->
<!--            </el-button>-->
<!--          </template>-->
<!--        </el-table-column>-->
<!--      </el-table>-->
<!--    <v-spacer/>-->
<!--      <el-pagination-->
<!--          layout="prev, pager, next"-->
<!--          :page-size="pageSize"-->
<!--          :total="total"-->
<!--          @current-change="page">-->
<!--      </el-pagination>-->
  </v-container>
</template>

<script>
import axios from "axios";

export default {
  methods: {
    deleteBook(row) {
      const _this = this
      // eslint-disable-next-line no-unused-vars
      axios.delete('/deleteById/' + row.id).then(function (resp) {
        _this.$alert('《' + row.title + '》删除成功！', '消息', {
          confirmButtonText: '确定',
          // eslint-disable-next-line no-unused-vars
          callback: action => {
            window.location.reload()
          }
        })
      })
    },
    edit(row) {
      this.$router.push({
        path: '/update',
        query: {
          id: row.id
        }
      })
    },
    page(currentPage) {
      const _this = this
      axios.get('/findAll/' + (currentPage - 1) + '/6').then(function (resp) {
        console.log(resp)
        _this.tableData = resp.data.content
        _this.pageSize = resp.data.size
        _this.total = resp.data.totalElements
      })
    }
  },

  data() {
    return {
      pageSize: '',
      total: '',
      tableData: []
    }
  },

  created() {
    const _this = this
    axios.get('/findAll/0/6').then(function (resp) {
      console.log(resp)
      _this.tableData = resp.data.content
      _this.pageSize = resp.data.size
      _this.total = resp.data.totalElements
    })
  }
}
</script>
