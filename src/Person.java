import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    void printInfo(){
        System.out.println(name + " " + surname);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    } // убрал сравнение по полу, чтобы соблюсти условие из тех задания:
        // Актёры считаются одинаковыми, если у них совпадают имя, фамилия и рост.

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
