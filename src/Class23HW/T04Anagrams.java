package Class23HW;

    //Task#04
    // Check if Two Strings are Anagrams: Given two strings, determine if
// they are anagrams, meaning they contain the same characters in a
// different order. For example, "listen" and "silent" are anagrams.
    public class T04Anagrams {
        public boolean isAnagram(String str1, String str2) {
            var isItAnagram = true;
            if (str1.length()==str2.length()) {
                for (int i = 0; i <str1.length(); i++) {
                    char c = str1.charAt(i);
                    if (!str2.contains(Character.toString(c))) {
                        isItAnagram = false;
                        break;
                    }
                }
            } else isItAnagram = false;
            return isItAnagram;
        }

        public static void main(String[] args) {
            var obj = new T04Anagrams();
            System.out.println(obj.isAnagram("sadder", "dreads"));
        }
    }

