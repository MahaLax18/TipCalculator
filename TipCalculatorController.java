import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipCalculatorController {

    @FXML private TextField billAmountField;
    @FXML private TextField tipPercentageField;
    @FXML private Label tipAmountLabel;
    @FXML private Label errorLabel;

    @FXML
    private void calculateTip() {
        try {
            double bill = Double.parseDouble(billAmountField.getText());
            double percent = Double.parseDouble(tipPercentageField.getText());
            double tip = bill * percent / 100;
            tipAmountLabel.setText(String.format("Tip Amount: $%.2f", tip));
            errorLabel.setText("");
        } catch (NumberFormatException e) {
            errorLabel.setText("Error: Invalid input. Please enter numbers.");
            tipAmountLabel.setText("Tip Amount: ");
        }
    }

    @FXML
    private void reset() {
        billAmountField.clear();
        tipPercentageField.clear();
        tipAmountLabel.setText("Tip Amount: ");
        errorLabel.setText("");
    }
}
