package HomeWork4.MyBilder.demo;

import HomeWork4.MyBilder.Person;

public class Demo {
    public static void main(String[] args) {

        Person.Builder personBilder = Person.newBuilder();

        personBilder.setfirstName("Vladislav");
        personBilder.setsecondName("Kaverdiy");
        personBilder.build();
        System.out.println(personBilder instanceof Person.Builder);

    }
}
