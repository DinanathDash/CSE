# CSE — Course Work and Assignments

This repository contains the code, assignments, and lab work completed during a B.Tech in Computer Science and Engineering (CSE).

Contents are organized by semester and course, and include Java programs, data-structures exercises, cryptography examples, and other practical assignments.

## Repository structure (high level)
- `SEM_1 (ICP)/`, `SEM_2 (DSA)/`, `SEM_3/`, ... — semester folders containing course assignments and labs
- Subfolders typically group assignments (`Assignment-1`, `Assignment-2`, ...), student ID folders, and topic-specific directories (e.g., `Array/`, `Command-Line/`).

## Languages and tools
- Primary language: Java
- Tested on: macOS (also works on Linux/Windows with standard JDK)
- Recommended IDEs: IntelliJ IDEA, Eclipse, or Visual Studio Code (with Java extensions)

## How to compile & run
Most source files are simple Java classes in the default package. From the repository root you can compile and run single files or whole directories.

Compile a single file:

```
javac SEM_1\ (ICP)/Assignment-1/Assignment_1.java
java -cp SEM_1\ (ICP)/Assignment-1 Assignment_1
```

Compile all `.java` files under a folder:

```
find SEM_1\ (ICP) -name "*.java" > sources.txt
javac @sources.txt
```

Then run a class by its fully-qualified name (or class name if default package):

```
java -cp SEM_1\ (ICP) Assignment_1
```

Note: If classes use packages, run from the repository root and specify the package-qualified class name.

## Conventions & notes
- Files are mostly organized by semester and assignment number. Filenames generally match the assignment or question numbers.
- Some directories contain multiple solution variants; check filenames like `Q1.java`, `Question_1.java`, `A1.java`, etc.

## Contribution & usage
- This repo is a personal archive of coursework. You may reuse snippets for learning, but attribute original authorship if you repurpose work for public use.

If you'd like me to:
- Add a small build script or `Makefile` to compile all semesters, or
- Convert projects to proper Maven/Gradle structure,
ask and I'll implement it.

## Contact
If you want to discuss any file or need runnable examples for a specific assignment, open an issue or contact the repository owner.

---
_Repository generated from a student CSE coursework archive._
