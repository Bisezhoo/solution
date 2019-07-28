package com.zhoo.review.solution;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IDEA
 *
 * @author:Bise
 * @date:2019/7/28 22:06
 */
public class ParenthesisMatchSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( isValid(str));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<String> charStack = new Stack<String>();
        for (char aChar : chars) {
            switch (aChar){
                case '}':{
                    if(!charStack.isEmpty()&&charStack.peek().equals("{")){
                        charStack.pop();
                    }else {
                        charStack.push(aChar+"");
                    }
                    break;
                }
                case ')':{
                    if(!charStack.isEmpty()&&charStack.peek().equals("(")){
                        charStack.pop();
                    }else {
                        charStack.push(aChar+"");
                    }
                    break;
                }
                case ']':{
                    if(!charStack.isEmpty()&&charStack.peek().equals("[")){
                        charStack.pop();
                    }else {
                        charStack.push(aChar+"");
                    }
                    break;
                }
                default:{
                    charStack.push(aChar+"");
                    break;
                }
            }

        }

        if(charStack.isEmpty()){
            return true;
        }
        return false;
    }
}