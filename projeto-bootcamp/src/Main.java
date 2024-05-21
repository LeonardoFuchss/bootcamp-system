import domain.Dev;
import domain.bootcamp.BootCamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BootCamp bootCamp = new BootCamp("Santander", "Back end Java");
        bootCamp.addContentCourse("Java Collections", "Collections", 30);
        Dev leo = new Dev("Leonardo");
        leo.register(bootCamp);
        bootCamp.showSubscribers();
        leo.showRegister();
    }
}