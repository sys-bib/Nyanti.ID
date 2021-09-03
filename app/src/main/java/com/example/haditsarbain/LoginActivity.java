package com.example.haditsarbain;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.haditsarbain.Database.UserDatabase;
import com.example.haditsarbain.Helper.SqliteHelper;

public class LoginActivity extends AppCompatActivity {

    private Button btnDaftar;
    private Button btnLogin;


    private SqliteHelper sqliteHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnDaftar = (Button) findViewById(R.id.btn_daftar);
        btnLogin = (Button) findViewById(R.id.btn_login);
        final EditText editUsername = (EditText) findViewById(R.id.usernameText);
        final EditText editPassword = (EditText) findViewById(R.id.passwordText);

        sqliteHelper = new SqliteHelper(LoginActivity.this);
        sqliteHelper.open();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();
                if (isLoginValid(username, password)) {
                    doLogin(username, password);
                }
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DaftarUserActivity.class);
//                intent.putExtra(DaftarUserActivity.formtype, DaftarUserActivity.FORM_INPUT);
                startActivityForResult(intent, 0);
            }
        });

    }



    private void doLogin(String username, String password) {
        if(sqliteHelper.login(username, password)) {
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Username atau password salah!", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean isLoginValid(String username, String password) {
        if (TextUtils.isEmpty(username)) {
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            return false;
        }
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sqliteHelper.close();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 0) {
            if(resultCode == RESULT_OK) {
                String username = data.getStringExtra(UserDatabase.FIELD_USER_NAME);
                String password = data.getStringExtra(UserDatabase.FIELD_PASSWORD);
                doLogin(username, password);
            }
        }
        RefreshData();
    }

    public void RefreshData() {

        btnDaftar = (Button) findViewById(R.id.btn_daftar);
        sqliteHelper = new SqliteHelper(LoginActivity.this);
        sqliteHelper.open();

    }
}