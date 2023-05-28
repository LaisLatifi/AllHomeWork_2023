package Class23HwGroupProject02;


    /*
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
 */
    class CarTester {
        public static void main(String[] args) {
            Sedan sedan = new Sedan();
            sedan.setLength(23);
            sedan.carPrice = 30000;
            System.out.println(sedan.calculateSalePrice());
        }
    }

    public class T08Car {
        double carPrice;
        String color;
        public double calculateSalePrice() {
            return carPrice;
        }

    }
    class Sedan extends T08Car {
        private int length;
        public void setLength(int length) {
            this.length = length;
        }
        @Override
        public double calculateSalePrice() {
            if (length > 20) return carPrice * .95;
            else return carPrice * .9;
        }
    }
    class Truck extends T08Car {
        private int weight;
        public void setWeight(int weight) {
            this.weight = weight;
        }
        @Override
        public double calculateSalePrice() {
            if (weight > 2000) return carPrice * .9;
            else return carPrice * .8;
        }
    }

