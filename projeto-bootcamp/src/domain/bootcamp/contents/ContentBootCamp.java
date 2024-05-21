package domain.bootcamp.contents;

import domain.bootcamp.BootCamp;

// Abstract content class (Parent class)
public abstract class ContentBootCamp extends BootCamp {
    private String title;
    private String description;
    private int hoursLead;

    public abstract int calculateXp();

    public ContentBootCamp(String title, String description, int hoursLead) {
        this.title = title;
        this.description = description;
        this.hoursLead = hoursLead;
    }

    public int getHoursLead() {
        return hoursLead;
    }

    public void setHoursLead(int hoursLead) {
        this.hoursLead = hoursLead;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
