# Time Complexity and Space Complexity

## Time Complexity
Time complexity refers to how the runtime of an algorithm changes with respect to the size of the input. It helps in understanding the efficiency of an algorithm.

### Types of Time Complexities:
1. **O(1)** (Constant time): The algorithm runs in the same time regardless of the input size.  
   *Example*: Accessing an element in an array by index.

2. **O(n)** (Linear time): The runtime grows linearly with the input size.  
   *Example*: Looping through an array.

3. **O(n^2)** (Quadratic time): The runtime grows quadratically with the input size.  
   *Example*: Nested loops, such as in bubble sort.

4. **O(log n)** (Logarithmic time): The runtime grows logarithmically as the input size increases.  
   *Example*: Binary search in a sorted array.

5. **O(n log n)**: The runtime grows as a combination of linear and logarithmic growth.  
   *Example*: Merge sort and quicksort.

### Example of Time Complexity:
For an algorithm that loops through an array of size `n`, the time complexity is **O(n)** because the number of operations increases linearly as `n` increases.

---

## Space Complexity
Space complexity refers to how the memory usage of an algorithm changes with respect to the size of the input. It helps in understanding the amount of memory required by the algorithm to run.

### Types of Space Complexities:
1. **O(1)** (Constant space): The algorithm uses a fixed amount of memory regardless of input size.  
   *Example*: Swapping two variables.

2. **O(n)** (Linear space): The algorithm’s memory usage grows linearly with the input size.  
   *Example*: Storing an array of size `n`.

3. **O(n^2)** (Quadratic space): The algorithm’s memory usage grows quadratically with the input size.  
   *Example*: A 2D matrix of size `n x n`.

### Example of Space Complexity:
Consider an algorithm that creates an array of size `n`. Its space complexity is **O(n)** because the memory required grows linearly with the input size.

---

## Summary
- **Time Complexity** measures the number of steps the algorithm takes to complete.
- **Space Complexity** measures how much memory the algorithm uses. 

### Example:
For a function that loops through an array of size `n` to find the maximum number, its **time complexity** is **O(n)** because it checks each element once. The **space complexity** is **O(1)** because it only needs a constant amount of extra space for variables like `max_value`.
