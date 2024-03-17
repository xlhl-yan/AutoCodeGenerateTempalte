package com.xlhl.template.acm;

import java.util.Scanner;

/**
 * ACM 输入模板（多数之和）
 *
 * @author xlhl
 * @date 2023/12/6 17:10
 */
public class MainTemplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("以空格分隔 每个数字求和：");
        while (scanner.hasNext()) {
            String inputStr = scanner.nextLine();
            String[] inputNum = inputStr.split(" ");

            int sum = 0;
            for (String str : inputNum) {
                sum += Integer.parseInt(str);
            }

            System.out.println("Sum: " + sum);
        }

        scanner.close();
    }
}
