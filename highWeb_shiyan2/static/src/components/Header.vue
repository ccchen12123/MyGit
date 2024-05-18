<template>
    <div class="d1">
      <div class="d2">
          <img src="@/assets/yun.png" class="s1">
          <ul class="u1">
              <a @click="showLoginclick" class="sub1" name="submit1">登录</a>
              <a @click="showRegisterclick" class="sub1" name="submit2">注册</a>
          </ul>

        <div class="modal" v-if="showLogin || showRegister">
          <div class="modal-content">
            <!-- 关闭按钮 -->
            <span class="close" @click="closeModal">&times;</span>
            <!-- 登入组件 -->
            <Login v-if="showLogin" @close="closeModal"></Login>
            <!-- 注册组件 -->
            <Register v-if="showRegister" @close="closeModal"></Register>
          </div>
        </div>

        <div class="d3">
          <div class="yun">云端编程，浏览器里边学习边练</div>
          <p class="p1">软件定义一切，网络连接时空，学习软件技术，创造未来世界。</p>
        </div>
        <div class="d22">
          <ul class="u2">
            <a @click="xuexi" class="ma1" name="xuexi1">马上学习</a>
          </ul>
        </div>
      </div>
    </div>
  </template>
  
  <script scoped>

  import Login from '@/components/Login.vue'
  import Register from '@/components/Register.vue'
  
  export default {
    name: 'Header',
    components: {
      Login,
      Register
    },
    data() {
      return {
        showLogin: false,
        showRegister: false
      };
    },
    methods: {
      showLoginclick() {
        this.showLogin = true;
        this.showRegister = false;
      },
      showRegisterclick() {
        this.showRegister = true;
        this.showLogin = false;
      },
      closeModal() {
      // 关闭模态框时同时隐藏登入和注册组件
      this.showLogin = false;
      this.showRegister = false;
      },
      xuexi() {
        alert("不准学！！！")
      }
    }
  }
  </script>
  
  <style scoped>
  .d1 {
    background: url("../assets/蓝头.jpg");
  }
  .d22 {
    padding: 5%;
  }
  .d2 {
    padding: 0;
  }
  .s1 {
    margin-top: 2%;
    margin-left: 1%;
  }
  .u1 {
    margin-left: 65%;
    display: inline-block;
  }
  .d3 {
    margin: 0;
    padding: 0;
    border: 0;
}
.yun {
    margin-top: 80px;
    font-size: 60px;
    font-weight: 1000;
    color: white;
    text-align: center;
}
.p1 {
    margin-top: 20px;
    font-size: 20px;
    color: white;
    text-align: center;
}
.u2 {
    margin-top: 5%;
    text-align: center;
}
a.ma1 {
    color: rgb(63, 117, 233);
    font-size: 30px;
    background-color: white;
    text-align: center;
    padding: 14px 26px;
    text-decoration: none;
    cursor: pointer;
}
a.ma1:hover {
    background-color: skyblue
}
a.sub1 {
    border: 1px solid;
    border-color: white;
    border-radius: 5px;
    line-height: 32px;
    padding: 10px 16px;
    cursor: pointer;
    /*辅助样式*/
    color: white;
    background-color: none;
    text-decoration: none;
}
.sub1:hover {
    background-color: rgb(121, 227, 233);
}
.modal {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5); /* 半透明黑色背景 */
  z-index: 999; /* 确保模态框在最上层 */
  display: flex;
  justify-content: center;
  align-items: center;
}
.modal-content {
  background-color: white;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
  max-width: 80%;
  width: 600px; /* 模态框宽度 */
  height: 400px;
  position: relative; /* 让关闭按钮相对于模态框定位 */
}
.close {
  position: absolute;
  top: 10px;
  right: 10px;
  cursor: pointer;
  font-size: 20px;
}
.close:hover {
  color: red;
}
  </style>
  