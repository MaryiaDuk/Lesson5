@echo off
javac -J-Dfile.encoding=cp866 -encoding utf8  -sourcepath ./src src/task1/Main.java
java -classpath ./src task1.Main
Pause
