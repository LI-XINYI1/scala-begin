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




问题
