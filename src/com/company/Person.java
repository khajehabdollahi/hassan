package com.company;

import java.io.Serializable;

public abstract class Person implements Serializable {
    /**
     * There are four variables, they are private. Every time that they are added it will be private in the same class.
     */
    private String name;
    private String familyName;
    private int age;
    private double weight;

    /**
     * It is a constructor to create new person vevey time that new person is added to the list.
     * @param name
     * @param familyName
     * @param age
     * @param Weight
     */

    public Person(String name, String familyName, int age, double Weight) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.weight = Weight;
    }

    /**
     *
     * @return name This function gets new name which is added to the list,
     */
    public String getName() {
        return name;
    }

    /**
     * This function gets the family which is added to the list
     * @return
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * This function gets the age of the person which is an Integer number and adds it to the list
     * @return
     */
    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    /**
     * This function writes the information of each person on the screen.
     * @return
     */

    @Override
    public String toString() {
        return String.format("Name: %s, Family Name: %s, Age: %d, Height: %.2f",name,familyName,age, weight);
    }
}
