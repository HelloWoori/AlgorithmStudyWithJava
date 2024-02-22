package section2;

import etc.IQuest;

import java.util.Scanner;

// 2. 보이는 학생
public class Quest2 implements IQuest {
    @Override
    public void run() {
        Quest2 q = new Quest2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] intList = new int[n];
        for (int i = 0; i < n; i++) {
            intList[i] = scanner.nextInt();
        }

        System.out.println(q.solution(n, intList));
    }

    public int solution(int n, int[] intList) {
        int max = intList[0];
        int answer = 1;
        for (int i = 1; i < n; i++) {
            if (max < intList[i]) {
                answer++;
                max = intList[i];
            }
        }

        return answer;
    }
}
