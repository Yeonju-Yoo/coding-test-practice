package baekjoon.DataStructure.Silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 풀이 : https://yooyeonju.notion.site/2164-2-1d99e0b01ac98050ab50c0d16da0cba4
public class B2164 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1 ; i<=n ; i++)
            queue.offer(i);

        while(queue.size()>1){
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.peek());
    }
}
