package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scaner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scaner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scaner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
