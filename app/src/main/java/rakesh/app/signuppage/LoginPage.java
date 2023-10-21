package rakesh.app.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText email, password;
    TextView signUpBtn;
    TextView googleImgBtn,facebookImgBtn,twitterImgBtn;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        signUpBtn = findViewById(R.id.alpSignUpBtn);
        email = findViewById(R.id.alpEmailText);
        password = findViewById(R.id.alpPasswordText);
        loginBtn = findViewById(R.id.alpLoginBtn);
        googleImgBtn.findViewById(R.id.alpGoogleImg);
//
//loginBtn.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        Login();
//    }
//});
//        signUpBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(),SignUpPage.class));
//            }
//        });
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