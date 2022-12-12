package lambda;

public class LambdaTest {
    public static void main(String[] args) {
//        //无参数无返回值接口
//        Lambda lambda = () -> {
//            System.out.println("无参数无返回值");
//        };
//        lambda.test();

        //有参数无返回值接口
//        Lambda lambda = (age) -> {
//            System.out.println("有参数无返回值" + " " + age);
//        };
//        lambda.test(18);

        //有参数有返回值
        Lambda lambda = ((name, age) -> {
            System.out.println("name=" + name + " " + "age=" + age);
            return age + 1;
        });
        int num = lambda.test("张三", 18);
        System.out.println(num);
    }
}


