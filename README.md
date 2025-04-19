#  JavaFX GUI Project (Eclipse)

This repository contains a JavaFX GUI project created in **Eclipse IDE**, with project structure files included (`.classpath`, `.project`, `build.fxbuild`). The application uses **JavaFX** to implement an interactive user interface.

---

##  Author

- **Hala Jebreel** 

---

## Project Structure

| File/Folder              | Description                                  |
|--------------------------|----------------------------------------------|
| `.classpath`             | Eclipse classpath file                       |
| `.project`               | Eclipse project descriptor                   |
| `build.fxbuild`          | JavaFX-specific build configuration file     |
| `src/`                   | Source folder (should contain your `.java` files) |
| `bin/`                   | Compiled classes (automatically generated)   |

---

## Requirements

- **Java JDK 11 or later**
- **JavaFX SDK**
- **Eclipse IDE** with **e(fx)clipse plugin** (or IntelliJ with JavaFX)

---

##  How to Run the Project

###  Eclipse Setup

1. **Clone or download** the project
2. Open **Eclipse IDE**
3. Go to `File > Import > Existing Projects into Workspace`
4. Select the project root folder
5. Ensure JavaFX is properly added in:
   - `Project Properties > Java Build Path > Libraries`
   - Add the path to `javafx-sdk/lib`
6. Run the main class

###  Manual Compilation via Terminal

```bash
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -d bin src/*.java
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp bin MainClassName
