package humh.algorithms.interview;

import java.util.Scanner;

/**
 * 进制转换
 *
 * @author humh
 * @date 2019/4/29
 */
public class FeelTheBase {

    /*
     * 十进制转二进制
     * 1、现有算法：通过已有的Integer.toBinaryString(int i) 完成转换
     * 2、自己实现算法：通过十进制转二进制的计算过程演变，不断地除2，每次将除2的余数字串相叠加即可
     */

    /**
     * 十进制转二进制（给定一个十进制数将其转成二进制表示）
     *
     * @author humh
     * @date 2019/4/29
     * @param num 给定的十进制整数
     * @return java.lang.String 返回二进制的字串
     */
    public static String decimalParseBinary(int num) {
        if (num == 0) {
            return num + "";
        }
        //按照十进制转二进制的计算过程演变，不断地除以2，余数倒序排列起来，直到除数为0（除到最后肯定剩1，1%2=1，1/2=0），所以除数为0停止循环
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            //每次余数倒叙排列，即每次将余数添加到上次字串的头部
            sb.insert(0, num % 2);
            num = num / 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        //输入-1 程序结束
        while ((num = scan.nextInt()) != -1) {
            System.out.println("十进制数：" + num + " 转换成二进制表示为：" + decimalParseBinary(num));
        }
    }

}
