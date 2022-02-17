import static org.junit.Assert.*;
import org.junit.*;
<<<<<<< HEAD
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


//To compile/run:
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks1() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://something.com");
        linkTester.add("some-page.html");

        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks2() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://something.com");
        linkTester.add("https://something.com");

        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks3() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://youtube.com");

        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks4() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://random.com");

        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks5() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();

        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks6() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("something.com");

        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks7() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        //linkTester.add("something.com");

        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
        System.out.println("test change 2");
    }
=======
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
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

        
        Path fileName2 = Path.of("incorrect.md");
	    String contents2 = Files.readString(fileName2);
        ArrayList<String> links2 = MarkdownParse.getLinks(contents2);
        assertEquals(List.of(), links2);
        
       
        Path fileName3 = Path.of("image.md");
	    String contents3 = Files.readString(fileName3);
        ArrayList<String> links3 = MarkdownParse.getLinks(contents3);
        assertEquals(List.of("google.com"), links3);

        Path fileName4 = Path.of("doubleParenthesis.md");
	    String contents4 = Files.readString(fileName4);
        ArrayList<String> links4 = MarkdownParse.getLinks(contents4);
        assertEquals(List.of("(www.google.com)"), links4);
        
        
    }

    

    @Test
    public void failingTest(){
        assertEquals(5,2+3);
    }

    @Test
    public void anotherFailureInducingInput() throws IOException{
        Path fileName3 = Path.of("noOpenParen.md");
	    String contents3 = Files.readString(fileName3);
        ArrayList<String> links3 = MarkdownParse.getLinks(contents3);
        assertEquals(List.of(), links3);
    }


>>>>>>> 1badd88badaa58297032da7b48d44fe1229a43a7
}