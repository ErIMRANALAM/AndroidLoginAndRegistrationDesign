package in.imranalam.app.loginandregistration;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserRegistrationActivity extends AppCompatActivity {
    TextView eLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        eLogin = findViewById(R.id.btn_login);
        eLogin.setOnClickListener(v -> {
            finish();
            Intent mIntent = new Intent(UserRegistrationActivity.this, UserLoginActivity.class);
            startActivity(mIntent);
        });


    }
}
