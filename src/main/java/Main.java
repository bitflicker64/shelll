import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //(m himanshu verma aka bitflicker doing this code so yea no ai shit i am learning )
        System.out.print("$ ");
        String input;
        String a=
        try (Scanner o = new Scanner(System.in)){
         /*
         * this comment is for future referance only so yea basically for me the code writer so .....
         * This loop runs as long as there is more input to read from the user.
         * 
         * scanner.hasNextLine():
         *   - Checks if the user has entered another line of input.
         *   - Returns true if there is more input (i.e., Enter key was pressed).
         *   - Returns false if an EOF (End Of File) signal is received:
         *       - On Windows: Ctrl + Z then Enter
         *       - On Linux/macOS: Ctrl + D
         *
         * scanner.nextLine():
         *   - Reads the full line of input the user typed.
         *
         * Use case:
         *   - This is useful when you want to keep accepting input line by line
         *     until the user explicitly stops (like in a terminal or shell).
         */
        while (o.hasNextLine()) //after this hasLine command dont have to use close command lol 
        {
            input = o.nextLine();
        String command = input.split(" ")[0];
        if(command.equals("test")){

        }
        switch(command){
            case "exit":
            System.exit(0);
            break;
            case "echo":
            // If user types "echo Hello", it prints "Hello"  // input.split(" ", 2)[1] splits only into 2 parts: ["echo", "Hello"]
            System.out.println(input.split(" ",2)[1]);
             // Prints an error message to System.err (standard error stream)
             break;
             default : System.err.printf("%s: command not found%n", input);
             // '%s' is replaced by the whole input//'%n' adds a new line in a platform-safe way
             break;

        }
        System.out.print("$ ");
    }
        }   
      }
}