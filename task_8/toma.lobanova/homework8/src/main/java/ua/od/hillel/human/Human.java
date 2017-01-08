package ua.od.hillel.human;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Human {
    String name = "unspecified";
    String surname = "unspecified";
    GregorianCalendar birthday = new GregorianCalendar(1975,
            Calendar.DECEMBER, 31);
    boolean married = false;
    boolean children = false;
    boolean work = false;
    String companyName = "unspecified";

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null) {
            name = newName;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        if (newSurname != null) {
            surname = newSurname;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String newCompanyName) {
        if (newCompanyName != null) {
            companyName = newCompanyName;
        }
    }

    public boolean getChildrenStatus() {
        return children;
    }

    public void setChildrenStatus(boolean newStatus) {
        children = newStatus;
    }

    public boolean getMarriageStatus() {
        return married;
    }

    public void setMarriageStatus(boolean newStatus) {
        married = newStatus;
    }

    public boolean getWorkStatus() {
        return work;
    }

    public void setWorkStatus(boolean newStatus) {
        work = newStatus;
    }

    public GregorianCalendar getBirthday() {
        return birthday;
    }

    public void setBirthday(int year, int month, int day) {
        GregorianCalendar newBirthday = new GregorianCalendar(year, month, day);
        birthday = newBirthday;
    }
}
