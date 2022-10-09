package ya.praktikum.sprint3;

public class SpeedLights {
    private final int speedLimit;

    public SpeedLights(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public String showLights(int speed) {
        if (speed < 0)
            throw new IllegalArgumentException("speed must not be negative " + speed);

        if (speed < speedLimit)
            return "green";
        else if (speed < speedLimit + 20)
            return "yellow";
        else
            return "red";
    }
}
