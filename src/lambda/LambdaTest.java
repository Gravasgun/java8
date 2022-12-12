package lambda;

import org.junit.Test;

public class LambdaTest {
//    @Test
//    public void test01() {
//        //无参数无返回值接口
//        Lambda lambda = () -> {
//            System.out.println("无参数无返回值");
//        };
//        lambda.test01();
//    }
//
//    @Test
//    public void test02() {
//        //有参数无返回值接口
//        Lambda lambda = (age) -> {
//            System.out.println("有参数无返回值" + " " + age);
//        };
//        lambda.test02(18);
//    }

    @Test
    public void test03() {
        //有参数有返回值
        Lambda lambda = ((name, age) -> {
            System.out.println("name=" + name + " " + "age=" + age);
            return age + 1;
        });
        int num = lambda.test03("张三", 18);
        System.out.println(num);
    }
}


