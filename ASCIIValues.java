public class StaticBlockDemo {
    // Static variable
    static int staticVariable;

    // Static block
    static {
        System.out.println("This is the static block.");
        staticVariable = 42; // Initializing static variable
    }

    // Static method
    static void displayStaticVariable() {
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Main method.");

        // Calling the static method
        displayStaticVariable();
    }
}




