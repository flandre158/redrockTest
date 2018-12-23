package question3.tools;

public class StampToDate {
    Time time = new Time();
    int stamp = 0;
    int second = 0;
    int minute = 0;
    int hour = 0;
    int month = 1;
    int day = 1;
    int year = 1970;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public StampToDate(int stamp) {
        this.stamp = stamp;
        while (stamp >= time.COMMONYEARSECONDS) {
            if (time.isLeapYear(year) == true && stamp >= time.LEAPYEARSECONDS) {
                year += 1;
                stamp -= time.LEAPYEARSECONDS;
            } else if (time.isLeapYear(year) == true && stamp < time.LEAPYEARSECONDS) {
                break;
            } else {
                year += 1;
                stamp -= time.COMMONYEARSECONDS;
            }
        }
        if (time.isLeapYear(year) == true) {
            int i = 0;
            while (stamp >= time.months2[i]) {
                month += 1;
                stamp -= time.months2[i];
                i += 1;
            }
            while (stamp >= 86400) {
                day += 1;
                stamp -= 86400;
            }
            while (stamp >= 3600) {
                hour += 1;
                stamp -= 3600;
            }
            while (stamp >= 60) {
                minute += 1;
                stamp -= 60;
            }
            second = stamp;
        } else {
            int i = 0;
            while (stamp >= time.months1[i]) {
                month += 1;
                stamp -= time.months1[i];
                i += 1;
            }
            while (stamp >= 86400) {
                day += 1;
                stamp -= 86400;
            }
            while (stamp >= 3600) {
                hour += 1;
                stamp -= 3600;
            }
            while (stamp >= 60) {
                minute += 1;
                stamp -= 60;
            }
            second = stamp;
        }
    }
}
