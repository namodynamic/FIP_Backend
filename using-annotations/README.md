# RequestForEnhancement Annotation

This file defines a custom Java type for tracking enhancement requests in code.

## Description

The `RequestForEnhancement` annotation can be used to mark classes, methods, or other elements with metadata about a requested enhancement. It includes the following elements:

- `id`: An integer identifier for the enhancement request.
- `synopsis`: A short description of the enhancement request.
- `engineer`: The name of the engineer assigned to the enhancement request. (Default: "[unassigned]")
- `date`: The date the request was made (Default: "[unknown]").

## Example Usage

```java
@RequestForEnhancement(
    id = 123,
    synopsis = "Enhance the performance of the class",
    engineer = "Cyprian",
    date = "2023-08-15"
)
public class MyClass {
    // ...
}
```
