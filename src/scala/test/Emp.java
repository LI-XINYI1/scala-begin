package scala.test;

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/17 - 11:12
 */
public class Emp {
    //和USER比加了FINAL
    public static final int age = 30;
    static  {
        System.out.println("Emp ...");
    }

    // out/../Emp right-click open-in-terminal
    // javap -v User  反编译
}
