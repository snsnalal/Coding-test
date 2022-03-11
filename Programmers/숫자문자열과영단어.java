//replaceAll(a, b) String에서 a를 b로 전부 바꾼다.
//내가 푼것
class Solution {
    public int solution(String s) {
        int answer = 0;
        int i = 0;
        String result="";
        String num = "";
        while(i < s.length())
        {
            char a = s.charAt(i);
            
            if((int)a >=48 && (int)a <= 57)
            {
                result += a;
            }
            else
            {
                num += a;
            }
            
            if(num.equals("zero"))
            {
                result += "0";
                num = "";
            }
            else if(num.equals("one"))
            {
                result += "1";
                num = "";
            }
            else if(num.equals("two"))
            {
                result += "2";
                num = "";
            }
            else if(num.equals("three"))
            {
                result += "3";
                num = "";
            }
            else if(num.equals("four"))
            {
                result += "4";
                num = "";
            }
            else if(num.equals("five"))
            {
                result += "5";
                num = "";
            }
            else if(num.equals("six"))
            {
                result += "6";
                num = "";
            }
            else if(num.equals("seven"))
            {
                result += "7";
                num = "";
            }
            else if(num.equals("eight"))
            {
                result += "8";
                num = "";
            }
            else if(num.equals("nine"))
            {
                result += "9";
                num = "";
            }
            
            i++;
        }
        
        answer = Integer.parseInt(result);
        
        return answer;
    }
}

//깔끔한 답
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}
