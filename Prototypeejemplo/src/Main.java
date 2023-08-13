//EJEMPLO PATRON PROTOTYPE

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Kia", "Sportage", 2024, "Red", 5);
        Car car2 = car.clone();
        Car car3 = car.clone();
        car2.setColor("Morado");
        car3.setModelo("Picanto");

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);


    }
}