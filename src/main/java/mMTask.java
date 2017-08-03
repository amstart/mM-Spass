import sun.misc.IOUtils;

import javax.swing.*;
import java.io.*;
public class mMTask {

    public static void main(String[] args){
        final JFileChooser fc;
        fc = new JFileChooser();
        String fileString = "", outputString = "";
        int returnVal = fc.showOpenDialog(null);
        if (returnVal != JFileChooser.APPROVE_OPTION) {
            System.out.println("Open command cancelled by user.");
        } else {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            System.out.println("Opening: " + file.getAbsolutePath() + ".");
            outputString = TextProcessor.processText("hallo");
            System.out.println(outputString);
        }
    }
}
