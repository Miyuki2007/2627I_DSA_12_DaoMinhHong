package Week03;

import java.util.Scanner;
import java.util.Stack;

public class w3_tailop_masv {
    static int pre(char c){
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if ((c>='A' && c <= 'Z') || (c>='a' && c<='z') || (c>='0' && c<='9')){
                System.out.print(c);
            }
            else if (c=='(') st.push('(');
            else if (c==')'){
                while (!st.empty() && st.peek()!='('){
                    System.out.print(st.pop());
                }
                st.pop();
            }
            else{
                while (!st.isEmpty() && st.peek() != '(' &&
                        (pre(st.peek()) > pre(c) || (pre(st.peek()) == pre(c) && c != '^'))){
                    System.out.print(st.pop());


                }
                st.push(c);
            }
        }
        while (!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
