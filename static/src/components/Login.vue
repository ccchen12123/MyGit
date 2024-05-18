<template>
    <div id="loginDiv">
        <form action="" id="form">
            <h1 style="text-align: center;color: aliceblue;">登陆</h1>
            <p><span color: red>*</span>用户名:<input id="userNname" class="in1" type="text"><label id="name_trip"></label></p>
            <p><span color: red>*</span>密码:  <input id="password" class="in2" type="password"><label id="password_trip"></label></p>
 
            <div style="text-align: center;margin-top: 30px;">
                <button class="button" @click="login">登录</button>
                <input type="reset" class="button" value="重置">
                <button class="button">注册</button>
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
            password: ''
        };
    },
    methods: {
        login() {
            // 发送登入请求至后端接口进行验证
            // 示例代码：假如后端接口地址为：
            axios.post('http://localhost:3000/login', {
                username: this.username,
                password: this.password
            })
            .then(response => {
                console.log(response.data);
                alert("登录成功！");
            })
            .catch(error => {
                console.log(error);
                alert("登录失败！");
            });
        },
    },
};
</script>

<style scoped>
* {
            margin: 0;
            padding: 0;
        }
         
        #loginDiv {
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
            color: rgb(221, 51, 16);
        }
         
        .in1 {
            margin-left: 15px;
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
         
        .button {
            border-color: cornsilk;
            background-color: rgba(82, 135, 240, 0.7);
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