public class Director extends Person{
    private int numberOfShow;

    public Director(String name, String surname, Gender gender, int numberOfShow) {
        super(name, surname, gender);
        this.numberOfShow = numberOfShow;
    }

    @Override
    void printInfo(){
        System.out.println("Режиссер: " + name + " " + surname);
    }
}


