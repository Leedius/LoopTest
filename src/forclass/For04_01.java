package forclass;
//구구단 2단을 아래와 같이 출력하세요. While문
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//...
//2 * 9 = 18


import java.util.Scanner;

public class For04_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=1, result=0, x;

        System.out.print("알고싶은 구구단의 단수를 입력하세요 : ");
        x=sc.nextInt();

        while (i<10){
            result=x*i;
            System.out.println(x+" * "+i+" = "+result);
            i++;
        }

    }
}
