// Author: Erick Huerta'
// Goal of this class is to create a driver class for Game.java similar to FourInARow test

import java.util.Scanner;

/**
 * GameLoop method: Will be a giant loop followed by if statements 1.) receive column chosen by
 * player -check is column is full (loop back to receiving column if already filled) -else, fill the
 * lowest empty spot 2.)Update Graphics 3.)Check for victory conditions (block of roughly 50 if
 * statements) -tie (filled board) -win/loss -if no winning conditions are met loop back to step 1
 * and switch player 2 and go through the loop again.
 * 
 * @param args
 */


public class PlayGame {

  Scanner scan = new Scanner(System.in);


  private static int gameboard[][] =
      {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},};

  public int GameLoop(Game game, int player) throws InterruptedException {

    // int will keep track of each player's victories
    int victory = 0;

    // Both ints here will keep track of player's choice for column chosen
    int column = 0;
    int row = 0;


    /**
     * Loop will be two loops followed testing of 50 if statements itself features 50 if statements
     **/

    do {

      System.out.println(
          player + " " + "Player 1 what column do you want to choose?? choose from 0 through 4");
      column = scan.nextInt();


      /*8if (gameboard[0][column] > 0)
        column++;
      */
    } while (gameboard[column][0] != 0);

    while (row <= 4 && gameboard[column][row] == 0) {
      row++;
    }
    row--;

    game.setGrid(gameboard);
    game.setSpot(column, row, player);

    /**
     * goes through each spot of the gameboard array manually checking for win conditions)
     * 
     */

    /*
     * first ten if statements check for horizontal win/loss conditions
     */
    if (gameboard[0][0] != 0 && gameboard[0][0] == gameboard[0][1]
        && gameboard[0][1] == gameboard[0][2] && gameboard[0][2] == gameboard[0][3]) {
      victory = gameboard[0][0];
    }

    if (gameboard[0][1] != 0 && gameboard[0][1] == gameboard[0][2]
        && gameboard[0][2] == gameboard[0][3] && gameboard[0][3] == gameboard[0][4]) {
      victory = gameboard[0][1];
    }

    if (gameboard[1][0] != 0 && gameboard[1][0] == gameboard[1][1]
        && gameboard[1][1] == gameboard[1][2] && gameboard[0][2] == gameboard[0][3]) {
      victory = gameboard[1][0];
    }

    if (gameboard[1][1] != 0 && gameboard[1][1] == gameboard[0][2]
        && gameboard[1][2] == gameboard[1][3] && gameboard[1][3] == gameboard[1][4]) {
      victory = gameboard[1][1];
    }

    if (gameboard[2][0] != 0 && gameboard[2][0] == gameboard[2][1]
        && gameboard[2][1] == gameboard[2][2] && gameboard[2][2] == gameboard[2][3]) {
      victory = gameboard[2][0];
    }

    if (gameboard[2][1] != 0 && gameboard[2][1] == gameboard[2][2]
        && gameboard[2][2] == gameboard[2][3] && gameboard[2][3] == gameboard[2][4]) {
      victory = gameboard[2][1];
    }

    if (gameboard[3][0] != 0 && gameboard[3][0] == gameboard[3][1]
        && gameboard[3][1] == gameboard[3][2] && gameboard[3][2] == gameboard[3][3]) {
      victory = gameboard[3][0];
    }

    if (gameboard[3][1] != 0 && gameboard[3][1] == gameboard[3][2]
        && gameboard[3][2] == gameboard[3][3] && gameboard[3][3] == gameboard[3][4]) {
      victory = gameboard[3][1];
    }

    if (gameboard[4][0] != 0 && gameboard[4][0] == gameboard[4][1]
        && gameboard[4][1] == gameboard[4][2] && gameboard[4][2] == gameboard[4][3]) {
      victory = gameboard[4][0];
    }

    if (gameboard[4][1] != 0 && gameboard[4][1] == gameboard[4][2]
        && gameboard[4][2] == gameboard[4][3] && gameboard[4][3] == gameboard[4][4]) {
      victory = gameboard[4][1];
    }

    /**
     * Next ten if statements checks for vertical win/loss scenarios
     */

    if (gameboard[0][0] != 0 && gameboard[0][0] == gameboard[1][0]
        && gameboard[1][0] == gameboard[2][0] && gameboard[2][0] == gameboard[3][0]) {
      victory = gameboard[0][0];
    }

    if (gameboard[1][0] != 0 && gameboard[1][0] == gameboard[2][0]
        && gameboard[2][0] == gameboard[3][0] && gameboard[3][0] == gameboard[4][0]) {
      victory = gameboard[1][0];
    }

    if (gameboard[0][1] != 0 && gameboard[0][1] == gameboard[1][1]
        && gameboard[1][1] == gameboard[2][1] && gameboard[2][1] == gameboard[3][1]) {
      victory = gameboard[0][1];
    }

    if (gameboard[1][1] != 0 && gameboard[1][1] == gameboard[2][1]
        && gameboard[2][1] == gameboard[3][1] && gameboard[3][1] == gameboard[4][1]) {
      victory = gameboard[1][1];
    }

    if (gameboard[0][2] != 0 && gameboard[0][2] == gameboard[1][2]
        && gameboard[1][2] == gameboard[2][2] && gameboard[2][2] == gameboard[3][2]) {
      victory = gameboard[0][2];
    }

    if (gameboard[1][2] != 0 && gameboard[1][2] == gameboard[2][2]
        && gameboard[2][2] == gameboard[3][2] && gameboard[3][2] == gameboard[4][2]) {
      victory = gameboard[1][2];
    }

    if (gameboard[0][2] != 0 && gameboard[0][2] == gameboard[1][2]
        && gameboard[1][2] == gameboard[2][2] && gameboard[2][2] == gameboard[3][2]) {
      victory = gameboard[0][2];
    }

    if (gameboard[1][3] != 0 && gameboard[1][3] == gameboard[2][3]
        && gameboard[2][3] == gameboard[3][3] && gameboard[3][3] == gameboard[4][3]) {
      victory = gameboard[1][3];
    }

    if (gameboard[0][2] != 0 && gameboard[0][2] == gameboard[1][2]
        && gameboard[1][2] == gameboard[2][2] && gameboard[2][2] == gameboard[3][2]) {
      victory = gameboard[0][2];
    }

    if (gameboard[1][4] != 0 && gameboard[1][4] == gameboard[2][4]
        && gameboard[2][4] == gameboard[3][4] && gameboard[3][4] == gameboard[4][4]) {
      victory = gameboard[1][4];
    }

    /**
     * next ten if statements will be searching for win/loss conditions in diagonal alignments
     */

    if (gameboard[0][0] != 0 && gameboard[0][0] == gameboard[1][1]
        && gameboard[1][1] == gameboard[2][2] && gameboard[2][2] == gameboard[3][3]) {
      victory = gameboard[0][0];
    }

    if (gameboard[1][1] != 0 && gameboard[1][1] == gameboard[2][2]
        && gameboard[2][2] == gameboard[3][3] && gameboard[3][3] == gameboard[4][4]) {
      victory = gameboard[1][1];
    }

    if (gameboard[0][1] != 0 && gameboard[0][1] == gameboard[1][2]
        && gameboard[1][2] == gameboard[2][3] && gameboard[2][3] == gameboard[3][4]) {
      victory = gameboard[0][1];
    }

    if (gameboard[1][0] != 0 && gameboard[1][0] == gameboard[2][1]
        && gameboard[2][1] == gameboard[3][2] && gameboard[3][2] == gameboard[4][3]) {
      victory = gameboard[1][0];
    }

    if (gameboard[0][4] != 0 && gameboard[0][4] == gameboard[1][3]
        && gameboard[1][3] == gameboard[2][2] && gameboard[2][2] == gameboard[3][1]) {
      victory = gameboard[0][4];
    }

    if (gameboard[1][3] != 0 && gameboard[1][3] == gameboard[2][2]
        && gameboard[2][2] == gameboard[3][1] && gameboard[3][1] == gameboard[4][0]) {
      victory = gameboard[1][3];
    }

    if (gameboard[1][4] != 0 && gameboard[1][4] == gameboard[2][3]
        && gameboard[2][3] == gameboard[3][2] && gameboard[3][2] == gameboard[4][1]) {
      victory = gameboard[1][4];
    }

    if (gameboard[0][3] != 0 && gameboard[0][3] == gameboard[1][2]
        && gameboard[1][2] == gameboard[2][1] && gameboard[2][1] == gameboard[3][0]) {
      victory = gameboard[0][3];
    }

    /** check for tie conditions **/

    if (gameboard[0][0] == 0 || gameboard[0][1] == 0 || gameboard[0][2] == 0 || gameboard[0][3] == 0
        || gameboard[0][4] == 0 || gameboard[1][0] == 0 || gameboard[1][1] == 0
        || gameboard[1][2] == 0 || gameboard[1][3] == 0 || gameboard[1][4] == 0
        || gameboard[2][0] == 0 || gameboard[2][1] == 0 || gameboard[2][2] == 0
        || gameboard[2][3] == 0 || gameboard[2][4] == 0 || gameboard[3][0] == 0
        || gameboard[3][1] == 0 || gameboard[3][2] == 0 || gameboard[3][3] == 0
        || gameboard[3][4] == 0 || gameboard[4][0] == 0 || gameboard[4][1] == 0
        || gameboard[4][2] == 0 || gameboard[4][3] == 0 || gameboard[4][4] == 0) {

    } else {
      System.out.println("Yall stink at this");
      victory = -1;

    }

    if (victory != 0) {
      System.out.printf("player%d won!!", victory);
    }

    return victory;

  }

  public class MainMenu {

    public static void main(String[] args) throws InterruptedException {

      /**
       * Create a main menu object that will handle the choices to start/cancel/reset games.
       * 
       * Main menu loop:
       * 
       * 1.) Ask player if he/she wants to play -proceed to gameLoop method if yes -reset scores if
       * chosen -cancel the game if chosen
       * 
       */
      Scanner scan = new Scanner(System.in);

      Game game = new Game();
      String choice;

      System.out.println("Want to play connect 4?? Y for yes/ N for no");
      choice = scan.nextLine();

      if (choice.equals("Y")) {

        PlayGame session = new PlayGame();

        // this version of victory is completely different than the one in the gameloop method
        int victory = 0;
        int player = 1;

        // While loop to make it possible to do more than one turn
        while (victory == 0) {

          victory = session.GameLoop(game, player);
          Game.redraw(game);
          System.out.println("the result is: " + victory);

          if (player == 1) {
            player = 2;
          } else {
            player = 1;
          }
        }
      }
      // how to remove game window
      // game.setVisible(false);

    }
  }
}


