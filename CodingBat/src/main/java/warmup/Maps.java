package warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    //    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
    // and set the key "a" to have the value "".
//    Basically "b" is a bully, taking the value and replacing it with the empty string.
//
//
//    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }


    //    Modify and return the given map as follows: if the key "a" has a value,
    // set the key "b" to have that same value.
    // In all cases remove the key "c", leaving the rest of the map unchanged.
//
//
//            mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
//    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;

    }

//
//    Given an array of strings, return a Map<String, Integer>
// containing a key for every different string in the array, always with the value 0.
// For example the string "hello" makes the pair "hello":0.
// We'll do more complicated counting later, but for this problem the value is simply 0.
//
//
//    word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
//    word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
//    word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, 0);
        }
        return map;
    }

//    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
// If both keys are present, append their 2 string values together and store the result under the key "ab".
//
//
//    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//    mapAB({"a": "Hi"}) → {"a": "Hi"}
//    mapAB({"b": "There"}) → {"b": "There"}

    public Map<String, String> mapAB(Map<String, String> map) {
        String ab = map.get("a") + map.get("b");
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", ab);
        }
        return map;
    }

//    Given a map of food keys and topping values,
// modify and return the map as follows: if the key "ice cream" is present,
// set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
//
//
//    topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
//    topping1({}) → {"bread": "butter"}
//    topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }

//    Given a map of food keys and their topping values, modify and return the map as follows:
// if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
// If the key "spinach" has a value, change that value to "nuts".
//
//
//    topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
//    topping2({"spinach": "dirt", "ice cream": "cherry"}) →
//    {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
//    topping2({"yogurt": "salt"}) → {"yogurt": "salt"}

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    //    Given a map of food keys and topping values, modify and return the map as follows:
    // if the key "potato" has a value, set that as the value for the key "fries".
    // If the key "salad" has a value, set that as the value for the key "spinach".
//
//
//    topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
//    topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
//    topping3({"salad": "oil", "potato": "ketchup"}) →
//     {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

//    Modify and return the given map as follows: if the keys "a" and "b"
// are both in the map and have equal values, remove them both.
//
//
//            mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
//    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
//    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    //    Given an array of strings, return a Map<String, Integer>
    // containing a key for every different string in the array, and the value is that string's length.
//
//
//    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
//    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
//    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String s : strings) {
            resultMap.put(s, s.length());
        }
        return resultMap;
    }

    //    Given an array of non-empty strings, create and return a Map<String, String> as follows:
    // for each string add its first character as a key with its last character as the value.
//
//
//    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        for (String s : strings) {
            resultMap.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return resultMap;
    }

    //    The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
    // with a key for each different string,
    // with the value the number of times that string appears in the array.
//
//
//            wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//    wordCount(["c", "c", "c", "c"]) → {"c": 4}
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String s : strings) {
            if (!resultMap.containsKey(s)) {
                resultMap.put(s, 1);
            } else {
                int counter = resultMap.get(s);
                resultMap.put(s, counter + 1);
            }
        }
        return resultMap;
    }

    //    Given an array of non-empty strings, return a Map<String, String>
    // with a key for every different first character seen,
    // with the value of all the strings starting with that character
    // appended together in the order they appear in the array.
//
//
//            firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
//    firstChar([]) → {}
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        for (String s : strings) {
            resultMap.merge(String.valueOf(s.charAt(0)), s, (String::concat));
        }
        return resultMap;
    }

//    public Map<String, String> firstChar(String[] strings) {
//        Map<String, String> map = new HashMap<String, String> ();
//        for (String s:strings) {
//            if (!map.containsKey(s.substring(0,1))) {  // first time we've seen this string
//                map.put(s.substring(0,1), s);
//
//            }
//            else
//            {
//                String existing = map.get(s.substring(0,1));
//                map.put(s.substring(0,1), existing+s);
//            }
//
//        }
//        return map;
//    }


    //    Given an array of strings, return a Map<String, Boolean>
    // where each different string is a key and its value is true if that string appears 2 or more times in the array.
//
//
//    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> resultMap = new HashMap<>();
        for (String s : strings) {
            if (!resultMap.containsKey(s)) {
                resultMap.put(s, false);
            } else {
                resultMap.put(s, true);
            }
        }
        return resultMap;
    }


//    We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
// Loop over and then return the given array of non-empty strings as follows:
// if a string matches an earlier string in the array, swap the 2 strings in the array.
// When a position in the array has been swapped, it no longer matches anything.
// Using a map, this can be solved making just one pass over the array. More difficult than it looks.
//
//
//    allSwap(["ab", "ac"]) → ["ac", "ab"]
//    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
//    allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));

            if (map.containsKey(key)) {
                int index = map.get(key);

                String swapper = strings[index];
                strings[index] = strings[i];
                strings[i] = swapper;

                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
//    public String[] allSwap(String[] strings) {
////        Map<String, Integer> map = new HashMap();
////        for (int i=0; i<strings.length; i++) {
////            String key = strings[i].substring(0, 1);
////            if (map.containsKey(key)) {
////                int match = map.get(key);
////                String temp = strings[match];  // swap strings at match/i
////                strings[match] = strings[i];
////                strings[i] = temp;
////                map.remove(key);  // so this old one won't match anything
////            }
////            else {
////                map.put(key, i);
////            }
////        }
////        return strings;
////    }


}