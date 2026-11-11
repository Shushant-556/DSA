# Sort 0s, 1s and 2s | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
- Generated at UTC: 2026-11-11T19:36:50.883933+00:00
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
Sort 0s, 1s and 2s
Difficulty: MediumAccuracy: 50.58%Submissions: 893K+Points: 4Average Time: 10m

Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order. 

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?

Constraints:

1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2

Try more examples
Expected Complexities
Company Tags
PaytmFlipkartMorgan StanleyAmazonMicrosoftOYO RoomsSamsungSnapdealHikeMakeMyTripOla CabsWalmartMAQ SoftwareAdobeYatra.comSAP LabsQualcomm
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
class Solution {
    public void sort012(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2

Try more examples
Expected Complexities
Company Tags
PaytmFlipkartMorgan StanleyAmazonMicrosoftOYO RoomsSamsungSnapdealHikeMakeMyTripOla CabsWalmartMAQ SoftwareAdobeYatra.comSAP LabsQualcomm
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
class Solution {
    public void sort012(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?

Constraints:

1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2

Try more examples
Expected Complexities
Company Tags
PaytmFlipkartMorgan StanleyAmazonMicrosoftOYO RoomsSamsungSnapdealHikeMakeMyTripOla CabsWalmartMAQ SoftwareAdobeYatra.comSAP LabsQualcomm
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
class Solution {
    public void sort012(int[] arr) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We use the Dutch National Flag algorithm. We maintain three pointers: low, mid, and high. Initially, low and mid are set to 0, and high is set to arr.length - 1. We traverse the array with the mid pointer. If arr[mid] is 0, we swap arr[low] and arr[mid], then increment both low and mid. If arr[mid] is 1, we simply increment mid. If arr[mid] is 2, we swap arr[mid] and arr[high], and decrement high (without incrementing mid, since the swapped element from high needs to be processed). This partitions the array into 0s on the left, 1s in the middle, and 2s on the right in a single pass.

## Correctness

The Dutch National Flag algorithm correctly places all 0s to the left of the 'low' pointer, all 2s to the right of the 'high' pointer, and all 1s between 'low' and 'mid' pointers. By checking every element with 'mid' and correctly shrinking the boundaries, the algorithm terminates when 'mid' crosses 'high', ensuring the entire array is sorted.

## Complexity

- Time: O(N) where N is the length of the array, since we traverse the array at most once.
- Space: O(1) as we only use a few integer variables for pointers.

## Edge Cases

Arrays with all 0s, all 1s, or all 2s; arrays already sorted; arrays in reverse sorted order; and arrays of length 1.

## Signature Notes

The method signature is 'public void sort012(int[] arr)', which modifies the array in-place and expects no return value.
