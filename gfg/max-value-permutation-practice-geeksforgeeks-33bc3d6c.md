# Max Value Permutation | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1
- Generated at UTC: 2026-11-11T19:18:36.927724+00:00
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
Max Value Permutation
Difficulty: EasyAccuracy: 18.93%Submissions: 305K+Points: 2Average Time: 20m

Given an array arr[] of integers, rearrange its elements in any order to maximize the value of:

Σ(arr[i] × i), where 0 ≤ i < n

Return the maximum possible value .

Examples:

Input: arr[] = [5, 3, 2, 4, 1]
Output: 40
Explanation: If we arrange the array as [1, 2, 3, 4, 5] then we can see that the minimum index will multiply with minimum number and maximum index will multiply with maximum number. So, 1*0 + 2*1 + 3*2 + 4*3 + 5*4 = 0+2+6+12+20 = 40 mod(109+7) = 40

Input: arr[] = [1, 2, 3]
Output: 8 
Explanation: If we arrange the array as [1, 2, 3], then the minimum index will multiply with the minimum number and the maximum index will multiply with the maximum number: 1*0 + 2*1 + 3*2 = 0 + 2 + 6 = 8 mod(109+7) = 8.

Input: arr[] = [7, 7, 7, 7]
Output: 42
Explanation: Each element is 7. The sum becomes: 7 ∗ 0 + 7 ∗ 1 + 7 ∗ 2 + 7 ∗ 3 = 0 + 7 + 14 + 21 = 42 

Constraints:

1 ≤ arr.size(), arr[i] ≤ 103

Try more examples
Expected Complexities
Company Tags
SAP Labs
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
    int maxValue(int arr[]) {
        // Complete the function
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size(), arr[i] ≤ 103

Try more examples
Expected Complexities
Company Tags
SAP Labs
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
    int maxValue(int arr[]) {
        // Complete the function
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [5, 3, 2, 4, 1]
Output: 40
Explanation: If we arrange the array as [1, 2, 3, 4, 5] then we can see that the minimum index will multiply with minimum number and maximum index will multiply with maximum number. So, 1*0 + 2*1 + 3*2 + 4*3 + 5*4 = 0+2+6+12+20 = 40 mod(109+7) = 40

Input: arr[] = [1, 2, 3]
Output: 8 
Explanation: If we arrange the array as [1, 2, 3], then the minimum index will multiply with the minimum number and the maximum index will multiply with the maximum number: 1*0 + 2*1 + 3*2 = 0 + 2 + 6 = 8 mod(109+7) = 8.

Input: arr[] = [7, 7, 7, 7]
Output: 42
Explanation: Each element is 7. The sum becomes: 7 ∗ 0 + 7 ∗ 1 + 7 ∗ 2 + 7 ∗ 3 = 0 + 7 + 14 + 21 = 42 

Constraints:

1 ≤ arr.size(), arr[i] ≤ 103

Try more examples
Expected Complexities
Company Tags
SAP Labs
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
    int maxValue(int arr[]) {
        // Complete the function
    }
}
Custom InputCompile & RunSubmit

## Approach

To maximize the sum of products of array elements with their respective indices (i.e., $\sum arr[i] \times i$), we should pair the smallest elements with the smallest indices and the largest elements with the largest indices. This is a direct consequence of the rearrangement inequality. Therefore, we first sort the array in ascending order. Then, we iterate through the sorted array, compute the product of each element with its index, sum them up, and take the result modulo $10^9 + 7$.

## Correctness

The greedy approach of pairing larger values with larger indices maximizes the sum of products according to the rearrangement inequality. Sorting takes $O(N \log N)$ time and the linear scan takes $O(N)$ time. The modulo operation prevents integer overflow during intermediate multiplications and additions.

## Complexity

- Time: O(N log N) due to sorting the array of size N.
- Space: O(1) auxiliary space (or O(log N) depending on the sorting algorithm's stack space).

## Edge Cases

Arrays with duplicate elements, arrays of size 1, arrays with maximum constraints values. All are handled correctly.

## Signature Notes

The method signature `int maxValue(int arr[])` matches the standard GFG problem definition.
