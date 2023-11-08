package src.Main;

import java.util.ArrayList;

public class Answer {
    public static void main(String[] args) {
        System.out.println(computeRPN("2 8 *" ));
    }

    public static int computeRPN(String input){
        ArrayList<String> arr = new ArrayList<String>();
        String[] inputArr = input.split(" ");
        for(int i = 0; i < inputArr.length; i++){
            arr.add(inputArr[i]);
        }
        int result = 0;
        ArrayList<Integer> stack = new ArrayList<Integer>();
        stack.add(Integer.parseInt(arr.get(0)));
        stack.add(Integer.parseInt(arr.get(1)));
        arr.remove(0);
        arr.remove(0);
        
        String operator = arr.get(0);
        if(operator.equals("+")){
            result = stack.get(0) + stack.get(1);
        }else if(operator.equals("-")){
            result = stack.get(0) - stack.get(1);
        }else if(operator.equals("*")){
            result = stack.get(0) * stack.get(1);
        }else if(operator.equals("/")){
            result = stack.get(0) / stack.get(1);
        }

        return result;
    }

}
