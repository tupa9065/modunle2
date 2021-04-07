public class Fan {
     final int SLOW=1;
     final int MEDIUM=2;
     final int FAST=3;
    private int speed ;
    private boolean on;
    private double radius;
    private String color ;
    Fan(){
        this.speed =SLOW;
        this.radius =5;
        this.color = "blue";
    }

//    public int getSpeed() {
//        return speed;
//    }
//    public

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        switch (speed){
            case 1:{
                this.speed = SLOW;
            }
            case 2:{
                this.speed = MEDIUM;
            }
            case 3:{
                this.speed = FAST;
            }
        }

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        if(this.on){
            return this.speed+" "+this.color+" "+this.radius+" fan is on";
        }else {
            return this.color+" "+this.radius+" fan is off";
        }
    }
}
