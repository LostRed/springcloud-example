package info.lostred.rule.config;

import com.netflix.loadbalancer.IRule;
import info.lostred.rule.MyRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigRule {

    /**
     * <p>自定义负载均衡策略规则 - 使用随机策略</p>
     * @return IRule接口
     */
    @Bean
    public IRule myRule() {
        return new MyRule();
    }
}
