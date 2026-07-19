package basics;


public class Stringbuild {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        // 1. append() - adds text to the end
        sb.append("hello");
        sb.append(" world");
        System.out.println("After append:  " + sb);  // "hello world"

        // 2. insert(index, text) - inserts text at a specific position
        sb.insert(5, ",");
        System.out.println("After insert:  " + sb);  // "hello, world"

        // 3. length() - returns the number of characters
        System.out.println("Length:        " + sb.length());  // 12

        // 4. charAt(index) - gets the character at a position
        System.out.println("Char at 0:     " + sb.charAt(0));  // 'h'
        System.out.println("Char at 7:     " + sb.charAt(7));  // 'w'

        // 5. indexOf(str) - finds the first occurrence of a substring
        System.out.println("Index of 'world': " + sb.indexOf("world"));  // 7

        // 6. substring(start, end) - extracts a portion (returns a String)
        String sub = sb.substring(0, 5);
        System.out.println("Substring(0,5): " + sub);  // "hello"

        // 7. replace(start, end, str) - replaces characters in a range
        sb.replace(7, 12, "java");
        System.out.println("After replace: " + sb);  // "hello, java"

        // 8. delete(start, end) - removes characters in a range
        sb.delete(5, 6);  // removes the comma
        System.out.println("After delete:  " + sb);  // "hello java"

        // 9. deleteCharAt(index) - removes a single character
        sb.deleteCharAt(5);  // removes the space
        System.out.println("After deleteCharAt: " + sb);  // "hellojava"

        // 10. reverse() - reverses the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);  // "avajolleh"

        // 11. toString() - converts StringBuilder back to a regular String
        String result = sb.toString();
        System.out.println("toString:      " + result);  // "avajolleh"

        // 12. capacity() - internal buffer size (default 16, grows automatically)
        StringBuilder sb2 = new StringBuilder();
        System.out.println("\nDefault capacity: " + sb2.capacity());  // 16
        sb2.append("hello");
        System.out.println("After 'hello':    " + sb2.capacity());  // still 16 (5 < 16)

        // 13. setCharAt(index, char) - changes one character in place
        StringBuilder sb3 = new StringBuilder("hello");
        sb3.setCharAt(0, 'H');
        System.out.println("\nAfter setCharAt: " + sb3);  // "Hello"

        // --- WHY StringBuilder over String? ---
        // String creates a new object on every change (slow in loops)
        // StringBuilder modifies the same object (fast)

        // Example: building a string in a loop
        StringBuilder loopSb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            loopSb.append(i);
            if (i < 5) loopSb.append("-");
        }
        System.out.println("\nLoop result: " + loopSb);  // "1-2-3-4-5"
    }
}
