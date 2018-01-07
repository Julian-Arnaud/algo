CC=javac
EXEC=Main
EXEC: 
	find . -name "*.java" -print | xargs javac

clean:
	find . -type f -name "*.class" -delete