public class Car {
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private int door;


    public Car(String marca, String modelo, int year, String color, int door) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", door=" + door +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public Car clone(){
        Car car3 = new Car(this.marca, this.modelo, this.year, this.color, this.door);
        return car3;
    }
}
