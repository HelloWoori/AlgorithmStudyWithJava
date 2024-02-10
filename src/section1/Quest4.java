package section1;

import etc.IQuest;

import java.util.ArrayList;
import java.util.Scanner;

// 4. 단어 뒤집기
public class Quest4 implements IQuest {
    @Override
    public void run() {
        Quest4 q = new Quest4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] strList = new String[n];
        for (int i = 0; i < n; i++) {
            strList[i] = scanner.next();
        }

        for (String str : q.solution(n, strList)) {
            System.out.println(str);
        }
    }

    public ArrayList<String> solution(int n, String[] strList) {
        // 해법 1)
        // ArrayList<String> answer = new ArrayList<>();
        // for (String str : strList) {
        //     String tmp = new StringBuilder(str).reverse().toString();
        //     answer.add(tmp);
        // }
        //
        // return answer;

        // 해법 2)
        ArrayList<String> answer = new ArrayList<>();
        for (String str : strList) {
            char[] c = str.toCharArray();
            int lt = 0;
            int rt = str.length() - 1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }

            String tmp = String.valueOf(c);
            answer.add(tmp);
        }

        return answer;
    }
}
