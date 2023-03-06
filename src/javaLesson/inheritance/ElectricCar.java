package javaLesson.inheritance;

public class ElectricCar extends Auto{

    private  int batteryVolume;
    private int passegersNumber;

    public ElectricCar(String producer, String model,  int batteryVolume, int passegersNumber) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passegersNumber = passegersNumber;
    }

    private void charge () {
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassegersNumber() {
        return passegersNumber;
    }

    public void setPassegersNumber(int passegersNumber) {
        this.passegersNumber = passegersNumber;
    }

    @Override
    public void energize() {
        charge();
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("ElectricCar is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("ElectricCar has stopped");
    }

}
