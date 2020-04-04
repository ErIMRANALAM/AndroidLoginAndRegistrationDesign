package in.imranalam.app.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserLoginActivity extends AppCompatActivity {

    TextView eRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        eRegister=findViewById(R.id.btn_register);
        eRegister.setOnClickListener(v -> {
            finish();
            Intent mIntent = new Intent(UserLoginActivity.this, UserRegistrationActivity.class);
            startActivity(mIntent);
        });
    }
}
