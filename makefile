CC=javac
EXEC=Main
EXEC: 
	find . -name "*.java" -print | xargs javac