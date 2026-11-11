# Three Way Partitioning | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/three-way-partitioning/1
- Generated at UTC: 2026-11-11T19:33:36.656094+00:00
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
Three Way Partitioning
Difficulty: EasyAccuracy: 41.58%Submissions: 192K+Points: 2Average Time: 20m

Given an array arr[] and a range a, b. The task is to partition the array around the range such that the array is divided into three parts.

All elements smaller than a come first.
All elements in range a to b come next.
All elements greater than b appear in the end.

The individual elements of three sets can appear in any order. You are required to return the modified array.


Note: The generated output is true if you modify the given array successfully. Otherwise false.

Examples:

Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.

Input: arr[] = [1, 4, 3, 6, 2, 1], a = 1, b = 3
Output: true
Explanation: One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be true.

Constraints:

1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 109
1 ≤ a, b ≤ 109

Try more examples
Expected Complexities
Company Tags
Yahoo
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
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 109
1 ≤ a, b ≤ 109

Try more examples
Expected Complexities
Company Tags
Yahoo
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
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.

Input: arr[] = [1, 4, 3, 6, 2, 1], a = 1, b = 3
Output: true
Explanation: One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be true.

Constraints:

1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 109
1 ≤ a, b ≤ 109

Try more examples
Expected Complexities
Company Tags
Yahoo
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
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We use the Dutch National Flag algorithm (similar to 3-way partitioning around a pivot). We maintain three pointers: low, mid, and high. 
- 'low' points to the boundary where elements less than 'a' should be placed.
- 'mid' scans the array from left to right.
- 'high' points to the boundary where elements greater than 'b' should be placed.

While mid <= high:
1. If arr[mid] < a, we swap arr[mid] and arr[low], then increment both low and mid.
2. If arr[mid] is between a and b (inclusive), we just increment mid.
3. If arr[mid] > b, we swap arr[mid] and arr[high], and decrement high (without incrementing mid, since the swapped element from high needs to be processed).

## Correctness

The algorithm correctly partitions the array into three sections: elements < a, elements between a and b, and elements > b. Since each element is visited a constant number of times and swapped at most once, the partitioning is accurate and adheres to the problem statement.

## Complexity

- Time: O(N) because we traverse the array of size N at most once using the three pointers.
- Space: O(1) because the partitioning is done in-place using only a few variables for pointers.

## Edge Cases

Array containing all elements smaller than a, all elements greater than b, all elements in range [a, b], or a single element array. The algorithm handles all these standard cases naturally.

## Signature Notes

The method takes an integer array arr[], and two integers a and b. It modifies the array in-place and has a void return type as defined by the GFG problem signature.
