class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int [][]pos = {{3,1},
                        {0,0},
                       {0,1},
                       {0,2},
                       {1,0},
                       {1,1},
                       {1,2},
                       {2,0},
                       {2,1},
                       {2,2},
                       {3,0},
                       {3,2}};

        int left_last=10;
        int right_last=11;

        for(int i : numbers)
        {
            if((i == 1) || (i == 4) || (i == 7))
            {
                answer += "L";
                left_last = i;
            }
            else if((i == 3) || (i == 6) || (i == 9))
            {
                answer += "R";
                right_last = i;
            }
            else if((i == 2) || (i == 5) || (i == 8)|| (i == 0))
            {
                int left_dif = Math.abs(pos[left_last][0] - pos[i][0]) + Math.abs(pos[left_last][1] - pos[i][1]);
                int right_dif = Math.abs(pos[right_last][0] - pos[i][0]) + Math.abs(pos[right_last][1] - pos[i][1]);

                if(left_dif > right_dif)
                {
                    answer += "R";
                    right_last = i;
                }
                else if(left_dif < right_dif)
                {
                    answer += "L";
                    left_last = i;
                }
                else if(left_dif == right_dif)
                {
                    if(hand.equals("right"))
                    {
                        answer += "R";
                        right_last = i;
                    }
                    else
                    {
                        answer += "L";
                        left_last = i;
                    }
                }
            }
        }

        return answer;
    }
}
