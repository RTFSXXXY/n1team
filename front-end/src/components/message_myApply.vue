// 组队申请
<template>
  <div id="bg" align="center">
    <div class="margin-top">
      <!-- 卡片1 -->
      <el-card class="box-card">
        <div slot="header" class="clearfix">
          <h3 align="left">我的发布1</h3>  
        </div>
        <div>
          <el-descriptions title="组队基本信息">
            <el-descriptions-item label=" 队伍名">发布1</el-descriptions-item>
            <el-descriptions-item label="发起人">张三</el-descriptions-item>
            <el-descriptions-item label="组队目的"
              >建模大赛</el-descriptions-item
            >
            <el-descriptions-item label="目标人数">10~15人</el-descriptions-item>
            <el-descriptions-item label="已通过人数">5人</el-descriptions-item>
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
          <el-table :data="tableData" border style="width: 100%">
            <el-table-column fixed prop="date" label="日期" width="150">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="120">
            </el-table-column>
            <el-table-column prop="province" label="省份" width="120">
            </el-table-column>
            <el-table-column prop="city" label="市区" width="120">
            </el-table-column>
            <el-table-column prop="address" label="地址" width="300">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column fixed="right" label="操作" width="100">

                <el-popconfirm title="确定通过吗？" icon-color="green">
                  <el-button slot="reference" style="danger">通过</el-button>
                </el-popconfirm>
                <el-popconfirm title="确定拒绝吗？" icon-color="red">
                  <el-button slot="reference" style="danger">拒绝</el-button>
                </el-popconfirm>


            </el-table-column>
          </el-table>
        </div>

        <div>
          <el-descriptions title="已通过的队员信息"> </el-descriptions>
          <el-table :data="tableDataApply" height="250" border style="width: 100%">
            <el-table-column prop="date" label="日期" width="180">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column prop="address" label="地址"> </el-table-column>
          </el-table>

          <el-descriptions title="已拒绝的队员信息"> </el-descriptions>
          <el-table :data="tableDataRefuse" height="250" border style="width: 100%">
            <el-table-column prop="date" label="日期" width="180">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column prop="address" label="地址"> </el-table-column>
          </el-table>
        </div>
      </el-card>

<!-- 卡片2 -->
      <el-card class="box-card">
        <div slot="header" class="clearfix">
          <h3 align="left">我的发布2</h3>
        </div>
        <div>
          <el-descriptions title="组队基本信息">
            <el-descriptions-item label=" 队伍名">发布2</el-descriptions-item>
            <el-descriptions-item label="发起人">张三</el-descriptions-item>
            <el-descriptions-item label="组队目的"
              >建模大赛</el-descriptions-item
            >
            <el-descriptions-item label="目标人数">10~15人</el-descriptions-item>
            <el-descriptions-item label="已通过人数">5人</el-descriptions-item>
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
          <el-table :data="tableData" border style="width: 100%">
            <el-table-column fixed prop="date" label="日期" width="150">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="120">
            </el-table-column>
            <el-table-column prop="province" label="省份" width="120">
            </el-table-column>
            <el-table-column prop="city" label="市区" width="120">
            </el-table-column>
            <el-table-column prop="address" label="地址" width="300">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column prop="test" label="测试数据" width="120">
            </el-table-column>
            <el-table-column fixed="right" label="操作" width="100">
              <template slot-scope="scope">
                <el-button
                  @click="handleClick(scope.row)"
                  type="text"
                  size="small"
                  >通过</el-button
                >
                <el-button type="text" size="small">拒绝</el-button>
              </template>
            </el-table-column>
          </el-table>
        </div>

        <div>
          <el-descriptions title="已通过的队员信息"> </el-descriptions>
          <el-table :data="tableDataApply" height="250" border style="width: 100%">
            <el-table-column prop="date" label="日期" width="180">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column prop="address" label="地址"> </el-table-column>
          </el-table>

          <el-descriptions title="已拒绝的队员信息"> </el-descriptions>
          <el-table :data="tableDataRefuse" height="250" border style="width: 100%">
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
      // 获取用户信息到主页
      sname: localStorage.getItem("name"),
      smail: localStorage.getItem("mail"),
      stel: localStorage.getItem("tel"),
      isAuth: "", // 是否保持登录状态
      
      tableData: [{
          date: '2016-05-02',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333,
          test:'测试数据测试数据测试数据'
        }, {
          date: '2016-05-04',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1517 弄',
          zip: 200333,
          test:'测试数据测试数据测试数据'
        }, {
          date: '2016-05-01',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1519 弄',
          zip: 200333,
          test:'测试数据测试数据测试数据'
        }, {
          date: '2016-05-03',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1516 弄',
          zip: 200333,
          test:'测试数据测试数据测试数据'
        },
        {
          date: '2016-05-01',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1519 弄',
          zip: 200333,
          test:'测试数据测试数据测试数据'
        }, 
        {
          date: '2016-05-01',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1519 弄',
          zip: 200333,
          test:'测试数据测试数据测试数据'
        }, 
        {
          date: '2016-05-01',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1519 弄',
          zip: 200333,
          test:'测试数据测试数据测试数据'
        }, ],
        tableDataApply: [
        {
          date: "2016-05-03",
          name: "王小虎1",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-02",
          name: "王小虎2",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-04",
          name: "王小虎3",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-01",
          name: "王小虎4",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-08",
          name: "王小虎5",
          address: "上海市普陀区金沙江路 1518 弄",
        },
      ],
      tableDataRefuse: [
        {
          date: "2016-05-03",
          name: "王小虎0",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-02",
          name: "王小虎0",
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
     handleClick(row) {
        console.log(row);
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
  overflow-y: scroll;
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

</style>