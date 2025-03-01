package com.mockito.samples;

import java.util.List;
import java.util.Objects;

public class User implements Comparable<User>{
    Long Id;
    String firstName;
    String lastName;
    List<String> grants;

    public Long getId() {
        return Id;
    }

    public User setId(Long id) {
        Id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<String> getGrants() {
        return grants;
    }

    public User setGrants(List<String> grants) {
        this.grants = grants;
        return this;
    }

    @Override
    public String toString(){
        return "User "+ this.firstName + " "+this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(Id, user.Id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, firstName, lastName);
    }


    @Override
    public int compareTo(User o) {
        return  ( this.firstName.compareTo(o.firstName) + this.lastName.compareTo(o.lastName));
    }
}
