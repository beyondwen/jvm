package com.wenhao.jvm.classloader;

/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 * 当一个类在初始化时，要求其父类要全部初始化完毕了，子类才初始化
 * -XX:+TraceClassLoading 用于追踪类的加载信息并打印出来
 * -XX:+<option>,表示开启option选项
 * -XX:-<option>,表示关闭option选项
 * -XX:<option>=<value>,表示option选项的值设置为value
 */
public class Mytest1 {
    public static void main(String[] args) {
        //此处子类调用str，因为str是定义在父类中的，没有主动使用MyChild1
        System.out.println(MyChild1.str);
    }
}
class MyParent1{
    public static String str = "hello world";
    static {
        System.out.println("Parent block");
    }
}
class MyChild1 extends MyParent1{
    //public static String str = "hello world child";
    static {
        System.out.println("Child block");
    }
}
