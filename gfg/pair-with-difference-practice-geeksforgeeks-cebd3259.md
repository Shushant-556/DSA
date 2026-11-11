# Pair With Difference | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
- Generated at UTC: 2026-11-11T18:59:39.049608+00:00
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

We can solve this problem efficiently using sorting and the two-pointer technique. First, sort the array in ascending order. Then, use two pointers, i and j, starting at index 0 and 1 respectively. If the difference arr[j] - arr[i] equals x and i != j, we return true. If the difference is less than x, we increment j to increase the difference. If the difference is greater than x, we increment i to decrease the difference. If i catches up with j, we increment j as well.

## Correctness

Sorting the array allows us to systematically search for a pair with the target difference using two pointers. Since all elements are positive and the array is sorted, increasing j increases the difference, and increasing i decreases the difference, ensuring no valid pairs are missed.

## Complexity

- Time: O(N log N) due to the sorting step, where N is the size of the array. The two-pointer traversal takes O(N) time.
- Space: O(1) auxiliary space (ignoring the space used by the sorting algorithm).

## Edge Cases

Array with a single element (returns false), x = 0 (looking for duplicate elements with difference 0), duplicate elements in the array, negative or zero values in array (though constraints say arr[i] >= 1).

## Signature Notes

The method takes an integer array arr[] and an integer x, and returns a boolean indicating whether a pair with the absolute difference x exists.
