package tictactoe;
import java.lang.Math;

/**
 *
 * @author Owner
 */
public class Cpu { //make CPUs make moves
    private int rowRemember = 0;
    private int[] rowAvailable = new int[8];
    public int getCPUMove(int difficulty, int order, int[] board)
    {
        int decision;
        switch (difficulty)
        {
            case 2: //easy
            {
                int k = 0;
                int l = 0;
                decision = 0;
                int[] row = new int[3];
                int[] rowNum = new int[3];
                if (rowRemember == 0)
                    rowRemember =(int)(Math.random() * 8) + 1;
                if (rowAvailable[rowRemember-1] == 1)
                {
                    int options = 8;
                    for(int i = 0; i < rowAvailable.length; i++)
                    {
                        if (rowAvailable[i] == 1)
                            options--;
                    }
                    int j = 0;
                    int holder = (int)(Math.random() * options);
                    int[] validOptions = new int[options];
                    for(int i = 0; i < rowAvailable.length; i++)
                    {
                        if (rowAvailable[i] != 1)
                        { 
                            validOptions[j] = (i+1);
                            j++;
                        }
                    }
                    rowRemember = validOptions[holder];
                }
                switch(rowRemember)
                {
                    case 1:
                    {
                        for(int i = 0; i < 3; i++)
                        {
                            rowNum[k] = i+1;
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                    case 2:
                    {
                        for(int i = 3; i < 6; i++)
                        {
                            rowNum[k] = i+1;
                            
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                    case 3:
                    {
                        for(int i = 6; i < 9; i++)
                        {
                            rowNum[k] = i+1;
                            
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                    case 4:
                    {
                        for(int i = 0; i < 7; i+=3)
                        {
                            rowNum[k] = i+1;
                            
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                    case 5:
                    {
                        for(int i = 1; i < 8; i+=3)
                        {
                            rowNum[k] = i+1;
                            
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                    case 6:
                    {
                        for(int i = 2; i < 9; i+=3)
                        {
                            rowNum[k] = i+1;
                            
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                    case 7:
                    {
                        for(int i = 0; i < 9; i+=4)
                        {
                            rowNum[k] = i+1;
                            
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                    case 8:
                    {
                        for(int i = 2; i < 8; i+=2)
                        {
                            rowNum[k] = i+1;
                            
                            if (board[i] == 1 || board[i] == 2)
                                row[k] = 1;
                            k++;
                        }
                        int valid = 0;
                        for(int i = 0; i <row.length; i++)
                        {
                            valid += row[i];
                        }
                        if(valid == 3)
                        {
                            rowAvailable[rowRemember-1] = 1;
                            decision = getCPUMove(difficulty, order, board);
                            break;
                        }
                        int options = 3;
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i]== 1)
                                options--;
                        }
                        int[] validRowOptions = new int[options];
                        for(int i = 0; i < row.length; i++)
                        {
                            if(row[i] != 1)
                            {
                                validRowOptions[l] = rowNum[i];
                                l++;
                            }
                        }
                        decision = validRowOptions[(int)(Math.random() * options)];
                        break;
                    }
                }
                return decision;  
            }
            case 3: // normal
            {
                int options = 9;
                int j = 0;
                for(int i = 0; i < board.length; i++)
                {
                    if (board[i] == 2 || board[i] == 1)
                        options--;
                }
          
                int[] validOptions = new int[options];
                for(int i = 0; i < board.length; i++)
                {
                    if (board[i] != 2 && board[i] != 1)
                    { 
                        validOptions[j] = (i+1);
                        j++;
                    }
                }
                decision = validOptions[(int)(Math.random() * options)];
                return decision;
            }
            case 4: // impossible
            {
               switch (order)
               {
                   case 1:
                   {
                       return decision;
                   }
                   case 2:
                   {
                       return decision;
                   }
               }
            }
            default: //this will literally never happen
            {
                return 0;
            }
        }
    }
}
