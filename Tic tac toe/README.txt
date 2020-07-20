**************************************************************************
*                                 README                                 *
*  This application is a 2-player game of Tic-Tac-Toe and to run this    *
*  application you must execute the exe or jar file in the src->runnable.*
*                                                                        *
*------------------------------------------------------------------------*
*                                                                        *
*  How this program works:                                               *
*                                                                        *
* The Start.java file when executed, will run the Intro.java file which  *
* contains the main GUI, you then have the option of reading the rules   *
* which will run the Rules.java file or exiting the program which will   *
* simply close the Application using stage.close() or starting the game  *
* which will run the Game.java file, once the game is running. X gets    *
* the 1st turn and is hence considered to be the player being supported  *
* by the game. If X were to fill 3 spots that form a line or diagonal    *
* then,the Win.java file will execute. This is accomplished by           *
* associating an array of type bool with a size of 9 each array index    *
* refers to a part of the board, for example: index 0 would mean top     *
* left of the board and index 1 would mean the top center of the board.  *
* However if O were to fill 3 spots in the board (done using array too)  *                                       
* that form a line or diagonal then, the Lose.java file will execute.    *
* Otherwise if no player were to fill 3 spots that form a line or        *
* diagonal then, the Draw.java file will execute. Once the results are   *
* provided, the user has the option to play again or to view game stats  *
* or to exit the application. The X.java file is used to place X's on    *
* the Game.java file and also to keep track of the X's positions on the  *
* Win.java,Lose.java and Draw.java files. The same applies to the O.java *
* file. The Stats.java file shows the game stats collected from the      *
* Game.java class and from the Win.java, Loss.java and Draw.java files.  *  
*                                                                        *
**************************************************************************
