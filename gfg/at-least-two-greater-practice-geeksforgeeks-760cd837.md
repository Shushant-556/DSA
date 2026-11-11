# At least Two Greater | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1
- Generated at UTC: 2026-11-11T18:31:50.703396+00:00
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
At least Two Greater
Difficulty: BasicAccuracy: 58.49%Submissions: 67K+Points: 1

Given an array arr of distinct elements, the task is to return an array of elements that have at least two greater elements.

Examples:

Input: arr[] = [2, 8, 7, 1, 5]
Output: [1, 2, 5] 
Explanation: Here we return an array contains 1, 2, 5 and we leave two greatest elements 7 & 8. 
Input: arr[] = [7, -2, 3, 4, 9, -1]
Output: [-2, -1, 3, 4]
Explanation:  Here we return an array contains -2 ,  -1,  3,  4 and we leave two greatest elements 7 & 9. 

Constraints:

3 ≤ arr.size() ≤ 105
-106 ≤ arr[i] ≤ 106

Try more examples
Expected Complexities
Company Tags
Amazon
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
    public ArrayList<Integer> findElements(int[] arr) {
        // code here
        
    }
};
Custom InputCompile & RunSubmit

## Constraints

Constraints:

3 ≤ arr.size() ≤ 105
-106 ≤ arr[i] ≤ 106

Try more examples
Expected Complexities
Company Tags
Amazon
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
    public ArrayList<Integer> findElements(int[] arr) {
        // code here
        
    }
};
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [2, 8, 7, 1, 5]
Output: [1, 2, 5] 
Explanation: Here we return an array contains 1, 2, 5 and we leave two greatest elements 7 & 8. 
Input: arr[] = [7, -2, 3, 4, 9, -1]
Output: [-2, -1, 3, 4]
Explanation:  Here we return an array contains -2 ,  -1,  3,  4 and we leave two greatest elements 7 & 9. 

Constraints:

3 ≤ arr.size() ≤ 105
-106 ≤ arr[i] ≤ 106

Try more examples
Expected Complexities
Company Tags
Amazon
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
    public ArrayList<Integer> findElements(int[] arr) {
        // code here
        
    }
};
Custom InputCompile & RunSubmit

## Approach

To find all elements that have at least two strictly greater elements in the array, we can sort the array in ascending order. Since all elements are distinct according to the problem statement, the two largest elements will be at the last two indices of the sorted array (i.e., at indices arr.length - 1 and arr.length - 2). All other elements in the array will have at least two elements greater than them. Thus, we collect all elements from index 0 up to arr.length - 3 and return them.

## Correctness

The problem guarantees that all elements in the input array are distinct. Sorting the array places the elements in increasing order. The largest two elements will occupy the last two positions. Removing these two largest elements leaves exactly the set of elements that have at least two greater elements. Sorting followed by a linear scan correctly implements this logic.

## Complexity

- Time: O(N log N) where N is the number of elements in the array, due to sorting the array. The subsequent linear scan takes O(N) time.
- Space: O(1) auxiliary space beyond the output list, or O(N) considering the output list storage required by the return type.

## Edge Cases

The constraints specify that the array size is between 3 and 10^5, so there are always at least 3 elements. Elements can be negative or positive, which sorting handles correctly.

## Signature Notes

The method takes an integer array `int[] arr` and returns `ArrayList<Integer>` containing the elements that have at least two greater elements, matching the standard GeeksforGeeks template.
