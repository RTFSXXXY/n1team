// 我的发布
<template>
  <div id="bg" align="center">
    <div class="margin-top">
      <el-button type="success"  @click="add_new">⊕ 新建组队</el-button>

<el-dialog :visible.sync="dialogFormVisible">
      <el-form 
        :model="questionForm"
        ref="dataForm"
        label-position="left"
        label-width="90px"
        style="width: 400px; margin-left:50px;"
      >

        <el-form-item label="队伍名" prop="correctAnswer">
          <el-input v-model="teamForm.name" />
        </el-form-item> 
        <el-form-item label="发起人" prop="correctAnswer">
          <el-input v-model="teamForm.leader" />
        </el-form-item> 
        <el-form-item label="目标人数" prop="correctAnswer">
          <el-input v-model="teamForm.number" />
        </el-form-item>
        <el-form-item label="队伍简介" prop="questionContent">
          <el-input type="textarea" :rows="2" v-model="teamForm.introduciton"></el-input>
        </el-form-item>
        <el-form-item label="标签" prop="otherAnswer1">
          <el-input v-model="teamForm.label" />
        </el-form-item>
      
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="dialogFormVisible = false">确定</el-button>
      </div>
    </el-dialog>

      <el-card class="box-card">
        <div slot="header" class="clearfix">
          <h3 align="left">我的发布1
            <el-button type="danger">删除</el-button>
          </h3>
        </div>

        <div>
          <el-descriptions title="组队基本信息">
            <el-descriptions-item label=" 队伍名">发布1</el-descriptions-item>
            <el-descriptions-item label="发起人">张三</el-descriptions-item>
            <el-descriptions-item label="组队目的"
              >建模大赛</el-descriptions-item
            >
              <el-descriptions-item label="目标人数"
              >3~5人</el-descriptions-item
            >
            <el-descriptions-item label="标签">
              <el-tag size="small">学习</el-tag>
              <el-tag size="small">天津大学</el-tag>
              <el-tag size="small">ACM</el-tag>
              <el-tag size="small">数学建模</el-tag>
            </el-descriptions-item>
            <el-descriptions-item label="QQ群">123456789</el-descriptions-item>
          </el-descriptions>
        </div>
        <div>
          <el-descriptions title="已通过的队员信息"> </el-descriptions>
          <el-table :data="tableData" height="250" border style="width: 100%">
            <el-table-column prop="date" label="日期" width="180">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column prop="address" label="地址"> </el-table-column>
          </el-table>

          <el-descriptions title="已申请的队员信息"> </el-descriptions>
          <el-table :data="tableData" height="250" border style="width: 100%">
            <el-table-column prop="date" label="日期" width="180">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column prop="address" label="地址"> </el-table-column>
          </el-table>
        </div>
      </el-card>

            <el-card class="box-card">
        <div slot="header" class="clearfix">
          <h3 align="left">我的发布2
            <el-button type="danger">删除</el-button>
          </h3>
        </div>

        <div>
          <el-descriptions title="组队基本信息">
            <el-descriptions-item label=" 队伍名">发布1</el-descriptions-item>
            <el-descriptions-item label="发起人">张三</el-descriptions-item>
            <el-descriptions-item label="组队目的"
              >建模大赛</el-descriptions-item
            >
              <el-descriptions-item label="目标人数"
              >3~5人</el-descriptions-item
            >
            <el-descriptions-item label="标签">
              <el-tag size="small">学习</el-tag>
              <el-tag size="small">天津大学</el-tag>
              <el-tag size="small">ACM</el-tag>
              <el-tag size="small">数学建模</el-tag>
            </el-descriptions-item>
            <el-descriptions-item label="QQ群">123456789</el-descriptions-item>
          </el-descriptions>
        </div>
        <div>
          <el-descriptions title="已通过的队员信息"> </el-descriptions>
          <el-table :data="tableData" height="250" border style="width: 100%">
            <el-table-column prop="date" label="日期" width="180">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column prop="address" label="地址"> </el-table-column>
          </el-table>

          <el-descriptions title="已申请的队员信息"> </el-descriptions>
          <el-table :data="tableData" height="250" border style="width: 100%">
            <el-table-column prop="date" label="日期" width="180">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column prop="address" label="地址"> </el-table-column>
          </el-table>
        </div>
      </el-card>
    </div>
  </div>
</template>

<script>
export default {
  name: "User",
  data() {
    return {
subjectList: ["黄金", "白银", "钻石"],
      input: "",
      teamForm: {
        name: "",
        leader: "",
        number: "",
        introduciton: "",
        lable: "",
      },
      dialogFormVisible: false,


      // 获取用户信息到主页
      sname: localStorage.getItem("name"),
      smail: localStorage.getItem("mail"),
      stel: localStorage.getItem("tel"),
      isAuth: "", // 是否保持登录状态
      tableData: [
        {
          date: "2016-05-03",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-02",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-04",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-01",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-08",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-06",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-07",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
      ],
    };
  },
  methods: {
    // 当点击退出按钮，将不保存登录状态
    logout: function () {
      this.isAuth = "false"; // 修改登录状态
      localStorage.setItem("s", this.isAuth);
      this.$router.replace("/login"); // 页面跳转至登录页面
    },
    // add_new() {
    //     this.$alert('这是一段内容', '标题名称', {
    //       confirmButtonText: '确定',
    //       callback: action => {
    //         this.$message({
    //           type: 'info',
    //           message: `action: ${ action }`
    //         });
    //       }
    //     });
    // }
    add_new(){
      this.dialogFormVisible = true;
    }
  },
};
</script>

<style scoped>
.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}
.clearfix:after {
  clear: both;
}

.box-card {
  width: 1500px;
  margin-top: 16px;
}

.margin-top {
  margin-top: 100px;
}
#completed {
  position: absolute;
  top: 30%;
  left: 30%;
  transform: translate(-50%, -50%);
  color: white;
}
#non-completed {
  position: absolute;
  top: 30%;
  left: 70%;
  transform: translate(-50%, -50%);
  color: white;
}
#bg {
  width: 100%;
  height: 100%;
  background: url("../assets/img/background.png");
  background-size: 100% 100%;
  position: fixed;
  top: 0;
  left: 0;
  overflow-y:scroll;
}
p {
  font-size: 14px;
  margin-top: 0px;
  text-align: center;
  margin-left: 0%;
}
.form {
  color: white;
  margin-left: 20%;
  margin-top: 60px;
  font-size: 20px;
  text-align: left;
}
label {
  float: left;
  width: 5em;
  margin-right: 1em;
  text-align: right;
}
input,
textarea {
  margin-left: 10px;
  padding: 4px;
  border: solid 1px #4e5ef3;
  outline: 0;
  font: normal 13px/100% Verdana, Tahoma, sans-serif;
  width: 200px;
  height: 20px;
  background: #f1f1f190;
  box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
}
input:hover,
textarea:hover,
input:focus,
textarea:focus {
  border-color: #0d0aa1;
}
button {
  position: relative;
  border-radius: 10px;
  margin-top: 0px;
  color: white;
}
</style>