package com.example.fragmenttest;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import fragment.AnotherRightFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button:

                AnotherRightFragment fragment=new AnotherRightFragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();

                transaction.replace(R.id.right_layout,fragment);
                //这行代码就是当我们点击Back键后,程序返回的是上一个碎片,而不是程序直接退出,
                //原理:addToBackStack可以接受一个名字用于描述返回栈的状态，
                transaction.addToBackStack(null);
                transaction.commit();

                break;

           default:
               break;

        }

    }
}
