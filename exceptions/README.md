# Custom Exceptions

A simple Java program demonstrating how to create, throw, and catch custom exceptions.

## Files

- `CustomException.java` - Custom exception class that extends Exception. This represents a user-defined exception for specific logic
- `CustomExceptionDemo.java` - Demo program showing various exception scenarios

## Features

- Custom exception class with multiple constructors
- Exception throwing and catching
- Custom error messages
- Exception chaining (nested exceptions)
- Input validation example

## How to Run

```bash
# Compile the Java files
javac CustomException.java CustomExceptionDemo.java

# Run the demo
java CustomExceptionDemo
```

## Expected Output

```bash
=== Custom Exception Demo ===
Caught custom exception: A custom exception occurred
Caught custom exception: Age cannot be negative. Provided age: -5
Age validation successful!
Caught custom exception: Mathematical operation failed in business logic
Root cause: / by zero

=== Demo completed ===
```

## Key Concepts Demonstrated

1. **Custom Exception Creation** - Extending the Exception class
2. **Exception Handling** - Using try-catch blocks
3. **Method Signatures** - Declaring throws clauses
4. **Exception Chaining** - Wrapping exceptions with causes
5. **Business Logic Validation** - Age validation example

## Requirements

- Java 8 or higher
- No external dependencies required
