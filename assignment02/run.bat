@echo off
echo Compiling Assignment02.java...
javac src\Assignment02.java

if %errorlevel% equ 0 (
    echo Running Assignment02...
    java -cp src Assignment02
) else (
    echo Compilation failed.
)

pause
