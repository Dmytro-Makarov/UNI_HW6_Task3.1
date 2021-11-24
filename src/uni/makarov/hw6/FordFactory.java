package uni.makarov.hw6;

public class FordFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Engine createEngine() {
        return new FordEngine();
    }
}
