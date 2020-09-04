package com.example.hooklogin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText setPackageName = null;
    SharedPreferences sharedPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button okButton = findViewById(R.id.okButton);
//        setPackageName = findViewById(R.id.setPackageName);
//        sharedPreferences = this.getSharedPreferences("ssss", Context.MODE_PRIVATE);
//        sharedPreferences.getString("name", "无内容");
//        Toast.makeText(MyApplication.getAppContext(),
//                sharedPreferences.getString("name", "无内容"), Toast.LENGTH_LONG).show();
//        okButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!TextUtils.isEmpty(setPackageName.getText().toString())) {
//                    MyApplication.pageName = setPackageName.getText().toString();
//                    sharedPreferences.edit().putString("name", MyApplication.pageName).commit();
//
//                }
//            }
//        });

    }
}

