package com.example.activityandfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= (EditText) findViewById(R.id.editText);
        send= (Button) findViewById(R.id.send);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText.getText().toString();

                MyFragment myFragment=new MyFragment();

                Bundle bundle=new Bundle();

                bundle.putString("name",text);

                myFragment.setArguments(bundle);

                FragmentManager fragmentManager=getSupportFragmentManager();

                FragmentTransaction transaction=fragmentManager.beginTransaction();

                transaction.add(R.id.layout,myFragment,"myFragment");

                transaction.commit();

                Toast.makeText(MainActivity.this, "发送消息:" +text, Toast.LENGTH_SHORT).show();






            }
        });







    }
}
