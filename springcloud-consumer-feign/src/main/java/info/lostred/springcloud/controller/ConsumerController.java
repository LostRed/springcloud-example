package info.lostred.springcloud.controller;

import info.lostred.springcloud.pojo.Dept;
import info.lostred.springcloud.service.DeptService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ConsumerController {
    @Resource
    private DeptService deptService;

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }
}
