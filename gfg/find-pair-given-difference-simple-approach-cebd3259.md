# Find Pair Given Difference(Simple Approach):-

- Problem URL: https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
- Generated at UTC: 2026-11-11T19:05:13.025387+00:00
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
8
9
10
11
12
13
14
15
16
17
18
19
20
class Solution {
    public boolean findPair(int[] arr, int x) {
        java.util.Arrays.sort(arr);
        int n = arr.length;
        int i = 0, j = 1;
        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
                if (i == j) {
                    j++;
                }
            }
        }
        return false;
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
8
9
10
11
12
13
14
15
16
17
18
19
20
class Solution {
    public boolean findPair(int[] arr, int x) {
        java.util.Arrays.sort(arr);
        int n = arr.length;
        int i = 0, j = 1;
        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
                if (i == j) {
                    j++;
                }
            }
        }
        return false;
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
8
9
10
11
12
13
14
15
16
17
18
19
20
class Solution {
    public boolean findPair(int[] arr, int x) {
        java.util.Arrays.sort(arr);
        int n = arr.length;
        int i = 0, j = 1;
        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
                if (i == j) {
                    j++;
                }
            }
        }
        return false;
    }
}
Custom InputCompile & RunSubmit

## Approach

Sort the array first. Then use two pointers, `i` and `j`, starting at 0 and 1 respectively. Since the array is sorted, if the difference `arr[j] - arr[i]` is less than `x`, we need a larger difference, so we increment `j`. If the difference is greater than `x`, we need a smaller difference, so we increment `i`. If we find the exact difference `x` with `i != j`, we return true. If pointers cross or reach the end without finding such a pair, we return false.

## Correctness

Sorting the array allows us to use a two-pointer approach effectively to search for a pair with the given difference in linear time after sorting. The pointer adjustments correctly navigate through all potential pairs since increasing `j` increases the difference and increasing `i` decreases the difference.

## Complexity

- Time: O(N log N) due to sorting the array of size N, where N is the length of arr. The two-pointer traversal takes O(N) time.
- Space: O(1) auxiliary space, ignoring the space used by the sorting algorithm.

## Edge Cases

Array with a single element, arrays with duplicate elements, `x = 0`, and negative numbers (though constraints state array elements and x are non-negative, the logic handles them correctly).

## Signature Notes

public boolean findPair(int[] arr, int x)
