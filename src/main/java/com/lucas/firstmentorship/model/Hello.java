package com.lucas.firstmentorship.model;


import java.util.Objects;

public class Hello {

    private String greeting;

    private String firstName;

    private String lastName;

    public Hello() {
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hello)) return false;
        Hello hello = (Hello) o;
        return Objects.equals(getGreeting(), hello.getGreeting()) && Objects.equals(getFirstName(), hello.getFirstName()) && Objects.equals(getLastName(), hello.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGreeting(), getFirstName(), getLastName());
    }
}
