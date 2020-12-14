package patterns.builder;

public class RunExample {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withAge(123)
                .withSex("M")
                .withSurname("Rus")
                .build();

        System.out.println(person.getSurname());
    }
}
