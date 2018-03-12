package com.zhangqie.andfixdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/****
 * 阿里 AndFix热修复
 */
public class MainActivity extends AppCompatActivity {


    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView(){
        textView = (TextView) findViewById(R.id.textview);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"bug未修复",Toast.LENGTH_LONG).show();
                textView.setText("bug未修复");
            }
        });
    }




}
