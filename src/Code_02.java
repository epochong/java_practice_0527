import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/27 17:16
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02 {
    public static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b,a % b) ;
    }
    public static int mul(int a, int b) {
        return a * b / gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(mul(a,b));
    }
}
