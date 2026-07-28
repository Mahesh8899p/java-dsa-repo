package arrayhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encodedecodestring {

    /*
     * ENCODE AND DECODE STRINGS
     * 
     * Problem: Design methods to encode a list of strings into a single string,
     * and decode that single string back into the original list.
     * 
     * Example:
     *   Input list:    ["hello", "world", "foo"]
     * 
     *   Encode step:   Prefix each word with its length + '#'
     *     "hello" -> "5#hello"
     *     "world" -> "5#world"
     *     "foo"   -> "3#foo"
     * 
     *   Encoded string: "5#hello5#world3#foo"
     * 
     *   Decode step:   Read the number before '#' to know how many chars to grab
     *     See 5# -> read next 5 chars -> "hello"
     *     See 5# -> read next 5 chars -> "world"
     *     See 3# -> read next 3 chars -> "foo"
     * 
     *   Output list:   ["hello", "world", "foo"]
     * 
     * Why length+# works:
     *   A simple delimiter like "," breaks if a string contains ",".
     *   The length prefix tells you exactly how many characters belong
     *   to each word, so even strings like "he#llo" or "12" decode correctly.
     */

    // Encode: for each string, prepend its length followed by '#'
   public String encode(List<String> strs) {
    //encode ["hello","world"]
    //after encoding -> "5#hello5#world"
    StringBuilder sb = new StringBuilder();
    //StringBuilder class is a class in java which can create 
    for(String s : strs){
        //applying for loop 
        sb.append(s.length()).append("#").append(s);
    }
    return sb.toString();
}

    // Decode: read the length number, skip '#', then grab that many characters
   public List<String> decode(String str){
    List<String> result = new ArrayList<>();
    //index started from the index 0
    int i =0;
    //taking 
    while(i<str.length()){
        int j = str.indexOf("#",i);
        int length = Integer.parseInt(str.substring(i,j));
        String word = str.substring(j+1,j+1+length);
        result.add(word);
    }
    return result;

   }

    public static void main(String[] args) {
        encodedecodestring codec = new encodedecodestring();

        List<String> input = Arrays.asList("hello", "world", "foo");
        System.out.println("Original:  " + input);

        String encoded = codec.encode(input);
        System.out.println("Encoded:   " + encoded);

        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded:   " + decoded);

        // Edge case: strings containing '#' and digits
        List<String> tricky = Arrays.asList("he#llo", "12", "");
        System.out.println("\nOriginal:  " + tricky);

        String encoded2 = codec.encode(tricky);
        System.out.println("Encoded:   " + encoded2);

        List<String> decoded2 = codec.decode(encoded2);
        System.out.println("Decoded:   " + decoded2);
    }
}
