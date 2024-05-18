// webpack.config.js
module.exports = {
    module: {
      rules: [
        // 使用 babael-loader 对 JS 文件进行转换
        {
          test: /\.js$/,
          use: {
            loader: 'babel-loader',
            options: {
              // 转换不同的功能就使用不同的插件。此处使用 Babel 中转换箭头函数的插件来转换箭头函数
              plugins: [
                '@babel/plugin-transform-arrow-functions',
              ]
            }
          }
        }
      ]
    }
  }
  