
import java.util.Scanner;

class ValidEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        try {
            validemail(id);
            System.out.println("Correct");
        } catch (Exception e) {
            System.out.println("Incorrect");
        }
    }

    public static void validemail(String id) throws Exception {
        if (!id.contains("@") || !id.contains(".")) {
            throw new Exception();
        }

        int atIndex = id.indexOf('@');
        int dotIndex = id.indexOf('.', atIndex);

        if (dotIndex == -1) {
            throw new Exception();
        }
    }
}
