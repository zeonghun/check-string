/**
 * @ 문자열의 구성을 확인하는 메소드
 * 
 * @param s 구성을 확인할 문자열
 * 
 * @author zeonghun
 * @since 230313
 */
public class IsDigit {
    public boolean digit(String s) {
        boolean answer = true;

        if (!(s.length() == 4 || s.length() == 6)) {
            answer = false;
        }
        char[] arr = s.toCharArray(); // 문자열을 char 타입의 배열로 변환
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] >= '0' && arr[i] <= '9')) { // 문자열 구성이 숫자가 아닌 경우
                answer = false;
            }
        }
        return answer;
    }
}
