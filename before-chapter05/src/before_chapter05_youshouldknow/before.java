//package before_chapter05_youshouldknow;

/**
 * ClassName: beforechapter05
 * Package: before_chapter05_youshouldknow
 * Description:由于第五章之前的java语法与C大致相同，所以不全部录入，这里只选择了部分重要的内容
 *
 * @Author C20H30O2
 * @Create 2024/8/10 15:59
 * @Version 1.0
 */
public class before {
    public static void main(String[] args){
        //在idle中项目的层次结构：项目，模块（module），包（package）  包下面才是一个个的.java文件
        //一个项目可以有多个模块也可以只有一个模块，一般多个模块分别实现不同的功能
        //一个模块下的src中可以有多个包(src是存储源码的)，一个包中可以有多个.java文件
        //.java文件经过运行后相应的模块下会出现out，out存储.class文件


        //运算符按功能分为：
//    算术运算符：+ - * / % ++ --  和C语言一样要注意++ -- 的前置和后置的区别
        int i=1;
        i=i++;
        System.out.println(i);

        //注意：取模运算的结果与被模数的符号相同
        int i1=12;
        int j1=5;
        System.out.println(i1%j1);//2

        i1=-12;
        j1=5;
        System.out.println(i1 % j1);//-2

        i1=12;
        j1=-5;
        System.out.println(i1 % j1);//2

        i1=-12;
        j1=-5;
        System.out.println(i1 % j1);//-2
//    赋值运算符：= += -= /= %= >>= <<= >>>= &= |= ^=
//    比较（或关系）运算符：> >= < <= == !=
//    逻辑运算符：& && ^ ! | ||
//    位运算符：& | ^ - << >> >>>
//    条件运算符：(条件表达式)? 结果一:结果二
//    lambda运算符：->

        //运算符按操作数分为：单目，双目，三目运算符
    }

}
