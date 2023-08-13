//EJEMPLO PATRON BUILDER

public class Main {
    public static void main(String[] args) {
        Car.Builder cb = new Car.Builder("Kia","Sportage" );
        cb = cb.year(2017);
        cb = cb.color("Red");
        cb = cb.doors(4);

        //cb.year(2024).color("Red").door(4);
        Car c = cb.build();

    }
}