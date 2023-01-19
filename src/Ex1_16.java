////Ex1_15문제를 for문을 사용하여 풀어보아라

import java.util.Scanner;

public class Ex1_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, count=0;

        System.out.print("원하는 정수를 입력하세요 : ");
        i=sc.nextInt();

        for(int j=1; j<=i; j++){
            if(j%2==0){
                count++;
            }
        }
        System.out.println("1~"+i+" 까지의 짝수의 총 개수는 "+count);
    }
}
