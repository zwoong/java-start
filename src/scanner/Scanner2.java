package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("첫 번쨰 숫자를 입력하세요.");
        int num1 = scaner.nextInt();

        System.out.print("두 번쨰 숫자를 입력하세요.");
        int num2 = scaner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 숫자의 합: " + sum);
    }
}
