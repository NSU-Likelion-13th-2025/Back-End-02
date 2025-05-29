package homework.car;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println(myCar.speed);

        myCar.speed = 500;
        System.out.println(myCar.speed);

        Car myCar2 = new Car();
        System.out.println(myCar2.speed);
    }
}
