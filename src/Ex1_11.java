//1~100까지의 숫자 중 3의 배수인 수의 개수를 while문을 사용하여 구하여라.
//1~100중 3의 배수의 개수 출력
//1.1~100까지 3의 배수인지를 검사한다.
//2.만약 3의 배수라면 3의 배수의 개수를 1증가시킨다.


import java.util.Scanner;

public class Ex1_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int x=1;
        int d;
        int count=0;

        System.out.print("원하는 숫자를 입력하세요 : ");
        i=sc.nextInt();
        System.out.print("찾고자하는 배수를 입력하세요 : ");
        d=sc.nextInt();

        while(i>=x){
            if(x%d==0){
                x++;
                count++;
            }
            else {
                x++;
            }
        }
        System.out.println("총 배수의 개수는 : "+count);
    }
}
