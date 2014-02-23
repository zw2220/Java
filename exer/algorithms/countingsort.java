/*
Counting sort is a sorting technique based on keys between a specific range. It works by counting the number of objects 
having distinct key values (kind of hashing). Then doing some arithmetic to calculate the position of each object in the 
output sequence.
Let us understand it with the help of an example.

For simplicity, consider the data in the range 0 to 9. 
Input data: 1, 4, 1, 2, 7, 5, 2
  1) Take a count array to store the count of each unique object.
  Index:     0  1  2  3  4  5  6  7  8  9
  Count:     0  2  2  0   1  1  0  1  0  0

  2) Modify the count array such that each element at each index 
  stores the sum of previous counts. 
  Index:     0  1  2  3  4  5  6  7  8  9
  Count:     0  2  4  4  5  6  6  7  7  7

The modified count array indicates the position of each object in 
the output sequence.
 
  3) Output each object from the input sequence followed by 
  decreasing its count by 1.
  Process the input data: 1, 4, 1, 2, 7, 5, 2. Position of 1 is 2.
  Put data 1 at index 2 in output. Decrease count by 1 to place 
  next data 1 at an index 1 smaller than this index.

Review: http://www.geeksforgeeks.org/counting-sort/

Time Complexity: O(n+k) where n is the number of elements in input array and k is the range of input.
Auxiliary Space: O(n+k)

Points to be noted:
1. Counting sort is efficient if the range of input data is not significantly greater than the number of objects to be 
sorted. Consider the situation where the input sequence is between range 1 to 10K and the data is 10, 5, 10K, 5K.
2. It is not a comparison based sorting. It running time complexity is O(n) with space proportional to the range of data.
3. It is often used as a sub-routine to another sorting algorithm like radix sort.
4. Counting sort uses a partial hashing to count the occurrence of the data object in O(1).
5. Counting sort can be extended to work for negative inputs also.

Exercise:
1. Modify above code to sort the input data in the range from M to N.
2. Modify above code to sort negative input data.
3. Is counting sort stable and online?
In computer science, an online algorithm is one that can process its input piece-by-piece in a serial fashion, i.e., 
in the order that the input is fed to the algorithm, without having the entire input available from the start. 
In contrast, an offline algorithm is given the whole problem data from the beginning and is required to output an answer
which solves the problem at hand. (For example, selection sort requires that the entire list be given before it can sort
it, while insertion sort doesn't.)

An example of stable sorting on playing cards. When the cards are sorted by rank with a stable sort, the two 5s must 
remain in the same order in the sorted output that they were originally in. When they are sorted with a non-stable sort,
the 5s may end up in the opposite order in the sorted output.
4. Thoughts on parallelizing the counting sort algorithm.
*/


