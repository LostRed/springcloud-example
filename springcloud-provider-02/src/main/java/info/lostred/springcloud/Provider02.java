package info.lostred.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //Eureka客户端启动类，自动在服务启动后自动注册到Eureka中
@EnableDiscoveryClient //服务发现
public class Provider02 {
    public static void main(String[] args) {
        SpringApplication.run(Provider02.class, args);
    }
}
