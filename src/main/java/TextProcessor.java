import sun.misc.IOUtils;

import java.io.File;
import java.io.FileInputStream;

public class TextProcessor {
    public static String processText(String inputString) {
        String outputString = "in and out: " + inputString;
        return outputString;
    }
}


//try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
//        StringBuilder sb = new StringBuilder();
//        String line = br.readLine();
//
//        while (line != null) {
//        sb.append(line);
//        sb.append(System.lineSeparator());
//        line = br.readLine();
//        }
//        String everything = sb.toString();
//        }