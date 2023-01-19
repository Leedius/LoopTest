//1부터 누적해서 합을 구하다 300이 최초로 넘었을때
// for문을 멈추고 그때까지의 합과 마지막으로 더해진 값을 각각 출력하여라

import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        int i;          //입력받을 값
        int j=1;

        System.out.print("숫자를 입력하세요 : ");
        i=sc.nextInt();

        for(j=1; j<i; j++){
            sum+=j;
            if(sum>i){
                break;
            }
        }
        System.out.println(" 합 "+sum+" 마지막으로 더해진 값 "+j);
    }
}
