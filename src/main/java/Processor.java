import java.io.*;

public class Processor {
    public static String processText(String inputString) {
        String outputString = "in and out: " + inputString;
        return outputString;
    }

    public static String openFile(String absolutePath) {
        String outputString = "in and out: ";
        try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputString;
    }
}