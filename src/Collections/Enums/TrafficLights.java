package Collections.Enums;

public enum TrafficLights {
    RED("stop"),YELLOW("wait"),GREEN("go");

    private final String action;

    TrafficLights(String action) {
        this.action = action;
    }
}
