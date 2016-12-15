# Find Ranges #
Write a function that takes an array of ints and returns a set of ranges denoting the increasing ranges. Please code in Java. Example:

input:[1,2,3,4,5,6,3,6,8,5,8,9,4,3,5]
output: (0,5)(6,8)(9,11)(13,14)

> 1. I implemented my understand of the problem statement. I assumed if there is 
 a range of numbers[2 or more number] in inout array I'll identify that else I will 
 ignore the isolated single items.
> 2. I couldn't understand the given sample Example; Why 6 doesn't belong to first range, 
 and also where 11, 13, 14 came from?  my class returned following result for it:{ [1, 6], [8, 9] } 