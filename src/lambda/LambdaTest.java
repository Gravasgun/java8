package lambda;

import org.junit.Test;

public class LambdaTest {
//    @Test
//    public void test01() {
//        //�޲����޷���ֵ�ӿ�
//        Lambda lambda = () -> {
//            System.out.println("�޲����޷���ֵ");
//        };
//        lambda.test01();
//    }
//
//    @Test
//    public void test02() {
//        //�в����޷���ֵ�ӿ�
//        Lambda lambda = (age) -> {
//            System.out.println("�в����޷���ֵ" + " " + age);
//        };
//        lambda.test02(18);
//    }

    @Test
    public void test03() {
        //�в����з���ֵ
        Lambda lambda = ((name, age) -> {
            System.out.println("name=" + name + " " + "age=" + age);
            return age + 1;
        });
        int num = lambda.test03("����", 18);
        System.out.println(num);
    }
}


