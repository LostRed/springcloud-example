package info.lostred.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启Hystrix监控页面
public class ConsumerDashboard {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashboard.class, args);
    }
}
