# Quiz Game

## Brief

Develop a command line program which runs a quiz game.

The program should run through a series of questions. For each question, the player should select an answer. 

The program should check if the answer is correct, increment the player's score, then show the next question.

Have a class using Scanner for the user input. 

To get good practice using classes, have each question handled by an instance of a Question class. This series of question classes should be managed by one Quiz class.

It would be cool to have the questions asked in a random order, and have a random selection from a larger list. This way the quiz feels different each time.

Have the program tell the player their score at the end.

<details>
  <summary>Possible Component Tree</summary>
  
  ![component tree](https://i.imgur.com/A3NPdZB.png)

  
</details>

---

## Extension

Make your Question class abstract, and create multiple categories of question (eg. history, sports, movies) as new classes, inheriting Question.

Allow the player to select the category of quiz they want to take, and have the program build the relevant set of questions.
