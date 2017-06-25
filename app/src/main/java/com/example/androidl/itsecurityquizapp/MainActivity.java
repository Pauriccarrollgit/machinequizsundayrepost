package com.example.androidl.itsecurityquizapp;

import android.support.annotation.Px;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;

/**
 * This app is Machine Learning App
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;
    final String q7_answer = "pauric";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the end test button is clicked.
     */
    public void end_Test(View view) {
        EditText nameField = (EditText) findViewById(R.id.editUsername);
        String name = nameField.getText().toString();

        //Called question checking methods
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();
        question_6();


        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);

        // Display the toast message when clicked

        if (score > 3) {
            Toast.makeText(this, "Keep up the good work: " + score, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You need to study more: " + score, Toast.LENGTH_SHORT).show();
        }



        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button);
        endTestButton.setEnabled(false);
    }

    /**
     * Create summary of the test result.
     *
     * @param name of the passing the test
     * @param score of the counting of right answers
     * @return text of the test result
     * here is where I could add an intent
     */
    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(R.string.test_result_score) + score;
        return test_result;
    }
    

    /**
     * This method counter correct answers in question 1
     * Which of the following are types of machine learning? Check all that apply? (Choose 3 best answers)
     */
    public void question_1() {
        // Figure out if the user chose "Availability" answer
        CheckBox AvailabilityCheckBox = (CheckBox) findViewById(R.id.availability_checkbox);
        boolean hasAvailability = AvailabilityCheckBox.isChecked();

        if (hasAvailability) {
            increment_score();
        }

        // Figure out if the user chose "Integrity" answer
        CheckBox IntegrityCheckBox = (CheckBox) findViewById(R.id.integrity_checkbox);
        boolean hasIntegrity = IntegrityCheckBox.isChecked();

        if (hasIntegrity) {
            increment_score();
        }

        // Figure out if the user chose "Confidentiality" answer
        CheckBox ConfidentialityCheckBox = (CheckBox) findViewById(R.id.confidentiality_checkbox);
        boolean hasConfidentiality = ConfidentialityCheckBox.isChecked();

        if (hasConfidentiality) {
            increment_score();
        }

        // Figure out if the user chose "Confidentiality" answer
        CheckBox RemoteAccessCheckBox = (CheckBox) findViewById(R.id.remote_access_checkbox);
        boolean hasRemoteAccess = RemoteAccessCheckBox.isChecked();

        if (hasRemoteAccess ) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 2
     * "Which of the following statements best describes confidentiality of information?"
     */
    public void question_2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_4_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 3
     * "According to Cisco, organizational data is classified into four categories. Which of the following is NOT classification category?"
     */
    public void question_3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.trusty_worthy_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.trusty_worthy_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.publ_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.sensitive_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.confidential_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.private_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 4
     * "What are the THREE security solution that Cisco recommends for comprehensive security?"
     */
    public void question_4() {
        // Figure out if the user chose "Physical" answer
        CheckBox PhysicalCheckBox = (CheckBox) findViewById(R.id.physical_checkbox);
        boolean hasPhysical = PhysicalCheckBox.isChecked();

        if (hasPhysical) {
            increment_score();
        }

        // Figure out if the user chose "Logical" answer
        CheckBox LogicalCheckBox = (CheckBox) findViewById(R.id.logical_checkbox);
        boolean hasLogical = LogicalCheckBox.isChecked();

        if (hasLogical) {
            increment_score();
        }

        // Figure out if the user chose "Managerial" answer

        CheckBox ManagarialCheckBox = (CheckBox) findViewById(R.id.managerial_checkbox);
        boolean hasManagerial = ManagarialCheckBox.isChecked();

        if (hasManagerial) {
            decrement_score();
        }

        // Figure out if the user chose "Managerial" answer

        CheckBox GeographicalCheckBox = (CheckBox) findViewById(R.id.geographical_checkbox);
        boolean hasGeographical = GeographicalCheckBox.isChecked();

        if (hasGeographical) {
            decrement_score();
        }


        // Figure out if the user chose "Administrative" answer
        CheckBox AdministrativeCheckBox = (CheckBox) findViewById(R.id.administrative_checkbox);
        boolean hasAdministrative = AdministrativeCheckBox.isChecked();

        if (hasAdministrative) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 5
     * "Which of the following is true about Dynamic ARP Inspection (DAI) employed in a network switch? (Choose 3 best answers)"
     */
    public void question_5() {
        // Figure out if the user chose "Intercept and examine all ARP request and response packets in a subnet and discard packets with invalid IP-to-MAC address bindings" answer
        CheckBox Answer_5_1_CheckBox = (CheckBox) findViewById(R.id.answer_5_1_checkbox);
        boolean hasAnswer_5_1_CheckBox = Answer_5_1_CheckBox.isChecked();

        if (hasAnswer_5_1_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "DAI can prevent common man-in-the-middle (MIM) attacks such as ARP cache poisoning" answer
        CheckBox Answer_5_3_CheckBox = (CheckBox) findViewById(R.id.answer_5_3_checkbox);
        boolean hasAnswer_5_3_CheckBox = Answer_5_3_CheckBox.isChecked();

        if (hasAnswer_5_3_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Prevents mis-configuration of client IP addresses" answer
        CheckBox Answer_5_4_CheckBox = (CheckBox) findViewById(R.id.answer_5_4_checkbox);
        boolean hasAnswer_5_4_CheckBox = Answer_5_4_CheckBox.isChecked();

        if (hasAnswer_5_4_CheckBox) {
            increment_score();
        }
    }

    /**
     * This method calculates the right score for edittext
     */

    public boolean question_6() {
        EditText et = (EditText) findViewById(R.id.question_7_edit_text);
        return et.getText().toString().equalsIgnoreCase(q7_answer);

        if (hasEditText) {
            increment_score();
        }


    }




    /**
     * This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view);
        testResultTextView.setText(result);
    }




    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;


    }

    private int decrement_score() {
        score = --score;
        return score;


    }
}
