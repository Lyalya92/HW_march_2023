package hw1.task1;

public class PersonBuilderDemo {

    public static void main(String[] args) {
        Person newPerson = new PersonBuilder()
                .setFirstName("John")
                .setCountry("United States")
                .setAge(23)
                .setGender("male")
                .build();

        System.out.println(newPerson.getFirstName());
        System.out.println(newPerson.getAge());
        System.out.println(newPerson.getGender());
    }
}
