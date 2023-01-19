package example;
//1이상 100미만의 정수 중에서 7의 배수와 9의 배수를 출력하는 프로그램을 작성하여라.
// 단, 7의 배수이면서 동시에 9의 배수인 수는 한번만 출력하여야 한다.

import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i, j=0;
        int d1, d2, d3=0;

        System.out.print("원하는 정수를 입력하세요 : ");
        i=sc.nextInt();
        System.out.print("원하는 첫번째 배수를 입력하세요 : ");
        d1=sc.nextInt();
        System.out.print("원하는 두번째 배수를 입력하세요 : ");
        d2=sc.nextInt();

        for(j=1; j<=i; j++){
            if(j%d1==0){
                System.out.println(j);
            }
            else if(j%d2==0){
                System.out.println(j);
            }

        }

    }
}
