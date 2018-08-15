package model;

import java.util.Date;

public class User {
    private Date dateStart = new Date();
    private Date dateFinish = new Date();

    public User(Date start, Date finish) {
        dateStart = start;
        dateFinish = finish;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    @Override
    public String toString() {
        return "User{" +
                "dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                '}';
    }
}
