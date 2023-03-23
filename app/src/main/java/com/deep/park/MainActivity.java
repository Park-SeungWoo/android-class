package com.deep.park;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 외부 클래스
public class MainActivity extends AppCompatActivity {

    // onclick말고도
    // 내부 클래스
    // 익명 클래스
    // 이 두개로 이벤트 처리 가능

    TextView titletxt, txtv;
    EditText editt;
    Button leftbtn, rightbtn, underbtn, submitbtn;
    Boolean tog = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // main 함수
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthweek);  // R.~~ = res.layout.activity_main

/*
in fourthweek.xml
 */
        // set event handler to rightbtn
        rightbtn = (Button) findViewById(R.id.RightBtn);

//        rightbtn.setOnClickListener(new EventR()); // by using inner class

        rightbtn.setOnClickListener(new View.OnClickListener() {  // by using anonymous class
            @Override
            public void onClick(View v) {
                String t = rightbtn.getText().toString();
                Toast.makeText(getApplicationContext(), t, Toast.LENGTH_SHORT).show();
            }
        });

        // undder button and
        underbtn = (Button) findViewById(R.id.UnderBtn);
        txtv = (TextView) findViewById(R.id.UnderTxtV);

        underbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tog) {
                    txtv.setText("Click upper " + underbtn.getText().toString() + "!");
                    tog = false;
                } else {
                    txtv.setText("Oh you Clicked?");
                    tog = true;
                }

            }
        });

        // edittext and submit button -> change title textview's text with user entered word.
        titletxt = (TextView) findViewById(R.id.titleText);
        editt = (EditText) findViewById(R.id.EditTxt);
        submitbtn = (Button) findViewById(R.id.SubmitBtn);
        submitbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                titletxt.setText(editt.getText().toString());
            }
        });
    }

/*
week 3
*/

    public void onClickCallBtn(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-1234"));
        startActivity(intent);
    }

    ;

    public void onClickNaver(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
        startActivity(intent);
    }

    public void onClickSwitchToSecond(View v) {
        Toast.makeText(getApplicationContext(), "집에 가자", Toast.LENGTH_SHORT).show();  // toast message
        // makeText(현재 애플리케이션의 context를 의미, 출력 내용, duration(지속시간))
        setContentView(R.layout.second);
    }


/*
week 4 (in fourthweek)
 */

    // left button using onclick
    public void onLeftBtnClick(View v) {
        leftbtn = (Button) findViewById(R.id.LeftBtn);
        String t = leftbtn.getText().toString();
        Toast.makeText(getApplicationContext(), t + "clicked!", Toast.LENGTH_SHORT).show();
    }

    // right button event handling using inner class
    // Event handling by using inner class
    // ~~Listener는 모두 interface임
    class EventR implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // initialize and set listener to rightbutton in onCreate method.
            // button.get~~ => get button's information (attributes)
            String t = rightbtn.getText().toString();
            // button.set~~ => set button's attributes (background, text, etc...)
            Toast.makeText(getApplicationContext(), t + "clicked!", Toast.LENGTH_SHORT).show();

            Boolean tog = false;
            if (tog){
                rightbtn.setText("Clicked");
                tog = false;
            } else {
                rightbtn.setText("Button2");
                tog = true;
            }
        }
    }

}