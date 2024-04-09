import java.awt.*;
import java.awt.event.*;

class CountProject extends Frame implements TextListener {
    TextField t;
    Label lengthLabel;
    Label vowelLabel;
    Label consonantLabel;
    Label wordLabel;

    CountProject() {
        setSize(300, 300);
        t = new TextField();
        lengthLabel = new Label("Total Length: 0");
        vowelLabel = new Label("Total Vowels: 0");
        consonantLabel = new Label("Total Consonants: 0");
        wordLabel = new Label("Total Words: 0");
        setLayout(null);
        t.setBounds(60, 60, 100, 20);
        lengthLabel.setBounds(30, 100, 150, 20);
        vowelLabel.setBounds(30, 120, 150, 20);
        consonantLabel.setBounds(30, 140, 150, 20);
        wordLabel.setBounds(30, 160, 150, 20);
        add(t);
        add(lengthLabel);
        add(vowelLabel);
        add(consonantLabel);
        add(wordLabel);
        t.addTextListener(this);
        setVisible(true);
    }

    public void textValueChanged(TextEvent e) {
        String text = t.getText();
        int length = text.length();
        lengthLabel.setText("Total Length: " + length);

        int vowels = 0;
        int consonants = 0;
        int words = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        vowelLabel.setText("Total Vowels: " + vowels);
        consonantLabel.setText("Total Consonants: " + consonants);

        
        words = text.trim().isEmpty() ? 0 : text.split("\\s+").length;
        wordLabel.setText("Total Words: " + words);
    }

    public static void main(String args[]) {
        CountProject ob = new CountProject();
    }
}
