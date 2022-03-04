<template>
    <div>
      
        <el-header>
            
            <div>
                <el-row >
                    <el-col :span="18">
                        <el-menu
                                router="router"
                                :default-active="activeIndex"
                                :active-text-color="activeColor"
                                class="el-menu-item"
                                style="position:static;"
                                mode="horizontal"
                                @select="handleSelect">  
                                
                            <el-row>
                                <el-col :span="4">
                                <img src="../../assets/img/top.png" class="header_image">
                                </el-col>
                                <el-col :span="4">
                                    <el-menu-item index="/home">我的首页</el-menu-item>
                                </el-col>
                                <el-col :span="4">
                                    <el-menu-item index="/myTeam">我的组队</el-menu-item>
                                </el-col>
                                <el-col :span="4">
                                    <el-submenu index="/message">
                                        <template slot="title">消息中心</template>
                                        <el-menu-item index="/message/myPublish">我的发布</el-menu-item>
                                        <el-menu-item index="/message/myApply">组队申请</el-menu-item>
                                    </el-submenu>
                                </el-col>
                                <el-col :span="4">
                                    <el-menu-item index="/user">个人信息</el-menu-item>
                                </el-col>
                            </el-row>
                        </el-menu>
                    </el-col>
                </el-row>
            </div>
        </el-header>
    </div>
</template>
 

<script>
    export default {
        name: "homeHead",
        data(){
            return{
                activeIndex: '/home',
                activeColor:'rgba(81, 91, 187, 0.959)',
                navList: [
                    {name:'/home',navItem:'我的首页'},
                    {name:'/myTeam',navItem:'我的组队'},
                    {name:'/message/myApply',navItem:'组队申请'},
                    {name:'/message/myPublish',navItem:'我的发布'},
                    {name:'/information',navItem:'个人信息'},

                ]
            }
        },
        methods: {
            handleSelect(key, keyPath) {
                console.log(key, keyPath);
            }
        }
    }

</script>


<style>

.header_image {
  height: 60px;
  margin-top: 0px;
  margin-left: 5px;
}
.el-header{
    list-style-type: none;
    margin: 0%;
    padding: 0%;
    overflow: hidden;
    position: fixed;
    top: 0%;
    width: 100%;
    background-color: rgba(240, 255, 255, 0.883);
    opacity:0.4;
    float: left;
}

.el-menu-item
{
    display: block;
    text-align: center;
    font-size: 20px !important;
    font-weight: 600;
    padding: 20px;
    text-decoration: none;

}

.el-submenu__title
{
    display: block;
    text-align: center;
    font-size: 20px !important;
    font-weight: 600;
    /* padding: 20px; */
    text-decoration: none;

}

/* .title{
    display: block;
    text-align: center;
    font-size: 18px !important;
    font-weight: 600;
    padding: 20px;
    text-decoration: none;
} */


</style>