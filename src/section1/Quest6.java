package section1;

import etc.IQuest;

import java.util.Scanner;

// 6. 중복문자제거
public class Quest6 implements IQuest {
    @Override
    public void run() {
        Quest6 q = new Quest6();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(q.solution(str));
    }

    public String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (stringBuilder.indexOf(String.valueOf(c)) == -1) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }
}
