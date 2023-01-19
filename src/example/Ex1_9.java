package example;
//while문을 사용하여 0~10까지의 합을 구하여라.

public class Ex1_9 {
    public static void main(String[] args) {

        int i=0;
        int sum=0;

        while(i<11){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
