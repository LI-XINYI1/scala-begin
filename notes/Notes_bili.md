6. 反编译-字节码 [test\Test,Emp,User.class] </br>
观察：test中对1Emp和User分别调用.age </br>
- User  age + print messgae (static age)
- Emp  只有 age (static final age)

反编译： </br>
out/../Emp right-click open-in-terminal   （out是编译后的字节码，src里是源码） </br>
javap -v User  
javap -v Emp

User 在执行完 static{} 静态方法后， age由0:bipush 赋值
![img.png](img_3.png)

Emp age作为constant直接出现，属于类的一部分；
![img_4.png](img_4.png)

Test 其实没有调用Emp，直接拿到Emp的值
![img_6.png](img_6.png)




16. java中访问scala对象  [test\Test.java]</br> 
Scala01_Var.main(args); </br>

21. 数据类型
![img_7.png](img_7.png)

30. ==
装箱
![img_8.png](img_8.png)

45. 方法与函数
![img_9.png](img_9.png)
![img_10.png](img_10.png)

结构中，scala和java都用JVM编译</br>
最后都是.class文件
所以scala要编译成没有函数的文件（反编译码中，函数即为方法）
![img_11.png](img_11.png)


63. 函数对象为RETURN，多层嵌套 [c05\s06_asRET]
![img_12.png](img_12.png)

64. 闭包  </br>
若无闭包，压栈，不合理 [c05\s08]
![img_13.png](img_13.png) </br>
闭包示意图: x生命周期延长， 且闭合环境仅仅inner可用
![img_14.png](img_14.png)

82. java 类
![img_15.png](img_15.png)

88.Object的继承</br>
![img_16.png](img_16.png)
结论：TestAcess不是'AAA的父类Object'的子类，他俩没关系</br>
clone是成员方法，和对象有关系</br>
构建AAA对象时，同时构建出OBJECT父类对象（黄色）</br>
红色TestAccess有自己的OBJECT父类对象（蓝色） </br>

![img_17.png](img_17.png)
结论：BBB(AAA)override了clone后，创建了自己的clone</br>
     TestAccess对象调用同包的BBB对象的方法，不会报错</br>


93. 为什么object构建对象是单例的</br>
 ![img_19.png](img_19.png)
反编译</br>
public static 类名$ MODULE$;</br>
static{}静态代码块中，构建当前对象，并赋值给MODULE$ - private </br>
静态只执行一次，所以只有一个单例对象</br>


99. scala单继承</br>
多继承-钻石问题</br>
![img_20.png](img_20.png)


107. trait extends在反编译java里如何实现
![img_21.png](img_21.png)

110. 多个traits的初始化和执行顺序
![img_22.png](img_22.png)


116. java的集合: 侧重数据间的关系 + 数据结构之间的关系 </br>
![img_23.png](img_23.png)</br>


    /* Scala集合
    scala是面向函数式的语言，学习集合时，更侧重集合本身的功能

    数据结构上，scala的集合分为三大类：
    1. Seq: 存储有序，数据可重复
    2. Set: 存储无序，数据不可重复
    3. Map: 存储无序，KEY不可重复, VALUE可以

    数据处理上，scala的集合分为两大类：
    1. 不可变集合  scala.collection.immutable
    2. 可变集合    scala.collection.mutable
    原始数据： 处理数据时，一般从数据源获取数据，但数据的数据源一般不可以随意改变。
                        如果必须变，也是新建并替换

    String & StringBuilder
    String:        不可变字符串， 类没有提供改变其内容的方法，如果有，也是创建新的并替换旧的
    StringBuilder: 可变字符串，   可以改变自身内容

     */

116. 集合类型/trait关系图</br>
Iterable  ->  Map, Set, Seq
![img_24.png](img_24.png)
![img_25.png](img_25.png)
绿色： trait 
蓝色： class

141. list.sliding()
![img_26.png](img_26.png)
![img_27.png](img_27.png)


145. List[String].flatMap, 参数类型：String => GenTraversableOnce </br>
查看hierarchy快捷键： ctrl+H
![img_28.png](img_28.png)


163. reduceLeft迭代两两计算
![img_29.png](img_29.png)

164. reduceLeft / Right迭代两两相减</br>
错的：</br>
![img_30.png](img_30.png)
对的：</br>
![img_31.png](img_31.png)

169. 模式匹配 - java switch</br>
![img_33.png](img_33.png)
![img_32.png](img_32.png) </br>

下划线的作用</br>
![img_34.png](img_34.png)
![img_35.png](img_35.png)


178. 异常 - java
![img_38.png](img_38.png)


问题
1. testAcess.java: clone cannot access, tho override
![img_18.png](img_18.png)

173. 模式匹配 - list
![img_37.png](img_37.png)