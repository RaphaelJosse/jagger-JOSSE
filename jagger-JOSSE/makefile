default:
	java -cp javacc.jar javacc Jagger.jj
	javac -g Jagger.java


javacc:
	java -cp javacc.jar javacc Jagger.jj
	javac -g Jagger.java

classes:
	javac *.java

check: testFile.txt default
	java Jagger testFile.txt

clean:
	$(RM) *.class
	$(RM) ParseException.java
	$(RM) SimpleCharStream.java
	$(RM) TokenMgrError.java
	$(RM) Token.java
	$(RM) JaggerConstants.java
	$(RM) JaggerTokenManager.java
	$(RM) Jagger.java
