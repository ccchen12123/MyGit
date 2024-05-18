<template>
    <div id="registerDiv">
      <form id="form">
        <h1 style="text-align: center;color: aliceblue;">注册</h1>
        <p><span color="red">*</span>用户名:<input v-model="username" class="in1" type="text"></p>
        <span v-if="!username1" class="error">x用户名不能为空!</span>
        <p><span color="red">*</span>密码:  <input v-model="password" class="in2" type="password"></p>
        <span v-if="!password1" class="error">x请输入密码</span>
        <p><span color="red">*</span>确认密码:  <input v-model="confirmPassword" class="in3" type="password"></p>
        <span v-if="!confirmPassword1" class="error">x请再次输入密码</span>

        <div style="text-align: center;margin-top: 30px;">
          <button type="submit" class="button" @click="register">提交</button>
          <input type="reset" class="button" value="重置">
          <button class="button" @click="goBack">返回</button>
        </div>
      </form>
    </div>
  </template>

<script>
import axios from 'axios';

export default {
    data() {
        return {
            username: '',
            password: '',
            confirmPassword: '',
            username1:true,
            password1:true,
            confirmPassword1:true
        };
    },
    methods: {
      register() {
        if(this.username=='') this.username1=false;
        if(this.password=='') this.password1=false;
        if(this.confirmPassword=='') this.confirmPassword1=false;
        if(!this.username1 || !this.password1 || !this.confirmPassword1){
            username1=true
            password1=true
            confirmPassword1=true
            return;
        }
        axios.post('http://localhost:3000/users', {
          username: this.username,
          password: this.password
        })
        .then(response => {
          console.log(response.data);
          alert("注册成功！");
          // 注册成功后的处理
        })
        .catch(error => {
          console.error(error);
          alert("注册失败");
        });
    },
        goBack() {
            // 返回操作
        }
    }
};
</script>

<style scoped>
.error {
  left: 20px;
  color: red;
  font-size: 20px;
}

* {
            margin: 0;
            padding: 0;
        }
         
        #registerDiv {
            width: 37%;
            display: flex;
            justify-content: center;
            align-items: center;
            width: 600px;
            height: 400px;
            background-color: rgba(199, 231, 118, 0.728);
            box-shadow: 7px 7px 17px rgba(52, 56, 66, 0.5);
            border-radius: 5px;
        }

        p {
            margin-top: 30px;
            margin-left: 20px;
            color: rgb(221, 51, 16);
        }
         
        .in1 {
            margin-left: 25px;
            border-radius: 5px;
            border-style: hidden;
            height: 30px;
            width: 140px;
            background-color: rgba(16, 15, 16, 0.5);
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }

        .in2 {
            margin-left: 37px;
            border-radius: 5px;
            border-style: hidden;
            height: 30px;
            width: 140px;
            background-color: rgba(16, 15, 16, 0.5);
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }
        .in3 {
            margin-left: 5px;
            border-radius: 5px;
            border-style: hidden;
            height: 30px;
            width: 140px;
            background-color: rgba(16, 15, 16, 0.5);
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }
        .button {
            border-color: cornsilk;
            background-color: rgba(100, 149, 237, .7);
            color: aliceblue;
            border-style: hidden;
            border-radius: 5px;
            width: 100px;
            height: 31px;
            font-size: 16px;
        }
        .button:hover {
            background-color: #0056b3; /* 鼠标悬停时的背景色 */
        }

</style>