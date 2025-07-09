@echo off
echo Compiling Assignment01.java...
javac src\Assignment01.java

if %errorlevel% equ 0 (
    echo Running Assignment01...
    java -cp src Assignment01
) else (
    echo Compilation failed.
)

pause
