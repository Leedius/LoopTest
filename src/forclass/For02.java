package forclass;
public class For02 {
    public static void main(String[] args) {
        //0부터 10까지 출력
        int count=0;
        for (int i=0; i<11; i++, count++) {
            System.out.println(i);
        }
        System.out.println("출력된총갯수는 : " + count);
    }
}
