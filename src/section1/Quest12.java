package section1;

import etc.IQuest;

import java.util.Scanner;

// 12. 암호
public class Quest12 implements IQuest {
    @Override
    public void run() {
        Quest12 q = new Quest12();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(q.solution(n, str));
    }

    public String solution(int n, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            answer.append(changeChar(tmp));
            str = str.substring(7);
        }

        return answer.toString();
    }

    private char changeChar(String binaryStr) {
        int decimal = Integer.parseInt(binaryStr, 2);
        return (char)decimal;
    }
}
