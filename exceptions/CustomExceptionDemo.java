public class CustomExceptionDemo {
    
    public static void main(String[] args) {
        CustomExceptionDemo demo = new CustomExceptionDemo();
        
        System.out.println("=== Custom Exception Demo ===");
        
        try {
            demo.methodThatThrowsCustomException();
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        
        try {
            demo.validateAge(-5);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        
        try {
            demo.validateAge(25);
            System.out.println("Age validation successful!");
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        
        try {
            demo.methodWithNestedOperation();
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Root cause: " + e.getCause().getMessage());
            }
        }
        
        System.out.println("\n=== Demo completed ===");
    }
    
    
    public void methodThatThrowsCustomException() throws CustomException {
        throw new CustomException();
    }
    
   
    public void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative. Provided age: " + age);
        }
        if (age > 150) {
            throw new CustomException("Age seems unrealistic. Provided age: " + age);
        }
    }
    
    
    public void methodWithNestedOperation() throws CustomException {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            throw new CustomException("Mathematical operation failed in business logic", e);
        }
    }
}

