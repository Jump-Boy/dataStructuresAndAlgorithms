package humh.algorithms.interview;

import java.util.Scanner;

/**
 * 2的指数幂校验
 *
 * @author humh
 * @date 2019/4/30
 */
public class TwoExponentVerify {

    /**
     * 判断给定的数是不是2的指数幂
     * 实现思路：2的指数幂二进制表示如“10000”，减一则“01111”，进行与运算为0。
     * 若不是2的指数幂，如“10100”，减一则“10011”，与运算则不为0。
     *
     * @author humh
     * @date 2019/4/30
     * @param num 需要判断的整数
     * @return boolean true表示是，false表示不是
     */
    public static boolean isTwoExponent(int num) {
        if ((num & num-1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        //输入-1 程序结束
        while ((num = scan.nextInt()) != -1) {
            System.out.println(num + (isTwoExponent(num) ? "是" : "不是") + "2的指数幂");
        }
    }

}
