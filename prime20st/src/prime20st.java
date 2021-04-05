public class prime20st {
    public static void main(String[] args) {
        int count =0;
        String str ="";
        for(int i=2;;i++){
            if(count==19){
                break;
            }
            boolean ck = true;
            for (int j =2 ; j<i;j++){
                if(i%j==0){
                    ck=false;
                    break;
                }
            }
            if(ck){
                str+=i+", ";
                count++;
            }

        }
        System.out.println(str);

    }
}
