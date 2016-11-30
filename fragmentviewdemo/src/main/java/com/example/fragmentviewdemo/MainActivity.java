package com.example.fragmentviewdemo;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import fragment.Fragment1;
import fragment.Fragment2;
import fragment.Fragment3;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;   //指示器
    int bitWidth;                       //图片宽度
    int offset = 0;                    //偏移量
    int tabIndex = 0;               //全局index,用以标示当前的index
    TextView textView1, textView2, textView3;


    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitImageView();
        InitTextView();
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        //开启事物，添加第一个fragment
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment1);
        fragmentTransaction.commit();


        fragmentManager
                .removeOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {


                    @Override
                    public void onBackStackChanged() {
// TODO Auto-generated method stub


                    }
                });
    }




    //初始化指示器，获取平均偏移量
    private void InitImageView() {
        imageView = (ImageView) findViewById(R.id.cursor);
        bitWidth = BitmapFactory.decodeResource(getResources(), R.mipmap.z1)
                .getWidth();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenW = displayMetrics.widthPixels;

        //平均偏移量
        offset = (screenW / 3 - bitWidth) / 2;
        Matrix matrix = new Matrix();
        matrix.postTranslate(offset, 0);
        imageView.setImageMatrix(matrix);
    }

    //初始化
    private void InitTextView() {
        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);
        textView3 = (TextView) findViewById(R.id.text3);
        textView1.setOnClickListener(new MyOnClickListener(0));
        textView2.setOnClickListener(new MyOnClickListener(1));
        textView3.setOnClickListener(new MyOnClickListener(2));
    }


    class MyOnClickListener implements View.OnClickListener {


        int index;  //保存点击时传入的index

        public MyOnClickListener(int index) {
            this.index = index;
        }


        @Override
        public void onClick(View v) {
// TODO Auto-generated method stub


            fragmentTransaction = fragmentManager.beginTransaction();
            switch (v.getId()) {
                case R.id.text1:

                    fragmentTransaction.replace(R.id.content, fragment1);
                    break;
                case R.id.text2:
                    fragmentTransaction.replace(R.id.content, fragment2);
                    break;
                case R.id.text3:
                    fragmentTransaction.replace(R.id.content, fragment3);
                    break;
                default:
                    break;
            }


            if(index != tabIndex){
                fragmentTransaction.commit();
            }

            Animation animation = new TranslateAnimation(offset* tabIndex, offset
                    * index, 0, 0);
            tabIndex = index;   //保存当前index
            animation.setFillAfter(true);
            animation.setDuration(300);
            imageView.startAnimation(animation);



        }


    }


}
