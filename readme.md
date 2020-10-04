# 算法练习刷题的仓库

## 开始
```bash
git clone https://github.com/shenwl/algorithm-java.git
cd algorithm-java

mvn install
mvn clean test
```


## 算法切题
- Clarification
- Possible solutions
    * compare(time/space)
    * optimal(加强)
- Coding
- Test cases


## 知识点
#### Data Structure
- Array
- Stack/Queue
- PriorityQueue(heap)
- LinkedList(single/double)
- Tree/BinaryTree
- BST
- HashTable
- Disjoint Set
- Trie
- BloomFilter
- LRU Cache

#### Algorithm
- General Coding
- InOrder/PreOrder/PostOrder Traversal
- Greedy
- Recursion/Backtrace
- Breadth-first/Depth-first Search
- Divide and Conquer
- Dynamic Programming
- Binary Search
- Graph

## leetcode 练习
#### Array & Linked List
- leetcode
    1. 206: reverse-linked-list
    2. 24: swap-nodes-in-pairs
    3. 141: linked-list-cycle
    4. 142: linked-list-cycle-ii
    5. 25: reverse-nodes-in-k-group

#### Stack & Queue
- leetcode
    1. 20: valid-parentheses
    2. 225: implement-stack-using-queues
    3. 232: implement-queue-using-stacks

#### PriorityQueue
- 正常入，按优先级出
- 实现机制
    * [Heap](https://en.wikipedia.org/wiki/Heap_(data_structure)) (Binary, Binomial, Fibonacci)
        - Fibonacci和Strict Fibonacci实现效率是最好的 [效率表](https://en.wikipedia.org/wiki/Heap_(data_structure))
    * Binary Search Tree
- leetcode
    * 703: kth-largest-element-in-a-stream
    * 239: sliding-window-maximum (hard)

#### Map & Set
1. HashTable & Hash Function & Collisions

2. Map vs Set

3. HashMap, HashSet, TreeMap, TreeSet

4. leetcode
    - 242: valid-anagram
    - 1: two-sum
    - 15: 3sum
    - 18: 4sum

#### Tree
1. Tree, Binary Tree, BST
    - 经典问题：分层打印二叉树

2. Graph
    - 图论算法
    - 最短路径问题

3. leetcode
    - 98: validate-binary-search-tree
    - 235: lowest-common-ancestor-of-a-binary-search-tree
    - 236: lowest-common-ancestor-of-a-binary-tree