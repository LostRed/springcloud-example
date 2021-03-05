package info.lostred.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//Ribbon和Eureka整合后，客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient //Eureka的客户端
@EnableFeignClients(basePackages = {"info.lostred.springcloud.service"})
public class FeignConsumer {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer.class, args);
    }
}
