package org.example;

public class Execercise20 {
    public static void main(String[] args) {
        String one = "blacksea";
        String two = "blacksea2";
        int num = one.compareTo(two);
        CharSequence csSeq = "blacksea";

        //Write a Java program to get the character at the given index within the string.
        System.out.println(one.charAt(1));

        //Write a Java program to compare two strings lexicographically.
        //Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
        if(num == 0){
            System.out.println("strings are equal");
        }else if(num > 1){
            System.out.println("string1 is greater than string2");
        }else {
            System.out.println("string1 is less than string2");
        }
        System.out.println(one.toUpperCase());
        System.out.println(one.contentEquals(csSeq));

        //Write a Java program to concatenate a given string to the end of another string.
        String concatenate = one.concat(two);
        System.out.println(concatenate);

        //Write a Java program to concatenate a given string to the end of another string.
        System.out.println("len " + concatenate.length());

        // Write a Java program to replace a specified character with another character.
        System.out.println(concatenate.replace('a','o'));

        //.Write a Java program to check whether a given string starts with another string.
        String check = "red";
        System.out.println(one.startsWith(check));

        if(one.startsWith("red")){
            System.out.println("red");
        }else {
            System.out.println("black");
        }

    }
}
