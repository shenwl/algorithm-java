# 算法练习刷题的仓库
理论基础：熟悉常见的数据结构、起码看过一本算法入门书

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


## 知识点大纲
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

## leetcode 练习 + 理论点
#### Array & Linked List
- leetcode
    1. 206: reverse-linked-list (easy)
    2. 24: swap-nodes-in-pairs  (mid)
    3. 141: linked-list-cycle   (easy)
    4. 142: linked-list-cycle-ii    (mid)
    5. 25: reverse-nodes-in-k-group (hard)

#### Stack & Queue
- leetcode
    1. 20: valid-parentheses    (easy)
    2. 225: implement-stack-using-queues    (easy)
    3. 232: implement-queue-using-stacks    (easy)

#### PriorityQueue
- 正常入，按优先级出
- 实现机制
    * [Heap](https://en.wikipedia.org/wiki/Heap_(data_structure)) (Binary, Binomial, Fibonacci)
        - Fibonacci和Strict Fibonacci实现效率是最好的 [效率表](https://en.wikipedia.org/wiki/Heap_(data_structure))
    * Binary Search Tree
- leetcode
    * 703: kth-largest-element-in-a-stream  (easy)
    * 239: sliding-window-maximum (hard)

#### Map & Set
1. HashTable & Hash Function & Collisions

2. Map vs Set

3. HashMap, HashSet, TreeMap, TreeSet

4. leetcode
    - 242: valid-anagram    (easy)
    - 1: two-sum    (easy)
    - 15: 3sum  (mid)
    - 18: 4sum  (mid)

#### Tree
1. Tree, Binary Tree, BST
    - 经典问题：分层打印二叉树

2. Graph
    - 图论算法
    - 最短路径问题

3. leetcode
    - 98: validate-binary-search-tree   (mid)
    - 235: lowest-common-ancestor-of-a-binary-search-tree   (easy)
    - 236: lowest-common-ancestor-of-a-binary-tree  (mid)
    
#### 二叉树的遍历（根在什么时候被访问）
1. pre-order: root-left-right

2. in-order: left-root-right

3. post-order: left-right-root

4. 代码演示
    ```python
    def preorder(self, root):
        if root:
            self.traverse_path.append(root.val)
            preorder(root.left)
            preorder(root.right)
    
    def inorder(self, root):
        if root:
            inorder(root.left)
            self.traverse_path.append(root.val)
            inorder(root.right)
    
    def postorder(self, root):
        if root:
            postorder(root.left)
            postorder(root.right)
            self.traverse_path.append(root.val)
    ```


#### 递归 & 分治
1. Recursion
    - 是实现很多其他算法的基础 
    - 递归 - 循环，通过函数体来进行循环
    - 递归的问题：斐波那契算法为例，重复的子计算过多
    
2. Divide & Conquer
    - 把大问题剖析为子问题：split/merge
    - 和递归一样，当出现重复计算时，分治效率并不高，动态规划或者子问题记忆等方法的更合适
    
3. leetcode
    - 50: powx-n    (mid)
    - 169: majority-element (easy)
