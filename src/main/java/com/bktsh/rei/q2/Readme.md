 #Drawing App #
 
 To design a complete Drawing App like MS Paint, with huge set of functionalities, I'd use **MVC pattern**. 
 However, for the purpose of just drawing a line on a canvas, which is way simpler problem, 
 I used a simpler pattern, **observer pattern**. 
  
 The canvas will be my observer and the mouse actions are my favorite observable in this case as I want to present mouse dragging as shapes on canvas. 
 In order to show the power of this pattern and also created another observer object for debugging/monitoring mouse drag movements. 
  
 Using this pattern I can update all my observers(Canvas, Sysout, StatusBar) at the same time and they can showsame data in different formats.
 
 If I had decided to implement undo-redo functionality I would use **command pattern**. 
 - I'd define a Command interface with **execute** and **undo** methods. 
 - Then each time I wanted to run a command, I would call execute on the command and will **push** the Command object into a stack. 
 - At the time of Undo, I'd pop command object from Stack and call **undo** function on them. 

