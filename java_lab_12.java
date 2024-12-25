import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

class CustomStack {
    private StringBuilder txt;
    private Stack<Command> hist;
    public CustomStack() {
        txt = new StringBuilder();
        hist = new Stack<>();
    }
    public void insert(String value) {
        txt.append(value);
        hist.push(new Command("insert", value));
    }
    public void delete(int value) {
        String removedText = txt.substring(txt.length() - value);
        txt.delete(txt.length() - value, txt.length());
        hist.push(new Command("delete", removedText));
    }
    public char get(int index) {
        return txt.charAt(index - 1);
    }
    public void undo() {
        if (!hist.isEmpty()) {
            Command lastCommand = hist.pop();
            if (lastCommand.type.equals("insert")) {
                txt.delete(txt.length() - lastCommand.value.length(), txt.length());
            } else if (lastCommand.type.equals("delete")) {
                txt.append(lastCommand.value);
            }
        }
    }
    private static class Command {
        String type;
        String value;

        Command(String type, String value) {
            this.type = type;
            this.value = value;
        }
    }
    public void processCommands(String[] commands) {
        for (String command : commands) {
            String[] parts = command.split(" ");
            int cmd = Integer.parseInt(parts[0]);
            switch (cmd) {
                case 1:
                    insert(parts[1]);
                    break;
                case 2:
                    delete(Integer.parseInt(parts[1]));
                    break;
                case 3:
                    System.out.println(get(Integer.parseInt(parts[1])));
                    break;
                case 4:
                    undo();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
public class java_lab_12 {
    public static void main(String[] args) {
        CustomStack editor = new CustomStack();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] commands = input.split(",");
        editor.processCommands(commands);
        sc.close();
    }
}
