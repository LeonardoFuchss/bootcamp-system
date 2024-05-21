package domain.bootcamp.contents;

import domain.bootcamp.contents.ContentBootCamp;
// Abstract content class (Parent class)
public class Course extends ContentBootCamp {
    public Course(String title, String description, int hoursLead) {
        super(title, description, hoursLead);
    }
    @Override
    public int calculateXp() {

        int hours = getHoursLead();
        int xp = 0;

        if (hours <= 5 && hours > 0) {
            xp += 10;
        } else if (hours > 5 && hours <= 10) {
            xp += 20;
        } else if (hours > 10 && hours <= 20) {
            xp += 30;
        } else if (hours > 20 && hours <= 30) {
            xp += 40;
        }
        return xp;
    }
}

