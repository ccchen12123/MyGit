<template>
    <div class="d2">
      <div class="d4">
        <div class="nan">
            <img src="@/assets/男生.png" class="nan1">
        </div>
        <div class="gaoji">双屏学习</div>
        <div class="meiren">双屏学习，小屏视频互动，大屏实际操作，学习无障碍。打开浏览器，即刻开始编程</div>
        <a @click="liaojie" class="liao" name="liaojie1">了解详细</a>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: 'Banner',
    methods: {
      liaojie() {
        alert("允许启动！！！")
      }
    }
  }
  </script>
  
  <style scoped>
  /* 在这里添加组件的样式 */
  .d2 {
    margin: 0;
    padding: 0;
    border: 0;
}
.d4 {
    background-color: rgb(250, 244, 241);

}
.nan {
    width: auto; /* 盒子也要自动缩放 */
    height: auto;
    max-width: 100%;
    max-height: 100%;
    background-size: cover;
}
.nan1 {
    margin-top: 7%;
    margin-left: 5%; /* 居中 */
    width: auto; /* 宽度自动调整 */
    height: auto; /* 高度自动调整 */
    max-width: 100%; /* 最大宽度为父元素的100% */
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
  