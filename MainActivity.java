package com.example.rahul.w3_intent_livstview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.rahul.w3_intent_livstview.utils.Utils.MSG_KEY_INTENT;
import static com.example.rahul.w3_intent_livstview.utils.Utils.NAME_KEY_INTENT;

public class MainActivity extends AppCompatActivity {
        EditText editText ,editText2;
        Button btn1;
        ListView listView;
        String[] myItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list_ma1) ;
        myItems=getResources().getStringArray(R.array.my_items);
        btn1=(Button)findViewById(R.id.bt1_ma1);
        btn1.setOnClickListener(new MyLstnr());
        editText=(EditText)findViewById(R.id.edittext_ma1);
        editText2=(EditText)findViewById(R.id.edittext1_ma1);

        ArrayAdapter<String> itemAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myItems);
        listView.setAdapter(itemAdapter);


//listView.setOnClickListener(new AdapterView.OnItemClickListener(){
//
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//
//    }
//});


    }

    public void showMap(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0.0?q=Montclair+State+University" +
                "   +New Jersey+USA"));
        startActivity(intent);
    }

    class MyLstnr implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra(MSG_KEY_INTENT, "Age is " + editText.getText());
            intent.putExtra(NAME_KEY_INTENT, "Name is " + editText2.getText());
            startActivity(intent);
        }
    }
}
