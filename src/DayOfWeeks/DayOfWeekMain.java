package DayOfWeeks;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.Tuesday));
    }

    static String getWorkingHours(DayOfWeek d){
        int result = 0;

        for (int i = d.ordinal(); i < DayOfWeek.values().length; i++){
            d = DayOfWeek.values()[i];
            result = result + d.getWorkingHours();
        }

        String res = (result != 0) ? "Осталось работать ещё "+result+" часов": "Можно расслабиться";
        return res;
    }
}
