# Array or List Traversal | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/array-traversal/1
- Generated at UTC: 2026-11-13T18:29:48.392252+00:00
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
Array or List Traversal
Difficulty: BasicAccuracy: 69.26%Submissions: 208K+Points: 1

Given an array arr[] of size n that contains integers. Print the elements of the array in a single line with a space between them.

Note: Don't add a new line at the end.

Examples:

Input: arr[] = [54, 43, 2, 1, 5]
Output: 54 43 2 1 5
Explanation: Just traverse and print the numbers.
Input: arr[] = [324, 5, 2, 2]
Output: 324 5 2 2
Explanation: Just traverse and print the numbers.

Constraints:

1 ≤ n, arr[i] ≤ 105

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
    public void arrayTraversal(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ n, arr[i] ≤ 105

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
    public void arrayTraversal(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [54, 43, 2, 1, 5]
Output: 54 43 2 1 5
Explanation: Just traverse and print the numbers.
Input: arr[] = [324, 5, 2, 2]
Output: 324 5 2 2
Explanation: Just traverse and print the numbers.

Constraints:

1 ≤ n, arr[i] ≤ 105

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
    public void arrayTraversal(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We need to iterate through the given array and print its elements in a single line separated by a space. To avoid adding a trailing space or a newline at the end (as per the problem statement), we can use a StringBuilder to construct the string. We append each element and a space after it, except for the very last element. Finally, we print the built string using System.out.print without any trailing newlines.

## Correctness

The solution correctly traverses the array from index 0 to n-1. It avoids adding extra spaces after the last element and avoids adding any newlines at the end, satisfying all requirements of the problem statement.

## Complexity

- Time: O(n) where n is the size of the array, since we visit each element of the array once.
- Space: O(n) to store the string representation of the array elements in the StringBuilder.

## Edge Cases

An array of size 1 where there is only one element and no space should be printed. The constraints state 1 <= n, arr[i] <= 10^5, so empty arrays do not need to be handled.

## Signature Notes

The method signature matches the expected GeeksforGeeks platform signature: public void arrayTraversal(int[] arr).
