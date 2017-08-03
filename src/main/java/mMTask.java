import sun.misc.IOUtils;

import javax.swing.*;
import java.io.*;
public class mMTask {

    public static void main(String[] args) throws IOException {
        final JFileChooser fc;
        fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);
        if (returnVal != JFileChooser.APPROVE_OPTION) {
            System.out.println("Open command cancelled by user.");
        } else {
            File file = fc.getSelectedFile();
            System.out.println("Opening: " + file.getAbsolutePath() + ".");
            System.out.println(Processor.processFile(file));
        }
    }
}
