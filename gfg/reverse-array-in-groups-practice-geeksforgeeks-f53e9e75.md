# Reverse Array in Groups | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
- Generated at UTC: 2026-11-13T18:24:38.319397+00:00
- Java compilation: {'enabled': False, 'ok': None}

## Problem Statement

Courses
Tutorials
Python
Java
DSA
ML & Data Science
Interview Corner
Programming Languages
Web Development
GATE
CS Subjects
DevOps
School Learning
Software and Tools
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
Reverse Array in Groups
Difficulty: BasicAccuracy: 37.48%Submissions: 393K+Points: 1Average Time: 15m

Given an integer array arr[] and an integer k, reverse every consecutive group of k elements. If fewer than k elements remain at the end, reverse all of them.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than the number of remaining elements, the entire array is reversed.

Constraints:

1 ≤ arr.size(), arr[i], k ≤ 105

Try more examples
Expected Complexities
Company Tags
Adobe
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
    public void reverseInGroups(int[] arr, int k) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size(), arr[i], k ≤ 105

Try more examples
Expected Complexities
Company Tags
Adobe
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
    public void reverseInGroups(int[] arr, int k) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than the number of remaining elements, the entire array is reversed.

Constraints:

1 ≤ arr.size(), arr[i], k ≤ 105

Try more examples
Expected Complexities
Company Tags
Adobe
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
    public void reverseInGroups(int[] arr, int k) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

The problem requires us to reverse every consecutive group of size k in an array. If the number of remaining elements at the end is less than k, we reverse all of them. We can iterate through the array with a step size of k. For each starting index i, the group spans from index i to min(i + k - 1, n - 1). Within this range, we use a standard two-pointer approach to swap elements from the ends towards the center until they meet.

## Correctness

The algorithm correctly handles both full groups of size k and the last group which may have fewer than k elements due to the `Math.min(i + k - 1, n - 1)` boundary check. The two-pointer swap correctly reverses the elements in-place for each determined range.

## Complexity

- Time: O(n), since every element is visited and swapped at most once across the entire array.
- Space: O(1), because the reversal is performed in-place without using any additional data structures.

## Edge Cases

1. k is greater than the array size (entire array gets reversed). 2. k is 1 (array remains unchanged). 3. Array size is a multiple of k. 4. Array size is 1.

## Signature Notes

The method signature matches the GeeksforGeeks requirement: void reverseInGroups(int[] arr, int k).
