public class Car {
        private String brand;
        private String model;
        private int year;
        private String color;
        private int doors;

        public static class Builder {
            private String brand;
            private String model;
            private int year;
            private String color;
            private int doors;

            public Builder(String brand, String model) {
                this.brand = brand;
                this.model = model;
            }

            public Builder year(int year) {
                this.year = year;
                return this;
            }

            public Builder color(String color) {
                this.color = color;
                return this;
            }

            public Builder doors(int doors) {
                this.doors = doors;
                return this;
            }

            public Car build() {
                return new Car(this);
            }
        }

        private Car(Builder builder) {
            brand = builder.brand;
            model = builder.model;
            year = builder.year;
            color = builder.color;
            doors = builder.doors;
        }
    }


