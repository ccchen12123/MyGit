import axios from 'axios'
import qs from 'qs'
/**
 * axios的传参方式：
 * 1.url 传参 一般用于Get和Delete 实现方式：config.params={JSON}
 * 2.body传参 实现方式：config.data = {JSON}，且请求头为：headers: { 'Content-Type': 'application/json;charset=UTF-8' }
 * 3.表单传参 实现方式：config.data = qs.stringify({JSON})，且请求头为：且请求头为：headers: { 'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8' }
 */
// axios实例
const $http = axios.create({
	baseURL: 'http://localhost:8080/',
	timeout: 60000,
	headers: { 'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8' }
})
 
// 请求拦截器
// $http.interceptors.request.use(
// 	(config) => {
// 		// 追加时间戳，防止GET请求缓存
// 		if (config.method?.toUpperCase() === 'GET') {
// 			config.params = { ...config.params, t: new Date().getTime() }
// 		}
		
// 		if (Object.values(config.headers).includes('application/x-www-form-urlencoded')) {
// 			config.data = qs.stringify(config.data)
// 		}
// 		return config
// 	},
// 	error => {
// 		return Promise.reject(error)
// 	}
// )
 
// 响应拦截器
$http.interceptors.response.use(
	response => {
		const res = response.data
		return res
	},
	error => {
		return Promise.reject(error)
	}
)
// cros 跨域是否允许凭证
$http.defaults.withCredentials = true;
// 导出 axios 实例
export default $http
