/**
 * ClassName: warning_tips
 * Package: PACKAGE_NAME
 * Description:提示一些容易错误和遗忘的地方   这个文件独立出来方便查看
 *
 * @Author C20H30O2
 * @Create 2024/8/11 20:18
 * @Version 1.0
 */
public class warning_tips {
    public static void main(String[] args){


        //取模以后，结果与被模数的符号相同
        int i2 = -12;
        int j2 = 5;
        System.out.println(i2 % j2); //-2

        int i3 = 12;
        int j3 = -5;
        System.out.println(i3 % j3); //2

        int i4 = -12;
        int j4 = -5;
        System.out.println(i4 % j4); //-2
    }
}
