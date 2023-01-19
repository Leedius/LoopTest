public class Break01 {
    public static void main(String[] args) {

        for(int i=0; i<6; i++){
            System.out.println(i);

            if(i==3){
                break;
                //반복문(for,while) 안쪽에 break가 실행되면 바로 반복문을 벗어나버린다.
            }

        }
    }
}
