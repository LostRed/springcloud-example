# springcloud-example

> 本工程为一个SpringCloud的例子，大部分使用了Netflix的组件，供学习使用

> 其中注册中心的域名eureka-server-01，eureka-server-02，eureka-server-03需要修改本地的hosts文件来模拟集群

## 使用组件的步骤
1. 引入依赖
2. 编写配置文件
3. 开启这个功能
4. 配置类

## 五大组件的关系
- Eureka作为服务的注册中心自成一个模块
- 微服务各自为一个模块，这些微服务可以是服务提供者也可能是服务消费者
- Ribbon实现相同微服务之间调用的负载均衡
- Feign能够暴露微服务模块中的某些API接口给其他微服务调用
- Hystrix实现微服务之间调用的熔断与降级
- Zuul作为用户访问服务的入口，起到路由和过滤的作用

## Config的运行机制  
- config存在服务提供者模块中，通过bootstrap.yml中配置config服务端，实现从远程获取该模块的配置，实现配置与程序的解耦