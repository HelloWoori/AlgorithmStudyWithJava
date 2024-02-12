package section1;

import etc.IQuest;

import java.util.Scanner;
import java.util.stream.Collectors;

// 8. 유효한 팰린드롬
public class Quest8 implements IQuest {
    @Override
    public void run() {
        Quest8 q = new Quest8();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(q.solution(str));
    }

    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            return "YES";
        }

        return "NO";
    }
}
