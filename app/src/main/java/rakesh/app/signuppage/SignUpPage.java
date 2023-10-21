package rakesh.app.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class SignUpPage extends AppCompatActivity {

    EditText firstName,lastName,email,password,confirmPassword;
    Button signUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        firstName = findViewById(R.id.firstNameText);
        lastName = findViewById(R.id.lastNameText);
        email = findViewById(R.id.emailText);
        password = findViewById(R.id.passwordText);
        confirmPassword = findViewById(R.id.confirmPasswordText);
        signUpBtn = findViewById(R.id.SignUpBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUP();
            }
        });

    }
    public void SignUP() {
        String firstNameStr, lastNameStr, emailStr, passwordStr, confirmPasswordStr;


        firstNameStr = firstName.getText().toString();
        lastNameStr = lastName.getText().toString();
        emailStr = email.getText().toString();
        passwordStr = password.getText().toString();
        confirmPasswordStr =confirmPassword.getText().toString();


        if (TextUtils.isEmpty(firstNameStr)) {
            firstName.setError("First name cannot be empty.");
            firstName.requestFocus();
        } else if (TextUtils.isEmpty(lastNameStr)) {
            lastName.setError("Last Name cannot be empty.");
            lastName.requestFocus();
        } else if (TextUtils.isEmpty(emailStr)) {
            email.setError("Please Enter your email.");
            email.requestFocus();
        } else if (TextUtils.isEmpty(passwordStr)) {
            password.setError("Please Enter your password.");
            password.requestFocus();
        }else if (TextUtils.isEmpty(confirmPasswordStr)) {
            confirmPassword.setError("Please confirm your password.");
            confirmPassword.requestFocus();
        }else {
            if(passwordStr.length()<8){
                password.setError("Password should be 8 character long...");
                password.requestFocus();
            }
            else if(!passwordStr.equals(confirmPasswordStr)){
                confirmPassword.setError("Password is not matching.");
                confirmPassword.requestFocus();

            }
            else if(!IsValidPassword(passwordStr) ){
                password.setError("Should be contain:\n1. One special character\n2. One Number\n3. One Capital letter");
                password.requestFocus();
            }
            else if(IsValidPassword(passwordStr) && passwordStr.length()>=8){
                Toast.makeText(getApplicationContext(),"Thanks for SignUp",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(),LoginPage.class));
            }
        }

    }

    private boolean IsValidPassword(String passwordStr) {
        // Regular expressions to check for '@' symbol, capital letter, and number
        String specialCharacterRegex = ".*[@#$%^&+=].*";
        String capitalLetterRegex = ".*[A-Z].*";
        String numberRegex = ".*\\d.*";

        // Check if the password meets the requirements

        return (Pattern.compile(specialCharacterRegex).matcher(passwordStr).matches() && Pattern.compile(capitalLetterRegex).matcher(passwordStr).matches() && Pattern.compile(numberRegex).matcher(passwordStr).matches());
    }
}