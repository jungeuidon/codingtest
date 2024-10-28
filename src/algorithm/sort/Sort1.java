package algorithm.sort;



// 프로그래머스
// 정렬
// K번째수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Sort1 {
    public int[] solution(int[] array, int[][] commands) {

        List<Integer> answerList = new ArrayList<>();

        for(int[] command: commands){
            int[] parArr = array;

            int thirdNumber = 0;
            // 문자열 자르기
            // 배열은 0번째부터 시작이라 숫자-1 을 해준다.
            int[] arrRange = Arrays.copyOfRange(parArr, command[0]-1, command[1]);  // 문자열 자르기

            Arrays.sort(arrRange);   // 정렬
            thirdNumber = arrRange[command[2]-1]; // 세번째 값 추출
            answerList.add(thirdNumber); // 배열에 추가
        }
        // 결과값 배열로 return
        int[] answer = new int[answerList.size()];
        // List<Integer> -> int[] : Integer List를 배열로 변환
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i).intValue();
        }
        return answer;
    }
}
