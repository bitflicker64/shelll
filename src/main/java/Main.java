import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        redo(true){
        String input = scanner.nextLine();
        System.out.println(input + ": command not found");
    }
    }
}
