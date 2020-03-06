package _2_oop._ex._ex_1_class;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int second) {
        this.hours = second / 3600;
        this.minutes = (second % 3600) / 60;
        this.seconds = second % 60;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Time {" +
                "hours = " + hours +
                ", minutes = " + minutes +
                ", seconds = " + seconds +
                '}';
    }
}
