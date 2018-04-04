@echo off
javac -J-Dfile.encoding=cp866 -encoding utf8  -sourcepath ./src src/task2/Main.java
java -classpath ./src task2.Main
Pause
