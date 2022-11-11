# SpringCloudDemo
开发环境：IDEA、MySQL

所用技术：

项目描述：基于SpringCloudAlibaba的选车、租车、支付业务分布式微服务方式实现，通过这个模块将支持用户的租车环节，使用分布式微服务方式可有效实现负载均衡，保证系统稳定

项目职责：

搭建Nocos注册中心
实现租车服务，有三个端口表示租车系统，模拟集群环境
实现订单服务，支持订单的查询和新增
订单操作会调用租车系统，使用openFeign实现负载均衡
采用SpringCloud Gateway实现网关，保证内部服务访问的安全性

项目收获：

对SpringCloudAlibaba的微服务搭建操作进一步熟练
对SpringCloudAlibaba中的核心组件有了进一步认识与掌握
