package lambda;

public class LambdaTest {
    public static void main(String[] args) {
//        //�޲����޷���ֵ�ӿ�
//        Lambda lambda = () -> {
//            System.out.println("�޲����޷���ֵ");
//        };
//        lambda.test();

        //�в����޷���ֵ�ӿ�
//        Lambda lambda = (age) -> {
//            System.out.println("�в����޷���ֵ" + " " + age);
//        };
//        lambda.test(18);

        //�в����з���ֵ
        Lambda lambda = ((name, age) -> {
            System.out.println("name=" + name + " " + "age=" + age);
            return age + 1;
        });
        int num = lambda.test("����", 18);
        System.out.println(num);
    }
}


