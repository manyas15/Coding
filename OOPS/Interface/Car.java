// package OOPS.Interface;

public class Car implements Engine , Media{
    int a = 30;

    @Override
    public void brake(){
        System.out.println("brake");
    }

    @Override
    public void start(){
        System.out.println("start");
    }

    @Override
    public void stop(){
        System.out.println("stop");
    }

    @Override
    public void acc(){
        System.out.println("acc");
    }
}
