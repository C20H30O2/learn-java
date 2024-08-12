package object_riented;

/**
 * ClassName: class_defined
 * Package: object_riented
 * Description:
 *
 * @Author C20H30O2
 * @Create 2024/8/11 21:14
 * @Version 1.0
 */
public class class_for_test {
    String name;//成员变量 又叫属性或者field（字段，域）


    //成员变量（属性） 和 局部变量
    //成员变量：声明在类内，方法外的变量
    //局部变量：声明在方法，构造器内部的变量

    //相同点：1.变量声明的格式相同  2.都有其作用域 出了作用域就失效了
    //属性：随着对象的创建而创建 随着对象的消亡而消亡
    //局部变量：随着方法对应的栈帧入栈，局部变量会在栈中分配，随着方法对应的栈帧出栈，局部变量消亡


    //不同点：1.类中声明的位置不同   2.在内存中分配的位置不同
    //一个类的对象创建后  这个对象的对象名放在栈区存储一个地址   该地址指向堆区存储着对象属性的地方
    //就是说一般的局部变量存储在栈区  而类对象的成员变量存储在堆区
    //不同点 3:属性可以使用权限修饰符进行修饰   局部变量不能使用任何权限修饰符进行修饰
    //权限修饰符(用于表明所修饰的结构可调用范围的大小）：public , protected , 缺省（不写就是缺省） ，private
    //4。属性有默认初始化值（在创建对象后且对对象的属性赋值之前就能将属性值打印出来，不会报错）    但是局部变量必须在使用前进行赋值，否则会报错


    int price;
    int[] arr;
    class2_for_test datetime;//在类中又套了一个类


    //java中的方法（method，函数）不能脱离类而存在 必须定义在类中
    //方法声明的格式    权限修饰符  [其他修饰符]   返回值类型   方法名(形参列表)  [throws 异常类型] {  //方法头
    //                      //方法体
    //                  }
    //注意：[]的部分不是必须的 以后再讲

    public void showprice() {//成员方法
        System.out.println(price);
        showarr();//这说明 1：可以调用之后才声明的成员方法，这里不需要考虑声明的次序  2：成员方法中可以调用成员方法
        //showprice();//不正确的递归会导致栈溢出
    }

    public void showarr() {
        System.out.println(arr);
    }


    public int lenarr() {
        return  arr.length;  //return 不仅在有返回值时用于返回值    还可以在直接使用使方法停止
    }


    public void printarr(){
        for (int i = 0; i < arr.length; i++) {
            if(i>=1){
                return;//当i==1时直接停止方法
            }
        }
    }


}