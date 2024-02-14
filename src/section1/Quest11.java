package section1;

import etc.IQuest;

import java.util.Scanner;

// 11. 문자열 압축
public class Quest11 implements IQuest {
    @Override
    public void run() {
        Quest11 q = new Quest11();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(q.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        int cnt = 1;
        char prevChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (prevChar == str.charAt(i)) {
                cnt++;
            }
            else {
                answer.append(prevChar);
                if (cnt > 1) answer.append(cnt);
                prevChar = str.charAt(i);
                cnt = 1;
            }
        }

        answer.append(prevChar);
        if (cnt > 1) answer.append(cnt);

        return answer.toString();
    }
}
