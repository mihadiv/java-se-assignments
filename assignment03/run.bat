@echo off
echo Compiling Assignment03.java...
javac src\Assignment03.java

if %errorlevel% equ 0 (
    echo Running Assignment03...
    java -cp src Assignment03
) else (
    echo Compilation failed.
)

pause
