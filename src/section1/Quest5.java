package section1;

import etc.IQuest;

import java.util.Scanner;

// 5. 특정 문자 뒤집기
public class Quest5 implements IQuest {
    @Override
    public void run() {
        Quest5 q = new Quest5();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(q.solution(str));
    }

    public String solution(String str) {
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isLetter(c[lt])) {
                lt++;
            } else if (!Character.isLetter(c[rt])) {
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }
        }

        return String.valueOf(c);
    }
}
