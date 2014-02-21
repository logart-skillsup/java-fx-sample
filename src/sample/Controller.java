package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField input;
    public Label statusBar;
    private Double memory;

    public void clear(ActionEvent actionEvent) {
        clearInput();
    }

    public void multiply(ActionEvent actionEvent) {
        double value = parseInput();
        clearInput();
        if (memory != null) {
            input.setText(String.valueOf(memory * value));
            memory = null;
        } else {
            memory = value;
            input.setText("0");
        }
    }

    public void divide(ActionEvent actionEvent) {
        double value = parseInput();
        clearInput();
        if (memory != null) {
            input.setText(String.valueOf(memory / value));
            memory = null;
        } else {
            memory = value;
            input.setText("0");
        }
    }

    public void subtract(ActionEvent actionEvent) {
        double value = parseInput();
        clearInput();
        if (memory != null) {
            input.setText(String.valueOf(memory - value));
            memory = null;
        } else {
            memory = value;
            input.setText("0");
        }
    }

    public void add(ActionEvent actionEvent) {
        double value = parseInput();
        clearInput();
        if (memory != null) {
            input.setText(String.valueOf(memory + value));
            memory = null;
        } else {
            memory = value;
            input.setText("0");
        }
    }

    private void clearInput() {
        input.setText("0");
    }

    private double parseInput() {
        try {
            return Double.valueOf(input.getText());
        } catch (NumberFormatException e) {
            statusBar.setText("error during parsing double value '" + input.getText() + "' is not valid number!");
            return Double.NaN;
        }
    }
}
