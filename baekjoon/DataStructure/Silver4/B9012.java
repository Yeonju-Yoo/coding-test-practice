package baekjoon.DataStructure.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 풀이 : https://yooyeonju.notion.site/9012-27456621d7844f77b6b613fc2afe7d05
public class B9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int num=0 ; num<t ; num++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int idx=0 ; idx<str.length() ; idx++){
                char c = str.charAt(idx);
                if(c == 40){
                    stack.add(c);
                }else if(c == 41){
                    if(stack.empty()) stack.add(c);
                    else if(stack.peek() == 40) stack.pop();
                    else stack.add(c);
                }
            }
            if(stack.size() != 0) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}
