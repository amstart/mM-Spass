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
            System.out.println("Opening: " + file.getAbsolutePath() + ".");
            fileString = Processor.readFile(file.getAbsolutePath());
            outputString = Processor.processText(fileString);
            System.out.println(outputString);
        }
    }
}
