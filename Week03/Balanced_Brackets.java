package Week03;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean ktr = true;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                st. push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}'){
                if (st.isEmpty()){
                    ktr = false;
                    break;
                }
                char top = st.pop();
                if ((ch == ')' && top != '(')
                        || (ch == ']' && top != '[')
                        || (ch == '}' && top != '{')){
                    ktr = false;
                    break;
                }
            }
        }
        if (st.isEmpty() && ktr){
            System.out.println("Hợp lệ!");
        }
        else
        {
            System.out.println("Không hợp lệ!");
        }
    }

}
