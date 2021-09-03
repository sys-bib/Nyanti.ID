package com.example.haditsarbain;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.haditsarbain.Helper.SqliteHelper;

public class DaftarUserActivity extends AppCompatActivity {

    private SqliteHelper sqliteHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_user);

        final EditText editUsername = findViewById(R.id.edit_text_username);
        final EditText editNama = findViewById(R.id.edit_text_nama);
        final EditText editPassword = findViewById(R.id.edit_text_pass);
        final EditText editConfirmPassword = findViewById(R.id.edit_text_c_pass);

        Button buttonRegistrasi = findViewById(R.id.btn_regis);

        buttonRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editUsername.getText().toString();
                String nama = editNama.getText().toString();
                String password = editPassword.getText().toString();
                String confirmPassword = editConfirmPassword.getText().toString();

                if(isInputValid(username, nama, password , confirmPassword)) {

                    long rowNum = sqliteHelper.insert(username, nama,password);

                    if(rowNum >= 0) {
                        Toast.makeText(DaftarUserActivity.this, "Registrasi Sukses", Toast.LENGTH_SHORT).show();
//                        Intent resultIntent = new Intent();
//                        resultIntent.putExtra(UserDatabase.FIELD_USER_NAME, username);
//                        resultIntent.putExtra(UserDatabase.FIELD_PASSWORD, password);
//                        setResult(Activity.RESULT_OK, resultIntent);
                        finish();
                    }
                    else {
                        Toast.makeText(DaftarUserActivity.this, "Registrasi Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        sqliteHelper = new SqliteHelper(DaftarUserActivity.this);
        sqliteHelper.open();

//

    }

    private boolean isInputValid(String username, String nama, String password, String confirmPassword) {

        if(TextUtils.isEmpty(username)) {
            Toast.makeText(this, "Username tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(TextUtils.isEmpty(nama)) {
            Toast.makeText(this, "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(TextUtils.isEmpty(password) || !password.equals(confirmPassword)) {
            Toast.makeText(this, "Password tidak boleh kosong atau konfirmasi password salah", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}
