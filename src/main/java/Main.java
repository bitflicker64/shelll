import java.io.File;
import java.util.*;
public class Main {
     public static String findInPath(String command) {
        String pathEnv = System.getenv("PATH");
        String[] pathDirs = pathEnv.split(File.pathSeparator);//using pathseperator because its windows we could've used ":" instead if it was linux 

        for (String dir : pathDirs) {
            File file = new File(dir, command);
            if (file.exists() && file.canExecute()) {
                return file.getAbsolutePath();
            }
        }

        return null;
    }
    public static void main(String[] args) throws Exception {
        //(m himanshu verma aka bitflicker doing this code so yea no ai shit i am learning )
        System.out.print("$ ");
        String input;

        // built-in commands
        HashMap<String, String> cmds = new HashMap<>() {{
            put("echo", "shell builtin");
            put("exit", "shell builtin");
            put("type", "shell builtin");
        }};

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
            String[] parts = input.trim().split(" ", 2);
            String command = parts[0];

            if(command.equals("test")){
                // currently empty — placeholder for future test commands if needed
            }

            switch(command){
                case "type":
                    if(parts.length < 2){
                        System.out.println("type: missing argument");
                    } else {
                        String target = parts[1];
                        if(cmds.containsKey(target))
                        {
                            System.out.println(target + " is a " + cmds.get(target));
                        } 
                        else
                         {
                            String result = findInPath(target);
                            if (result != null) {
                                System.out.println(target + " is " + result);
                            } else {
                                System.out.println(target + ": not found");
                            }

                        }
                    }
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "echo":
                    if (parts.length > 1) {
                        System.out.println(parts[1]);
                    } else {
                        System.out.println();
                    }
                    break;
                default : 
                    System.err.printf("%s: command not found%n", input);
                    break;
            }

            System.out.print("$ ");
        }
        }   
    }
}
