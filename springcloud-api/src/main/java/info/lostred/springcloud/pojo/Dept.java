package info.lostred.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
    //存在哪个数据库的字段，一个微服务对应一个数据库，同一个信息可能存在不同的数据库
    private String dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
