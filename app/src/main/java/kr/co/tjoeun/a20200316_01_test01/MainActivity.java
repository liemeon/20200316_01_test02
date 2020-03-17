package kr.co.tjoeun.a20200316_01_test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    Button password = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginBtn = findViewById(R.id.ioginBtn);
        password = findViewById(R.id.password);

        loginBtn.setText("회원가입");
        password.setText("비밀번호를찾아랄");

    }
}
