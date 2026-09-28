/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Cat extends Pet{
    public Cat() {
        super();
    }
    
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public String speak() {
        return "Cat is cmeowing";
    }
    public void chaseMouse() {
        System.out.println("Cat is chasing a mouse!");
    }
    
}
