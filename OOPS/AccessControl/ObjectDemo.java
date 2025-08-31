package OOPS.AccessControl;

public class ObjectDemo {
    
    int num;
    float gpa;

    //already covered

    // @Override
    // public String to.String(){
    //     return super to.String();
    // }

    // @Override
    // public void finalize throws Throwable{
    //     super.finalize();
    // }

    public ObjectDemo(int num , float gpa){
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);

        // System.out.println(obj.hashCode());       // will give a random value

        if(obj1 == obj2){
            System.out.println("Obj1 is = Obj2");    //this will not be printed
        }

        if(obj1.equals(obj2)){
            System.out.println("obj1 is equals to obj2");  //this will be printed
        }
    }

}
