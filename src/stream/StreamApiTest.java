package stream;

import bean.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiTest {

    public List<User> getUserList() {
        User user1 = new User(1, "zhangsan", 20, 3000.0);
        User user2 = new User(2, "lisi", 21, 4000.0);
        User user3 = new User(3, "wangwu", 20, 5000.0);
        User user4 = new User(4, "zhaoliu", 20, 6000.0);
        User user5 = new User(5, "qianqi", 20, 7000.0);
        User user6 = new User(6, "bob", 20, 8000.0);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        return list;
    }

    //����stream ��ʽһ��ͨ�����ϣ�����.stream()
    @Test
    public void test01(){
        //stream()����һ��˳����
        Stream<User> stream = getUserList().stream();
        //parallelStream()����һ��������������߳�ͬʱȡ����
        Stream<User> parallelStream = getUserList().parallelStream();
    }

    //����stream ��ʽ����ͨ������ķ�ʽ,Arrays.stream(����)
    @Test
    public void test02(){
        int[] arr=new int[]{1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
    }

    //����stream ��ʽ��:ͨ��Stream.of()
    @Test
    public void test03(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
    }

}
