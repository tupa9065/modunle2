import java.time.LocalTime;

public class stopWatch {
    private double startTime;
    private double stopTime;
    stopWatch(){
        startTime= System.currentTimeMillis();
    }
    public void start(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        stopTime=System.currentTimeMillis();
    }

    public double getElapsedTime() {
        double elapsedTime;
        elapsedTime = stopTime -startTime;
        return elapsedTime;
    }
}
