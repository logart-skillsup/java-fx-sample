package sample.operations;

import sample.BinaryOperation;

public class Multiplication implements BinaryOperation {
    @Override
    public double execute(double first, double second) {
        return first*second;
    }
}
