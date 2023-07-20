public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) throw new IllegalStateException("Человек обязан иметь имя и фамилию");
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть отрицательным");
        return new Person(name, surname, age, city);
    }
}
