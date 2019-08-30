package jdk8;

import org.junit.Test;

/**
 * Created by mazg on 2019/8/30
 */
public class UseJDK8 {

    //Lambda 表达式 − Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中。

    /**
     * Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
     * Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
     * 使用 Lambda 表达式可以使代码变的更加简洁紧凑。
     * 语法如下：
     * (parameters) -> expression
     * 或
     * (parameters) ->{ statements; }
     * lambda函数的特性：
     * 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
     * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
     * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
     * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
     * lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
     * @param s
     */
    public void fun1(String s){
        System.out.println(s);

    }

    public String fun2(){

        return "我是函数";
    }

    @Test
    public void fun3(){
    }

    final static String salutation = "Hello! ";

    public static void main(String args[]){
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
    /**
     * 方法引用 − 方法引用提供了非常有用的语法，
     * 可以直接引用已有Java类或对象（实例）的方法或构造器。
     * 与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
     *
     * 差不多就是
     * 函数(对象/类名.methrod())
     * 便捷调用减少代码量
     * 看起来更简洁
     */


    //默认方法 − 默认方法就是一个在接口里面有了一个实现的方法。

    //新工具 − 新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps。

    //Stream API −新添加的Stream API（java.util.stream） 把真正的函数式编程风格引入到Java中。

    //Date Time API − 加强对日期与时间的处理。

    //Optional 类 − Optional 类已经成为 Java 8 类库的一部分，用来解决空指针异常。

    //Nashorn, JavaScript 引擎 − Java 8提供了一个新的Nashorn javascript引擎，它允许我们在JVM上运行特定的javascript应用。
}
