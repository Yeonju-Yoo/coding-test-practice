package baekjoon.DataStructure.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 풀이 : https://yooyeonju.notion.site/10809-956d3efa5bbe4ca2bb0648fd8cb2a750
public class B10809{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] alphabetNum = new int[26];
        Arrays.fill(alphabetNum, -1);

        String str = br.readLine();
        for(int idx=0 ; idx<str.length() ; idx++){
            if(alphabetNum[str.charAt(idx)-97] == -1)
                alphabetNum[str.charAt(idx)-97] = idx;
        }
        
        for(int idx=0 ; idx<alphabetNum.length ; idx++)
            sb.append(alphabetNum[idx]).append(" ");

        System.out.println(sb);
    }
}