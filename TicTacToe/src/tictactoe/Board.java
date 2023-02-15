package tictactoe;

public class Board 
{
    char [][] board = {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
    
    public void printBoard()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
    public void updateBoard(int choice, char userChar)
    {
        switch(choice)
        {
            case 1:
            {
                board[0][0] = userChar;
                break;
            }
            case 2:
            {
                board[0][2] = userChar;
                break;
            }
            case 3:
            {
                board[0][4] = userChar;
                break;
            }
            case 4:
            {
                board[2][0] = userChar;
                break;
            }
            case 5:
            {
                board[2][2] = userChar;
                break;
            }
            case 6:
            {
                board[2][4] = userChar;
                break;
            }
            case 7:
            {
                board[4][0] = userChar;
                break;
            }
            case 8:
            {
                board[4][2] = userChar;
                break;
            }
            case 9:
            {
                board[4][4] = userChar;
                break;
            }
        }
    }
    public char getCharat(int choice)
    {
        switch(choice)
        {
            case 1:
            {
                return board[0][0];
            }
            case 2:
            {
                return board[0][2];
               
            }
            case 3:
            {
                return board[0][4];
            }
            case 4:
            {
                return board[2][0];
            }
            case 5:
            {
                return board[2][2];
            }
            case 6:
            {
                return board[2][4];
            }
            case 7:
            {
                return board[4][0];
            }
            case 8:
            {
                return board[4][2];
            }
            case 9:
            {
                return board[4][4];
            }
            default:
                return ' ';
        }
    }
    public int isGameOver()
    {
        if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][4] == 'X')
            return 1;
        else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == 'X')
            return 1;
        else if (board[4][0] == 'X' && board[4][2] == 'X' && board[4][4] == 'X')
            return 1;
        else if (board[0][0] == 'X' && board[2][0] == 'X' && board[4][0] == 'X')
            return 1;
        else if (board[0][2] == 'X' && board[2][2] == 'X' && board[4][2] == 'X')
            return 1;
        else if (board[0][4] == 'X' && board[2][4] == 'X' && board[4][4] == 'X')
            return 1;
        else if (board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == 'X')
            return 1;
        else if (board[0][4] == 'X' && board[2][2] == 'X' && board[4][0] == 'X')
            return 1;
        else if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][4] == 'O')
            return 2;
        else if (board[2][0] == 'O' && board[2][2] == 'O' && board[2][4] == 'O')
            return 2;
        else if (board[4][0] == 'O' && board[4][2] == 'O' && board[4][4] == 'O')
            return 2;
        else if (board[0][0] == 'O' && board[2][0] == 'O' && board[4][0] == 'O')
            return 2;
        else if (board[0][2] == 'O' && board[2][2] == 'O' && board[4][2] == 'O')
            return 2;
        else if (board[0][4] == 'O' && board[2][4] == 'O' && board[4][4] == 'O')
            return 2;
        else if (board[0][0] == 'O' && board[2][2] == 'O' && board[4][4] == 'O')
            return 2;
        else if (board[0][4] == 'O' && board[2][2] == 'O' && board[4][0] == 'O')
            return 2;
        else
            return 0;
    }
    public int[] updateArray(int[] board, int location, int user)
    {
        board[location - 1] = user;
        return board;
    }
}
