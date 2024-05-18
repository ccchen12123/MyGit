<template>
    <div class="d6">
      <div class="d7">
          <p class="p2">课程特色</p>
          <hr>
      </div>
      <div class="d8">
        <div class="feng">
            <img src="@/assets/1.png">
            <h2 class="hh2">丰富的教学服务</h2>
            <p class="pp2">特色教学服务功能，各种配套教学服务，在线学习从未如此轻松。</p>
            <a @click="mashang1" class="ma2">马上学习</a>
        </div>
        <div class="feng">
            <img src="@/assets/2.png">
            <h2 class="hh2">丰富的教学服务</h2>
            <p class="pp2">特色教学服务功能，各种配套教学服务，在线学习从未如此轻松。</p>
            <a @click="mashang2" class="ma2">马上学习</a>
        </div>
        <div class="feng">
            <img src="@/assets/3.png">
            <h2 class="hh2">丰富的教学服务</h2>
            <p class="pp2">特色教学服务功能，各种配套教学服务，在线学习从未如此轻松。</p>
            <a @click="mashang3" class="ma2">马上学习</a>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: 'Feature',
    methods: {
        mashang1() {
            alert("嗯")
        },
        mashang2() {
            alert("哦")
        },
        mashang3() {
            alert("额")
        }
    }
  }
  </script>
  
  <style scoped>
  .d6 {
    background-color: rgb(250, 244, 241);
}
.d7 {
    padding: 2% 0%;
    background-color: rgb(250, 244, 241);
}
.p2 {
    margin-left: 5%;
    font-size: 40px;
    font-weight: 1000;
    background-color: rgb(250, 244, 241);
}
hr {
    border: none;
    height: 1px;
    background-color: rgb(203, 195, 195);
}
.d8 {
    background-color: white;
    display: inline-block;
}
.feng {
    display: inline-block;
    margin: 55px;
}
.hh2 {
    font-size: 30px;
    font-weight: 1000;
}
.pp2 {
    font-size: 15px;
    font-weight: 500;
}
a.ma2 {
    color: rgb(63, 117, 233);
    font-size: 20px;
    text-decoration: none;
    cursor: pointer;
}
  </style>
  