package example;
//System.out.print("*");을 사용하여 별을 다섯 개 출력해보자. 단 출력문은 한번만 사용해야한다.
//while문을 사용하여 풀어보아라.

public class Ex1_1 {
    public static void main(String[] args) {
        int i=0;
        String x="*";

        while(i<5){
            System.out.println(x);
            i++;
        }
    }
}
