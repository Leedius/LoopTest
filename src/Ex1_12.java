//Ex1_11문제를 for문을 사용하여 풀어보아라

import java.util.Scanner;

public class Ex1_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int d;
        int count=0;

        System.out.print("원하는 숫자를 입력하세요 : ");
        i=sc.nextInt();
        System.out.print("찾고자하는 배수를 입력하세요 : ");
        d=sc.nextInt();

        for(int x=1; x<=i; x++){
            if(x%d==0){
                count++;
            }
        }
        System.out.println("1~"+i+" 의 "+d+" 의 배수의 총 개수는 "+count);
    }
}
