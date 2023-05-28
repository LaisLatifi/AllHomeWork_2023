package Class23HW;

public class T06Shapes {

//Task06
    // Create an Interface 'Shape' with undefined methods as calculateArea
// and calculatePerimeter. Create 2 classes Circle & Square that
// implements functionality defined in the Shape Interface. Test your code.
    public interface T06Shape {
        double PI = 3.1415926535;
        double calculateArea();
        double calculatePerimeter();
    }
    class Circle implements T06Shape {
        private double radius;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * PI * radius;
        }
    }
    static class Square implements T06Shape {

        private double sideLength;

        public double getSideLength() {
            return sideLength;
        }

        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public double calculateArea() {
            return sideLength * sideLength;
        }

        @Override
        public double calculatePerimeter() {
            return sideLength * 4;
        }
    }

    class ShapeTester {
        public void main(String[] args) {
            T06Shape[] shapes = {new Circle(), new Square()};

            for (T06Shape shape : shapes) {
                if (shape instanceof Circle) {
                    ((Circle) shape).setRadius(4.5);
                    System.out.println(shape.calculateArea());
                    System.out.println(shape.calculatePerimeter());
                }
                if (shape instanceof Square) {
                    ((Square) shape).setSideLength(10.5);
                    System.out.println(shape.calculateArea());
                    System.out.println(shape.calculatePerimeter());
                }
            }
        }
    }
}
