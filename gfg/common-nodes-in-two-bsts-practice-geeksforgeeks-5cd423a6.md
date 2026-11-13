# Common Nodes in Two BSTs | Practice | GeeksforGeeks

- Problem URL: https://www.geeksforgeeks.org/problems/print-common-nodes-in-bst/1
- Generated at UTC: 2026-11-13T18:21:38.677718+00:00
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
Common Nodes in Two BSTs
Difficulty: MediumAccuracy: 51.7%Submissions: 82K+Points: 4Average Time: 20m

Given the roots r1 and r2 of two Binary Search Trees (BST), find all nodes that are present in both trees i.e. the intersection nodes of the two BSTs.

Return the common node values in sorted order.

Examples:

Input: r1 = [5, 1, 10, 0, 4, 7, N, N, N, N, N, N, 9], r2 = [10, 7, 20, 4, 9, N, N]  

Output: [4, 7, 9, 10]
Explanation: The values present in both BSTs are 4, 7, 9, and 10. Hence, the answer is [4, 7, 9, 10].
Input: r1 = [10, 2, 11, 1, 3, N, N], r2 = [2, 1, 3]

Output: [1, 2, 3]
Explanation: The values 1, 2, and 3 are present in both BSTs. Hence, the answer is [1, 2, 3].

Constraints:

1 ≤ size of binary trees ≤ 105
0 ≤ Node.data ≤ 109

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
7
8
9
10
11
12
13
14
15
16
17
18
19
/* Structure of a Binary Search Tree node
class Node {
  public int data;
  public Node left;
  public Node right;
  public Node(int val) {
      data = val;
      left = right = null;
  }
};
*/
class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Constraints

Constraints:

1 ≤ size of binary trees ≤ 105
0 ≤ Node.data ≤ 109

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
7
8
9
10
11
12
13
14
15
16
17
18
19
/* Structure of a Binary Search Tree node
class Node {
  public int data;
  public Node left;
  public Node right;
  public Node(int val) {
      data = val;
      left = right = null;
  }
};
*/
class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Examples

Examples:

Input: r1 = [5, 1, 10, 0, 4, 7, N, N, N, N, N, N, 9], r2 = [10, 7, 20, 4, 9, N, N]  

Output: [4, 7, 9, 10]
Explanation: The values present in both BSTs are 4, 7, 9, and 10. Hence, the answer is [4, 7, 9, 10].
Input: r1 = [10, 2, 11, 1, 3, N, N], r2 = [2, 1, 3]

Output: [1, 2, 3]
Explanation: The values 1, 2, and 3 are present in both BSTs. Hence, the answer is [1, 2, 3].

Constraints:

1 ≤ size of binary trees ≤ 105
0 ≤ Node.data ≤ 109

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
7
8
9
10
11
12
13
14
15
16
17
18
19
/* Structure of a Binary Search Tree node
class Node {
  public int data;
  public Node left;
  public Node right;
  public Node(int val) {
      data = val;
      left = right = null;
  }
};
*/
class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        
    }
}
Custom InputCompile & RunSubmit

## Approach

We can find common nodes in two Binary Search Trees (BSTs) in sorted order by performing an iterative inorder traversal of both trees simultaneously using two explicit stacks. At each step, we peek at the top nodes of both stacks (which represent the current smallest elements in their respective traversals). If their values are equal, we add the value to the result and advance both traversals. If the value in the first stack is smaller, we advance the first traversal. Otherwise, we advance the second traversal.

## Correctness

The approach utilizes the properties of BST inorder traversal, which visits nodes in ascending order. By advancing the stack with the smaller current value, we correctly match common elements without skipping any potential intersections, thus guaranteeing correct and sorted output.

## Complexity

- Time: O(N + M), where N and M are the number of nodes in the two BSTs. Each node is pushed and popped from the stack at most once.
- Space: O(H1 + H2), where H1 and H2 are the heights of the two BSTs, representing the maximum stack sizes during traversal.

## Edge Cases

One or both trees are empty (r1 or r2 is null). Trees are skewed (degenerate trees). No common nodes found. All nodes are common.

## Signature Notes

The method signature matches the GeeksforGeeks requirement: `public ArrayList<Integer> findCommon(Node r1, Node r2)`.
