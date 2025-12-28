package StringMethods;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringMethodsDemo {

    public static void main(String[] args) {

        // Creating String objects
        String s1 = "Java Programming";
        String s2 = "JAVA programming";
        String s3 = "  Hello World  ";
        String s4 = "Java";

        // ===============================
        // 1. Length & Character Methods
        // ===============================

        // Returns number of characters in the string
        System.out.println("Length: " + s1.length());

        // Returns character at specified index
        System.out.println("charAt(2): " + s1.charAt(2));

        // Returns Unicode value of character at index
        System.out.println("codePointAt(1): " + s1.codePointAt(1));

        // ===============================
        // 2. Comparison Methods
        // ===============================

        // Compares content of two strings
        System.out.println("equals: " + s1.equals(s2));

        // Compares content ignoring case
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

        // Lexicographical comparison
        System.out.println("compareTo: " + s1.compareTo(s4));

        // Lexicographical comparison ignoring case
        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2));

        // ===============================
        // 3. Searching Methods
        // ===============================

        // Checks if string contains specified sequence
        System.out.println("contains 'Java': " + s1.contains("Java"));

        // Returns index of first occurrence
        System.out.println("indexOf 'a': " + s1.indexOf('a'));

        // Returns index of last occurrence
        System.out.println("lastIndexOf 'a': " + s1.lastIndexOf('a'));

        // Checks starting substring
        System.out.println("startsWith 'Java': " + s1.startsWith("Java"));

        // Checks ending substring
        System.out.println("endsWith 'ing': " + s1.endsWith("ing"));

        // Matches string with given regular expression
        System.out.println("matches regex: " + s1.matches("[A-Za-z ]+"));

        // ===============================
        // 4. Substring & Slicing
        // ===============================

        // Returns substring from given index
        System.out.println("substring(5): " + s1.substring(5));

        // Returns substring between begin and end index
        System.out.println("substring(0,4): " + s1.substring(0, 4));

        // Returns character sequence
        System.out.println("subSequence(0,4): " + s1.subSequence(0, 4));

        // ===============================
        // 5. Modification Methods (Immutable)
        // ===============================

        // Concatenates two strings
        System.out.println("concat: " + s4.concat(" Language"));

        // Replaces all occurrences of a character
        System.out.println("replace char: " + s1.replace('a', 'A'));

        // Replaces a word with another word
        System.out.println("replace string: " + s1.replace("Java", "Core Java"));

        // Replaces using regular expression
        System.out.println("replaceAll: " + s1.replaceAll("a", "@"));

        // Replaces first occurrence using regex
        System.out.println("replaceFirst: " + s1.replaceFirst("a", "@"));

        // Converts string to uppercase
        System.out.println("toUpperCase: " + s1.toUpperCase());

        // Converts string to lowercase
        System.out.println("toLowerCase: " + s1.toLowerCase());

        // Removes leading and trailing spaces
        System.out.println("trim: '" + s3.trim() + "'");

        // Removes Unicode whitespace
        System.out.println("strip: '" + s3.strip() + "'");

        // Repeats string given number of times
        System.out.println("repeat: " + s4.repeat(3));

        // ===============================
        // 6. Split & Join
        // ===============================

        // Splits string based on delimiter
        String data = "Java,Python,C++";
        String[] arr = data.split(",");

        // Converts array to string for display
        System.out.println("split: " + Arrays.toString(arr));

        // Joins strings using delimiter
        System.out.println("join: " + String.join("-", arr));

        // ===============================
        // 7. Conversion Methods
        // ===============================

        // Converts string to character array
        char[] ch = s4.toCharArray();
        System.out.println("toCharArray: " + Arrays.toString(ch));

        // Converts string to byte array
        byte[] bytes = s4.getBytes(StandardCharsets.UTF_8);
        System.out.println("getBytes: " + Arrays.toString(bytes));

        // Converts different data types to string
        System.out.println("valueOf int: " + String.valueOf(100));

        // Formats string using format specifiers
        System.out.println("format: " + String.format("Name: %s, Age: %d", "Rahul", 21));

        // ===============================
        // 8. Checking Methods
        // ===============================

        // Checks if string is empty
        System.out.println("isEmpty: " + "".isEmpty());

        // Checks if string is blank (spaces only)
        System.out.println("isBlank: " + "   ".isBlank());

        // Returns hash code of string
        System.out.println("hashCode: " + s1.hashCode());

        // Returns string from string pool
        System.out.println("intern: " + s4.intern());

        // ===============================
        // 9. Stream Methods (Java 8+)
        // ===============================

        // Returns IntStream of characters
        System.out.print("chars(): ");
        s4.chars().forEach(c -> System.out.print((char) c + " "));
        System.out.println();

        // Returns Unicode code points
        System.out.print("codePoints(): ");
        s4.codePoints().forEach(c -> System.out.print(c + " "));
    }
}

        
    
    

