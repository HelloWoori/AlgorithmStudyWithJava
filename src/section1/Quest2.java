package section1;

import etc.IQuest;

import java.util.Scanner;

// 2. 대소문자 변환
public class Quest2 implements IQuest {

    @Override
    public void run() {
        Quest2 q = new Quest2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(q.solution(str));
    }

    public String solution(String str) {
        // 해법 1)
        // StringBuilder stringBuilder = new StringBuilder(str);
        // for (int i = 0; i < str.length(); i++) {
        //     if (Character.isUpperCase(str.charAt(i))) {
        //         char c = Character.toLowerCase(str.charAt(i));
        //         stringBuilder.setCharAt(i, c);
        //     } else {
        //         char c = Character.toUpperCase(str.charAt(i));
        //         stringBuilder.setCharAt(i, c);
        //     }
        // }
        //
        // return stringBuilder.toString();

        // 해법 2)
        StringBuilder answer = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer.append(Character.toLowerCase(x));
            } else {
                answer.append(Character.toUpperCase(x));
            }
        }

        return answer.toString();
    }
}
