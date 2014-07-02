package sample.operations;

import sample.BinaryOperation;

public class Division implements BinaryOperation {
    @Override
    public double execute(double first, double second) {
        //Avoiding ArithmeticException
        if (second==0){
            return 0;
        }
        return first/second;
    }
}
