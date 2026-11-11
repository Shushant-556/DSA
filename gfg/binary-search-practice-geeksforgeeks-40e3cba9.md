# Binary Search | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1
- Generated at UTC: 2026-11-11T19:49:49.428290+00:00
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
Binary Search
Difficulty: BasicAccuracy: 48.03%Submissions: 418K+Points: 1Average Time: 20m

Given a sorted array arr[] of distinct integers and an integer k, return the 0-based index of k if it is present in the array. Otherwise, return -1.

Examples:

Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: 4
Explanation: 6 is present at index 4.
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: -1
Explanation: 3 is not present in the array.

Constraints:

1 ≤ arr.size() ≤ 106
1 ≤ arr[i], k ≤ 109
All elements of arr are distinct.
arr is sorted in non-decreasing order.

Try more examples
Expected Complexities
Company Tags
Paytm
Topic Tags
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
    public int binarySearch(int[] arr, int k) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size() ≤ 106
1 ≤ arr[i], k ≤ 109
All elements of arr are distinct.
arr is sorted in non-decreasing order.

Try more examples
Expected Complexities
Company Tags
Paytm
Topic Tags
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
    public int binarySearch(int[] arr, int k) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: 4
Explanation: 6 is present at index 4.
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: -1
Explanation: 3 is not present in the array.

Constraints:

1 ≤ arr.size() ≤ 106
1 ≤ arr[i], k ≤ 109
All elements of arr are distinct.
arr is sorted in non-decreasing order.

Try more examples
Expected Complexities
Company Tags
Paytm
Topic Tags
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
    public int binarySearch(int[] arr, int k) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We use the standard iterative Binary Search algorithm since the array is sorted and contains distinct integers. We maintain two pointers, 'low' initialized to 0 and 'high' initialized to arr.length - 1. In each step, we calculate the middle index 'mid'. If arr[mid] equals k, we return 'mid'. If arr[mid] < k, we narrow our search to the right half by setting low = mid + 1. Otherwise, we narrow our search to the left half by setting high = mid - 1. If the pointers cross and we haven't found the element, we return -1.

## Correctness

Binary search is a well-established and mathematically sound divide-and-conquer algorithm for finding an element in a sorted array. The bounds 'low' and 'high' correctly cover the entire array, and index overflow for 'mid' is prevented by using 'low + (high - low) / 2'.

## Complexity

- Time: O(log n) where n is the number of elements in the array, as the search space is halved in each iteration.
- Space: O(1) because only a few variables for pointers are used.

## Edge Cases

Array of size 1, element present at the first or last index, element not present (smaller than all elements, larger than all elements, or in between elements).

## Signature Notes

The method signature strictly matches the required 'public int binarySearch(int[] arr, int k)' inside the 'Solution' class.
