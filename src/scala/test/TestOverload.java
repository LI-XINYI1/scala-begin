package scala.test;

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/21 - 11:09
 */
public class TestOverload {
    public static void main(String[] args){
        /* TODO 方法的重载OVERLOAD
        1. 方法名称相同
        2. 方法参数列表不相同（1个数，2类型，3顺序）
         */
        AA aa = new AA();
        test(aa); //aaa

        BB bb = new BB();
        test(bb); //bbb

        // 查找方法，以【类型】为基础；
        // 如果指定类型不存在，会扩大类型的范围继续查找： 父类 > 子类范围
        AA aab = new BB();
        test(aab);
    }
    public static void test(AA aa){
        System.out.println("aaa");
    }
    public static void test(BB bb){
        System.out.println("bbb");
    }

}

class AA{

}
class BB extends AA{

}