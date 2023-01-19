//임의의 정수를 입력받아 0부터 입력받은 수까지 중 짝수의 개수를 구하여라. while문 사용

import java.util.Scanner;

public class Ex1_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i, j=1, count=0;

        System.out.print("원하는 정수를 입력하세요 : ");
        i=sc.nextInt();

        while(i>=j){
            if(j%2==0){
                count++;
                j++;
            }
            else {
                j++;
            }

        }
        System.out.println("1~"+i+" 까지의 짝수의 총 개수는 "+count);
    }
}
