package org.spring.springboot.property;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : xy
 * @date : 2021/8/6 9:46
 */
@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 爱好
     */
    private String hobby;
    /**
     * 编号
     */
    private String pid;
    /**
     * 描述
     */
    private String desc;
}
