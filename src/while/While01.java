public class While01 {
    public static void main(String[] args) {
        int num=1;
        //반복의 시작 시점 필수.


        //While문은 ()조건을 비교하고 참이면 {}실행하고 다시 ()조건을 확인하고
        // 거짓일시 {}실행하지 않고 빠져나온다.
        while(num<3){
            //()반복 조건 필수.
            System.out.println("java");
            num++;
            //반복을 파기할 조건 필수.
        }
        System.out.println("끝");
    }
}
