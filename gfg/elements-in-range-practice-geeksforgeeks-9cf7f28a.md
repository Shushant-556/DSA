# Elements in Range | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1
- Generated at UTC: 2026-11-11T20:26:50.818752+00:00
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
Elements in Range
Difficulty: BasicAccuracy: 37.28%Submissions: 98K+Points: 1

Given an array arr[] containing distinct positive integers, and two integers start and end defining a range. Find if the array contains all elements within inclusive range [start, end].

Examples :

Input: start = 2, end = 5, arr[] =  [1, 4, 5, 2, 7, 8, 3]
Output: true
Explanation: All integers within the range [2, 5] are 2, 3, 4, and 5, and all of them are present in the array. Therefore, the answer is true for this test case.

Input: start = 2, end = 6, arr[] = [1, 4, 5, 2, 7, 8, 3]
Output: false
Explanation: The array does not contain 6; hence, it does not contain all the elements in the range [2, 6]. Therefore, the output is false.


Constraints:

0 ≤ start ≤ end
end ≤ 105
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105

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
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

0 ≤ start ≤ end
end ≤ 105
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105

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
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples :

Input: start = 2, end = 5, arr[] =  [1, 4, 5, 2, 7, 8, 3]
Output: true
Explanation: All integers within the range [2, 5] are 2, 3, 4, and 5, and all of them are present in the array. Therefore, the answer is true for this test case.

Input: start = 2, end = 6, arr[] = [1, 4, 5, 2, 7, 8, 3]
Output: false
Explanation: The array does not contain 6; hence, it does not contain all the elements in the range [2, 6]. Therefore, the output is false.


Constraints:

0 ≤ start ≤ end
end ≤ 105
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105

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
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We need to check if all integers in the inclusive range [start, end] are present in the given array arr[]. We can use a boolean array of size end + 1 to keep track of the presence of numbers that fall within the range [start, end]. First, we iterate through the array and mark present[num] as true if num is within the range [start, end]. Then, we iterate from start to end and check if any number has not been marked as present. If we find any missing number, we return false. Otherwise, we return true.

## Correctness

The approach correctly identifies whether every element in the range [start, end] exists in the array. Since the array contains distinct positive integers and values are bounded by 10^5, a boolean array of size end + 1 is efficient and avoids index out of bounds exceptions as long as end <= 10^5.

## Complexity

- Time: O(N + (end - start + 1)) where N is the size of the array arr. This is optimal since we iterate through the array once and then through the range [start, end].
- Space: O(end) to store the boolean array tracking the presence of elements up to 'end'.

## Edge Cases

1. Range is a single element (start == end).
2. Elements in the range are completely missing from the array.
3. Array elements are outside the [start, end] range.

## Signature Notes

The method signature matches the expected GFG template: public boolean checkElements(int start, int end, int[] arr).
