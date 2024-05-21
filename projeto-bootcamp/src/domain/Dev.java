package domain;

import domain.bootcamp.BootCamp;
import domain.bootcamp.contents.ContentBootCamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<ContentBootCamp> registered = new LinkedHashSet<>();
    private Set<ContentBootCamp> concluded = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void register(BootCamp bootCamp) { // Registering dev in boot camp and all yours contents of boot camp
        this.registered.addAll(bootCamp.getContent());
        registered.forEach(ContentBootCamp::calculateXp);
        bootCamp.getSubscribers().add(this); // Adding this dev in subscribers of bootcamp of param

    }
    public void conclude() { // if exist boot camp with xp bigger or equal 40, add a new concluded boot camp and remove from registered´s

        Optional<ContentBootCamp> contentBootCamp = this.registered.stream().filter(n -> n.calculateXp() >= 40).findFirst();
        if (contentBootCamp.isPresent()) {
            this.concluded.add(contentBootCamp.get());
            this.registered.remove(contentBootCamp.get());
            System.out.println("Boot camp " + contentBootCamp.get().getTitle() + " completed successfully");
        } else {
            System.err.println("You are not subscribed to any content");
        }
    }
    public void showConcludes() {

        concluded.forEach(content -> {
            String name = content.getTitle();
            String description = content.getDescription();
            int xp = content.calculateXp();
            System.out.println("===============================");
            System.out.println("           COMPLETED                    ");
            System.out.println(" ");
            System.out.println("CONTENT: " + name);
            System.out.println("DESCRIPTION: " + description);
            System.out.println("TOTAL XP: " + xp);
            System.out.println("===============================");
        });
    }
    public void showRegister() {

        registered.forEach(content -> {
            String name = content.getTitle();
            String description = content.getDescription();
            int xp = content.calculateXp();
            System.out.println("================================");
            System.out.println("           REGISTERED                     ");
            System.out.println(" ");
            System.out.println("CONTENT: " + name);
            System.out.println("DESCRIPTION: " + description);
            System.out.println("TOTAL XP: " + xp);
            System.out.println("===============================");
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ContentBootCamp> getRegistered() {
        return registered;
    }

    public void setRegistered(Set<ContentBootCamp> registered) {
        this.registered = registered;
    }

    public Set<ContentBootCamp> getConcluded() {
        return concluded;
    }

    public void setConcluded(Set<ContentBootCamp> concluded) {
        this.concluded = concluded;
    }
}
