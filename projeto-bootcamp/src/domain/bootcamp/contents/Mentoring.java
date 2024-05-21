package domain.bootcamp.contents;

import domain.bootcamp.contents.ContentBootCamp;
// Classe filha da classe conteudos com seu proprio metodo de xp
public class Mentoring extends ContentBootCamp {
    public Mentoring(String title, String description, int hoursLead) {
        super(title, description, hoursLead);
    }
    @Override
    public int calculateXp() {
        return 30;
    }
}
