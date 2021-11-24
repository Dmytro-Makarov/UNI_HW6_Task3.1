package uni.makarov.hw6;

public class ToyotaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Toyota();
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }
}
