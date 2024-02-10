package section1;

import etc.IQuest;

import java.util.Scanner;

// 1. 문자 찾기
public class Quest1 implements IQuest {

    @Override
    public void run() {
        Quest1 q = new Quest1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.print(q.solution(str, c));
    }

    public int solution(String str, char targetC) {
        final String newStr = str.toUpperCase();
        final char newTargetC = Character.toUpperCase(targetC);

        // 해법 1)
        // int answer = 0;
        // for (int i = 0; i < newStr.length(); i++) {
        //    if (newStr.charAt(i) == newTargetC) answer++;
        // }
        // return answer;

        // 해법 2)
        // int answer = 0;
        // for (char x : newStr.toCharArray()) {
        //    if (x == newTargetC) {
        //        answer++;
        //    }
        // }
        // return answer;

        // 해법 3)
        return (int) newStr.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == newTargetC)
                .count();
    }
}
