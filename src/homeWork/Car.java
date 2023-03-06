package homeWork;

public class Car {
    private Boolean body;
    private Integer wheels;
    private Integer mirrors;
    private Boolean engine;
    private Integer transmissionCount;

    public Car() {
    }

    public Car(Boolean body, Integer wheels, Integer mirrors, Boolean engine, Integer transmissionCount) {
        this.body = body;
        this.wheels = wheels;
        this.mirrors = mirrors;
        this.engine = engine;
        this.transmissionCount = transmissionCount;
    }

    public Boolean isEngineWorking() {
        if (this.engine ) {
            return true;

        } else {
            return false;
        }

    }

    public Boolean isMoving() {
        if (this.wheels == 4 && this.engine && this.transmissionCount > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean getBody() {
        return body;
    }

    public void setBody(Boolean body) {
        this.body = body;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public Integer getMirrors() {
        return mirrors;
    }

    public void setMirrors(Integer mirrors) {
        this.mirrors = mirrors;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public Integer getTransmissionCount() {
        return transmissionCount;
    }

    public void setTransmissionCount(Integer transmissionCount) {
        this.transmissionCount = transmissionCount;
    }
}


