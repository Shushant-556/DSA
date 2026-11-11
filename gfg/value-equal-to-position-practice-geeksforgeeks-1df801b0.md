# Value Equal to Position | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
- Generated at UTC: 2026-11-11T20:06:05.532386+00:00
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
Value Equal to Position
Difficulty: BasicAccuracy: 54.83%Submissions: 252K+Points: 1Average Time: 20m

Given an array arr[], find the elements whose value is equal to the position where they appear.

Note: There can be more than one element in the array which have the same value as its position. You need to include the position of every such element.

Examples:

Input: arr[] = [15, 2, 45, 4, 7]
Output: [2, 4]
Explanation: Here, arr[2] = 2 exists here and arr[4] = 4 exists.
Input: arr[] = [1]
Output: [1]
Explanation: Here arr[1] = 1 exists.

Constraints:

1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

Try more examples
Expected Complexities
Company Tags
FlipkartAmazonFactSetHike
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
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

Try more examples
Expected Complexities
Company Tags
FlipkartAmazonFactSetHike
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
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [15, 2, 45, 4, 7]
Output: [2, 4]
Explanation: Here, arr[2] = 2 exists here and arr[4] = 4 exists.
Input: arr[] = [1]
Output: [1]
Explanation: Here arr[1] = 1 exists.

Constraints:

1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

Try more examples
Expected Complexities
Company Tags
FlipkartAmazonFactSetHike
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
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We need to find all elements in the given array whose value is equal to their 1-based index (position). We can iterate through the array from index 0 to n-1. For each element at index i, its 1-based position is i + 1. We check if arr[i] == i + 1. If it is, we add i + 1 to our result list. Finally, we return the list containing all such positions.

## Correctness

The approach directly follows the problem statement by checking 1-based positions. Since we iterate through the entire array sequentially, every element and its position are checked. The result will contain all positions where the condition holds true, adhering to the requirement.

## Complexity

- Time: O(N) where N is the size of the array, as we perform a single linear scan.
- Space: O(K) where K is the number of elements that satisfy the condition, used for storing the result list. In the worst case, this could be O(N).

## Edge Cases

Arrays of size 1, arrays with no matching elements, arrays where all elements match, and arrays with duplicate matching values.

## Signature Notes

The method takes an integer array `arr` and returns an `ArrayList<Integer>` of 1-based positions. The signature matches the GFG template: `public static ArrayList<Integer> valEqualToPos(int[] arr)`.
