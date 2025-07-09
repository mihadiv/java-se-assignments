@echo off

set SRC=src\a05_4

echo.
echo Select version to run:
echo [1] OOP
echo [2] Non-OOP
set /p choice=Your choice (1/2):

if "%choice%"=="1" (
    echo Compiling OOP classes ...
    javac %SRC%\RentCars.java
    if %errorlevel% neq 0 (
        echo Failed to compile RentCars.java
        pause
        exit /b
    )

    javac -cp src %SRC%\A05_4_Oop.java
    if %errorlevel% neq 0 (
        echo Failed to compile A05_4_Oop.java
        pause
        exit /b
    )

    echo Running OOP version ...
    java -cp src a05_4.A05_4_Oop
)

if "%choice%"=="2" (
    echo Compiling Non-OOP class ...
    javac -cp src %SRC%\A05_4_NonOop.java
    if %errorlevel% neq 0 (
        echo Failed to compile A05_4_NonOop.java
        pause
        exit /b
    )

    echo Running Non-OOP version ...
    java -cp src a05_4.A05_4_NonOop
)

echo.
pause
