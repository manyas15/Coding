import java.util.Scanner;

class AgeNotValidEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            validAge(age);
            System.out.println(" You are eligible to vote!");
        } catch (Exception e) {
            System.out.println(" You are not eligible to vote!");
        }
    }

    public static void validAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception();
        }
    }
}
