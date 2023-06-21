package scala.test;

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 17:01
 */
public class TestThread {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();


        // TODO sleep & wait 方法的区别
        // sleep - static静态的 - 属于类，和对象无关  （斜体）
        t1.sleep(1000);   //休眠的线程不是t1（与t1无关）; 哪个线程调用sleep方法，哪个线程休眠
        // wait -   成员的      - 属于对象
        t2.wait(); //等待的线程是t2
    }
}
