package uni.makarov.hw6;

public class Cars {

    // AbstractProductA
    public static abstract class Car {
        public abstract void info();
    }

    // ConcreteProductA1
    public static class Ford extends Car {
        @Override
        public void info() {
            System.out.println("Ford");
        }
    }

    // ConcreteProductA2
    public static class Toyota extends Car {
        @Override
        public void info() {
            System.out.println("Toyota");
        }
    }

    // ConcreteProductA3
    public static class Merseder extends Car {
        @Override
        public void info() {
            System.out.println("Merseder");
        }
    }
}
