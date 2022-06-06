package com.MyFirstProject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {
    @Test
    public void fakerTest() {
        //Cretae faker object
        Faker faker = new Faker();

        //Generate fake data
        String fName = faker.name().firstName();
        System.out.println(fName);

        String lName = faker.name().lastName();
        System.out.println(lName);

        String fFullName = faker.name().fullName();
        System.out.println(fFullName);

        String fUserName = faker.name().username();
        System.out.println(fUserName);

        String fEmail = faker.internet().emailAddress();
        System.out.println(fEmail);

        String title=faker.name().title();
        System.out.println(title);

        String city=faker.address().city();
        System.out.println(city);

        String state=faker.address().state();
        System.out.println(state);

        String fullAdress=faker.address().fullAddress();
        System.out.println(fullAdress);

        String cellPhone=faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

        String emailAdress=faker.internet().emailAddress();
        System.out.println(emailAdress);

        String randomZipCode=faker.number().digits(5);
        System.out.println(randomZipCode);


    }
}
