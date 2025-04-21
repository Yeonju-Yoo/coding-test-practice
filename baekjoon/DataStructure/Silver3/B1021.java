package baekjoon.DataStructure.Silver3;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

// 풀이 : https://yooyeonju.notion.site/1021-1dc9e0b01ac980c5b975e84a9b4123b1
public class B1021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        
        String[] nm = br.readLine().split(" ");
        String[] numberArr = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1 ; i<=n ; i++){
            deque.addLast(i);
        }

        for(int idx = 0 ; idx<m ; idx++){
            int dequeSize = deque.size();

            Iterator<Integer> iterator = deque.iterator();
            int targetIndex = 0;
            int targetNumber = Integer.parseInt(numberArr[idx]);
            while(iterator.hasNext()){
                if(iterator.next() == targetNumber) break;
                targetIndex++;
            }
            //System.out.println("targetNumber = " + targetNumber + ", targetIndex = " + targetIndex + ", dequeSize/2 = " + dequeSize/2);
            if(targetIndex == 0){
                deque.pollFirst();
                continue;
            }else if(targetIndex <= dequeSize/2){
                for(int i=0 ; i<targetIndex ; i++)
                    deque.addLast(deque.pollFirst());
                total += targetIndex;
                deque.pollFirst();
            }else{
                for(int i=0 ; i<deque.size()-targetIndex ; i++)
                    deque.addFirst(deque.pollLast());
                total += (deque.size() - targetIndex);
                deque.pollFirst();
            }
        }

        System.out.println(total);
    }

    public void betterCode() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] targetNumbers = br.readLine().split(" ");

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1 ; i<=n ; i++){
            deque.addLast(i);
        }

        for(String targetNumberString : targetNumbers){
            int targetNumber = Integer.parseInt(targetNumberString);
            int idx = 0;

            // index 찾기
            for (int val : deque) {
                if (val == targetNumber) break;
                idx++;
            }

            int half = deque.size() / 2;

            if (idx == 0) {
                deque.pollFirst(); // 이미 맨 앞에 있음
                continue;
            }

            if (idx <= half) {
                // 왼쪽 회전
                for (int i = 0; i < idx; i++) {
                    deque.addLast(deque.pollFirst());
                    total++;
                }
            } else {
                // 오른쪽 회전
                int rotate = deque.size() - idx;
                for (int i = 0; i < rotate; i++) {
                    deque.addFirst(deque.pollLast());
                    total++;
                }
            }

            deque.pollFirst(); // 타겟 제거
        }

        System.out.println(total);
    }
}
