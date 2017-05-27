package spring;

/**
 * Created by Thinkpad on 17/05/02.
 **/
public class HelloImp implements  HelloApi {
    private  String hello= "Hello World";
    public HelloImp() {
    }
    public HelloImp(String hello) {
        this.hello= hello;
    }


    public void sayhello() {
        System.out.println(hello);
    }
}
