package rakesh.app.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView googleImage,facebookImage,twitterImage;
    Button signUpPageBtn;
    TextView loginPageBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        googleImage = findViewById(R.id.googleImg);
        facebookImage = findViewById(R.id.facebookImg);
        twitterImage = findViewById(R.id.twitterImg);

        signUpPageBtn = findViewById(R.id.SignUpBtn);
        loginPageBtn = findViewById(R.id.amLoginPageBtn);


        signUpPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SignUpPage.class));

            }
        });

        loginPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(getApplicationContext(), "hii", Toast.LENGTH_SHORT).show();
               startActivity(new Intent(getApplicationContext(), TheLoginPage.class));
            }
        });

    }
}