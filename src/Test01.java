/**
 * ClassName: Test01
 * Package: PACKAGE_NAME
 * Description:记录一些快捷方式和常用方法
 *
 * @Author C20H30O2
 * @Create 2024/8/9 20:00
 * @Version 1.0
 */
public class Test01 {
        public static void main(String[] args){
            int a=1;
            System.out.println(a);//此处输入 a.sout回车可以快捷输出




            //C语言形式的数组声明和定义没有问题但是会有警告
            int b[]={1,2,3,4};
            System.out.println(b[1]);

            int[] c;
            c=new int[2];
            c[0]=2;

            int[] d=new int[]{1,1};


            for (int i = 0; i < d.length; i++) { //fori回车快速生成for循环结构
                System.out.println(d[i]);}


            /**
             *  打出/**之后回车可以快速生成文档注释
             */


        }
}
