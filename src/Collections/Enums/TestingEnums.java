package Collections.Enums;

public class TestingEnums {
    public static void main(String[] args) {
        //Testing TrafficLights enum
        TrafficLights color=TrafficLights.RED;
        color=TrafficLights.GREEN;
        color= TrafficLights.valueOf("YELLOW");
        System.out.println(color);
        for (TrafficLights value : color.values()) {
            System.out.println(value);
        }
        //Testing Day enum
        for (Day day : Day.values()) {
            System.out.printf("%s: %s\n",day,day.getType());
        }
    }
}
