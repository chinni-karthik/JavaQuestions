package com.ck.unable.to.solve;

public class OneGbJvmPoblem {
	/*You have to sort 1 GB of data with only 100 MB of available main memory. Which sorting technique will be most appropriate?

	Explanation: The data can be sorted using external sorting which uses merging technique. This can be done as follows:
	1. Divide the data into 10 groups each of size 100.
	2. Sort each group and write them to disk.
	3. Load 10 items from each group into main memory.
	4. Output the smallest item from the main memory to disk. Load the next item from the group whose item was chosen.
	5. Loop step #4 until all items are not outputted.

	The step 3-5 is called as merging technique.
	
	This approach is called as K-way merge!
	 */
}
