package ru.mirea.naz.p2;

import java.time.LocalDate;

public class Human {
    private int age;
    private String lastName;
    private String firstName;
    private LocalDate birthday;
    private int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthday, int weight) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthday=" + birthday +
                ", weight=" + weight +
                '}';
    }
}
