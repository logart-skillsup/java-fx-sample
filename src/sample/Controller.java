package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.operations.Addition;
import sample.operations.Division;
import sample.operations.Multiplication;
import sample.operations.Subtraction;

public class Controller {

    public TextField input;
    private static double memory;
    private BinaryOperation operation;

    public void operation(ActionEvent actionEvent) {
        Button target = (Button) actionEvent.getTarget();
        if ("add".equals(target.getId())) {
            operation = new Addition();
        } else if ("subtract".equals(target.getId())) {
            operation = new Subtraction();
        } else if ("multiply".equals(target.getId())) {
            operation = new Multiplication();
        } else if ("divide".equals(target.getId())) {
            operation = new Division();
        } else {
            System.out.println("error button");
        }
        memory = parseString(input.getText());
        input.setText("");
    }

    public void evaluate(ActionEvent actionEvent) {
        double result = operation.execute(memory, parseString(input.getText()));
        if (!Double.isNaN(result)) {
            input.setText(String.valueOf(result));
        }
    }

    private Double parseString(String s1) {
        try {
            return Double.valueOf(s1);
        } catch (NumberFormatException e) {
            input.setText("error!");
            return Double.NaN;
        }
    }
}
