package com.deep.park;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 외부 클래스
public class MainActivity extends AppCompatActivity {

    // onclick말고도
    // 내부 클래스
    // 익명 클래스
    // 이 두개로 이벤트 처리 가능

/*
for fourthweek
 */
//    TextView titletxt, txtv, finaltxt;
//    EditText editt;
//    Button leftbtn, rightbtn, underbtn, submitbtn, finalbtn;
//    Boolean tog = false;

/*
for fifthweek
 */
//    Button countBtn, resetBtn, changeBtn, ameBtn, cappuBtn, cafeBtn;
////    ImageButton naverBtn;
//    ImageView imgView;
//    TextView countTxt, selectionTxt;
//    boolean isNaver = true;

/*
for sixthweek
 */
//    Button ameBtn, cafeBtn, cappuBtn, resetbtn;
//    ImageView coffeeImg;
//    TextView descTxt, priceTxt;

/*
for seventhweek
 */

    EditText temperEdit;
    RadioButton celsiusRd, fahRd;
    Button conversionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // main 함수
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventhweek);  // R.~~ = res.layout.activity_main

    /*
    in fourthweek.xml
     */
        // set event handler to rightbtn
//        rightbtn = (Button) findViewById(R.id.RightBtn);
//
////        rightbtn.setOnClickListener(new EventR()); // by using inner class
//
//        rightbtn.setOnClickListener(new View.OnClickListener() {  // by using anonymous class
//            @Override
//            public void onClick(View v) {
//                String t = rightbtn.getText().toString();
//                Toast.makeText(getApplicationContext(), t, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // undder button and
//        underbtn = (Button) findViewById(R.id.UnderBtn);
//        txtv = (TextView) findViewById(R.id.UnderTxtV);
//
//        underbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (tog) {
//                    txtv.setText("Click upper " + underbtn.getText().toString() + "!");
//                    tog = false;
//                } else {
//                    txtv.setText("Oh you Clicked?");
//                    tog = true;
//                }
//
//            }
//        });
//
//        // edittext and submit button -> change title textview's text with user entered word.
//        titletxt = (TextView) findViewById(R.id.titleText);
//        editt = (EditText) findViewById(R.id.EditTxt);
//        submitbtn = (Button) findViewById(R.id.SubmitBtn);
//        submitbtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                titletxt.setText(editt.getText().toString());
//            }
//        });
//
//        // final overview
//        finaltxt = (TextView) findViewById(R.id.FinalText);
//        finalbtn = (Button) findViewById(R.id.FinalBtn);
//        finalbtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Random rand = new Random();
//                int r = rand.nextInt(256);
//                int g = rand.nextInt(256);
//                int b = rand.nextInt(256);
//                String color = String.format("#%02x%02x%02x", r, g, b);
//                finaltxt.setBackgroundColor(Color.parseColor(color));
//                finaltxt.setText(String.format("(%d, %d, %d)", r, g, b));
//
//            }
//        });

    /*
    in fifthweek.xml
     */

//        // first layout
//        countBtn = (Button) findViewById(R.id.countBtn);
//        resetBtn = (Button) findViewById(R.id.resetBtn);
//        countTxt = (TextView) findViewById(R.id.countText);
//
//        countBtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                countTxt.setText((Integer.parseInt((String) countTxt.getText()) + 1) + "");
//            }
//        });
//
//        resetBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                countTxt.setText(0 + "");
//            }
//        });
//
//
//        // second layout
//        changeBtn = (Button) findViewById(R.id.changeBtn);
////        naverBtn = (ImageButton) findViewById(R.id.naverBtn);
//        imgView = (ImageView) findViewById(R.id.imgView);
//
//        changeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Random r = new Random();
//                int image;
//                image = r.nextInt(3);
//                switch(image){
//                    case 0:
//                        imgView.setImageResource(R.drawable.naver);
//                        imgView.setRotation((imgView.getRotation() + 10) % 360);
//                        break;
//                    case 1:
//                        imgView.setImageResource(R.drawable.kakao);
//                        imgView.setRotation((imgView.getRotation() + 10) % 360);
//                        break;
//                    case 2:
//                        imgView.setImageResource(R.drawable.baemin);
//                        imgView.setRotation((imgView.getRotation() + 10) % 360);
//                        break;
//                }
//
////                if (isNaver) {
////                    imgView.setImageResource(R.drawable.kakao);
////                } else {
////                    imgView.setImageResource(R.drawable.naver);
////                }
////                isNaver = !isNaver;
//            }
//        });
//
//        //final
//        ameBtn = (Button) findViewById(R.id.topBtn);
//        cappuBtn = (Button) findViewById(R.id.middleBtn);
//        cafeBtn = (Button) findViewById(R.id.bottomBtn);
//        selectionTxt = (TextView) findViewById(R.id.selectionView);
//
//        ameBtn.setOnClickListener(new VendingMachine());
//        cappuBtn.setOnClickListener(new VendingMachine());
//        cafeBtn.setOnClickListener(new VendingMachine());

    /*
    in sixthweek.xml
     */
        // button
//        ameBtn = (Button) findViewById(R.id.coffee1);
//        cafeBtn = (Button) findViewById(R.id.coffee2);
//        cappuBtn = (Button) findViewById(R.id.coffee3);
//        resetbtn = (Button) findViewById(R.id.resetBtn);
//        // img view
//        coffeeImg = (ImageView) findViewById(R.id.coffeeImg);
//        // txt view
//        descTxt = (TextView) findViewById(R.id.descTxt);
//        priceTxt = (TextView) findViewById(R.id.totPriceTxt);

    /*
    in seventhweek.xml
     */

        temperEdit = (EditText) findViewById(R.id.temperatureEdit);
        celsiusRd = (RadioButton) findViewById(R.id.celsiusRdo);
        fahRd = (RadioButton) findViewById(R.id.fahRdo);
        conversionBtn = (Button) findViewById(R.id.conversionBtn);
    }

/*
week 3
*/

//    public void onClickCallBtn(View v) {
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-1234"));
//        startActivity(intent);
//    }
//
//    public void onClickNaver(View v) {
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
//        startActivity(intent);
//    }
//
//    public void onClickSwitchToSecond(View v) {
//        Toast.makeText(getApplicationContext(), "집에 가자", Toast.LENGTH_SHORT).show();  // toast message
//        // makeText(현재 애플리케이션의 context를 의미, 출력 내용, duration(지속시간))
//        setContentView(R.layout.second);
//    }


/*
week 4 (in fourthweek)
 */

//    // left button using onclick
//    public void onLeftBtnClick(View v) {
//        leftbtn = (Button) findViewById(R.id.LeftBtn);
//        String t = leftbtn.getText().toString();
//        Toast.makeText(getApplicationContext(), t + "clicked!", Toast.LENGTH_SHORT).show();
//    }
//
//    // right button event handling using inner class
//    // Event handling by using inner class
//    // ~~Listener는 모두 interface임
//    class EventR implements View.OnClickListener {
//        @Override
//        public void onClick(View v) {
//            // initialize and set listener to rightbutton in onCreate method.
//            // button.get~~ => get button's information (attributes)
//            String t = rightbtn.getText().toString();
//            // button.set~~ => set button's attributes (background, text, etc...)
//            Toast.makeText(getApplicationContext(), t + "clicked!", Toast.LENGTH_SHORT).show();
//
//            Boolean tog = false;
//            if (tog){
//                rightbtn.setText("Clicked");
//                tog = false;
//            } else {
//                rightbtn.setText("Button2");
//                tog = true;
//            }
//        }
//    }

/*
week 5
 */

//    class VendingMachine implements View.OnClickListener {
//        @Override
//        public void onClick(View v) {
//            Button btn = (Button) findViewById(v.getId());
////            System.out.println(btn.getText());
//            selectionTxt.setText("ordered " + btn.getText());
//        }
//    }

/*
week 6
 */

//    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})  // disable warning
//    public void coffeeBtnEventListener(View view){
//        Long totPrice = Long.parseLong((priceTxt.getText() + "").split("￦")[0]);  // price view의 텍스트 부분을 가져와 단위를 지운 후 long으로 형변환.
////        descTxt.setText(view.getId() + "");
////        Toast.makeText(getApplicationContext(), ((Button) findViewById(view.getId())).getText() + "", Toast.LENGTH_SHORT).show();
////        String coffee = ((Button) findViewById(view.getId())).getText() + "";  // btn texts
//        // 디자인은 무채색, 색상 3, 4개 돌려쓰기
//        switch (view.getId()) {
//            case R.id.coffee1:
//                coffeeImg.setImageResource(R.drawable.americano);
//                descTxt.setText("Caffè Americano is a type of coffee drink prepared by diluting an " +
//                        "espresso with hot water, giving it a similar strength to, " +
//                        "but different flavor from, traditionally brewed coffee.");
//                priceTxt.setText(totPrice + 700L + "￦");
//                break;
//            case R.id.coffee2:
//                coffeeImg.setImageResource(R.drawable.cafe_latte);
//                descTxt.setText("Caffè latte, often shortened to just latte in English, " +
//                        "is a coffee drink of Italian origin made with espresso and steamed milk.");
//                priceTxt.setText(totPrice + 1000L + "￦");
//                break;
//            case R.id.coffee3:
//                coffeeImg.setImageResource(R.drawable.cappuccino);
//                descTxt.setText("A cappuccino is an espresso-based coffee drink and is traditionally prepared with steamed milk foam.");
//                priceTxt.setText(totPrice + 1500L + "￦");
//                break;
//            case R.id.resetBtn:
//                coffeeImg.setImageResource(R.drawable.coffeemain);
//                descTxt.setText("Select Coffee Menu!");
//                priceTxt.setText("0￦");
//                break;
//        }
//    }

/*
week 7
 */
    public void convertTemper(View v){
        if(temperEdit.getText().length() == 0) {
            Toast.makeText(this, "Input temperature", Toast.LENGTH_SHORT).show();
            return;
        }

        double temperature = Double.parseDouble(temperEdit.getText().toString());  // get temperature

        if (celsiusRd.isChecked()) {  // check radio btns
            temperEdit.setText(fahToCelsius(temperature) + "");
            celsiusRd.setChecked(false);
            fahRd.setChecked(true);
        }else if (fahRd.isChecked()) {
            temperEdit.setText(celsiusToFah(temperature) + "");
            fahRd.setChecked(false);
            celsiusRd.setChecked(true);
        }else
            Toast.makeText(this, "check any radiobtn", Toast.LENGTH_SHORT).show();
    }

    public Double celsiusToFah(Double temperature){
        return (temperature * 9) / 5 + 32;
    }

    public Double fahToCelsius(Double temperature){
        return (temperature - 32) * 5 / 9;
    }

}