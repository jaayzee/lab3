import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    List<File> list = new ArrayList<>();
    File first = new File("./test");
    File second = new File("./test/blah.txt");
    File third = new File("./test/test1/blah1.txt");
    File fourth = new File("./test/test2/blah2.txt");
    File fifth = new File("./test/test2/blah2_extra.txt");
    @Test
    public void testGetFiles() throws IOException{
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        assertEquals(FileExample.getFiles(first), list);
    }
    public void testGetFilesFile() throws IOException{
        list.add(third);
        assertEquals(FileExample.getFiles(third), list);
    }
}
