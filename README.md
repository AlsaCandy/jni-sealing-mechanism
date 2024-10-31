# jni-sealing-mechanism
A project implementing a JNI (Java Native Interface) Sealing Mechanism to secure interactions between Java and native C++ code. It ensures memory integrity by sealing JNI references with a global capability, preventing tampering and enhancing the security of direct memory manipulation and field access.



## Table of Contents
1. [Overview](#overview)
2. [Project Structure](#project-structure)
3. [Getting Started](#getting-started)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)

## Project Structure
- **src/**: Contains the core Java and C++ source code.
  - `JNISealExample.java`: Java class file to initiate the native method.
  - `jni_seal_example.cpp`: C++ code implementing the sealing and verification process.
- **docs/**: Documentation files, including a detailed project report.
- **lib/**: Any shared libraries required for the project.

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Ensure you have JDK installed.
- **C++ Compiler**: For compiling the native code, a C++ compiler (like GCC) is required.

### Installation
Clone the repository and navigate into it:
```bash
git clone https://github.com/YOUR-USERNAME/jni-sealing-mechanism.git
cd jni-sealing-mechanism
```

### Compiling the Code
To compile the Java and C++ code, run the following commands:
```bash
# Compile the Java file
javac src/JNISealExample.java

# Compile the C++ file to a shared library
g++ -shared -o lib/libjni_seal_example.so -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux src/jni_seal_example.cpp
```

## Usage
To run the program, use the following command:
```bash
java -Djava.library.path=./lib -cp src JNISealExample
```

### Expected Output
The program will display:
```
Capability verified, JNI environment is secure!
```

## Contributing
Feel free to submit issues or pull requests. Contributions are welcome!

## License
This project is licensed under the MIT License - see the LICENSE file for details.
```




