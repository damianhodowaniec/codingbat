package warmup;

import javax.print.attribute.standard.RequestingUserName;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Warmup {


    //    sleepIn(false, false) → true
//    sleepIn(true, false) → false
//    sleepIn(false, true) → true
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && !vacation) {
            return true;
        } else if (weekday && !vacation) {
            return false;
        } else if (!weekday) {
            return true;
        }
        return true;

    }

//    monkeyTrouble(true, true) → true
//    monkeyTrouble(false, false) → true
//    monkeyTrouble(true, false) → false
//

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else return !aSmile || bSmile;

    }

//    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//    sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }

    }

    //
//    Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.
//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }

    }

//
//    Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number.
//
//
//            nearHundred(93) → true
//    nearHundred(90) → true
//    nearHundred(89) → false

    public boolean nearHundred(int n) {

        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);

    }


//    Given 2 int values, return true if one is negative and one is positive.
// Except if the parameter "negative" is true, then return true only if both are negative.
//
//
//            posNeg(1, -1, false) → true
//    posNeg(-1, 1, false) → true
//    posNeg(-4, -5, true) → true

    public boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }


//    Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged.
// Note: use .equals() to compare 2 strings.
//
//
//            notString("candy") → "not candy"
//    notString("x") → "not x"
//    notString("not bad") → "not bad"
//

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }


    //
//    Given a string, we'll say that the front is the first 3 chars of the string.
// If the string length is less than 3, the front is whatever is there.
// Return a new string which is 3 copies of the front.
//
//
//    front3("Java") → "JavJavJav"
//    front3("Chocolate") → "ChoChoCho"
//    front3("abc") → "abcabcabc"
    public String front3(String str) {
        String concatString = str.substring(0, 2);
        if (str.length() <= 2) {
            return str;
        } else {
            return concatString + concatString + concatString;
        }
    }

    //    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    // Use the % "mod" operator -- see Introduction to Mod
//
//
//    or35(3) → true
//    or35(10) → true
//    or35(8) → false
    public boolean or35(int n) {
        if (n > 0) {
            return n % 3 == 0 || n % 5 == 0;
        }
        return false;
    }

//    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
//
//
//            front22("kitten") → "kikittenki"
//    front22("Ha") → "HaHaHa"
//    front22("abc") → "ababcab"

    public String front22(String str) {
        String fix = str.substring(0, 2);
        if (str.length() > 2) {
            return fix + str + fix;

        } else return str + str + str;
    }

//    Solution 2:
//    public String front22(String str) {
//        // First figure the number of chars to take
//        int take = 2;
//        if (take > str.length()) {
//            take = str.length();
//        }
//
//        String front = str.substring(0, take);
//        return front + str + front;
//////////////////////////////////////////////////////////////////
//    Given a string, return true if the string starts with "hi" and false otherwise.
//
//
//            startHi("hi there") → true
//    startHi("hi") → true
//    startHi("hello hi") → false

    public boolean startHi(String str) {
        return str.startsWith("hi");

    }

//    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
//
//
//    icyHot(120, -1) → true
//    icyHot(-1, 120) → true
//    icyHot(2, 120) → false

    public boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0;
    }

//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 3 int values, return true if 1 or more of them are teen.
//
//
//    hasTeen(13, 20, 10) → true
//    hasTeen(20, 19, 10) → true
//    hasTeen(20, 10, 13) → true

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }

//
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 2 int values, return true if one or the other is teen, but not both.
//
//
//    loneTeen(13, 99) → true
//    loneTeen(21, 19) → true
//    loneTeen(13, 13) → false

    public boolean loneTeen(int a, int b) {
        boolean teenA = (a >= 13 && a <= 19);
        boolean teenB = (b >= 13 && b <= 19);
        return (teenA && !teenB) || (teenB && !teenA);
    }


//    Given an array of ints, return true if 6 appears as either the first or last element in the array.
// The array will be length 1 or more.
//
//
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false

    public boolean firstLast6(int[] nums) {
        return nums.length >= 1 && (nums[0] == 6 || nums[nums.length - 1] == 6);
    }


//    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//    helloName("Bob") → "Hello Bob!"
//    helloName("Alice") → "Hello Alice!"
//    helloName("X") → "Hello X!

    public String helloName(String name) {
        return "Hello " + name + "!";
    }


    //    When squirrels get together for a party, they like to have cigars.
    // A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
//    Unless it is the weekend, in which case there is no upper bound on the number of cigars.
// Return true if the party with the given values is successful, or false otherwise.
//
//
//            cigarParty(30, false) → false
//    cigarParty(50, false) → true
//    cigarParty(70, true) → true
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else return !isWeekend && (cigars >= 40 && cigars <= 60);
    }

//
//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//
//            stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }


//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
//    or whatever is there if the string is less than length 3.
//    Return n copies of the front;
//
//
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"

    public String frontTimes(String str, int n) {
        int frontLength = 3;
        if (str.length() < frontLength) {
            frontLength = str.length();
        }
        String front = str.substring(0, frontLength);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;


    }

//    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//
//    doubleX("axxbb") → true
//    doubleX("axaxax") → false
//    doubleX("xxxxx") → true

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        String x = str.substring(i);
        return x.startsWith("xx");
    }


//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    //    Given a string, return the count of the number of times that a substring length 2 appears in the string
    //    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
//
//
//    last2("hixxhi") → 1
//    last2("xaxxaxaxx") → 1
//    last2("axxxaaxx") → 2
    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }


    //
//    Given an array of ints, return the number of 9's in the array.
//
//
//    arrayCount9([1, 2, 9]) → 1
//    arrayCount9([1, 9, 9]) → 2
//    arrayCount9([1, 9, 9, 3, 9]) → 3
    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                counter++;
            }
        }
        return counter;
    }


    //    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    // The array length may be less than 4.
//
//
//    arrayFront9([1, 2, 9, 3, 4]) → true
//    arrayFront9([1, 2, 3, 4, 9]) → false
//    arrayFront9([1, 2, 3, 4, 5]) → false
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;

        }
        return false;
    }

    //    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//
//
//            array123([1, 1, 2, 3, 1]) → true
//    array123([1, 1, 2, 4, 1]) → false
//    array123([1, 1, 2, 1, 2, 3]) → true
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        }
        return false;
    }

//    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
//    So "xxcaazz" and "xxbaaz" yields 3,
// since the "xx", "aa", and "az" substrings appear in the same place in both strings.
//
//
//            stringMatch("xxcaazz", "xxbaaz") → 3
//    stringMatch("abc", "abc") → 2
//    stringMatch("abc", "axc") → 0

    public int stringMatch(String a, String b) {
        // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    //
//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//
//    countXX("abcxx") → 1
//    countXX("xxx") → 2
//    countXX("xxxx") → 3
    int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                counter++;
            }
        }
        return counter;
    }

    //    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//
//
//    altPairs("kitten") → "kien"
//    altPairs("Chocolate") → "Chole"
//    altPairs("CodingHorror") → "Congrr"
    public String altPairs(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i = 0; i < str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }


    //    Given a string, return a version where all the "x" have been removed.
    // Except an "x" at the very start or end should not be removed.
//
//
//    stringX("xxHxix") → "xHix"
//    stringX("abxxxcd") → "abcd"
//    stringX("xabxxxcdx") → "xabcdx"
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str.startsWith("x") || !str.endsWith("x") && !str.substring(i, i + 1).equals("x")) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }

//    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
// but the "a" can be any char. The "yak" strings will not overlap.
//
//
//    stringYak("yakpak") → "pak"
//    stringYak("pakyak") → "pak"
//    stringYak("yak123ya") → "123ya"

    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    //    Given an array of ints, return the number of times that two 6's are next to each other in the array.
    // Also count instances where the second "6" is actually a 7.
//
//
//    array667([6, 6, 2]) → 1
//    array667([6, 6, 2, 6]) → 1
//    array667([6, 7, 2, 6]) → 1
    public int array667(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7) {
                counter++;
            }
        }
        return counter;
    }

//    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
// Return true if the array does not contain any triples.
//
//
//    noTriples([1, 1, 2, 2, 1]) → true
//    noTriples([1, 1, 2, 2, 2, 1]) → false
//    noTriples([1, 1, 1, 2, 2, 2, 1]) → false

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    //    Given an array of ints, return true if it contains a 2, 7, 1 pattern:
    // a value, followed by the value plus 5, followed by the value minus 1.
    //    Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
//
//
//    has271([1, 2, 7, 1]) → true
//    has271([1, 2, 8, 1]) → false
//    has271([2, 7, 1]) → true
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) &&              // the "7" check
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {  // the "1" check
                return true;
            }
        }
        return false;
    }





}

