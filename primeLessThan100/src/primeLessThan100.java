public class primeLessThan100 {
        public static void main(String[] args) {

            String str ="";
            for(int i=2;i<100;i++){

                boolean ck = true;
                for (int j =2 ; j<i;j++){
                    if(i%j==0){
                        ck=false;
                        break;
                    }
                }
                if(ck){
                    str+=i+", ";
                }

            }
            System.out.println(str);

        }

}
