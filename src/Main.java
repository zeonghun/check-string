// 문제
// 문자열의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수를 완성하세요.
// 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

import java.util.Scanner;

/**
 * @ (non-javadoc)
 * 
 * @author zeonghun
 * @since 230313
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IsDigit digit = new IsDigit();
        
        System.out.printf("구성을 확인할 문자열을 공백 없이 입력하세요: ");
        String input = sc.next();

        boolean result = digit.digit(input);
        System.out.println(result);
        sc.close();
    }
}
