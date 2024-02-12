package section1;

import etc.IQuest;

import java.util.Scanner;

// 9. 숫자만 추출
public class Quest9 implements IQuest {
    @Override
    public void run() {
        Quest9 q = new Quest9();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(q.solution(str));
    }

    public int solution(String str) {
        String tmp = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(tmp);
    }
}
