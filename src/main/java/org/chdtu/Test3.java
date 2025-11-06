package org.chdtu;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean(Person.class);
        person.setPet(context.getBean(Cat.class));
        person.callYourPet();

        context.close();
    }
}
