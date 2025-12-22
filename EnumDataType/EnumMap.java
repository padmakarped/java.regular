package EnumDataType;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class EnumMap {
    public static void main(String[] args) {

        java.util.EnumMap<Day, String> map = new java.util.EnumMap<>(Day.class);

        map.put(Day.MONDAY, "Work");
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.WEDNESDAY, "Study");

        System.out.println(map);
    }
}

