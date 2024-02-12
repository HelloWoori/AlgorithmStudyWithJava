package section1;

import etc.IQuest;

import java.util.ArrayList;
import java.util.Scanner;

// 10. 가장 짧은 문자거리
public class Quest10 implements IQuest {
    @Override
    public void run() {
        Quest10 q = new Quest10();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = scanner.next().charAt(0);

        String result = String.join(" ", q.solution(str, ch));
        System.out.println(result);
    }

    public ArrayList<String> solution(String str, char ch) {
        ArrayList<String> answer = new ArrayList<>();

        // 목표 문자의 인덱스 찾기
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int index = 0; index < str.length(); index++)
            if (str.charAt(index) == ch) {
                indexList.add(index);
            }

        // 다시 돌면서 결과값 출력
        for (int i = 0; i < str.length(); i++) {
            answer.add(String.valueOf(getMin(indexList, i)));
        }

        return answer;
    }

    private int getMin(ArrayList<Integer> indexList, int myIndex) {
        int min = Integer.MAX_VALUE;
        for (Integer index : indexList) {
            if (Math.abs(index - myIndex) < min) {
                min = Math.abs(index - myIndex);
            }
        }

        return min;
    }
}
