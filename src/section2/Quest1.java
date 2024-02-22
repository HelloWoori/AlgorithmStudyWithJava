package section2;

import etc.IQuest;

import java.util.ArrayList;
import java.util.Scanner;

// 1. 큰 수 출력하기
public class Quest1 implements IQuest {
    @Override
    public void run() {
        Quest1 q = new Quest1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Integer[] intList = new Integer[n];
        for (int i = 0; i < n; i++) {
            intList[i] = scanner.nextInt();
        }

        for (Integer num : q.solution(n, intList)) {
            System.out.print(num);
            System.out.print(" ");
        }
    }

    public ArrayList<Integer> solution(int n, Integer[] intList) {
        ArrayList<Integer> answer = new ArrayList<>();
        Integer prevNum = intList[0];
        answer.add(prevNum);
        for (int i = 1; i < n; i++) {
            if (prevNum < intList[i]) {
                answer.add(intList[i]);
            }

            prevNum = intList[i];
        }

        return answer;
    }
}
