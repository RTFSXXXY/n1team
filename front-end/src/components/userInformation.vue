// 个人信息
<template>
  <div id="bg" align="center">
    <div style="width: 80%;" >
      <el-descriptions
        align="center"
        class="margin-top"
        title=" "
        :column="2"
        :size="size"
        border
      >
        <template slot="extra">
          <el-button type="primary" size="large" @click="edit()">修改个人信息</el-button>
        </template>
        

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-user"></i>
            用户名
          </template>
          {{ sname }}
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-user"></i>
            真实姓名
          </template>
          张三
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-mobile-phone"></i>
            手机号
          </template>
          18100000000
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-mobile-phone"></i>
            微信
          </template>
          18100000000
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-mobile-phone"></i>
            QQ号
          </template>
          938264820
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-mobile-phone"></i>
            邮箱
          </template>
          938264820@qq.com
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-location-outline"></i>
            居住地
          </template>
          江苏省
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-collection"></i>
            教育背景
          </template>
          天津大学计算机科学与技术本科在读，2021年9月-2025年5月，GPA:3.75（专业前10%）
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-collection"></i>
            相关的科研经历
          </template>
          内容
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-trophy"></i>
            获奖情况
          </template>
          内容
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-collection"></i>
            论文发表情况
          </template>
          内容
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-tickets"></i>
            标签
          </template>
          <el-tag size="small">计算机科学与技术</el-tag>
          <el-tag size="small">乐于助人</el-tag>
          <el-tag size="small">leader</el-tag>
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-office-building"></i>
            联系地址
          </template>
          江苏省苏州市吴中区吴中大道 1188 号
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-s-custom"></i>
            个性签名
          </template>
          欢迎大家与我组队！
        </el-descriptions-item>

        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-s-custom"></i>
            个人简介
          </template>
          计算机专业本科在读，喜欢ACM，具有一定的领导能力
        </el-descriptions-item>
      </el-descriptions>
        <template slot="extra">
          <el-button type="primary" size="small"> 123</el-button>
        </template>
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
    };
  },
  methods: {
    // 当点击退出按钮，将不保存登录状态
    logout: function () {
      this.isAuth = "false"; // 修改登录状态
      localStorage.setItem("s", this.isAuth);
      this.$router.replace("/login"); // 页面跳转至登录页面
    },
  },
};
</script>

<style scoped>
.margin-top{
    margin-top:100px;
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
  font-size: 20px;
  margin-top: 20px;
  text-align: left;
  margin-left: 32%;
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
  height: 33px;
  width: 150px;
  background: rgba(35, 19, 252, 0.425);
  border-radius: 10px;
  margin-top: 38px;
  box-shadow: none;
  color: white;
  margin-left: 40px;
}
button {
  position: relative;
  height: 33px;
  width: 150px;
  background: rgba(35, 19, 252, 0.425);
  border-radius: 10px;
  margin-top: 10px;
  box-shadow: none;
  color: white;
  margin-left: 10px;
}
</style>