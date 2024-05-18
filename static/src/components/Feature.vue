<template>
  <div class="d2">
    <div class="d5">
      <div class="nan">
          <img src="@/assets/女生.png" class="nv">
      </div>
      <div class="gaoji">高级Web编程实验室</div>
      <div class="meiren">每人拥有自己完全独立的编程实验室，内置所有基础软件及学习素材。打开浏览器，即刻开始编程！</div>
      <a @click="liaojie" class="liao" name="liaojie1">了解详细</a>
    </div>
  </div>
</template>
  
  <script>
  export default {
    name: 'Feature',
    methods: {
      liaojie() {
        alert("允许启动！！！")
      }
    }
  }
  </script>
  
  <style scoped>
  .d2 {
    margin: 0;
    padding: 0;
    border: 0;
}
.d5 {
    max-width: 100%;
    max-height: 100%;
    background-color: rgb(250, 244, 241);
}
.nv {
    margin-top: 7%;
    margin-left: 5%; /* 居中 */
    width: auto; /* 宽度自动调整 */
    height: auto; /* 高度自动调整 */
    max-width: 100%; /* 最大宽度为父元素的100% */
}
.nan {
    width: auto; /* 盒子也要自动缩放 */
    height: auto;
    max-width: 100%;
    max-height: 100%;
    background-size: cover;
}
.gaoji {
    margin-top: 3%;
    margin-left: 5%;
    font-size: 50px;
    font-weight: 1000;
}
.meiren {
    margin-top: 1%;
    margin-left: 5%;
    margin-bottom: 2%;
    font-size: 24px;
}
a.liao {
    margin-top: 2%;
    margin-left: 5%;
    border: 1px solid black;
    border-radius: 5px;
    font-size: 24px;
    color: rgba(72, 74, 74, 0.801);
    padding: 8px 42%;
    text-align: center;
    text-decoration: none;
    background-color: rgb(250, 244, 241);
}
.liao:hover {
    background-color: aliceblue;
}
  </style>
  