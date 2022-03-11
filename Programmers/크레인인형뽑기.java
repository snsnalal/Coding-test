import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int last=-1;
        
        for(int i : moves)
        {
            for(int j = 0; j < board.length; j++)
            {
                if(board[j][i-1] != 0)
                {
                    if(!st.isEmpty())
                    {
                        last = st.peek();
                    }
                    
                    if(last == board[j][i-1])
                    {
                        st.pop();
                        answer++;
                    }
                    else
                    {
                        st.push(board[j][i-1]);
                    }
                    
                    board[j][i-1] = 0;                   
                    break;
                }
            }            
        }
        
        return answer*2;
    }
}
