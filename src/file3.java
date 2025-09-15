public class StringOperations {
    public static void main(String[] args) {
        // Declare some sample strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello World";
        
        // 1. String Concatenation
        String concatenated = str1 + " " + str2;  // Using + operator
        System.out.println("Concatenated String: " + concatenated);
        
        // 2. String Length
        int length = str3.length();  // Gets the length of str3
        System.out.println("Length of str3: " + length);
        
        // 3. Substring
        String substring = str3.substring(6, 11);  // Extracts "World" from str3
        System.out.println("Substring of str3: " + substring);
        
        // 4. String Comparison
        boolean isEqual = str1.equals(str2);  // Checks if str1 and str2 are equal
        System.out.println("Are str1 and str2 equal? " + isEqual);
        
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello");  // Case-insensitive comparison
        System.out.println("Is str1 equal to 'hello' (ignore case)? " + isEqualIgnoreCase);
        
        // 5. String Contains
        boolean containsWord = str3.contains("World");  // Checks if str3 contains "World"
        System.out.println("Does str3 contain 'World'? " + containsWord);
        
        // 6. String Uppercase and Lowercase
        String upper = str1.toUpperCase();  // Converts str1 to uppercase
        String lower = str2.toLowerCase();  // Converts str2 to lowercase
        System.out.println("Uppercase of str1: " + upper);
        System.out.println("Lowercase of str2:
