package com.example.rahul.w3_intent_livstview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.rahul.w3_intent_livstview.utils.Utils.MSG_KEY_INTENT;
import static com.example.rahul.w3_intent_livstview.utils.Utils.NAME_KEY_INTENT;

public class Main2Activity extends AppCompatActivity {

    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=(TextView)findViewById(R.id.tv1_ma1);
        tv2=(TextView)findViewById(R.id.tv2_ma1);

        tv1.setText(getIntent().getStringExtra(MSG_KEY_INTENT));
        tv2.setText(getIntent().getStringExtra(NAME_KEY_INTENT));
    }
}
