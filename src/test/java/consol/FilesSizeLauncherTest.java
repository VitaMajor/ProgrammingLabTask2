package consol;

import logic.FilesSize;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilesSizeLauncherTest {
    @Test
    public void filesSizeLauncherTest() throws Exception {
        String[] args1 = {"-c","-h","--si","src/test/java/filesForTest","src/test/java/filesForTest/TestFile1"};
        new FilesSizeLauncher().main(args1);
        String[] argsStr1 = {"src/test/java/filesForTest","src/test/java/filesForTest/TestFile1"};
        assertEquals("12.442 kb\n" + "8.102 kb\n" + "20.544 kb",
                new FilesSize(true,true,true).filesSize(argsStr1));
    }
}