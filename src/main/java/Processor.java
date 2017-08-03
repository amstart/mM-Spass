import java.io.*;
import java.util.Scanner;

public class Processor {
    public static String processText(String inputString) {
        String outputString = "in and out: " + inputString;
        return outputString;
    }

    public static String readFile(String absolutePath) {
        String outputString = "in and out: ";
        try(Scanner in = new Scanner(new FileReader(absolutePath));) {
            StringBuilder sb = new StringBuilder();
            while(in.hasNext()) {
                sb.append(in.next());
            }
            in.close();
            outputString = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputString;
    }
}