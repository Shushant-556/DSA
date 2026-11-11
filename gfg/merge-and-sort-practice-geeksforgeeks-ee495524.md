# Merge and Sort | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/merge-and-sort5821/1
- Generated at UTC: 2026-11-11T18:29:51.869824+00:00
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
Merge and Sort
Difficulty: BasicAccuracy: 48.84%Submissions: 17K+Points: 1

Given two arrays arr1[] and arr2[], return the merged array in ascending order containing unique elements.

Examples:

Input: arr1[] = [11, 1, 8], arr2[] = [10, 11]
Output: [1, 8, 10, 11]
Explanation: The ouput array after merging both the arrays and removing duplicates is [1, 8, 10, 11]

Input: arr1[] = [7, 1, 5, 3, 9], arr2[]  = [8, 4, 3, 5, 2, 6]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] 

Constraints:

1 ≤ arr1.size(), arr2.size() ≤ 104
0 ≤ arr1[i], arr2[i] ≤ 109

Try more examples
Expected Complexities
Topic Tags
Related Articles
Report An Issue
If you are facing any issue on this page. Please let us know.
Python3
1
2
3
4
5
class Solution:
    def mergeNsort(self, arr1, arr2):
        # code here
        
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr1.size(), arr2.size() ≤ 104
0 ≤ arr1[i], arr2[i] ≤ 109

Try more examples
Expected Complexities
Topic Tags
Related Articles
Report An Issue
If you are facing any issue on this page. Please let us know.
Python3
1
2
3
4
5
class Solution:
    def mergeNsort(self, arr1, arr2):
        # code here
        
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr1[] = [11, 1, 8], arr2[] = [10, 11]
Output: [1, 8, 10, 11]
Explanation: The ouput array after merging both the arrays and removing duplicates is [1, 8, 10, 11]

Input: arr1[] = [7, 1, 5, 3, 9], arr2[]  = [8, 4, 3, 5, 2, 6]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] 

Constraints:

1 ≤ arr1.size(), arr2.size() ≤ 104
0 ≤ arr1[i], arr2[i] ≤ 109

Try more examples
Expected Complexities
Topic Tags
Related Articles
Report An Issue
If you are facing any issue on this page. Please let us know.
Python3
1
2
3
4
5
class Solution:
    def mergeNsort(self, arr1, arr2):
        # code here
        
Custom InputCompile & RunSubmit

## Approach

We can use a TreeSet to automatically handle both duplicate removal and sorting. We iterate through all elements of arr1 and arr2, adding each element to the TreeSet. Finally, we convert the TreeSet into an ArrayList and return it.

## Correctness

TreeSet naturally maintains elements in ascending order and guarantees uniqueness. Since all elements from both arrays are added, we correctly capture the union of elements from both arrays. The resulting ArrayList preserves this sorted and unique order.

## Complexity

- Time: O((N + M) log(N + M)), where N and M are the sizes of arr1 and arr2 respectively, due to inserting elements into a Red-Black tree (TreeSet).
- Space: O(N + M) to store the unique elements in the TreeSet and the resulting ArrayList.

## Edge Cases

Arrays with completely overlapping elements, arrays with no overlapping elements, arrays containing duplicate elements within themselves, and maximum constraints values.

## Signature Notes

The method takes two integer arrays arr1 and arr2 and returns an ArrayList<Integer> containing the merged unique elements in ascending order.
