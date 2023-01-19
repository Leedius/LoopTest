//1~100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력하되, while문을 사용하여라.

import java.util.Scanner;

public class Ex1_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=1, count=0;
        int d, i;

        System.out.print("원하는 숫자를 입력하세요 : ");
        i=sc.nextInt();
        System.out.print("찾고자하는 배수를 입력하세요 : ");
        d=sc.nextInt();

        while(i>=x){
            if(x%d==0){
                System.out.println(x);
                count++;
                x++;
            }
            else {
                x++;
            }
        }
        System.out.println("1~"+i+" 까지의 "+d+" 의 배수의 총 개수는 "+count);
    }
}
