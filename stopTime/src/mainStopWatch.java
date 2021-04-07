public class mainStopWatch {
    public static void main(String[] args) {
        stopWatch watch = new stopWatch();
        for(int i =0;i<100;i++){
            for (int j =0;j<200;j++){
                System.out.println(i);
            }
        }
        watch.stop();
        System.out.println("time:"+watch.getElapsedTime());
    }
}
