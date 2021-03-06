package info.lostred.springcloud.controller;

import info.lostred.springcloud.pojo.Dept;
import info.lostred.springcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ConsumerController {
    @Resource
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept) {
        return deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll() {
        return deptClientService.queryAll();
    }
}
