package uni.makarov.hw6;

public class Factories {
    //AbstractFactory
    interface CarFactory{
        Cars.Car createCar();
        Engines.Engine createEngine();
    }

    //ConcreteFactory1
    public static class FordFactory implements CarFactory {
        //from CarFactory
        @Override
        public Cars.Car createCar() {
            return new Cars.Ford();
        }

        @Override
        public Engines.Engine createEngine() {
            return new Engines.FordEngine();
        }
    }

    //ConcreteFactory2
    public static class ToyotaFactory implements CarFactory {
        //from CarFactory
        @Override
        public Cars.Car createCar() {
            return new Cars.Toyota();
        }

        @Override
        public Engines.Engine createEngine() {
            return new Engines.ToyotaEngine();
        }
    }

    //ConcreteFactory3
    public static class MersederFactory implements CarFactory {
        //from CarFactory
        @Override
        public Cars.Car createCar() {
            return new Cars.Merseder();
        }

        @Override
        public Engines.Engine createEngine() {
            return new Engines.MersederEngine();
        }
    }
}
