package hw1.task1;

import hw1.task1.Builder;

public class PersonBuilder implements Builder {
    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    @Override
    public Builder setFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @Override
    public Builder setLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    public Builder setMiddleName(String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    @Override
    public Builder setCountry(String country) {
        person.setCountry(country);
        return this;
    }

    @Override
    public Builder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    @Override
    public Builder setPhone(String phone) {
        person.setPhone(phone);
        return this;
    }

    @Override
    public Builder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public Builder setGender(String gender) {
        person.setGender(gender);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
