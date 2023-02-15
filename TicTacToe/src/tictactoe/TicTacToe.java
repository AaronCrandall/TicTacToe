package tictactoe;
import java.util.*;

public class TicTacToe {

    public static void main(String[] args) 
    {
       Board gameBoard = new Board();
       int[] board = new int[9];
       int choice = 0;
       int count = 0;
       int winner = 0;
       int gameType = 0;
       char user1Char = 'X';
       char user2Char = 'O';
       System.out.println("Would you like to play with 2 players or with a CPU?");
       System.out.println("Press 1 for 2 player, 2 for easy CPU, 3 more medium CPU, 4 for hard CPU");
       Scanner gametype = new Scanner(System.in);
       gameType = gametype.nextInt();
       switch (gameType)
       {
           case 1: 
            {
                User User1 = new User();
                User User2 = new User();
                gameBoard.printBoard();
                do{
                choice = User1.getUserMove();
                while (gameBoard.getCharat(choice) != ' ')
                {
                    System.out.println("That move is already taken, you must pick another spot");
                    choice = User1.getUserMove();
                }
                gameBoard.updateBoard(choice, user1Char);
                gameBoard.printBoard();
                winner = gameBoard.isGameOver();
                if (winner == 1)
                    break;
                choice = User2.getUserMove();
                while (gameBoard.getCharat(choice) != ' ')
                {
                    System.out.println("That move is already taken, you must pick another spot");
                    choice = User2.getUserMove();
                }
                gameBoard.updateBoard(choice, user2Char);
                gameBoard.printBoard();
                winner = gameBoard.isGameOver();
                if (winner == 2)
                    break;
                count++;
                }while (count < 4);
                if (winner == 1)
                    System.out.println("Player 1 Wins!");
                else if (winner == 2)
                    System.out.println("Player 2 Wins!");
                else
                    System.out.println("There is a tie");
                break;
            }
       
            case 2: //easy game 
            {
                int order = 0;
                User player = new User();
                Cpu bot = new Cpu();
                System.out.println("Would you like to be player 1 or player 2?");
                System.out.println("Press 1 for player 1 and 2 for player 2");
                order = gametype.nextInt();
                if (order == 1) // player goes first
                {
                    gameBoard.printBoard();
                    do{
                    choice = player.getUserMove(); //get player move
                    while (gameBoard.getCharat(choice) != ' ') //verify player move is valid
                    {
                        System.out.println("That move is already taken, you must pick another spot");
                        choice = player.getUserMove();
                    }
                    gameBoard.updateBoard(choice, user1Char); //updates board
                    gameBoard.printBoard(); //prints new board
                    winner = gameBoard.isGameOver(); //checks for winner
                    if (winner == 1)
                        break;
                    board[choice - 1] = 1; //if game is still going on update cpu "board"
                    choice = bot.getCPUMove(gameType, order, board);
                    
                    gameBoard.updateBoard(choice, user2Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 2)
                        break;
                    board[choice - 1] = 2;
                    count++;
                    }while (count < 4);
                    if (winner == 1)
                        System.out.println("You Win!");
                    else if (winner == 2)
                        System.out.println("The Computer Wins!");
                    else
                        System.out.println("There is a tie");
                    }
                else //player going second
                {
                    gameBoard.printBoard();
                    do{
                    choice = bot.getCPUMove(gameType, order, board);
                    
                    gameBoard.updateBoard(choice, user1Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 1)
                        break;
                    board[choice - 1] = 1;
                    choice = player.getUserMove();
                    while (gameBoard.getCharat(choice) != ' ')
                    {
                        System.out.println("That move is already taken, you must pick another spot");
                        choice = player.getUserMove();
                    }
                    gameBoard.updateBoard(choice, user2Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 2)
                        break;
                    board[choice - 1] = 2;
                    count++;
                    }while (count < 4);
                    if (winner == 1)
                        System.out.println("The Computer Wins!");
                    else if (winner == 2)
                        System.out.println("You Win!");
                    else
                        System.out.println("There is a tie");
                } break;
            }
            case 3: //medium or random cpu
            {
                int order = 0;
                User player = new User();
                Cpu bot = new Cpu();
                System.out.println("Would you like to be player 1 or player 2?");
                System.out.println("Press 1 for player 1 and 2 for player 2");
                order = gametype.nextInt();
                if (order == 1) //player  first
                {
                    gameBoard.printBoard();
                    do{
                    choice = player.getUserMove();
                    while (gameBoard.getCharat(choice) != ' ')
                    {
                        System.out.println("That move is already taken, you must pick another spot");
                        choice = player.getUserMove();
                    }
                    gameBoard.updateBoard(choice, user1Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 1)
                        break;
                    board[choice - 1] = 1;
                    choice = bot.getCPUMove(gameType, order, board);
                    
                    gameBoard.updateBoard(choice, user2Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 2)
                        break;
                    board[choice - 1] = 2;
                    count++;
                    }while (count < 4);
                    if (winner == 1)
                        System.out.println("You Win!");
                    else if (winner == 2)
                        System.out.println("The Computer Wins!");
                    else
                        System.out.println("There is a tie");
                    }
                else // player second medium game
                {
                    gameBoard.printBoard();
                    do{
                    choice = bot.getCPUMove(gameType, order, board);
                    
                    gameBoard.updateBoard(choice, user1Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 1)
                         break;
                    board [choice - 1] = 1;
                    choice = player.getUserMove();
                    while (gameBoard.getCharat(choice) != ' ')
                    {
                        System.out.println("That move is already taken, you must pick another spot");
                        choice = player.getUserMove();
                    }
                    gameBoard.updateBoard(choice, user2Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 2)
                        break;
                    board[choice - 1] = 2;
                    count++;
                    }while (count < 4);
                    if (winner == 1)
                        System.out.println("The Computer Wins!");
                    else if (winner == 2)
                        System.out.println("You Win!");
                    else
                        System.out.println("There is a tie");
                } break;
            }
            case 4: //impossible game
            {
                int order = 0;
                User player = new User();
                Cpu bot = new Cpu();
                System.out.println("Would you like to be player 1 or player 2?");
                System.out.println("Press 1 for player 1 and 2 for player 2");
                order = gametype.nextInt();
                if (order == 1) //player first
                {
                    gameBoard.printBoard();
                    do{
                    choice = player.getUserMove();
                    while (gameBoard.getCharat(choice) != ' ')
                    {
                        System.out.println("That move is already taken, you must pick another spot");
                        choice = player.getUserMove();
                    }
                    gameBoard.updateBoard(choice, user1Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 1)
                        break;
                    board[choice - 1] = 0;
                    choice = bot.getCPUMove(gameType, order, board);
                    
                    gameBoard.updateBoard(choice, user2Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 2)
                        break;
                    board[choice - 1] = 1;
                    count++;
                    }while (count < 4);
                    if (winner == 1)
                        System.out.println("You Win!");
                    else if (winner == 2)
                        System.out.println("The Computer Wins!");
                    else
                        System.out.println("There is a tie");
                    }
                else //impossible player second
                {
                    gameBoard.printBoard();
                    do{
                    choice = bot.getCPUMove(gameType, order, board);
                    
                    gameBoard.updateBoard(choice, user1Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 1)
                         break;
                    board[choice -1] = 0;
                    choice = player.getUserMove();
                    while (gameBoard.getCharat(choice) != ' ')
                    {
                        System.out.println("That move is already taken, you must pick another spot");
                        choice = player.getUserMove();
                    }
                    gameBoard.updateBoard(choice, user2Char);
                    gameBoard.printBoard();
                    winner = gameBoard.isGameOver();
                    if (winner == 2)
                        break;
                    board[choice - 1] = 1;
                    count++;
                    }while (count < 4);
                    if (winner == 1)
                        System.out.println("The Computer Wins!");
                    else if (winner == 2)
                        System.out.println("You Win!");
                    else
                        System.out.println("There is a tie");
                } break;
            }
        }
    }
}
