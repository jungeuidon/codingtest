package algorithm.stackQueue;

import java.util.*;


// 프로그래머스
// 스택/큐
// 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906

public class Stack1 {
        public int[] solution(int []arr) {

            Stack<Integer> stack = new Stack<>();

            for(int elem: arr) {
                if(stack.empty() || elem != stack.peek()){  // stack이 비어있거나 배열원소가 stack의 원소와 다를때 삽입
                    stack.push(elem);
                }
            }
            // stack에 원소값을 담은 뒤 결과값의 크기 설정
            int[] answer = new int[stack.size()];


            // stack을 뺄때는 역순으로 나오기 때문에 거꾸로 넣어준다.
            // -> 배열이니까 -1, 배열의 위치에 해당 값을 삽입
            for(int i=stack.size()-1; i>=0; i--){
                answer[i] = stack.pop();
            }

            return answer;
        }

        // 문제를 보면 0보다 크고 9보다 작다는 글이 있다. 이를 잘 파악하여 Stack을 사용하지 않고 풀었다.
//        public int[] solution(int []arr) {
//            ArrayList<Integer> tempList = new ArrayList<Integer>();
//            int preNum = 10;
//            for(int num : arr) {
//                if(preNum != num)
//                    tempList.add(num);
//                preNum = num;
//            }
//            int[] answer = new int[tempList.size()];
//            for(int i=0; i<answer.length; i++) {
//                answer[i] = tempList.get(i).intValue();
//            }
//            return answer;
//        }

}
