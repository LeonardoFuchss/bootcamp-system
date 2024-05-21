package domain.bootcamp;

import domain.bootcamp.contents.ContentBootCamp;
import domain.Dev;
import domain.bootcamp.contents.Course;
import domain.bootcamp.contents.Mentoring;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

// Classe boot camp que recebe inscritos e conteudos além dos seus atributos
public class BootCamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finalDate = startDate.plusDays(45);
    private Set<Dev> subscribers = new LinkedHashSet<>();
    private Set<ContentBootCamp> content = new LinkedHashSet<>();

    public BootCamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public BootCamp() {
    }

    // Add new content by instantiating the course class that extends the content class (Polymorphism)
    public void addContentCourse(String name, String description, int hours) {
        content.add(new Course(name, description, hours));
    }

    /// Add new content by instantiating the course class that extends the content class (Polymorphism)
    public void addContentMentoring(String name, String description, int hours) {
        content.add(new Mentoring(name, description, hours));
    }

    // Scroll through the list of subscribers and print to the console output.
    public void showSubscribers() {
        subscribers.forEach(sub -> {
            System.out.println("SUBSCRIBERS: " + sub.getName());
        });
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Set<Dev> subscribers) {
        this.subscribers = subscribers;
    }

    public Set<ContentBootCamp> getContent() {
        return content;
    }

    public void setContent(Set<ContentBootCamp> content) {
        this.content = content;
    }
}
