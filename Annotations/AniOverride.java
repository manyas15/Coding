// package Annotations;

public class AniOverride{
    void sound(){
        System.out.println("Animal Sound");
    }

    public static void main(String[] args) {
        AniOverride a = new Dog();
        a.sound();
    }
}

class Dog extends AniOverride{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}

//@Override helps the compiler verify that the method is correctly overriding a superclass method. 

