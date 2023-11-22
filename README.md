# REDSTOR CHALLENGE [JAVA]
![redstorlogo](https://github.com/AnoshMalik/Redstor-Challenge-Java/assets/3519251/1c6c37b5-e6c5-43f2-9ec6-05cff1218577)

------------------------------------------------------------------------------------------

Project Specs :
Written in Java using IntelliJ Idea on Linux Ubuntu
Tested on Linux terminal and Windows 10 in CMD
Terminal based (No GUI)

Compilation instructions
Easy
1. Clone repo > Use Master branch
2. Open out/production/Redstor-Challenge folder in terminal
3. Type --> java Main
4. The code should run in terminal (assuming the right jdk is there)
5. In case of error on linux try --> sudo apt install openjdk-17-jre-headless followed by --> sudo apt install openjdk-17-jdk-headless and repeat step 3

Hard
1. Clone the repo and open in IntelliJ Idea
2. Click > Build (Ctrl+F9) and see if any errors regarding JDK/JRE or source/release versions
3. If all clear -> Click run (Shif+F10) and check terminal in IntelliJ IDE
4. If errors --> Click File > Project Structure > Project > SDK version is the same as --> Project Structure > Modules > Module SDK version

To go a step further
1. Click File > Project Structure > Project > Compiler output > Copy it
2. In linux terminal or cmd > cd into that location 
3. cd into src folder and copy all the files
4. Create a new folder elsewhere on the computer and paste them there
5. In terminal type > javac Main.java Audi.java BMW.java Chevrolet.java Dodge.java Product.java Checkout.java
6. Once .class files appear type > java Main
7. The code should run 

This project has been tested to compile with SDK versions:
1. 1.8 Eclipse Temurin version 1.8.0_302 on Windows
2. jbr-17 Jetbrains Runtime version 17.0.6 on Linux Ubuntu

------------------------------------------------------------------------------------------
## The Challenge
Implement the code for a supermarket checkout that calculates the total price of a number of
items. In a normal supermarket, items are identified using Stock Keeping Units (SKUs), but
in our store we’ll be using individual letters of the alphabet (A, B, C etc). Our goods are
priced individually, but some items also have multibuy offers. For example, item A might cost
60 individually, but if you buy three A’s then they’ll cost you 150. This week’s prices are as
follows: <br/>
Item Unit Price Special Price <br/>
A 60 3 for 150 <br/>
B 30 2 for 45 <br/>
C 30 <br/>
D 25 <br/>
Items can be scanned in any order, so if we scan a B, an A, then another B, we’ll recognise
the offer for two B’s and price them at 45, giving a total price of 105. Because our store
changes its pricing frequently, we need to be able to pass in a set of pricing rules each time
we begin handling a checkout transaction. <br/>
You may use any language and technologies to design and implement your solution. The
interface for the checkout should look similar to the following pseudocode: <br/>
checkout = new Checkout(pricingRules) <br/>
checkout.Scan(item) <br/>
checkout.Scan(item) <br/>
… <br/>
price = checkout.Total <br/>


------------------------------------------------------------------------------------------
