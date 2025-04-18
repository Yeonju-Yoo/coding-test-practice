package baekjoon;

import java.io.*;

public class Base {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 한 줄 입력
        String line = br.readLine();  

        // 정수 한 개 입력
        int n = Integer.parseInt(br.readLine());  

        // 공백으로 나뉜 정수들 입력
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        sb.append(a+b).append("\n");

        System.out.println(sb);
    }
}
