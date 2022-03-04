<template>
  <div class="login_container" id="building">
    <div class="login_box">
      <!-- 头像区域 -->
      <div class="avatar_box">
        <img src="../assets/img/logo.png">
      </div>
      <!-- 登录表单区域 -->
      <el-form ref="loginFormRef" :model="loginForm" :rules="loginFormRules" label-width="0px" class="login_form">
        <!--        用户名-->
        <el-form-item prop="username">
          <el-input v-model="loginForm.username" prefix-icon="el-icon-user" aria-placeholder="请输入用户名" ></el-input>
        </el-form-item>
        <!--        密码-->
        <el-form-item prop="password">
          <el-input v-model="loginForm.password" prefix-icon="el-icon-key" type="password" aria-placeholder="请输入密码"></el-input>
        </el-form-item>
        <!--        按钮区域-->
        <div class="keep">
          <input @click="handlesave" id="yes" type="radio" value="0" ><!-- 点击选中 -->
          <label for="yes">保持登录状态</label> 
        </div>
        <el-form-item class="btns">
          <el-button type="primary" @click="Login">登录</el-button>
          <el-button type="primary" @click="handleregister">注册</el-button>
          <el-button type="info" @click="resetLoginForm">重置</el-button>
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
      loginForm: {
        username: '',
        password: ''
      },
      // 验证规则对象
      loginFormRules: {
        // 验证用户
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
          { min: 3, max: 10, message: '长度在 3 到 10 个字符', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入登录密码', trigger: 'blur' },
          { min: 3, max: 15, message: '长度在 3 到 15 个字符', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    Login () {
      // 设置账号密码
      localStorage['name'] = 'admin'
      localStorage['password'] = 'pswd123456'
      if (this.loginForm.username===localStorage['name'] && this.loginForm.password===localStorage['password']) {
        // 登陆成功
        sessionStorage.setItem("token", 'true')
        this.$router.push('/home')
      } 
      else if(this.loginForm.username === ''){
          alert('用户名不能为空')
      }
      else if(this.loginForm.password === ''){
          alert('密码不能为空')
      }
      else {
        localStorage.removeItem('token')
        alert('账号不存在，请注册后登录')
      }
    }, // 重置登录表单
    resetLoginForm () {
      // ui框架自带的form表单方法
      this.$refs.loginFormRef.resetFields()
    },
    handleregister(){
      this.$router.push("/register")// 点击注册按钮，跳转至注册页面
    },
    handlesave: function () {
      this.st = 'true' // 修改登录状态为true
      localStorage.setItem('s', this.st)
    }
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
    height: 300px;
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
