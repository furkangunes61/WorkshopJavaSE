package com.furkangunes.oop.inheritancex;

public class Person {
    // Variable
    private String name;
    private String surname;

    // Parametresiz Constructor
    public Person() {
    }

    // Parametreli Constructor
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    // Method
    public void govdeliMethod(String data){
        System.out.println(data);
    }

    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
