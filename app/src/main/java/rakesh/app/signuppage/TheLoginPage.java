package rakesh.app.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TheLoginPage extends AppCompatActivity {
    EditText email, password;
    TextView signUpBtn;
    ImageView googleImgBtn,facebookImgBtn,twitterImgBtn;

    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_login_page);
        
        signUpBtn = findViewById(R.id.atlpSignUpBtn);
        email = findViewById(R.id.atlpEmailText);
        password = findViewById(R.id.atlpPasswordText);
        loginBtn = findViewById(R.id.atlpLoginBtn);
        googleImgBtn = findViewById(R.id.atlpGoogleImg);
        facebookImgBtn = findViewById(R.id.atlpFacebookImg);
        twitterImgBtn = findViewById(R.id.atlpTwitterImg);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SignUpPage.class));
            }
        });
        googleImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login using google.", Toast.LENGTH_SHORT).show();
            }
        });
        facebookImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login using facebook.", Toast.LENGTH_SHORT).show();
            }
        });
        twitterImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login using twitter.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Login() {

        String emailStr, passwordStr;

        emailStr = email.getText().toString();
        passwordStr = password.getText().toString();
        if (TextUtils.isEmpty(emailStr)) {
            email.setError("Email cannot be empty.");
            email.requestFocus();
        } else if (TextUtils.isEmpty(passwordStr)) {
            password.setError("Password cannot be empty.");
            password.requestFocus();
        }else{

            Toast.makeText(getApplicationContext(),"Login Successfully.",Toast.LENGTH_LONG).show();
        }
    }
}