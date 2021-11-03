package uni.makarov.hw6;



public class AbstractFactory {

    public static void main(String[] args) {
        Cars cars = new Cars();
        Engines engines = new Engines();

        Factories.CarFactory carFactory = new Factories.ToyotaFactory();

        Cars.Car myCar = carFactory.createCar();
        myCar.info();
        Engines.Engine myEngine = carFactory.createEngine();
        myEngine.getPower();

        carFactory = new Factories.FordFactory();

        myCar = carFactory.createCar();
        myCar.info();
        myEngine = carFactory.createEngine();
        myEngine.getPower();

        carFactory = new Factories.MersederFactory();

        myCar = carFactory.createCar();
        myCar.info();
        myEngine = carFactory.createEngine();
        myEngine.getPower();
    }
}
