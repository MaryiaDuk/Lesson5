@echo off
javac -J-Dfile.encoding=cp866 -encoding utf8  -sourcepath ./src src/task3/Main.java
java -classpath ./src task3.Main
Pause
