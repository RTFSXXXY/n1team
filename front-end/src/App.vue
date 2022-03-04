<template>
    <div>
      <div>
      <router-view></router-view>
      </div>
      <div v-if="$route.meta.keepAlive">
      <home-head></home-head>
    </div>
      <router-view v-if="!$route.meta.keepAlive"></router-view>
  </div>
 
</template>

<script>
import homeHead from '@/views/base/homeHead'
export default {
  components: { homeHead },
  name: 'App'

}
</script>

<style lang="less">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
