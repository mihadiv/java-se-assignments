@echo off

set SRC=src\a05_1

echo.
echo Select version to run:
echo [1] OOP
echo [2] Non-OOP
set /p choice=Your choice (1/2):

if "%choice%"=="1" (
    echo Compiling OOP version...
    javac %SRC%\GasConsume.java
    if %errorlevel% neq 0 (
        echo Failed to compile GasConsume.java
        pause
        exit /b
    )

    javac -cp src %SRC%\A05_1_Oop.java
    if %errorlevel% neq 0 (
        echo Failed to compile A05_1_Oop.java
        pause
        exit /b
    )

    echo Running OOP version...
    java -cp src a05_1.A05_1_Oop

) else if "%choice%"=="2" (
    echo Compiling Non-OOP version...
    javac -cp src %SRC%\A05_1_NonOop.java
    if %errorlevel% neq 0 (
        echo Failed to compile A05_1_NonOop.java
        pause
        exit /b
    )

    echo Running Non-OOP version...
    java -cp src a05_1.A05_1_NonOop

) else (
    echo Invalid choice. Please enter 1 or 2.
)

pause
