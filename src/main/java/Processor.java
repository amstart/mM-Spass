import java.io.*;
import java.util.Scanner;

public class Processor {
    public static String processFile(File file) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        String filePath = file.getAbsolutePath().
                substring(0,file.getAbsolutePath().lastIndexOf(File.separator))
                + File.separator + "processed_" + file.getName();

        try {
            inputStream = new BufferedReader(new FileReader(file.getAbsolutePath()));
            outputStream = new PrintWriter(new FileWriter(filePath));

            String l;
            while ((l = inputStream.readLine()) != null) {
                char[] ch = l.toCharArray();
                for (int i=0; i<ch.length; i++) {
                    if (ch[i] == 'm') {
                        ch[i] = 'M';
                    }
                    else if (ch[i] == 'M') {
                        ch[i] = 'm';
                    }
                }
                outputStream.println(ch);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        return "saved: " + filePath;
    }
}