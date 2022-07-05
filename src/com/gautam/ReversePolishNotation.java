package com.gautam;

import java.util.Stack;
import java.util.Vector;

public class ReversePolishNotation {
    public static void main(String [] args){
        //Vector<String> tokens = new Vector<>();
        String [] tokens = { "4", "13", "5","/", "+"};
        int result = evalRPN(tokens);

        System.out.println(result);
    }

    //Space complexity is S = o(n) creating a stack
//Time complexity is T = o(n)  just iterating over the vector array
    public static int evalRPN(String [] tokens){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i< tokens.length; i++){
            if(tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/"){
                int v1 = st.peek();
                st.pop();
                int v2 = st.peek();
                st.pop();
                if(tokens[i] == "+"){
                    st.push(v2+v1); // push result inside the stack
                }
                else if(tokens[i] == "-"){
                    st.push(v2-v1); // push result inside the stack
                }
                else if(tokens[i] == "*"){
                    st.push(v2*v1); // push result inside the stack
                }
                else if(tokens[i] == "/"){
                    st.push(v2/v1); // push result inside the stack
                }
            }
            else{
                //operands
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        // now we have only one element in stack
        return st.peek();
    }
}






