package com.itheima;


/**
 * 013 package
 * 包其实就是文件夹
 * 作用：对类进行分类管理
 * 格式：package 包名；（多级包用.分开）
 *    🌰：package com.itheima;
 *
 * 自动建包：
 *      javac -d . Hellopackage.java
 * 运行包内容：
 *      java com.itheima.Hellopackage
 */
public class Hellopackage {
    public static void main(String[] args) {
        System.out.println("Hellopackage");
    }
}
