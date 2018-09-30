package datastructures.tasks;

import datastructures.Stack;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int numberOfLines = Integer.parseInt(input);

        for (int i = 0; i < numberOfLines; i++) {
            input = sc.nextLine();
            int length = input.length();
            Stack<Character> stack = new Stack<>();
            loops:
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if("{[(".indexOf(c) != -1){
                    stack.push(c);
                }
                if("}])".indexOf(c) != -1){
                    char topElement = stack.peek();
                    switch (c){
                        case '}':
                            if(topElement == '{'){
                                stack.pop();
                            }else{
                                //stack.push(c);
                                break loops;
                            }
                            break;
                        case ']':
                            if(topElement == '['){
                                stack.pop();
                            }else{
                                //stack.push(c);
                                break loops;
                            }
                            break;
                        case ')':
                            if(topElement == '('){
                                stack.pop();
                            }else{
                                break loops;
                                //stack.push(c);
                            }
                            break;
                        default:
                            break;
                    }
                }
                System.out.printf("Loops is looping %d%n", j);
            }
            System.out.println(stack.isEmpty() ? "Yes" : "No");
        }
    }
}
