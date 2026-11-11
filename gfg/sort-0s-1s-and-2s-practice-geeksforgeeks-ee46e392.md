# Sort 0s, 1s and 2s | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
- Generated at UTC: 2026-11-11T19:45:04.143790+00:00
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
class Solution {
    public void sort012(int[] arr) {
        
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
class Solution {
    public void sort012(int[] arr) {
        
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
class Solution {
    public void sort012(int[] arr) {
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We use the Dutch National Flag algorithm. We maintain three pointers: low, mid, and high. Initially, low and mid point to the start of the array (0), and high points to the end of the array (arr.length - 1). We iterate with mid from 0 to high: 1. If arr[mid] == 0, we swap arr[low] and arr[mid], then increment both low and mid. 2. If arr[mid] == 1, it is in the correct middle section, so we just increment mid. 3. If arr[mid] == 2, we swap arr[mid] and arr[high], then decrement high. Note that when arr[mid] is swapped with arr[high], we do not increment mid because the element swapped from high has not been examined yet.

## Correctness

The algorithm correctly partitions the array into three regions: elements < low are 0s, elements between low and mid-1 are 1s, and elements > high are 2s. The loop invariant holds throughout, and since mid advances toward high at each step where no 2 is swapped, termination is guaranteed in a single pass.

## Complexity

- Time: O(N) where N is the size of the array, as each element is visited at most once by the mid pointer.
- Space: O(1) auxiliary space as sorting is performed in place using a few pointer variables.

## Edge Cases

Array with all 0s, all 1s, or all 2s; array already sorted; array with only two types of elements; array of minimum length (1).

## Signature Notes

The method takes an integer array arr and sorts it in-place, returning void, matching the exact GeeksforGeeks signature.
