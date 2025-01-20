# Mobile Plans Finder and Administration System
A proof-of-concept Java application to demonstrate how a mobile phone shop can help customers find the perfect service plan that meets their needs, whether they're looking for an unlimited 5G data plan or a value international calls plan. This application is available as an IntelliJ project (.iml) for machines with IntelliJ installed (tested on IDEA 2020 and OpenJDK 15), or as a JAR executable file on any machine with Java JDK installed.

## Requirements
- Java JDK 8 or newer (e.g. OpenJDK of any edition including Microsoft or Amazon Corretto). The latest LTS version of OpenJDK Microsoft edition is highly recommended and can be downloaded [here](https://learn.microsoft.com/en-us/java/openjdk/download) for Windows, macOS and Linux.
- Optional (for the .iml project file): IntelliJ IDEA 2020 or newer

## How to run this demo application
The Mobile Plans Finder and Administration application can be run directly from IntelliJ IDEA using the .iml file or as an executable JAR file on any machine with Java JDK installed. This project was created on IntelliJ IDEA 2020, although it will also run from later versions of IntelliJ.

### Method 1: Run directly without an IDE (e.g. IntelliJ)
1. Download the ZIP package containing the JAR file from the Releases page and extract all contents to a new folder on your computer. The package also includes a pre-loaded ***MobilePlans.dat*** file in order for the application to run correctly.
2. Before running the application, please ensure that you have Java JDK (OpenJDK) installed on your computer. Open the extracted folder, and then double-click on the ***oop-java-mobileplans.jar*** file to run the application.

### Method 2: Run from IntelliJ IDEA
1. Clone the repository into an empty folder on your computer by entering this command on your terminal *(without double-quotes)*: "**git clone https://github.com/NeilSebbey/oop-java-mobileplans.git**".
2. Open the cloned folder and double-click on the .iml file. This file should take you to IntelliJ IDEA. Alternatively, you can open IntelliJ and then open the .iml file from there.
3. Once you opened the .iml file, please ensure that you have your Java JDK (OpenJDK) configured under the **Language level** option in the **Project Settings > Project** tab of the **Project Structure** properties.
4. Double-click on the MainMenu.java file from the files sidebar on the IntelliJ window and then click on the green **Start** icon to run the application from IntelliJ. The project package includes the ***MobilePlans.dat*** data file, pre-loaded with data plans, operators and customer entries.