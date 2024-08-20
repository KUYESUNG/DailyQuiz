import java.util.Scanner;

public class NumbersPlus {

    /* 문제
    * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
    */

    /* 입력
    * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 숫자의 개수 N 입력받기
        int num = scanner.nextInt();

        // 숫자들을 공백 없이 입력받기
        String numbers = scanner.next();

        // 합을 저장할 변수 초기화
        int sum = 0;

        // 문자열의 각 문자를 숫자로 변환하여 더하기
        for (int i = 0; i < num; i++) {
            sum += numbers.charAt(i) - '0'; // 문자를 숫자로 변환하기 위해 '0'을 뺌
        }

        // 결과 출력
        System.out.println(sum);
    }
}
