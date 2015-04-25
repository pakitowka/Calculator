import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcEngine implements ActionListener{
    private View parent;
    private double c = 0;

    CalcEngine(View parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String showFieldText = parent.getShowValue();
        String clickedButtonLabel = clickedButton.getText();
        if(clickedButtonLabel.equals("=")){
            String answer = String.valueOf(c);
            parent.setShowValue(answer);
            c = 0;

        } else {
            if(clickedButtonLabel.equals("+")){
                c = c + Double.parseDouble(parent.getShowValue());
                parent.setShowValue(null);
            } else {
                if(clickedButtonLabel.equals("-")){
                    c = c - Double.parseDouble(parent.getShowValue());
                    parent.setShowValue(null);
                } else {
                    if (clickedButtonLabel.equals("*")){
                        c = c * Double.parseDouble(parent.getShowValue());
                        parent.setShowValue(null);
                    } else {
                        if (clickedButtonLabel.equals("/")){
                            c = c / Double.parseDouble(parent.getShowValue());
                            parent.setShowValue(null);
                        } else {
                            parent.setShowValue(showFieldText + clickedButtonLabel);
                        }
                    }
                }
            }
        }

        
    }
}
