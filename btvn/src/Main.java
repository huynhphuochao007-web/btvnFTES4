/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
    
    
    Dog dog1 = new Dog();
    dog1.setName("kiki");
    dog1.setAge(4);
    dog1.setWeight(12.5);
    
    Cat cat1 = new Cat("Mimi", 2, 2.5);
    
    pets.add(dog1);
    pets.add(cat1);
    
    for (Pet p : pets){
        System.out.println(p.getName() + ": " + p.speak());
    }
    
    dog1.fetchBall();
    cat1.chaseMouse();
    }
}
