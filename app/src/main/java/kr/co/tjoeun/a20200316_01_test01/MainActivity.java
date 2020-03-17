package kr.co.tjoeun.a20200316_01_test01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    Button findPwTxt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginBtn = findViewById(R.id.ioginBtn);
        findPwTxt = findViewById(R.id.findPwTxt);

        loginBtn.setText("회원가입");
        findPwTxt.setText("비밀번호를찾아랄");

       loginBtn.setOnClickListener(new OnClickListener(){


           @Override
           public void onClick(View v) {
               findPwTxt.setText("AAA");
           }
       });

       findPwTxt.setOnClickListener(new View.OnClickListener(){


           @Override
           public void onClick(View v) {
               findPwTxt.setText("비밀번호 찾기");
           }
       });

    }
}
