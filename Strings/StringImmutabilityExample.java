// public class StringImmutabilityExample {
//     public static void main(String[] args) {
//         String name = "Kunal";  // Initial value of name
//         System.out.println("Before change: " + name);

//         // Attempt to change the string (without reassigning)
//         changeString(name);
        
//         System.out.println("After change: " + name);  // name remains unchanged
//     }

//     static void changeString(String naam) {
//         naam = "Rahul";  // Changing the local variable 'naam' to "Rahul"
//         // This change only affects the local copy of the reference.
//         System.out.println("Inside changeString: " + naam);  // "Rahul"
//     }
// }

public class StringImmutabilityExample {
    public static void main(String[] args) {
        String name = "Kunal";  // Initial value of name
        System.out.println("Before change: " + name);

        // Call the method and reassign the returned value to the original string variable
        name = changeString(name);

        System.out.println("After change: " + name);  // name is now updated to "Rahul"
    }

    static String changeString(String naam) {
        naam = "Rahul";  // Changing the local reference to point to a new string
        return naam;      // Returning the modified string
    }
}