package example;
//키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i, j, x;
        int sum=0;

        System.out.print("첫번째 원하는 정수를 입력하세요 : ");
        i=sc.nextInt();
        System.out.print("두번째 원하는 정수를 입력하세요 : ");
        j=sc.nextInt();

        for(x=i; x<=j; x++){
            sum+=x;
        }
        System.out.println(i+" 부터 "+j+" 정수의 사이의 모든 정수의 합은 "+sum);
    }
}
