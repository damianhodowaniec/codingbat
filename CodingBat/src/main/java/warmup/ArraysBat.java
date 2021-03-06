package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysBat {


//    Consider the leftmost and righmost appearances of some value in an array.
// We'll say that the "span" is the number of elements between the two inclusive.
// A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
//
//
//    maxSpan([1, 2, 1, 1, 3]) → 4
//    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
//    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

    public int maxSpan(int[] nums) {
        if (nums.length > 0) {
            int maxSpan = 1;
            for (int i = 0; i < nums.length; i++)
                for (int j = nums.length - 1; j > i; j--)
                    if (nums[j] == nums[i]) {
                        int count = (j - i) + 1;
                        if (count > maxSpan) maxSpan = count;
                        break;
                    }
            return maxSpan;
        } else return 0;
    }


//    Return an array that contains exactly the same numbers as the given array,
// but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move.
// The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
// and a 3 appears in the array before any 4.
//
//
//    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == 4) nums[j] = temp;
                }
            }
        }
        return nums;
    }

//
//    Given a non-empty array, return true if there is a place to split the array
// so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//
//    canBalance([1, 1, 1, 2, 1]) → true
//    canBalance([2, 1, 1, 2, 1]) → false
//    canBalance([10, 10]) → true

    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) sum += nums[j];
            for (int j = i; j < nums.length; j++) sum -= nums[j];
            if (sum == 0) return true;
        }
        return false;
    }

    //    Given an array of ints, return true if the array is length 1 or more,
    // and the first element and the last element are equal.
//
//
//            sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true
    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }


    //  Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
//
//
//    makePi() → [3, 1, 4]
    public int[] makePi() {
        int[] pi = new int[]{3, 1, 4};
        return pi;
    }


    //    Given 2 arrays of ints, a and b, return true if they have the same first element
    // or they have the same last element.
    //    Both arrays will be length 1 or more.
//
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    //
//    Given an array of ints length 3, return the sum of all the elements.
//
//
//    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }


    //    Given an array of ints length 3, return an array with the elements
    // "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//
//
//    rotateLeft3([1, 2, 3]) → [2, 3, 1]
//    rotateLeft3([5, 11, 9]) → [11, 9, 5]
//    rotateLeft3([7, 0, 0]) → [0, 0, 7]
    public int[] rotateLeft3(int[] nums) {
        int[] result = {nums[1], nums[2], nums[0]};
        return result;
    }

    //
//    Given an array of ints length 3, return a new array
// with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//
//
//    reverse3([1, 2, 3]) → [3, 2, 1]
//    reverse3([5, 11, 9]) → [9, 11, 5]
//    reverse3([7, 0, 0]) → [0, 0, 7]
    public int[] reverse3(int[] nums) {
        int[] result = {nums[2], nums[1], nums[0]};
        return result;
    }

    //
//    Given an array of ints length 3, figure out which is larger,
// the first or last element in the array, and set all the other elements to be that value. Return the changed array.
//
//
//    maxEnd3([1, 2, 3]) → [3, 3, 3]
//    maxEnd3([11, 5, 9]) → [11, 11, 11]
//    maxEnd3([2, 11, 3]) → [3, 3, 3]
//
    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            int[] result = {nums[0], nums[0], nums[0]};
            return result;
        } else if (nums[0] < nums[2]) {
            int[] result = {nums[2], nums[2], nums[2]};
            return result;
        }
        int[] result = {nums[2], nums[2], nums[2]};
        return result;
    }


//    Given an array of ints, return the sum of the first 2 elements in the array.
//    If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
//
//
//    sum2([1, 2, 3]) → 3
//    sum2([1, 1]) → 2
//    sum2([1, 1, 1, 1]) → 2

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else return 0;
    }


    //    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//
//
//    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
//    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
//    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    public int[] middleWay(int[] a, int[] b) {
        int[] ints = new int[]{a[1], b[1]};
        return ints;
    }


    //    Given an array of ints, return a new array length 2
    // containing the first and last elements from the original array.
    //    The original array will be length 1 or more.
//
//
//    makeEnds([1, 2, 3]) → [1, 3]
//    makeEnds([1, 2, 3, 4]) → [1, 4]
//    makeEnds([7, 4, 6, 2]) → [7, 2]
//
    public int[] makeEnds(int[] nums) {
        if (nums.length == 1) {
            return new int[]{nums[0], nums[0]};
        } else return new int[]{nums[0], nums[nums.length - 1]};
    }

//    Given an int array length 2, return true if it contains a 2 or a 3.
//
//
//    has23([2, 5]) → true
//    has23([4, 3]) → true
//    has23([4, 5]) → false

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3) || nums[1] == 2 || nums[1] == 3;
    }


//
//    Given an int array length 2, return true if it does not contain a 2 or 3.
//
//
//    no23([4, 5]) → true
//    no23([4, 2]) → false
//    no23([3, 5]) → false

    public boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3) && nums[1] != 2 && nums[1] != 3;

    }

//
//    Given an int array, return a new array with double the length
// where its last element is the same as the original array, and all the other elements are 0.
//    The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
//
//
//    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//    makeLast([1, 2]) → [0, 0, 0, 2]
//    makeLast([3]) → [0, 3]

    public int[] makeLast(int[] nums) {
        int[] ints = new int[nums.length * 2];
        ints[ints.length - 1] = nums[nums.length - 1];
        return ints;
    }

//    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
//
//
//    double23([2, 2]) → true
//    double23([3, 3]) → true
//    double23([2, 3]) → false

    public boolean double23(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        if (nums.length == 2) {
            return nums[0] == 2 && nums[1] == 2 || (nums[0] == 3 && nums[1] == 3);
        }
        return false;
    }

    //    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    // Return the changed array.
//
//
//    fix23([1, 2, 3]) → [1, 2, 0]
//    fix23([2, 3, 5]) → [2, 0, 5]
//    fix23([1, 2, 1]) → [1, 2, 1]
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            int[] ints = new int[]{nums[0], 0, nums[2]};
            return ints;
        } else if (nums[1] == 2 && nums[2] == 3) {
            int[] ints = new int[]{nums[0], nums[1], 0};
            return ints;
        } else return nums;
    }

    //    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//
//
//    start1([1, 2, 3], [1, 3]) → 2
//    start1([7, 2, 3], [1]) → 1
//    start1([1, 2], []) → 1
    public int start1(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return 0;
        }
        if (a.length == 0 && b[0] == 1 || (b.length == 0 && a[0] == 1)) {
            return 1;
        }
        if (a.length != 0 && b.length != 0) {
            if (a[0] == 1 && b[0] == 1) {
                return 2;
            }
            if (a[0] == 1 || b[0] == 1) {
                return 1;
            }
        }
        return 0;
    }

}

