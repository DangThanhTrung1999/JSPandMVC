public class Calculator {
    public static float calculator(float first, char operator, float second) throws Exception {
        switch (operator){
            case '+':
                return first + second;
            case '-':
                return first-second;
            case '*':
                return first*second;
            case '/':
                if(second!=0)
                    return first/second;
                else
                    throw new Exception("Can't divide by zero");
                default:
                    throw new Exception("Invalid operation");
        }
    }
}
