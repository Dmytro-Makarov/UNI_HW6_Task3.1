package uni.makarov.hw6;



public class AbstractFactory {

    public static void main(String[] args) {
        CarFactory carFactory = new FordFactory();
        Car mycar = carFactory.createCar();
        mycar.getInfo();
        Engine myengine = carFactory.createEngine();
        myengine.getPower();

        CarFactory carFactory1 = new ToyotaFactory();
        Car mycar1 = carFactory1.createCar();
        mycar1.getInfo();
        Engine myengine1 = carFactory1.createEngine();
        myengine1.getPower();

        CarFactory carFactory2 = new MersedesFactory();
        Car mycar2 = carFactory2.createCar();
        mycar2.getInfo();
        Engine myengine2 = carFactory2.createEngine();
        myengine2.getPower();
    }
}
