package warmup;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Logic {

//  You and your date are trying to get a table at a restaurant.
// The parameter "you" is the stylishness of your clothes,
// in the range 0..10, and "date" is the stylishness of your date's clothes.
// The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
// If either of you is very stylish, 8 or more, then the result is 2 (yes).
// With the exception that if either of you has style of 2 or less, then the result is 0 (no).
// Otherwise the result is 1 (maybe).
//
//
//    dateFashion(5, 10) → 2
//    dateFashion(5, 2) → 0
//    dateFashion(5, 5) → 1

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else return 1;
    }

//    The squirrels in Palo Alto spend most of the day playing. In particular,
// they play if the temperature is between 60 and 90 (inclusive).
// Unless it is summer, then the upper limit is 100 instead of 90.
// Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
//
//
//            squirrelPlay(70, false) → true
//    squirrelPlay(95, false) → false
//    squirrelPlay(95, true) → true

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return isSummer && temp >= 60 && temp <= 100 || (!isSummer && temp >= 60 && temp <= 90);

    }


    //    You are driving a little too fast, and a police officer stops you. Write code to compute the result,
    // encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    // If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
    // Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
//
//
//    caughtSpeeding(60, false) → 0
//    caughtSpeeding(65, false) → 1
//    caughtSpeeding(65, true) → 0
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed >= 66 && speed <= 85) {
                return 1;
            } else return 2;
        } else {
            if (speed <= 60) {
                return 0;
            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else return 2;
        }

    }

//    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
//     so in that case just return 20.
//
//
//    sortaSum(3, 4) → 7
//    sortaSum(9, 4) → 20
//    sortaSum(10, 11) → 21

    public int sortaSum(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 19) {
            result = 20;
        }
        return result;
    }

    //    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
// and a boolean indicating if we are on vacation, return a string of the form "7:00"
// indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
// and on the weekend it should be "10:00". Unless we are on vacation --
// then on weekdays it should be "10:00" and weekends it should be "off".
//
//
//    alarmClock(1, false) → "7:00"
//    alarmClock(5, false) → "7:00"
//    alarmClock(0, false) → "10:00"
    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day <= 5 && day >= 1) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (day <= 5 && day >= 1) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    //    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
// Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
//
//
//    love6(6, 4) → true
//    love6(4, 5) → false
//    love6(1, 5) → true
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || a - Math.abs(b) == 6 || Math.abs(b) - Math.abs(a) == 6;

    }

    //    Given a number n, return true if n is in the range 1..10, inclusive.
// Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
//
//
//    in1To10(5, false) → true
//    in1To10(11, false) → false
//    in1To10(11, true) → true
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    //    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
// Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
//
//
//    specialEleven(22) → true
//    specialEleven(23) → true
//    specialEleven(24) → false
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    //    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    // See also: Introduction to Mod
//
//
//    more20(20) → false
//    more20(21) → true
//    more20(22) → true
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;

    }

    //    Return true if the given non-negative number is a multiple of 3 or 5, but not both.
// Use the % "mod" operator -- see Introduction to Mod
//
//
//    old35(3) → true
//    old35(10) → true
//    old35(15) → false
    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return false;
        else return n % 3 == 0 || n % 5 == 0;
    }

//    Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
// So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
//
//
//    less20(18) → true
//    less20(19) → true
//    less20(20) → false

    public boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }


    //    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
// Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//
//
//    nearTen(12) → true
//    nearTen(17) → false
//    nearTen(19) → true
    public boolean nearTen(int num) {
        return num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 9 || num % 10 == 8;
    }

    //    Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
// So if either value is a teen, just return 19.
//
//
//    teenSum(3, 4) → 7
//    teenSum(10, 13) → 19
//    teenSum(13, 2) → 19
    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }

    //    Your cell phone rings. Return true if you should answer it.
// Normally you answer, except in the morning you only answer if it is your mom calling.
// In all cases, if you are asleep, you do not answer.
//
//
//    answerCell(false, false, false) → true
//    answerCell(false, false, true) → false
//    answerCell(true, false, false) → false
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep) {
            if (!isMorning) {
                return true;
            } else return isMom;
        } else {
            return false;
        }
    }

//    We are having a party with amounts of tea and candy.
// Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
// A party is good (1) if both tea and candy are at least 5. However,
// if either tea or candy is at least double the amount of the other one, the party is great (2).
// However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
//
//
//    teaParty(6, 8) → 1
//    teaParty(3, 8) → 0
//    teaParty(20, 6) → 2

    public int teaParty(int tea, int candy) {
        if (candy < 5 || tea < 5) {
            return 0;
        } else if (candy / tea >= 2 || tea / candy >= 2) {
            return 2;
        } else {
            return 1;
        }
    }

    //    Given a string str, if the string starts with "f" return "Fizz".
// If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
// In all other cases, return the string unchanged. (See also: FizzBuzz Code)
//
//
//    fizzString("fig") → "Fizz"
//    fizzString("dib") → "Buzz"
//    fizzString("fib") → "FizzBuzz"
    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else return str;
    }

    //    Given an int n, return the string form of the number followed by "!".
// So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number,
// and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
// Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
// What will the remainder be when one number divides evenly into another?
// (See also: FizzBuzz Code and Introduction to Mod)
//
//
//    fizzString2(1) → "1!"
//    fizzString2(2) → "2!"
//    fizzString2(3) → "Fizz!"
    public String fizzString2(int n) {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;
        if (fizz && buzz) {
            return "FizzBuzz!";
        } else if (fizz) {
            return "Fizz!";
        } else if (buzz) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    //    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
//
//
//    twoAsOne(1, 2, 3) → true
//    twoAsOne(3, 1, 2) → true
//    twoAsOne(3, 2, 2) → false
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    //    Given three ints, a b c, return true if b is greater than a, and c is greater than b.
// However, with the exception that if "bOk" is true, b does not need to be greater than a.
//
//
//    inOrder(1, 2, 4, false) → true
//    inOrder(1, 2, 1, false) → false
//    inOrder(1, 1, 2, true) → true
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    //    Given three ints, a b c, return true if they are in strict increasing order,
// such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
// However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
//
//
//    inOrderEqual(2, 5, 11, false) → true
//    inOrderEqual(5, 7, 6, false) → false
//    inOrderEqual(5, 5, 7, true) → true
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a == b && a < c || a == b && b == c || b == c && a < b;
        } else {
            return a < b && b < c;
        }
    }

    //    Given three ints, a b c, return true if two or more of them have the same rightmost digit.
//    The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
//
//
//    lastDigit(23, 19, 13) → true
//    lastDigit(23, 19, 12) → false
//    lastDigit(23, 19, 3) → true
    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    //    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
//
//
//    lessBy10(1, 7, 11) → true
//    lessBy10(1, 7, 10) → false
//    lessBy10(11, 1, 7) → true
    public boolean lessBy10(int a, int b, int c) {
        return a - b >= 10 || b - a >= 10 || a - c >= 10 || c - a >= 10 || b - c >= 10 || c - a >= 10 || c - b >= 10;
    }
//    public boolean lessBy10(int a, int b, int c) {
//        return (Math.abs(a - b) >= 10 ||
//                Math.abs(b - c) >= 10 ||
//                Math.abs(a - c) >= 10);

    // Solution notes: it's a bit surprising that this can be so short.
    // We simplify by using Math.abs() to take the absolute value --
    // say with the ab pair, one is smaller and one is bigger, but we don't
    // care which is which, since we are just looking for a difference
    // of 10 or more.

    //    Given two int values, return whichever value is larger.
    // However if the two values have the same remainder when divided by 5, then the return the smaller value.
    // However, in all cases, if the two values are the same, return 0.
    // Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
//
//
//    maxMod5(2, 3) → 3
//    maxMod5(6, 2) → 6
//    maxMod5(3, 2) → 3
    public int maxMod5(int a, int b) {
        int aMod = a % 5;
        int bMod = b % 5;
        if (a == b) {
            return 0;
        } else if (aMod == bMod) {
            if (a > b) {
                return b;
            } else {
                return a;
            }
        } else {
            if (a > b) {
                return a;
            } else return b;
        }
    }

    //    You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
// If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5.
// Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
//
//
//    redTicket(2, 2, 2) → 10
//    redTicket(2, 2, 1) → 0
//    redTicket(0, 0, 0) → 5
    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    //  You have a green lottery ticket, with ints a, b, and c on it.
    // If the numbers are all different from each other,
    // the result is 0. If all of the numbers are the same, the result is 20.
    // If two of the numbers are the same, the result is 10.
//
//
//    greenTicket(1, 2, 3) → 0
//    greenTicket(2, 2, 2) → 20
//    greenTicket(1, 1, 2) → 10
    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    //    You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs,
// which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10,
// the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
// Otherwise the result is 0.
//
//
//    blueTicket(9, 1, 0) → 10
//    blueTicket(9, 2, 0) → 0
//    blueTicket(6, 1, 4) → 10
    public int blueTicket(int a, int b, int c) {
        int abSum = a + b;
        int bcSum = b + c;
        int acSum = a + c;
        if (abSum == 10 || bcSum == 10 || acSum == 10) {
            return 10;
        } else if (abSum - bcSum == 10 || abSum - acSum == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    //    Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
// such as the 2 in 12 and 23.
// (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
//
//
//    shareDigit(12, 23) → true
//    shareDigit(12, 43) → false
//    shareDigit(12, 44) → false
    public boolean shareDigit(int a, int b) {
        int rightA = a % 10;
        int leftA = a / 10;
        int rightB = b % 10;
        int leftB = b / 10;
        return rightA == rightB || rightA == leftB || leftA == leftB || leftA == rightB;
    }

    //    Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
    // If the sum has more digits than a, just return a without b.
    // (Note: one way to compute the number of digits of a non-negative int n is to convert it to
    // a string with String.valueOf(n) and then check the length of the string.)
//
//
//    sumLimit(2, 3) → 5
//    sumLimit(8, 3) → 8
//    sumLimit(8, 1) → 9
    public int sumLimit(int a, int b) {
        int sumAB = a + b;
        if (String.valueOf(sumAB).length() == String.valueOf(a).length()) {
            return sumAB;
        } else return a;
    }

//    Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true,
// if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
//
//
//    withoutDoubles(2, 3, true) → 5
//    withoutDoubles(3, 3, true) → 7
//    withoutDoubles(3, 3, false) → 6

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == 6d && die2 == 6) {
                return 1;
            } else {
                if (die1 == die2) {
                    return die1 + die2 + 1;
                }
            }
        } else {
            return die1 + die2;
        }
        return die1 + die2;
    }
//
//    We want to make a row of bricks that is goal inches long. We have a number of small bricks
//    (1 inch each) and big bricks (5 inches each).
//    Return true if it is possible to make the goal by choosing from the given bricks.
//    This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
//
//
//    makeBricks(3, 1, 8) → true
//    makeBricks(3, 1, 9) → false
//    makeBricks(3, 2, 10) → true

    public boolean makeBricks(int small, int big, int goal) {
        if (goal > big * 5 + small) {
            return false;
        } else return goal % 5 <= small;
    }

    //    Given 3 int values, a b c, return their sum.
// However, if one of the values is the same as another of the values, it does not count towards the sum.
//
//
//    loneSum(1, 2, 3) → 6
//    loneSum(3, 2, 3) → 2
//    loneSum(3, 3, 3) → 0
    public int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            sum = c;
        } else if (a == c) {
            sum = b;
        } else if (b == c) {
            sum = a;
        }
        return sum;
    }

    //    Given 3 int values, a b c, return their sum.
// However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
// So for example, if b is 13, then both b and c do not count.
//
//
//    luckySum(1, 2, 3) → 6
//    luckySum(1, 2, 13) → 3
//    luckySum(1, 13, 3) → 1
    public int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) {
            sum = 0;
        } else if (b == 13) {
            sum = a;
        } else if (c == 13) {
            sum = a + b;
        }
        return sum;
    }

//    Given 3 int values, a b c, return their sum. However, if any of the values is a teen
// -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
// Write a separate helper "public int fixTeen(int n)
// {"that takes in an int value and returns that value fixed for the teen rule.
// In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
// Define the helper below and at the same indent level as the main noTeenSum().
//
//
//    noTeenSum(1, 2, 3) → 6
//    noTeenSum(2, 13, 1) → 3
//    noTeenSum(2, 1, 14) → 3

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private int fixTeen(int n) {
        if (n < 13 || n > 19 || n == 15 || n == 16) {
            return n;
        } else return 0;
    }

    //
//    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
// so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
// so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
// To avoid code repetition, write a separate helper "public int round10(int num)
// {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
//
//
//    roundSum(16, 17, 18) → 60
//    roundSum(12, 13, 14) → 30
//    roundSum(6, 4, 4) → 10
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private int round10(int num) {
        if (num % 10 >= 5) {
            return num + (10 - num % 10);
        } else return num - num % 10;
    }

//    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
// while the other is "far", differing from both other values by 2 or more.
// Note: Math.abs(num) computes the absolute value of a number.
//
//
//            closeFar(1, 2, 10) → true
//    closeFar(1, 2, 3) → false
//    closeFar(4, 1, 3) → true

    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(b - a) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2
                || Math.abs(c - a) <= 1 && Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2);
    }

    //    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    // Return 0 if they both go over.
//
//
//    blackjack(19, 21) → 21
//    blackjack(21, 19) → 21
//    blackjack(19, 22) → 19
    public int blackjack(int a, int b) {
        if (a > 21) {
            if (b > 21)
                return 0;
            return b;
        }
        if (a < b && b <= 21)
            return b;
        return a;
    }


//    Given three ints, a b c, one of them is small, one is medium and one is large.
// Return true if the three values are evenly spaced, so the difference between small and medium
// is the same as the difference between medium and large.
//
//
//    evenlySpaced(2, 4, 6) → true
//    evenlySpaced(4, 6, 2) → true
//    evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {
        int temp;
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        if (c > b) {
            temp = b;
            b = c;
            c = temp;
        }
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        return (a - b == b - c);
    }

    //  We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
// Return the number of small bars to use, assuming we always use big bars before small bars.
// Return -1 if it can't be done.
//
//
//    makeChocolate(4, 1, 9) → 4
//    makeChocolate(4, 1, 10) → -1
//    makeChocolate(4, 1, 7) → 2
    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        if (maxBig <= big)
            goal -= maxBig * 5;
        else
            goal -= big * 5;
        if (goal <= small)
            return goal;
        return -1;
    }

}



