package com.example.strings;

public class StringIntern {

    public static void main(String[] args) {
        // S1 refers to Object in the Heap Area
        String s1 = new String("GFG"); // Line-1


        // S2 now refers to Object in SCP Area
        String s2 = s1.concat("GFG"); // Line-2


        // S3 refers to Object in SCP Area
        String s3 = s2.intern(); // Line-3

        System.out.println(s2 == s3);
        System.out.println(s1 == s2);

        // S4 refers to Object in the SCP Area
        String s4 = "GFGGFG"; // Line-4

        System.out.println(s3 == s4);
    }
}
