package Postfix;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Calculator {


    public static void main (String [] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while(!str.equals("exit")){
            System.out.println("Type \"exit\" to exit, \nType your calculation:");
            str = scanner.nextLine();
            String[] strings = str.split(" ");
            calculate(strings);
        }
    }

    static boolean isParsable(String input){
        try{
            Integer.parseInt(input);
            return true;
        }catch (final NumberFormatException e){
            return false;
        }
    }

    static void calculate(String[] strings){
        Iterator<String> iterator = Arrays.stream(strings).iterator();

        System.out.println(Arrays.toString(strings));
        Deque<String> operands = new LinkedList<>();
        Deque<String> aux = new LinkedList<>();

        while(iterator.hasNext()){
            String val = iterator.next();
            Integer num = 0;
            try{
                num = Integer.parseInt(val);
                operands.push(num.toString());
            }catch (NumberFormatException e){
                switch (val){
                    case "+": case "-":
                    case "(": case "/":
                    case "*":
                        aux.push(val);
                        break;
                    case ")":
                        String temp = aux.pop();
                        while(!temp.equals("(")){
                            operands.push(temp);
                            temp = aux.pop();
                        }
                }
            }
        }
        while(!aux.isEmpty()){
            operands.push(aux.pop());
        }
        Stack<Double> result = new Stack<>();
        System.out.println(operands);
        while(!operands.isEmpty()) {
            while (isParsable(operands.peekLast())) {
                result.push((double) Integer.parseInt(operands.pollLast()));
            }
            System.out.println(result);
            Double left = result.pop();
            Double right = result.pop();
            String operation = operands.pollLast();
            System.out.println(right + " " + operation + " " + left);

            switch(operation){
                case "+":
                    result.push(left + right);
                    break;
                case "-":
                    result.push(right - left);
                    break;
                case "*":
                    result.push(right * left);
                    break;
                case "/":
                    result.push(right / left);
                    break;
            }
        }
        System.out.println(result.peek());
    }
}
