package rakesh.app.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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
        //checking



    }
}