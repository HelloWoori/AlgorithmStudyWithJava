package section1;

import etc.IQuest;

import java.util.Scanner;

// 3. 문장 속 단어
public class Quest3 implements IQuest {
    @Override
    public void run() {
        Quest3 q = new Quest3();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    public String solution(String str) {
        // 해법 1)
        // String answer = "";
        // int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        // String[] s = str.split(" ");
        // for (String subStr : s) {
        //     int len = subStr.length();
        //     if (len > m) {
        //         m = len;
        //         answer = innerStr;
        //     }
        // }
        //
        // return answer;

        // 해법 2)
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }

            str = str.substring(pos + 1);
        }

        if (str.length() > m) answer = str; // 마지막 단어 처리

        return answer;
    }
}
