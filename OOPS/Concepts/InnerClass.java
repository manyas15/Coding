package OOPS.Concepts;

public class InnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Manya");
        Test b = new Test("Manvi");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
