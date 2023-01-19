import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        //0부터 5까지의 합을 출력
        Scanner sc=new Scanner(System.in);
        int s, t;
        int sum=0;

        System.out.print("시작할 수를 입력하세요 : ");
        s=sc.nextInt();
        System.out.print("마지막 수를 입력하세요 : ");
        t=sc.nextInt();

        while(s<=t){
            sum+=s;
            s++;
        }
        System.out.println("모든정수의 합은 : "+sum);
    }
}
