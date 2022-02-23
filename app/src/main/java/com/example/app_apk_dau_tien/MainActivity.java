package com.example.app_apk_dau_tien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    TextView txtNoidung;
//    Button BtnLogin;
//    Button BtnRandom;
//    EditText nameTxT;
//    ImageView logo;
//    Switch wifi;
//    CheckBox checkboxJS;
//    CheckBox checkBoxIOS;
//    CheckBox checkBoxAndroid;
//    Button submitBtn;
//    RadioButton lua_chon_1;
//    RadioButton lua_chon_2;
//    RadioButton lua_chon_3;
//    Button submitBtn;

    Button download;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
//        logo = findViewById(R.id.fbIcon);
//        wifi = findViewById(R.id.wifiSwitch);
//        checkboxJS = findViewById(R.id.checkboxJS);
//        checkBoxAndroid = findViewById(R.id.checkboxAndroid);
//        checkBoxIOS = findViewById(R.id.checkboxIOS);
//        submitBtn = findViewById(R.id.submitBtn);
//
//        lua_chon_1 = findViewById(R.id.line1);
//        lua_chon_2 = findViewById(R.id.line2);
//        lua_chon_3 = findViewById(R.id.line3);
//        submitBtn = findViewById(R.id.submitBtn);

        download = findViewById(R.id.download);
        progressBar = findViewById(R.id.progressBar);




    //Viết code
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = progressBar.getProgress();
                progressBar.setProgress(current + 10);
            }
        });

//            submitBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    String result = "Bạn đã lựa chọn: ";
//
//                    if(lua_chon_1.isChecked()){
//                        Toast.makeText(MainActivity.this, result += lua_chon_1.getText(), Toast.LENGTH_SHORT).show();
//                    }
//                    if(lua_chon_2.isChecked()){
//                        Toast.makeText(MainActivity.this, result += lua_chon_2.getText(), Toast.LENGTH_SHORT).show();
//                    }
//                    if(lua_chon_3.isChecked()){
//                        Toast.makeText(MainActivity.this, result += lua_chon_3.getText(), Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//            });

//        logo.setImageResource(R.drawable.ic_launcher_foreground);
//        wifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked) {
//                    Toast.makeText(MainActivity.this, "Mở Wifi", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Tắt Wifi", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        checkboxJS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    Toast.makeText(MainActivity.this, "Bạn đã click chọn JS", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        checkBoxAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    Toast.makeText(MainActivity.this, "Bạn đã click chọn android", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        checkBoxIOS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    Toast.makeText(MainActivity.this, "Bạn đã click chọn IOS", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        submitBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String feedback = "Bạn đã lựa chọn: \n";
//                if (checkboxJS.isChecked()){
//                    feedback += "JS\n";
//                }
//                if (checkBoxAndroid.isChecked()){
//                    feedback += "android\n";
//                }
//                if (checkBoxIOS.isChecked()){
//                    feedback += "IOS\n";
//                }
//                Toast.makeText(MainActivity.this, feedback, Toast.LENGTH_SHORT).show();
//            }
//        });



    }

}