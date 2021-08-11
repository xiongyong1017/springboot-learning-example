package org.spring.springboot.property;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * person属性
 *
 * @author : xy
 * @date : 2021/8/6 9:34
 */
@Getter
@Setter
@ToString
public class PersonProperties1 {
    /**
     * 姓名
     */
    @Value("${person.name}")
    private String name;
    /**
     * 年龄
     */
    @Value("${person.age}")
    private Integer age;
    /**
     * 爱好
     */
    @Value("${person.hobby}")
    private String hobby;
    /**
     * 编号
     */
    @Value("${person.pid}")
    private String pid;
}
