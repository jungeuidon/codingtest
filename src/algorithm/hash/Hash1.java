package algorithm.hash;

import java.util.HashSet;

// 프로그래머스
// 해시
// 폰켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class Hash1 {

        public int solution(int[] nums) {

            int answer = 0; // 최종답
            int maxCnt = nums.length/2;   // 1. 최대개수 : 짝수만 나오기때문에 n/2가 겹칠 수 있는 최대개수 == 결과값의 개수
            int typeCnt = 0;              // 2. 종류개수 : 겹치는 숫자가 있을때 Set을 통해 정제한 개수가 중복없는 최대개수
            HashSet<Integer> hSet = new HashSet();

            // set을 통해 중복제거
            for(int num : nums ){
                hSet.add(num);
            }
            typeCnt = hSet.size();

            // maxCnt(결과값)보다 중복을 제거한 setCnt(중복제거값)가 클 수 없기 때문에
            // 결과적으로 중복을 제거한 typeCnt(종류개수)가 maxCnt(최대개수)보다 클 때 maxCnt을 반환,
            //                                                           작으면 typeCnt를 반환한다.
            answer = maxCnt;

            if(maxCnt >= typeCnt){
                answer = typeCnt;
            }
            System.out.println(answer);
            return answer;
    }

    // 자바 8부터 추가된 기술인 람다와 스트림을 활용한 코드이다. 훨씬 짧고 함수형 코드이다.

//        public int solution(int[] nums) {
//            return Arrays.stream(nums)
//                    .boxed()
//                    .collect(Collectors.collectingAndThen(Collectors.toSet(),
//                            phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
//        }

}
