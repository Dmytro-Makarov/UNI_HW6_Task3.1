package uni.makarov.hw6;

public class MersedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mersedes();
    }

    @Override
    public Engine createEngine() {
        return new MersedesEngine();
    }
}
