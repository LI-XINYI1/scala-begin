package scala.test;

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/21 - 11:19
 */
public class TestOverwrite {
    public static void main(String[] args){

        /*TODO 方法的重写OverWRITE
        1. 存在父子关系
        2. 不适用于子类的场合，改变父类的实现
        3. 方法名相同，参数列表相同，异常不能超出父类的范围（总的异常范围）
        -- 子类重写方法的权限 不能低于 父类的方法
        4. 重写方法后，子类的方法可以代替父类的方法
         */

        CC cc = new CC();
        System.out.println(cc.sum());  //20

        DD dd = new DD();
        System.out.println(dd.sum());  //40

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // 方法的重写 === 在同一个内存区域中存在两个一样的方法，该如何区分的问题
        // JVM在调用对象的成员方法时，会遵循【动态绑定机制】
        // TODO 【动态绑定机制】
        //      在方法运行时，将方法和当前运行对象的实际内存进行绑定，然后调用
        // 动态绑定机制和属性（i）没有任何关系，属性在哪里，声明在哪里使用
        CC ccd = new DD();   //ccd的实际内存是DD
        System.out.println(ccd.sum());  //使用DD位置的方法 -- 40

        //变化1:
        // 当comment掉DD的sum（）时 - 不overwrite
        // ccd在DD里没找到sum(),找到父类CC的sum() -- outptu:40

        //变化2：
        //i由getI调用，并且 comment掉DD的sum（）时
        //ccd在DD里没找到sum(),找到父类CC的sum()
        // sum()调用成员方法getI(),遵循动态绑定，先在DD内存区域里找getI
        // 所以，DD区域的getI return i=20
        //      CC区域的sum 计算 20 + 10 return 30    ------outptu: 30

    }
}

class CC{
    public int i=10;
    public int sum(){ return getI()+10;}
    public int getI(){ return i;}
}
class DD extends CC{
    public int i=20;
//    public int sum(){ return i+20;}
//    // Overwrite时：
//    // 不允许： private int sum()
//    // 不允许： throw reception
//
    public int getI(){ return i;}


}