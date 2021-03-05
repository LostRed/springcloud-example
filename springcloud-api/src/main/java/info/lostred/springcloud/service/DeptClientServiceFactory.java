package info.lostred.springcloud.service;

import feign.hystrix.FallbackFactory;
import info.lostred.springcloud.pojo.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

//降级接口
@Component
public class DeptClientServiceFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptNo(id)
                        .setDeptName("id=>" + id + "，没有对应信息，客户端提供了降级的信息，这个服务已被关闭")
                        .setDbSource("不存在数据库");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
