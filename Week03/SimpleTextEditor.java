package Week03;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        Stack<String> st = new Stack<>();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++){
            int type = sc.nextInt();
            if (type == 1){
                st.push(s.toString());
                String w = sc.next();
                s.append(w);
            }
            else if (type == 2){
                st.push(s.toString());
                int k = sc.nextInt();
                s.delete(s.length() - k, s.length());
            }
            else if (type == 3){
                int id = sc.nextInt();
                System.out.println(s.charAt(id - 1));
            }
            else if (type == 4){
                if (!st.isEmpty())
                {
                    s = new StringBuilder(st.pop());
                }
            }
        }
    }
}
