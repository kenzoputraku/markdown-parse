// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
        
        while(currentIndex < markdown.length()) {
            
            
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);
            if(closeParen == -1){
                return toReturn;
            }
            if(markdown.charAt(nextOpenBracket - 1) == '!') { 
                currentIndex = closeParen + 1; 
                continue;
            }
            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
            //System.out.println(currentIndex);
            //System.out.println(markdown.charAt(currentIndex));
        }
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        //System.out.println(contents);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}



//test file 4
/*Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 22, end -1, length 36
        at java.base/java.lang.String.checkBoundsBeginEnd(String.java:4601)
        at java.base/java.lang.String.substring(String.java:2704)
        at MarkdownParse.getLinks(MarkdownParse.java:25)
        at MarkdownParse.main(MarkdownParse.java:36)*/