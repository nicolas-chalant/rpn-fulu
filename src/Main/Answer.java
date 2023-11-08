package src.Main;

import java.util.ArrayList;

public class Answer {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("8");
        arr.add("*");
        System.out.println(computeRPN(arr));
    }

    public static int computeRPN(ArrayList<String> arr){
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
