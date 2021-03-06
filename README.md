# springcloud-sample

> 本工程为一个SpringCloud的例子，大部分使用了Netflix的组件，供学习使用


## 项目模块说明

```
springcloud-example   
├── springcloud-api                             // 接口(实体类、暴露的服务API、服务降级)
├── springcloud-config-client                   // config客户端案例模块(无实际意义)
├── springcloud-config-eureka                   // 注册中心(使用云端config配置)
├── springcloud-config-provider                 // 微服务(使用云端config配置)
├── springcloud-config-server                   // config服务端模块(10010)(访问git上的配置)
├── springcloud-consumer-feign                  // 使用feign的服务消费模块(80)(无实际意义)
├── springcloud-consumer-hystrix-dashboard      // 使用hystrix监控面板(9001)
├── springcloud-consumer-ribbon                 // 未使用feign的服务消费模块(80)(无实际意义)
├── springcloud-eureka-node-01                  // 注册中心集群节点01(7001)
├── springcloud-eureka-node-02                  // 注册中心集群节点02(7002)
├── springcloud-eureka-node-03                  // 注册中心集群节点03(7003)
├── springcloud-provider-01                     // 微服务集群节点01(8001)
├── springcloud-provider-02                     // 微服务集群节点02(8002)
├── springcloud-provider-03                     // 微服务集群节点03(8003)
├── springcloud-provider-hystrix                // 带熔断机制的微服务(8004)
└── springcloud-provider-zuul                   // 用户访问的网关(10000)
```

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
