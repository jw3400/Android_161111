package com.example.a403.choijinwon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1; //버튼 하나로만 인식을 해줌

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button); //id의 이름이 button인 button만 인식을 하게됨.
        b1.setOnClickListener(new View.OnClickListener() {  //Listerner를 객체화해서 구현 선언함.
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕하세요", Toast.LENGTH_SHORT).show();
                //Toast는 메시지 창을 띄우는 명령어이며, 길게 줄거면 Length_long, 짧게 줄거면 Length_short를 지정해준다.
            }
        });

    }
}
