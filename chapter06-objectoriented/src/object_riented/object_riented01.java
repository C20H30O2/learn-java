package object_riented;

/**
 * ClassName: object_riented01
 * Package: object_riented
 * Description:
 *
 * @Author C20H30O2
 * @Create 2024/8/11 21:12
 * @Version 1.0
 */
public class object_riented01 {
    public static void main(String[] args){
        class_for_test object1=new class_for_test();//创建一个实例对象

        //创建后的对象的属性具有初始值  各种类型默认初始值的设定和之前提到的是一样的
        System.out.println(object1.name);//比如String的name  其初始值和一般的String一样都是null


        object1.name="jack";
        object1.price=12;
        object1.arr=new int[]{1,2,3};
        object1.datetime=new class2_for_test();
        object1.datetime.date=System.currentTimeMillis();

        object1.showprice();


        class_for_test object2=object1;//这样o1和o2就指向了堆区的同一处  修改o2等于修改o1

        String str=new String();

    }


    //注意：类里面可以定义类   方法里面不能定义方法
    public class classfortest{

    }
}
