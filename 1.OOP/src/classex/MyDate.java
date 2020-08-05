package classex;

import java.util.Objects;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

}


