test: MarkdownParseTest.class 
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
	echo 1
	
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	echo 2

MarkdownParse.class : MarkdownParse.java 
	javac MarkdownParse.java
	echo 3

clean:
	rm -f *.class