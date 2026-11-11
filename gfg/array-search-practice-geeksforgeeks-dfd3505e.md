# Array Search | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
- Generated at UTC: 2026-11-11T19:54:59.378825+00:00
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
Array Search
Difficulty: BasicAccuracy: 40.95%Submissions: 776K+Points: 1Average Time: 15m

Given an array, arr[] of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

Examples:

Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: For array [1, 2, 3, 4], the element to be searched is 3. Since 3 is present at index 2, the output is 2.
Input: arr[] = [10, 8, 30, 4, 5], x = 5
Output: 4
Explanation: For array [10, 8, 30, 4, 5], the element to be searched is 5 and it is at index 4. So, the output is 4.

Input: arr[] = [10, 8, 30], x = 6
Output: -1
Explanation: The element to be searched is 6 and it is not present, so we return -1.

Constraints:

1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106
0 ≤ x ≤ 105

Try more examples
Expected Complexities
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
7
class Solution {
    public int search(int arr[], int x) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106
0 ≤ x ≤ 105

Try more examples
Expected Complexities
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
7
class Solution {
    public int search(int arr[], int x) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: For array [1, 2, 3, 4], the element to be searched is 3. Since 3 is present at index 2, the output is 2.
Input: arr[] = [10, 8, 30, 4, 5], x = 5
Output: 4
Explanation: For array [10, 8, 30, 4, 5], the element to be searched is 5 and it is at index 4. So, the output is 4.

Input: arr[] = [10, 8, 30], x = 6
Output: -1
Explanation: The element to be searched is 6 and it is not present, so we return -1.

Constraints:

1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106
0 ≤ x ≤ 105

Try more examples
Expected Complexities
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
7
class Solution {
    public int search(int arr[], int x) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We need to find the first occurrence of an integer `x` in an array `arr[]`. A straightforward linear scan from the beginning to the end of the array will achieve this. We iterate through each element using a standard `for` loop, comparing each element with `x`. As soon as we find a match, we return its index. If the loop completes without finding the element, we return `-1`.

## Correctness

The algorithm checks every element sequentially starting from index 0. Because it returns the index immediately upon the first match, it guarantees finding the first occurrence. If the element is absent, checking all elements ensures `-1` is returned correctly.

## Complexity

- Time: O(N) in the worst case, where N is the number of elements in the array, as we might need to check every element. O(1) in the best case if the element is found at the first position.
- Space: O(1) because we are only using a few variables for iteration and no extra data structures are required.

## Edge Cases

Array containing only one element (either matching or not matching `x`), element `x` present at the very beginning or the very end of the array, and element `x` completely absent from the array.

## Signature Notes

The method signature `public int search(int arr[], int x)` takes an integer array and an integer to search for, and returns an integer representing the index of the first occurrence or -1.
