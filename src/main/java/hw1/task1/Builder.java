package hw1.task1;

public interface Builder {

    Builder setFirstName(String firstName);
    Builder setLastName(String lastName);
    Builder setMiddleName(String middleName);
    Builder setCountry(String country);
    Builder setAddress(String address);
    Builder setPhone(String phone);
    Builder setAge(int age);
    Builder setGender(String gender);
    Person build();
}
