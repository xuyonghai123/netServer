package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Thinkpad on 17/05/02.
 **/
public class HelloTest {
    @Test
    public void testhelloworld(){
        //1.实例化Spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-test.xml","import.xml"});
        /*2.通过getbean方法获取bean hello,获取bean的方式有
            根据名称返回一个bean，getBean（"name）
            根据名称和指定类型类型返回一个bean，
            根据指定类型类型返回一个bean，
            根据指定类型返回一个键值为名字和值为bean对象的map，如果没有bean对象存在则返回空
        */
        HelloApi helloApi = context.getBean("helloid",HelloApi.class);

        HelloApi helloApi1 = context.getBean("bean1",HelloApi.class);

//        HelloApi helloApi1 = context.getBean(HelloApi.class);
//        Map map = context.getBeansOfType(HelloApi.class);
        helloApi.sayhello();
        helloApi1.sayhello();
//        System.out.println(map);
        //3.使用bean
//        helloApi.sayhello();
    }
}
