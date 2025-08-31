package OOPS.Polymorphism;

public class Numbers {
    double sum(double a , int b){
        return a + b;
    }

    int sum(int a , int b , int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(3 ,5 );        //we pass int but double is being called becoz java automatically convert it
        obj.sum(3,5,7);
    }
}
