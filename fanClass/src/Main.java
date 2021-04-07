public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setOn(true);
        //System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        System.out.println(fan2.toString());

    }
}
