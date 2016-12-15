## REI Coding practice ##
>Please send your .java files, or post your project on GitHub or something (we don’t accept .zip attachments), thanks!

1. **Question 1:**  Write a function that takes an array of ints and returns a set of ranges denoting the increasing ranges.  Please code in Java. Example:
* input:[1,2,3,4,5,6,3,6,8,5,8,9,4,3,5] 
* output: (0,5)(6,8)(9,11)(13,14)
 
2. **Question 2:** OO Design - Pick One (Looking for what classes you would use and what would their interactions be at a high level)
* Design a Deck of cards. (This might be part of a poker game or something)

####Design a Drawing application (think MS Paint, BONUS: what about Undo functionality).Name a design pattern you know or have used & tell me about it. (Java certification, Gang of Four) ####
 To design a Drawing App like MS Paint, I will use **observer pattern**. The canvas will be my observer and the mouse listener will be the observable.
   Using this pattern I can update the canvas drawing while the user is interacting with canvas [clicking/moving].
   To enable undo-redo functionality I would use command pattern. Whenever user does an interaction with UI I will encapsulate the interaction
   as a command and save it into a stack, and when user tries to undo what they did I will pop item from the stack. 
   To support re-do I will use a re-do stack, so when user hits re-do action I will pop from re-do stack and push to undo stack again.
  
####Question 3: Simple Algorithm Question - Pick One (Asking essentially for dictated pseudo-code and approach to solving problem) ####  
#####Write a method that counts the number of words in a string. #####    

This WordCounter class is designed to solve: Counting words in a given text. Here is the way it solves the problem:
 1. Break down the sentence into words (array of strings)
 2. return length of the array
 Edge cases:
 a) In case the input is empty or null return 0
 #####My Assumpption:  #####
 1. This algrithm assumes the words are separated by single space.
 2. A word a sequence of non-empty(tab,return,space) characters.
#### Write a method that reverses the order of words in a string without reversing the order of the letters within the word. (example: “a quick brown fox” becomes “fox brown quick a”.) #### 
 This is how the algoruthm works:
 1. Decompose a sentence into words (assuming empty spaces bigger than one are junk). 
 2. Then It will concat the array items in reverse order.
 #####My Assumpption:  #####
  1. This algrithm assumes the words are separated by single space.
  2. A word a sequence of non-empty(tab,return,space) characters.