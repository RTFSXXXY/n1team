<template>
  <div class="login_container" id="building">
    <div class="login_box">
      <!-- 头像区域 -->
      <!-- <div class="avatar_box">
        <img src="../assets/img/logo.png">
      </div> -->
      <h1 align = "center">注册</h1>
      <!-- 登录表单区域 -->
      <el-form ref="loginFormRef" :model="registerForm" label-width="0px" class="login_form">
        <!--        用户名-->
        <el-form-item prop="username">
          用户名：
          <el-input v-model="registerForm.name" prefix-icon="el-icon-user" aria-placeholder="请输入用户名" ></el-input>
        </el-form-item>
        <!--        密码-->
        <el-form-item prop="password">
          密码：
          <el-input v-model="registerForm.password" prefix-icon="el-icon-key" type="password" aria-placeholder="请输入密码"></el-input>
        </el-form-item>

        <el-form-item prop="mail">
          邮箱：
          <el-input v-model="registerForm.mail" prefix-icon="el-icon-message" type="email" aria-placeholder="请输入邮箱"></el-input>
        </el-form-item>

        <el-form-item prop="tel">
          手机号：
          <el-input v-model="registerForm.tel" prefix-icon="el-icon-mobile-phone" type="tel" aria-placeholder="请输入电话"></el-input>
        </el-form-item>

        <el-form-item class="btns">
          <el-button type="primary" @click="handlefinish">提交</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      // 数据绑定对象
      registerForm: {
        name: '',
        password: '',
        mail:'',
        tel:''
      },
      // 验证规则对象
    }
  },
  methods: {
      // 点击完成按钮触发handlefinish
    handlefinish: function () {
      if (localStorage["name"] === this.registerForm.name) {
        alert("用户名已存在"); // 如果用户名已存在则无法注册
      } else if (this.registerForm.name === "") {
        alert("用户名不能为空");
      } else {
        // 将新用户信息存储到localStorage
        localStorage.setItem("name", this.registerForm.name);
        localStorage.setItem("password", this.registerForm.password);
        localStorage.setItem("mail", this.registerForm.mail);
        localStorage.setItem("tel", this.registerForm.tel);
        localStorage.setItem("s", "false");
        alert("注册成功");
        this.$router.replace("/Login"); // 完成注册后跳转至登录页面
      }
    },
  }
}
</script>
<!--加上scoped是将样式应用于此组件，不加是全局-->
<style lang="less" scoped>
  #building{
  background:url("../assets/img/background.png");
  width:100%;			//大小设置为100%
  height:100%;			//大小设置为100%
  position:fixed;
  background-size:100% 100%;}

  .login_container {
    background-image: url('../assets/img/background.png');
    background-position: center center;
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
    height: 100%;
  }

  .login_box {
    background-image: url('/assets/img/logo.png');
    width: 450px;
    height: 600px;
    background-color: white;
    border-radius: 3px;
    /*容器内居中*/
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);

    .avatar_box {
      height: 130px;
      width: 130px;
      border: 1px solid #eee;
      border-radius: 50%;
      padding: 10px;
      /*边框阴影*/
      box-shadow: 0 0 10px #ddd;
      position: absolute;
      left: 50%;
      transform: translate(-50%, -50%);
      background-color: #fff;

      img {
        width: 100%;
        height: 100%;
        border-radius: 50%;
        background-color: #eee;
      }
    }

    .login_form {
      position: absolute;
      bottom: 0;
      width: 100%;
      padding: 0 20px;
      box-sizing: border-box;
    }

    .btns {
      display: flex;
      justify-content: flex-end;
    }
  }
</style>
