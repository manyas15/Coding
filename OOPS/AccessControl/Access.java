package OOPS.AccessControl;

public class Access {
    private int num;
    String name;
    int[] arr;

    public int getNum(){
        return num;         //since this method is public so it can be accessed from anywhere 
    }

    public void setNum(int num){
        this.num = num;
    }

    public Access(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
