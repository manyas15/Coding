package OOPS.Concepts;

public class StaticEg {
    public static void main(String[] args) {
        Human manya = new Human(20 , "Manya Sachdeva" , 40000 , false);
        Human aadi = new Human (20, "Aadi Dayal" , 50000 ,false);

        System.out.println(manya.population);
        System.out.println(aadi.population);
    }
}
