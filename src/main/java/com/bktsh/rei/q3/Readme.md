# Algorithm Design # 

##### Write a method that counts the number of words in a string #####    

Counting words in a given text. Here is the pseudo-code of the written code:
1. Break down the sentence into words (array of strings)
2. return length of the array
3. Edge cases:
    - In case the input is empty or null return 0
 > My Assumpption:
 
    1. Fo this algrithm I assumed the words are separated by single space.
    2. A word a sequence of non-empty(tab,return,space) characters.

------ 

##### Write a method that reverses the order of words in a string without reversing the order of the letters within the word. (example: “a quick brown fox” becomes “fox brown quick a”.) ##### 
 Here is the pseudo-code of the algorithm:
1. Decompose a sentence into words (assuming empty spaces bigger than one are junk and they will be ignored). 
2. Then It will concat the items of the array in reverse order.
 
 >My Assumpption:
     
      1. This algrithm assumes the words are separated by single space.
      2. A word a sequence of non-empty(tab,return,space) characters.