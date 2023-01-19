////Ex1_13문제를 for문을 사용하여 풀어보아라

import java.util.Scanner;

public class Ex1_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0;
        int d, i;

        System.out.print("원하는 숫자를 입력하세요 : ");
        i=sc.nextInt();
        System.out.print("찾고자하는 배수를 입력하세요 : ");
        d=sc.nextInt();

        for(int x=1; x<=i; x++){
            if(x%d==0){
                System.out.println(x);
                count++;
            }
        }
        System.out.println("1~"+i+" 까지의 "+d+" 의 배수의 총 개수는 "+count);
    }
}
