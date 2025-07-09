@echo off

echo Compiling Matrix.java ...
javac src\Matrix.java
if %errorlevel% neq 0 (
    echo Compilation failed.
    pause
    exit /b
)

echo Compiling Assignment04.java ...
javac -cp src src\Assignment04.java
if %errorlevel% neq 0 (
    echo Compilation failed.
    pause
    exit /b
)

echo.
echo Running Assignment04 ...
java  -cp src Assignment04

pause