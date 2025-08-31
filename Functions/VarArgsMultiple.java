public class VarArgsMultiple {
    public static void main(String[] args) {
        multiple(2, 5, "Manya", "Aadi");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a);
        System.out.println(b);

        System.out.print("Strings: ");
        for (String str : v) {
            System.out.print(str + " ");
        }
    }
}
