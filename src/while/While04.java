public class While04 {
    public static void main(String[] args) {
        //2부터 10까지 짝수만 출력.

        int i=0,count=0;

        while (i<10){
            i+=2;
            System.out.println(i);
            count++;
        }
        System.out.println("출력된 갯수 : "+count);

    }
}
