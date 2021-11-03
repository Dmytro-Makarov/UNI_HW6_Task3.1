package uni.makarov.hw6;

public class Engines {
    // AbstractProductB1
    public static abstract class Engine {
        public void getPower(){

        }
    }

    //ConcreteProductB2
    public static class FordEngine extends Engine {
        @Override
        public void getPower(){
            System.out.println("Ford Engine 4.4");
        }
    }

    //ConcreteProductB2
    public static class ToyotaEngine extends Engine {
        @Override
        public void getPower(){
            System.out.println("Toyota Engine 3.2");
        }
    }

    //ConcreteProductB3
    public static class MersederEngine extends Engine {
        @Override
        public void getPower(){
            System.out.println("Merseder Engine 6.9");
        }
    }

}
