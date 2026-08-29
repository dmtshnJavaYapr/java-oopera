import java.util.ArrayList;
import java.util.Arrays;


public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Дмитрий", "Гордон", Gender.MALE, 171);
        Actor actor2 = new Actor("Григорий", "Овчинников", Gender.MALE, 160);
        Actor actor3 = new Actor("Денис", "Прокопенко", Gender.MALE, 180);

        Director director1 = new Director("Настасья", "Филлиповна", Gender.FEMALE, 8);
        Director director2 = new Director("Лев", "Мышкин", Gender.FEMALE, 8);

        Opera opera1 = new Opera(director1, 120, new ArrayList<Actor>(),
                "Опера 1", "Текст либретто оперы1", new MusicAuthor("Бахтияр",
                "Ниязов", Gender.MALE), 6);
        opera1.addActorToShow(actor1);
        opera1.addActorToShow(actor2);
        opera1.addActorToShow(actor3);
        opera1.printActors();

        Ballet ballet1 = new Ballet(director2, 110, new ArrayList<Actor>(),
                "Балет 1", "Текст либретто балета1", new MusicAuthor("Бахтияр",
                "Ниязов", Gender.MALE), new Choreographer("Парфен", "Рогожин", Gender.MALE));

        ballet1.addActorToShow(actor1);
        ballet1.addActorToShow(actor2);
        ballet1.printActors();

        Show show1 = new Show(director2, 150, new ArrayList<>(), "Спектакль 1");
        show1.addActorToShow(actor2);
        show1.addActorToShow(actor3);
        show1.printActors();

        ballet1.changeActorInShow(actor3, "Гордон");
        ballet1.printActors();

        show1.changeActorInShow(actor3, "Дудкин");

        ballet1.printLibrettoText();
        opera1.printLibrettoText();



    }



}


