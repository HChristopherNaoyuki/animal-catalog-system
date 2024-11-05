# Animal Catalog System

A Java program for cataloging animals in a zoo, designed to demonstrate object-oriented programming principles. This project includes inheritance, method overriding, and input validation through classes for `Animal`, `Bird`, and `Reptile`.

## Project Overview

This application allows users to:
- Input details for animals, specifically birds and reptiles.
- Display animal details in a formatted output.
- Demonstrate inheritance and polymorphism in Java, with an `Animal` superclass and subclasses `Bird` and `Reptile`.

### Features

- **Inheritance**: `Bird` and `Reptile` inherit common fields from `Animal`.
- **Method Overriding**: Each subclass overrides `input()` and `output()` methods to customize data handling.
- **Input Validation**: Ensures valid entries for `ID`, species names, and other attributes.

## Class Structure

1. **Animal**: Base class containing `IDtag` and `species`.
2. **Bird**: Derived class adding a `color` field for feather color.
3. **Reptile**: Derived class adding a `bloodTemp` field for blood temperature.

## Setup and Usage

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **Git** (optional, for version control)

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/animal-catalog-system.git
   cd animal-catalog-system
   ```

2. **Compile the Java Files**:
   ```bash
   javac -d bin src/Solutions/*.java
   ```

3. **Run the Program**:
   ```bash
   java -cp bin Solutions.AnimalCatalog
   ```

### Usage

- **Bird and Reptile Entry**: The program will prompt you to enter information such as the ID, species, and specific fields (feather color for birds and blood temperature for reptiles).
- **Display**: After entry, the details of each animal are displayed on the console.

## Example Output

```
Enter Bird Details:
Enter Bird ID: 1
Enter Bird Species: Parrot
Enter Bird Color
1: Gray
2: White
3: Black
Enter Choice: 2

Enter Reptile Details:
Enter Reptile ID: 2
Enter Reptile Species: Lizard
Enter Reptile Blood Temperature: 36.5

Bird Details:
Animal ID: 1
Species: Parrot
Feather Color Code: 2

Reptile Details:
Animal ID: 2
Species: Lizard
Blood Temperature: 36.5°C
```

---
