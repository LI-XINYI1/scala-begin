package scala.test;

import scala.main.c02DataType.Scala01_Var;

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/17 - 11:08
 */
public class Test {
    public static void main(String[] args){

        //User: static int age
        System.out.println(User.age);

        //Emp: static final int
        System.out.println(Emp.age);

        //java中访问scala对象
        Scala01_Var.main(args);
    }


}
