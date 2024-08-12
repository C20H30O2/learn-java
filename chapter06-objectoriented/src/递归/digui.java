package 递归;

/**
 * ClassName: digui
 * Package: 递归
 * Description:
 *
 * @Author C20H30O2
 * @Create 2024/8/12 15:25
 * @Version 1.0
 */
public class digui {
    public static void main(String[] args){
        digui test1=new digui();

        //递归举例1：计算100以内的和
        int end=test1.getsum(100);
        System.out.println(end);


    }
    public int getsum(int num){
        if(num>0){
            return num+getsum(num-1);
        }else{
            return 0;
        }
    }



    //递归举例其他：求阶乘  快速排序  汉诺塔  斐波那契数列

}
