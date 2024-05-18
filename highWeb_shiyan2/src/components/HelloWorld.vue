<template>
  <div class="hello">
    
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      xiaoxi: '玩游戏',
      count:1,
      message:""
    }
  },
  methods: {
    onclick(event){
      this.xiaoxi = "点击之后";
      alert("等下健身！！！")
    },
    say(mess){
      console.log(mess)
    },
    getname(){
      alert(this.message)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

