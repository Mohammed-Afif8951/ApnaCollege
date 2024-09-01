package OOPS;

class Animal{
    void eat(){
        System.out.println("It eats");
    }
}

class Fish extends Animal{
    void swims(){
        System.out.println("It swims");
    }
}
class Tuna extends Fish{
    int fins;
}
class Shark extends Fish {
    int teeth;
}


class Bird extends Animal{
    void Fly(){
        System.out.println("It flys");
    }
}
class Peacock extends Bird{
    int speed;
}


class Mammals extends Animal{
    void walks(){
        System.out.println("It walks");
    }
}
class Dog extends Mammals{
    boolean walk;
}

class Cat extends Mammals{
    boolean jump;
}

class Human extends Mammals{
    boolean brain;
}
public class Hybrid_Inheritance {

    public static void main(String[] args) {
        Human h = new Human();
        h.brain = true;
        System.out.println(h.brain);
    }
}
