package info.lostred.springcloud.config;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //配置负载均衡实现RestTemplate

    /**
     * <p>IRule的choose方法实现类：</p>
     * <p>{@link RoundRobinRule} - 轮询</p>
     * <p>{@link RandomRule} - 随机</p>
     * <p>{@link AvailabilityFilteringRule} - 先过滤掉跳闸、访问故障的服务，对剩下的进行轮询</p>
     * <p>{@link RetryRule} - 会先按轮询获取服务，如果服务获取失败，则会在指定的时间内进行重试</p>
     *
     * @return Rest模板
     */
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
