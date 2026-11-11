# Insertion Sort | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/insertion-sort/1
- Generated at UTC: 2026-11-11T19:13:59.864214+00:00
- Java compilation: {'enabled': False, 'ok': None}

## Problem Statement

Courses
DSA / Placements
DA / Data Science & AI
Development
DevOps Course
GATE Prep
All Courses
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
Insertion Sort
Difficulty: EasyAccuracy: 66.61%Submissions: 297K+Points: 2Average Time: 15m

Given an array arr[] of positive integers.The task is to complete the insertsort() function which is used to implement Insertion Sort.

Examples:

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: The sorted array will be [1, 3, 4, 7, 9].
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
Input: arr[] = [4, 1, 9]
Output: [1, 4, 9]
Explanation: The sorted array will be [1, 4, 9].

Constraints:

1 ≤ arr.size() ≤ 1000
1 ≤ arr[i] ≤ 10000

Try more examples
Expected Complexities
Company Tags
MicrosoftMAQ SoftwareJuniper NetworksCiscoAccentureDellVeritasGrofers
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
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size() ≤ 1000
1 ≤ arr[i] ≤ 10000

Try more examples
Expected Complexities
Company Tags
MicrosoftMAQ SoftwareJuniper NetworksCiscoAccentureDellVeritasGrofers
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
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: The sorted array will be [1, 3, 4, 7, 9].
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
Input: arr[] = [4, 1, 9]
Output: [1, 4, 9]
Explanation: The sorted array will be [1, 4, 9].

Constraints:

1 ≤ arr.size() ≤ 1000
1 ≤ arr[i] ≤ 10000

Try more examples
Expected Complexities
Company Tags
MicrosoftMAQ SoftwareJuniper NetworksCiscoAccentureDellVeritasGrofers
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
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

The standard Insertion Sort algorithm is used. We iterate through the array starting from the second element (index 1). For each element, we treat it as a 'key' and compare it with the elements in the sorted portion to its left. We shift all elements greater than the key one position to the right and finally insert the key into its correct position.

## Correctness

Insertion sort maintains a sorted sub-list on the left of the current index. At each step, one element is taken from the unsorted sub-list and inserted into its correct position in the sorted sub-list. By induction, the entire array becomes sorted when the outer loop completes.

## Complexity

- Time: O(N^2) in the worst and average cases, where N is the number of elements in the array. O(N) in the best case when the array is already sorted.
- Space: O(1) auxiliary space since the sorting is performed in-place.

## Edge Cases

Array with a single element (n = 1), array with all identical elements, already sorted array, and reverse sorted array.

## Signature Notes

The method takes an integer array `arr` and sorts it in-place, returning void. Matches the expected GeeksforGeeks signature.
