# 没有办法的获取到收款推送的办法

#### 目前个人收款现状

##### 个人申请支付接口现状

- 原生支付宝，微信支付

- `支付宝只服务于有营业执照、个体工商户的商户。就算你有钱但没实体店铺在某宝上也是买不到的。截止目前无法以个人身份（或以个人为主体）直接申请API。网上那些 “个人申请支付宝xx接口” 的文章就不要看了，节约时间。微信同支付宝，不支付个人申请。`
    
##### 原先的方法不管用了

- 最好的方法是抓取与支付宝绑定的邮件，但是只要你绑定了电话，支付包就不发邮件和短信提醒你有收款到帐了。

- 抓自己支付宝网页版的账单，这个关键在于复制出cookie,原先一个cookie可以使用一个月，现在是动态的5分钟就变了。使用模拟登录，支付宝的风控很厉害，导致模拟登录容易被封。



#### 实在是没有法子的办法

- 手机安装一个app,然后这个服务监听手机收到的通知，如果是收到收款的通知，就把信息推送到指定的url去。

#### 本软件使用方法

- 安装后先将软件加入系统白名单，各个安卓系统的方法各有不同

- 打开软件自动跳转到获取通知权限页面，允许本应用监控通知

- 返回到软件主页，填写你要接受收款信息通知的url,软件在接到收款通知后，会用post的方法，发送json信息.

- 详细使用方法，参考[wiki](https://github.com/WeihuaGu/receiptnotice/wiki)

#### 这个可搭配服务端项目

|getreceipt-server |
|:-|
|[getreceipt-server](https://github.com/WeihuaGu/getreceipt-server)|

##### 捐助
[![](https://img.shields.io/badge/%E6%8D%90%E5%8A%A9-%E6%94%AF%E4%BB%98%E5%AE%9D%7C%E5%BE%AE%E4%BF%A1%7C%E4%BA%91%E9%97%AA%E4%BB%98%7CPayPal-green.svg)](https://weihuagu.github.io/donate)

##### 引用项目
| ||
|-|-|
|本软件从NLservice修改而来| [NLservice](https://github.com/WHD597312/NLservice)|
|实时logcat | [Lynx](https://github.com/pedrovgs/Lynx) |

##### 开源许可
本项目使用标准的apache2.0许可
