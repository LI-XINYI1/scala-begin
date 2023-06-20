package scala.test;

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/17 - 16:45
 */
public class TestOper {

    public static void main(String[] args){
        // JDK1.5后，java可以将基本数据类型和引用数据类型（包装类）进行自动转换
        // 装箱 & 拆箱
        // 基本数据类型 => 装箱(包装类型.valueOf) => 包装类型
        Integer i = 100;
        Integer j = 100;
        System.out.println(i==j); //true
        // 小于127，从同一块缓存内存取出

        //超过127（虚拟机），放在IntegerCache里，不相等，不过其他值也可能相等，和底层配置有关
        Integer i0 = 200;
        Integer j0 = 200;
        System.out.println(i0==j0); //false



        //赋值运算符： 将等号右边的计算结果给左边
        int i1 = 0;
        int i2 = 0;
        // ++在后，先赋值，再加一；在前，先加一，再赋值
        // ++运算不是原子性运算（atomic），会有多步操作
        // 多个步骤间会存在临时计算结果
        int j1 = i1 ++; // _tmp = i = 0; i = 0+1; i = _tmp = 0;
        int j2 = ++ i2;
        System.out.println(" i2 = " + i1); //1
        System.out.println(" j2 = " + j1); //0
        System.out.println(" j2 = " + j2); //1


    }

    // TODO 逻辑运算与或 - 空指针
    // TODO 判断字符串是否非空
    // 不是null  并且  不是空字符串
    public static boolean isNotEmpty(String s) { //如果按位与，s 为空，会发生空指针
        // 左边不成立时，不会执行右边
        return s != null && !"".equals(s.trim());
        // s != null & !"".equals(s.trim());  //位与：右边仍会执行 - 发生空指针
    }

}
