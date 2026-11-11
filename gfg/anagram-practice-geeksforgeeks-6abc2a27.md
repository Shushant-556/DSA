# Anagram | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/anagram-1587115620/1
- Generated at UTC: 2026-11-11T19:08:37.594254+00:00
- Java compilation: {'enabled': False, 'ok': None}

## Problem Statement

Courses
Tutorials
Practice
Jobs

Back to Explore Page

Ask A Doubt
My Doubts
FREQUENTLY ASKED QUESTIONS
Give me a hint
Dry Run the Example with approach
Identify the Boundary cases to consider
Problem
Editorial
Submissions
Comments
Anagram
Difficulty: EasyAccuracy: 44.93%Submissions: 509K+Points: 2Average Time: 20m

Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

Examples:

Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
Input: s1 = "listen", s2 = "lists" 
Output: false 
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

Constraints:

1 ≤ s1.size(), s2.size() ≤ 105
s1 consists only of lowercase English alphabets
s2 consists only of lowercase English alphabets

Try more examples
Expected Complexities
Company Tags
FlipkartDirectiAdobeGoogleNagarroMedia.net
Topic Tags
Related Interview Experiences
Related Articles
Report An Issue
If you are facing any issue on this page. Please let us know.
Java (21)
1
2
3
4
5
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
  
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ s1.size(), s2.size() ≤ 105
s1 consists only of lowercase English alphabets
s2 consists only of lowercase English alphabets

Try more examples
Expected Complexities
Company Tags
FlipkartDirectiAdobeGoogleNagarroMedia.net
Topic Tags
Related Interview Experiences
Related Articles
Report An Issue
If you are facing any issue on this page. Please let us know.
Java (21)
1
2
3
4
5
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
  
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
Input: s1 = "listen", s2 = "lists" 
Output: false 
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

Constraints:

1 ≤ s1.size(), s2.size() ≤ 105
s1 consists only of lowercase English alphabets
s2 consists only of lowercase English alphabets

Try more examples
Expected Complexities
Company Tags
FlipkartDirectiAdobeGoogleNagarroMedia.net
Topic Tags
Related Interview Experiences
Related Articles
Report An Issue
If you are facing any issue on this page. Please let us know.
Java (21)
1
2
3
4
5
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
  
    }
}
Custom InputCompile & RunSubmit

## Approach

First, check if the lengths of the two strings are equal. If not, they cannot be anagrams. Then, use a frequency array of size 26 to count occurrences of each character in both strings. Increment the count for characters in s1 and decrement for characters in s2. Finally, verify if all elements in the frequency array are zero.

## Correctness

The approach directly tracks character frequencies using a fixed-size array corresponding to the 26 lowercase English letters. Since lengths are checked first, any mismatch in character frequency will result in non-zero counts in the array, correctly identifying non-anagrams.

## Complexity

- Time: O(N), where N is the length of the strings, as we traverse both strings of length N once.
- Space: O(1), because the frequency array has a fixed size of 26 regardless of the input string length.

## Edge Cases

Strings of different lengths, strings with identical characters but different frequencies, and minimum length strings of size 1.

## Signature Notes

The method takes two Strings (s1 and s2) and returns a boolean value indicating whether they are anagrams.
