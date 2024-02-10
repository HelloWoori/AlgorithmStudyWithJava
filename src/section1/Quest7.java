package section1;

import etc.IQuest;

import java.util.Scanner;

// 7. 회문 문자열
public class Quest7 implements IQuest {
    @Override
    public void run() {
        Quest7 q = new Quest7();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(q.solution(str));
    }

    public String solution(String str) {
        // 해법 1)
        // String tmp = new StringBuilder(str).reverse().toString();
        // if (str.equalsIgnoreCase(tmp)) {
        //     return "YES";
        // }
        //
        // return "NO";

        // 해법 2)
        int len = str.length();
        str = str.toUpperCase();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return "NO";
            }
        }

        return "YES";
    }
}
