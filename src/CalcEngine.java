import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcEngine implements ActionListener{
    private View parent;
    private double c;
    private double d;
    private boolean sum = false;
    private boolean minus = false;
    private boolean multiply = false;
    private boolean divide = false;

    CalcEngine(View parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String showFieldText = parent.getShowValue();
        String clickedButtonLabel = clickedButton.getText();
        if(clickedButtonLabel.equals("=")){
            d = Double.parseDouble(parent.getShowValue());
            if (sum){
                c = c + d;
                sum = false;
            } else {
                if(minus){
                    c = c - d;
                    minus = false;
                } else {
                    if(multiply){
                        c = c * d;
                        multiply = false;
                    } else {
                        if (divide){
                            c = c / d;
                            divide = false;
                        }
                    }
                }
            }

            String answer = String.valueOf(c);
            parent.setShowValue(answer);
            c = 0;
        } else {
            if(clickedButtonLabel.equals("+")){
                sum = true;
                d = Double.parseDouble(parent.getShowValue());
                if (sum){
                    c = c + d;
                } else {
                    if(minus){
                        c = c - d;
                        minus = false;
                    } else {
                        if(multiply){
                            c = c * d;
                            multiply = false;
                        } else {
                            if (divide){
                                c = c / d;
                                divide = false;
                            }
                        }
                    }
                }
                parent.setShowValue(null);
            } else {
                if(clickedButtonLabel.equals("-")){
                    minus = true;
                    d = Double.parseDouble(parent.getShowValue());
                    if (sum){
                        c = c + d;
                        sum = false;
                    } else {
                        if(minus){
                            c = c - d;
                        } else {
                            if(multiply){
                                c = c * d;
                                multiply = false;
                            } else {
                                if (divide){
                                    c = c / d;
                                    divide = false;
                                }
                            }
                        }
                    }
                    parent.setShowValue(null);
                } else {
                    if (clickedButtonLabel.equals("*")){
                        multiply = true;
                        d = Double.parseDouble(parent.getShowValue());
                        if (sum){
                            c = c + d;
                            sum = false;
                        } else {
                            if(minus){
                                c = c - d;
                                minus = false;
                            } else {
                                if(multiply){
                                    c = c * d;
                                } else {
                                    if (divide){
                                        c = c / d;
                                        divide = false;
                                    }
                                }
                            }
                        }
                        parent.setShowValue(null);
                    } else {
                        if (clickedButtonLabel.equals("/")){
                            divide = true;
                            d = Double.parseDouble(parent.getShowValue());
                            if (sum){
                                c = c + d;
                                sum = false;
                            } else {
                                if(minus){
                                    c = c - d;
                                    minus = false;
                                } else {
                                    if(multiply){
                                        c = c * d;
                                        multiply = false;
                                    } else {
                                        if (divide){
                                            c = c / d;
                                        }
                                    }
                                }
                            }
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
