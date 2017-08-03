import java.io.*;
import java.util.Scanner;

public class Processor {
    public static String saveFile(String inputString, File file) throws IOException {
        FileWriter outputStream = null;
        try {
            outputStream = new FileWriter(file.getPath() + "processed_" + file.getName());

            for(int i=0; i<inputString.length()-1; i++){
                outputStream.write(inputString.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
        return "saved: " + inputString;
    }

    public static String readFile(File file) {
        String outputString = "in and out: ";
        try(Scanner in = new Scanner(new FileReader(file.getAbsolutePath()));) {
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