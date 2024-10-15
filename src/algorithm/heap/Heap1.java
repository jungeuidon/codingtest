package algorithm.heap;

import java.util.PriorityQueue;

// 프로그래머스
// 힙
// 더 맵게
// https://school.programmers.co.kr/learn/courses/30/lessons/42626
public class Heap1 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 우선순위 큐 선언
        // 우선순위 큐는 오름차순으로 데이터가 저장된다.
        PriorityQueue<Integer> que = new PriorityQueue<>();

        // 큐에 스코빌 데이터 추가
        for (int i = 0; i < scoville.length; i++) {
            que.add(scoville[i]);
        }

        // 큐에서 데이터를 뽑아 주어진 식에 대입한 결과값이 K보다 클 때까지 반복
        while(que.peek() < K) {
            // 제한사항 적용 : 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
            // 비교데이터가 없을 시 반환
            if (que.size() == 1) {
                return -1;
            }
            // 주어진 식
            que.add(que.poll() + que.poll() * 2);

            answer++;   // 결과 값(=섞은횟수)
        }

        System.out.println("답 : " +answer);

        return answer;
    }

}
