import java.util.ArrayList;

import java.util.Scanner;

public class Show {
    Scanner scanner = new Scanner(System.in);
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(Director director, int duration, ArrayList<Actor> listOfActors, String title) {
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.title = title;
    }

    void printActors(){
        System.out.println("Актеры, участвующие в спектакле: " + title);
        for (Actor actor : listOfActors) {
            actor.printInfo();
        }
    }

    private boolean checkActor(Actor otherActor){
        for (Actor actor : listOfActors) {
            if (otherActor.equals(actor))
                return true;
            }

        return false;
    }

    void addActorToShow(Actor actor){


        boolean isEquals = checkActor(actor);

        if (isEquals)
            IO.println("Такой актер уже существует");

        else {
            listOfActors.add(actor);
        }
    }

    void changeActorInShow(Actor newActor, String surnameOldActor){
        int numberOfActors = listOfActors.size();

            for (Actor actor : listOfActors) {
                if (actor.surname.equals(surnameOldActor)){
                    listOfActors.remove(actor);
                    break;
            }}
        int newNumberOfActors = listOfActors.size(); // херня решение?
        if (numberOfActors == newNumberOfActors)
            IO.println("Фамилия актера, которого надо заменить не найдена");

        else {
            listOfActors.add(newActor);
        }

    }
}
