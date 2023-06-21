package scala.test;

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 17:56
 */
public class TestAccess {
    public static void main(String[] args) throws Exception {

        /*TODO 权限
        权限的应用： 用户和平台 （User，vip，superadmin)
        java权限：以方法为例，方法的提供者和方法的调用者之间的关系，决定了访问权限
        1. private:   私有的，   同类
        2. (default): 包权限，   同类，同包
        3. protected: 受保护权限，同类，同包，子类
        4. public:    公共，     同类，同包，子类，所以类
         */

        // TODO 对象有什么方法？
        AAA aaa = new AAA();
        aaa.hashCode(); //public native hashCode
        /* proteced native clone;
         clone方法来自Object，AAA对象有clone方法
         clone方法的提供者  java.lang.Object
                   调用者  test.TestAccess   ~~scala.test.AAA  [按理说，AAA是object的子类]~~
                                 - 在当前main方法执行时，构建了aaa对象，并调用aaa对象的克隆；
                                 - JAVA虚拟机调用了TestAccess的main方法
                           - 虽说，所有类都继承object
                           - 但TestAcess和Object没有父子关系！！！ 【Notes_bili.md,88】

        */
        //这里的 . 不是调用的意思；表示【从属关系】：你的clone（）方法“属于”aaa
        //                             -- 类比c06/scala_object_import


        //aaa.clone();  //报错！！！【'clone()' has protected access in 'java.lang.Object'】



        /*
         clone方法来自Object，BBB对象有clone方法, 并且@override
         clone方法的提供者  test.BBB
                   调用者  test.TestAccess
         以上两者同包，不会报错  -- but still CANNOT RUN ?????
         */
//        BBB bbb = new BBB();
//        bbb.clone();

    }

}

class AAA {
}

class BBB {
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}