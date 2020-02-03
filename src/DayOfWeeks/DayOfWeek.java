package DayOfWeeks;

public enum DayOfWeek {
    Monday(8), Tuesday(8), Wednesday(8), Thursday(8), Friday(8), Saturday(0), Sunday(0);

    private int WorkingHours;

    DayOfWeek(int WorkingHours){
        this.WorkingHours = WorkingHours;
    }

    public int getWorkingHours() {
        return WorkingHours;
    }
}
