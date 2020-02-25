package com.wenhao.jvm.classloader;

/**
 * 对于数组类型实例来说，其类型是由JVM在运行期动态生成的，表示为[Lcom.wenhao.jvm.classloader.MyParent4
 * 这种形式，动态生成的类型，其父类型就是Object
 * 对于数组来说，JavaDoc经常将构成数组的元素为Component，实际上就是将数组降低一个维度后的类型
 *
 * anewarray:表示创建一个引用类型的(如类，接口，数组)数组，并将其引用值压入栈顶
 * newarray: 表示创建一个指定的原始类型(如int,float,char)的数组，并将其引用值压入栈顶
 */


public class MyTest4 {
    public static void main(String[] args) {
        //MyParent4 myParent4 = new MyParent4(); 可以初始化
        MyParent4[] myParent4s = new MyParent4[1]; //不可以初始化
        System.out.println(myParent4s.getClass());
        int[] ints = new int[1];
        System.out.println(ints.getClass());
    }
}

class MyParent4 {
    static {
        System.out.println("MyParent4 static code");
    }
}
