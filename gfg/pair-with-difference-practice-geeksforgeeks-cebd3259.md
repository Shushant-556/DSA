# Pair With Difference | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
- Generated at UTC: 2026-11-11T18:42:22.286297+00:00
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
Pair With Difference
Difficulty: EasyAccuracy: 27.25%Submissions: 309K+Points: 2Average Time: 15m

Given an array, arr[] and an integer x, return true if there exists a pair of elements in the array whose absolute difference is x, otherwise, return false.

Examples:

Input: arr[] = [5, 20, 3, 2, 5, 80], x = 78
Output: true
Explanation: Pair (2, 80) have an absolute difference of 78.
Input: arr[] = [90, 70, 20, 80, 50], x = 45
Output: false
Explanation: There is no pair with absolute difference of 45.

Constraints:

1 ≤ arr.size(), arr[i] ≤ 106
0 ≤ x ≤ 105

Try more examples
Expected Complexities
Company Tags
AmazonVisa
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
7
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size(), arr[i] ≤ 106
0 ≤ x ≤ 105

Try more examples
Expected Complexities
Company Tags
AmazonVisa
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
7
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [5, 20, 3, 2, 5, 80], x = 78
Output: true
Explanation: Pair (2, 80) have an absolute difference of 78.
Input: arr[] = [90, 70, 20, 80, 50], x = 45
Output: false
Explanation: There is no pair with absolute difference of 45.

Constraints:

1 ≤ arr.size(), arr[i] ≤ 106
0 ≤ x ≤ 105

Try more examples
Expected Complexities
Company Tags
AmazonVisa
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
7
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We can solve this problem efficiently by sorting the array and using a two-pointer approach. First, we sort the array in ascending order. Then we maintain two pointers, i and j, both starting near the beginning (e.g., i = 0, j = 1). We check the difference arr[j] - arr[i]. If the difference is equal to x and i != j, we return true. If the difference is less than x, we increment j to increase the difference. If the difference is greater than x, we increment i to decrease the difference. If i catches up to j, we increment j as well. This covers all possible pairs in linearithmic time after sorting.

## Correctness

The two-pointer technique works correctly on sorted arrays because the elements are ordered, allowing us to monotonically increase or decrease the difference by advancing either the left or right pointer. The condition i != j ensures we do not pick the same element twice when x = 0.

## Complexity

- Time: O(N log N) due to sorting the array, where N is the size of the array. The two-pointer traversal takes O(N) time.
- Space: O(1) auxiliary space (ignoring the space used by the sorting algorithm).

## Edge Cases

x = 0 (looking for identical elements), array with only one element, duplicate elements in the array, negative numbers (though constraints state arr[i] >= 1), and arrays with no valid pair.

## Signature Notes

The method signature matches the GeeksforGeeks template: boolean findPair(int[] arr, int x).
