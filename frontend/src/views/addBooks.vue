<template>
  <el-form style="width: 60%" :model="bookForm" :rules="rules" ref="bookForm"
           label-width="100px" class="demo-bookForm">

    <el-form-item label="图书名称" prop="title">
      <el-input v-model="bookForm.title"></el-input>
    </el-form-item>

    <el-form-item label="作者" prop="author">
      <el-input v-model="bookForm.author"></el-input>
    </el-form-item>

    <el-form-item label="概要" prop="description">
      <el-input v-model="bookForm.description"></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('bookForm')">提交</el-button>
      <el-button @click="resetForm('bookForm')">重置</el-button>
    </el-form-item>

  </el-form>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      bookForm: {
        title: '',
        author: '',
        description: ''
      },
      rules: {
        title: [
          {required: true, message: '图书名称不能为空', trigger: 'blur'}
        ],
        author: [
          {required: true, message: '作者不能为空', trigger: 'blur'}
        ],
        description: [
          {required: true, message: '概要不能为空', trigger: 'blur'}
        ]
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.post('/saveBook', this.bookForm).then(function (resp) {
            if (resp.data === 'success') {
              _this.$alert('《' + _this.bookForm.title + '》添加成功！', '消息', {
                confirmButtonText: '确定',
                // eslint-disable-next-line no-unused-vars
                callback: action => {
                  _this.$router.push('/books')
                }
              })
            }
          })
        } else {
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
}
</script>

