public enum Day {
    SUNDAY(1), MONDAY(3), TUESDAY(4), WEDNDESDAY(25), THURSDAY(9),FRIDAY(7), SATURDAY(36);

    private final int dayNumber;
    Day(int dayNumber) {
        this.dayNumber=dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}
