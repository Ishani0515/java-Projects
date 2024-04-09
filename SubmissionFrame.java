import java.awt.*;
import java.awt.event.*;

class SubmissionFrame extends Frame {
    Label submissionLabel;

    SubmissionFrame() {
        setSize(400, 100);
        setTitle("Submission Status");
        setLocationRelativeTo(null);
SubmissionFrame submissionFrame = new SubmissionFrame();
        submissionLabel = new Label("Thank you, Your Response has been submitted");
        submissionLabel.setAlignment(Label.CENTER);
        submissionLabel.setFont(new Font("Arial", Font.BOLD, 15));

        add(submissionLabel);

        setVisible(true);
    }
}