public class While02 {
    public static void main(String[] args) {
        //안녕하세요를 10번 출력.
        int i=0;
        int count=0;

        while (i<10){
            System.out.println("안녕하세요");
            i++;
            count++;
        }
        System.out.println("출력된 갯수 : "+count);
    }
}
