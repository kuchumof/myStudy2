package javaLesson.inheritance;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol(); // сколько нужно добавить топлива в бак
        fuelUp(volume);
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus has stopped");
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume; // сколько + заливаем
        if (volume> getTankVolume()) {                           // если суммарный объем больше чем объема бака, то
            setAvailablePetrol(getTankVolume());               //заливаем до полного
        }
        System.out.println("Adding DIESEL");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passengers");
    }

    public void releasePassegers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume()- getAvailablePetrol());
    }

}
