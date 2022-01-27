import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1+1);
    }
    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);

        Path fileName2 = Path.of("test-file4.md");
	    String contents2 = Files.readString(fileName2);
        ArrayList<String> links2 = MarkdownParse.getLinks(contents2);
        assertEquals(List.of(), links2);

        Path fileName3 = Path.of("test-file3.md");
	    String contents3 = Files.readString(fileName3);
        ArrayList<String> links3 = MarkdownParse.getLinks(contents3);
        assertEquals(List.of("google.com"), links3);
        
    }
    
}
