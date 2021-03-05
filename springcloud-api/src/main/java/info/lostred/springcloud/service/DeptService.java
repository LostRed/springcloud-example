package info.lostred.springcloud.service;

import info.lostred.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "springcloud-provider") //标记为Feign客户端，并关联注册中心中的某个服务
public interface DeptService {

    @PostMapping("/dept/add")
    boolean addDept(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept queryById(@PathVariable("id") Long id);

    @GetMapping("dept/list")
    List<Dept> queryAll();
}
