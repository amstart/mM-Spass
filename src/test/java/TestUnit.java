import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import org.junit.Before;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUnit extends TestCase  {
    protected File infile;
    String outfilePath = "processed_test123.txt";
    protected String original = "Mama mia was soll das denn?";
    protected String processed = "maMa Mia was soll das denn?";

    @Before
    public void setUp() throws IOException {
        infile = new File("test123.txt");
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter(infile));
            outputStream.println(original);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    @Test
    public void testmM() throws IOException {
        BufferedReader inputStream = null;
        Processor.processFile(infile);
        try {
            inputStream = new BufferedReader(new FileReader(outfilePath));
            String l = inputStream.readLine();
            assertEquals(l, processed);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
    //tearDown used to close the connection or clean up activities
    public void tearDown(  ) {
        System.out.println(infile.getAbsolutePath());
        infile.delete();
        try {
            Files.delete(Paths.get(outfilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
