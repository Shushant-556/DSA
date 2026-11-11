# Last Index of One | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/last-index-of-15847/1
- Generated at UTC: 2026-11-11T20:17:39.394909+00:00
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
Last Index of One
Difficulty: BasicAccuracy: 49.01%Submissions: 125K+Points: 1Average Time: 20m

Given a string s consisting only of '0' and '1', find the last index at which '1' occurs. If '1' is not present in the string, return -1.

Examples:

Input: s = "01001"
Output: 4
Explanation: Last index of  1 in given string is 4.

Input: s = "0"
Output: -1
Explanation: Since, 1 is not present, so output is -1.

Constraints:

1 ≤ s.size() ≤ 106

Try more examples
Expected Complexities
Company Tags
InMobi
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
6
class Solution {
    public int lastIndex(String s) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ s.size() ≤ 106

Try more examples
Expected Complexities
Company Tags
InMobi
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
6
class Solution {
    public int lastIndex(String s) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: s = "01001"
Output: 4
Explanation: Last index of  1 in given string is 4.

Input: s = "0"
Output: -1
Explanation: Since, 1 is not present, so output is -1.

Constraints:

1 ≤ s.size() ≤ 106

Try more examples
Expected Complexities
Company Tags
InMobi
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
6
class Solution {
    public int lastIndex(String s) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

Traverse the string from the end (right to left) to find the first occurrence of the character '1'. Since we are moving backwards, the first '1' we encounter will naturally be the last index of '1' in the string. If we complete the loop without finding any '1', return -1.

## Correctness

The algorithm correctly checks each character starting from the last index down to zero. The first '1' found is guaranteed to have the maximum index. If none are found, -1 is returned per the problem statement.

## Complexity

- Time: O(N) in the worst case where N is the length of the string and no '1' is present, or O(1) best case if the last character is '1'.
- Space: O(1) as no extra space is used.

## Edge Cases

Strings with only '0's, strings with only '1's, strings of length 1 containing '0' or '1'.

## Signature Notes

The method takes a String s and returns an int, matching the provided GFG signature.
