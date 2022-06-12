package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    private TextView timer,o11,o12,o21,o22,o31,o32,o41,o42,o51,o52,ans1,ans2,ans3,ans4,ans5;
    private TextView id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
    private ProgressBar progressBar;
    private int i=0,totalSecond=0,indi=1,nonTimerind=1;
    private Dialog dialog;
    private String selectedOption="";
    private Button submitBtn;
    private int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,time=1;
    private Float  ea1,ea2,ea3,ea4,ea5,totalScore=0F;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        o11=findViewById(R.id.o11);
        o12=findViewById(R.id.o12);
        o21=findViewById(R.id.o21);
        o22=findViewById(R.id.o22);
        o31=findViewById(R.id.o31);
        o32=findViewById(R.id.o32);
        o41=findViewById(R.id.o41);
        o42=findViewById(R.id.o42);
        o51=findViewById(R.id.o51);
        o52=findViewById(R.id.o52);
        ans1=findViewById(R.id.answer1);
        ans2=findViewById(R.id.answer2);
        ans3=findViewById(R.id.answer3);
        ans4=findViewById(R.id.answer4);
        ans5=findViewById(R.id.answer5);
        id1=findViewById(R.id.id1);
        id2=findViewById(R.id.id2);
        id3=findViewById(R.id.id3);
        id4=findViewById(R.id.id4);
        id5=findViewById(R.id.id5);
        id6=findViewById(R.id.id6);
        id7=findViewById(R.id.id7);
        id8=findViewById(R.id.id8);
        id9=findViewById(R.id.id9);
        id10=findViewById(R.id.id10);

        progressBar=findViewById(R.id.progressbar);
        timer=findViewById(R.id.timer);
        submitBtn=findViewById(R.id.submitBtn);

        userInputSeconds();

        fillTheOption();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time=0;
                scoreDeclare();

            }
        });

        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id1.getText().toString().equals("")) {
                    removeColor(1);
                    selectedOption = "1";
                    id1.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id2.getText().toString().equals("")) {
                    removeColor(2);
                    selectedOption = "2";
                    id2.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id3.getText().toString().equals("")) {
                    removeColor(3);
                    selectedOption = "3";
                    id3.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id4.getText().toString().equals("")) {
                    removeColor(4);
                    selectedOption = "4";
                    id4.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id5.getText().toString().equals("")) {
                    removeColor(5);
                    selectedOption = "5";
                    id5.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id6.getText().toString().equals("")) {
                    removeColor(6);
                    selectedOption = "6";
                    id6.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id7.getText().toString().equals("")) {
                    removeColor(7);
                    selectedOption = "7";
                    id7.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id8.getText().toString().equals("")) {
                    removeColor(8);
                    selectedOption = "8";
                    id8.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id9.getText().toString().equals("")) {
                    removeColor(9);
                    selectedOption = "9";
                    id9.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });
        id10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!id10.getText().toString().equals("")) {
                    removeColor(10);
                    selectedOption = "10";
                    id10.setBackgroundResource(R.drawable.button_highlite);
                }
            }
        });

        o11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(!o11.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o11.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o11.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }

                if(selectedOption.equals("1")){
                    o11.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o11.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o11.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                  else if (selectedOption.equals("4")){
                    o11.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                  else if (selectedOption.equals("5")){
                    o11.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                  else if (selectedOption.equals("6")){
                    o11.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                  else if (selectedOption.equals("7")){
                    o11.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                }
                  else if (selectedOption.equals("8")){
                    o11.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                  else if (selectedOption.equals("9")){
                    o11.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o11.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }



            }
        });
        o12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o12.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o12.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o12.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }

                if(selectedOption.equals("1")){
                    o12.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o12.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o12.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o12.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o12.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o12.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o12.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o12.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o12.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o12.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        o21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o21.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o21.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o21.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }


                if(selectedOption.equals("1")){
                    o21.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o21.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o21.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o21.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o21.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o21.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o21.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o21.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o21.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o21.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }

            }
        });

        o22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o22.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o22.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o22.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }



                if(selectedOption.equals("1")){
                    o22.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o22.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o22.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o22.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o22.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o22.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o22.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o22.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o22.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o22.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        o31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o31.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o31.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o31.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }


                if(selectedOption.equals("1")){
                    o31.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o31.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o31.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o31.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o31.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o31.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o31.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o31.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o31.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o31.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        o32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o32.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o32.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o32.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }


                if(selectedOption.equals("1")){
                    o32.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o32.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o32.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o32.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o32.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o32.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o32.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o32.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o32.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o32.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        o41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o41.getText().toString().equals("")  && !selectedOption.equals("")){
                    if(o41.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o41.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }


                if(selectedOption.equals("1")){
                    o41.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o41.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o41.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o41.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o41.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o41.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o41.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o41.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o41.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o41.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        o42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o42.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o42.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o42.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }


                if(selectedOption.equals("1")){
                    o42.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";

                }
                else if (selectedOption.equals("2")){
                    o42.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o42.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o42.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o42.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o42.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o42.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o42.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o42.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o42.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        o51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o51.getText().toString().equals("") && !selectedOption.equals("")) {
                    if(o51.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o51.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }


                if(selectedOption.equals("1")){
                    o51.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o51.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o51.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o51.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o51.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o51.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o51.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o51.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o51.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o51.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        o52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!o52.getText().toString().equals("") && !selectedOption.equals("")){
                    if(o52.getText().toString().equals(String.valueOf(n1))){
                        id7.setText(String.valueOf(n1));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n2))){
                        id4.setText(String.valueOf(n2));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n3))){
                        id1.setText(String.valueOf(n3));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n4))){
                        id9.setText(String.valueOf(n4));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n5))){
                        id3.setText(String.valueOf(n5));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n6))){
                        id10.setText(String.valueOf(n6));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n7))){
                        id2.setText(String.valueOf(n7));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n8))){
                        id6.setText(String.valueOf(n8));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n9))){
                        id5.setText(String.valueOf(n9));
                    }
                    else if(o52.getText().toString().equals(String.valueOf(n10))){
                        id8.setText(String.valueOf(n10));
                    }
                }

                if(selectedOption.equals("1")){
                    o52.setText(String.valueOf(n3));
                    id1.setText("");
                    id1.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("2")){
                    o52.setText(String.valueOf(n7));
                    id2.setText("");
                    id2.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("3")){
                    o52.setText(String.valueOf(n5));
                    id3.setText("");
                    id3.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("4")){
                    o52.setText(String.valueOf(n2));
                    id4.setText("");
                    id4.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("5")){
                    o52.setText(String.valueOf(n9));
                    id5.setText("");
                    id5.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("6")){
                    o52.setText(String.valueOf(n8));
                    id6.setText("");
                    id6.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("7")){
                    o52.setText(String.valueOf(n1));
                    id7.setText("");
                    id7.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("8")){
                    o52.setText(String.valueOf(n10));
                    id8.setText("");
                    id8.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("9")){
                    o52.setText(String.valueOf(n4));
                    id9.setText("");
                    id9.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else if (selectedOption.equals("10")){
                    o52.setText(String.valueOf(n6));
                    id10.setText("");
                    id10.setBackgroundResource(R.drawable.button_bacground);
                    selectedOption="";
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select a Number..", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void fillTheOption(){

        n1= randomNumberGenerate();
        id7.setText(String.valueOf(n1));
        n2= randomNumberGenerate();
        id4.setText(String.valueOf(n2));
        ea1=Float.valueOf(n1+n2);
        ans1.setText(String.valueOf(ea1));


        n3= randomNumberGenerate();
        id1.setText(String.valueOf(n3));
        n4= randomNumberGenerate();
        id9.setText(String.valueOf(n4));
        ea2=Float.valueOf(n3-n4);
        ans2.setText(String.valueOf(ea2));


        n5= randomNumberGenerate();
        id3.setText(String.valueOf(n5));
        n6= randomNumberGenerate();
        id10.setText(String.valueOf(n6));
        ea3=Float.valueOf(n5*n6);
        ans3.setText(String.valueOf(ea3));

        n7= randomNumberGenerate();
        n8= randomNumberGenerate();

        while(n7<n8){
            n7= randomNumberGenerate();
            n8= randomNumberGenerate();
        }

        id2.setText(String.valueOf(n7));
        id6.setText(String.valueOf(n8));
        ea4=Float.valueOf(n7/n8);
        ans4.setText(String.valueOf(ea4));


        n9= randomNumberGenerate();
        id5.setText(String.valueOf(n9));
        n10= randomNumberGenerate();
        id8.setText(String.valueOf(n10));
        ea5=Float.valueOf(n9%n10);
        ans5.setText(String.valueOf(ea5));

    }


    private void removeColor(int c) {
        if(c==1){
            String blank = "#FFFFFF";
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);


        }
        else if(c==2){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);

        }
        else if(c==3){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);

        }
        else if(c==4){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);

        }
        else if(c==5){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);

        }
        else if(c==6){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);
        }
        else if(c==7){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);

        }
        else if(c==8){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);
        }
        else if(c==9){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id10.setBackgroundResource(R.drawable.button_bacground);
        }
        else if(c==10){
            String blank = "#FFFFFF";
            id1.setBackgroundResource(R.drawable.button_bacground);
            id2.setBackgroundResource(R.drawable.button_bacground);
            id3.setBackgroundResource(R.drawable.button_bacground);
            id4.setBackgroundResource(R.drawable.button_bacground);
            id5.setBackgroundResource(R.drawable.button_bacground);
            id6.setBackgroundResource(R.drawable.button_bacground);
            id7.setBackgroundResource(R.drawable.button_bacground);
            id8.setBackgroundResource(R.drawable.button_bacground);
            id9.setBackgroundResource(R.drawable.button_bacground);
        }


    }

    private void scoreDeclare(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.score);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.alert_dilog_background));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setLayout(ViewGroup.MarginLayoutParams.WRAP_CONTENT,ViewGroup.MarginLayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        Button Okay = dialog.findViewById(R.id.score_btn_okay);
        TextView score=dialog.findViewById(R.id.score);

        ImageView quesImage1=dialog.findViewById(R.id.quesImage1);
        ImageView quesImage2=dialog.findViewById(R.id.quesImage2);
        ImageView quesImage3=dialog.findViewById(R.id.quesImage3);
        ImageView quesImage4=dialog.findViewById(R.id.quesImage4);
        ImageView quesImage5=dialog.findViewById(R.id.quesImage5);
        ImageView image1=dialog.findViewById(R.id.image1);
        ImageView image2=dialog.findViewById(R.id.image2);

        if(!o11.getText().toString().equals("") && !o12.getText().toString().equals("")){
            int a1 = Integer.parseInt(o11.getText().toString());
            int a2=Integer.parseInt(o12.getText().toString());

            if(a1+a2==ea1){
                totalScore+=2;
                quesImage1.setImageResource(R.drawable.correct_tick);
             }

        }

        if(!o21.getText().toString().equals("") && !o22.getText().toString().equals("")){
            int a3=Integer.parseInt(o21.getText().toString());
            int a4=Integer.parseInt(o22.getText().toString());

            if(a3-a4==ea2){
                totalScore+=2;
                quesImage2.setImageResource(R.drawable.correct_tick);
            }
        }

        if(!o31.getText().toString().equals("") && !o32.getText().toString().equals("")){
            int a5=Integer.parseInt(o31.getText().toString());
            int a6=Integer.parseInt(o32.getText().toString());

            if(a5*a6==ea3){
                totalScore+=2;
                quesImage3.setImageResource(R.drawable.correct_tick);
            }

        }

        if(!o41.getText().toString().equals("") && !o42.getText().toString().equals("")){
            int a7=Integer.parseInt(o41.getText().toString());
            int a8=Integer.parseInt(o42.getText().toString());

            if(a7/a8==ea4){
                totalScore+=2;
                quesImage4.setImageResource(R.drawable.correct_tick);
            }
        }

        if(!o51.getText().toString().equals("") && !o52.getText().toString().equals("")){
            int a9=Integer.parseInt(o51.getText().toString());
            int a10=Integer.parseInt(o52.getText().toString());

            if(a9%a10==ea5){
                totalScore+=2;
                quesImage5.setImageResource(R.drawable.correct_tick);
            }

        }

        if(totalSecond!=0){
            if(i-20>0){
                totalScore=totalScore-(i-20)*0.2f;
            }
        }
        if(totalScore>=8.0){
            image1.setVisibility(View.VISIBLE);
            image2.setVisibility(View.VISIBLE);
        }

        score.setText(String.valueOf(totalScore)+"/10");

        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                startActivity(new Intent(MainActivity.this,MainActivity.class));

            }
        });
        dialog.show();
    }


    private void userInputSeconds(){
       dialog = new Dialog(this);
       dialog.setContentView(R.layout.custom_dilog_layout);
       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
           dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.alert_dilog_background));
       }
       dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
       dialog.getWindow().setLayout(ViewGroup.MarginLayoutParams.WRAP_CONTENT,ViewGroup.MarginLayoutParams.WRAP_CONTENT);
       dialog.setCancelable(false); //Optional
       dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

       Button Okay = dialog.findViewById(R.id.btn_okay);


       EditText userInputSecond=dialog.findViewById(R.id.userInputSeconds);
        RadioGroup radioGroup=dialog.findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton genderradioButton = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());


                if(genderradioButton.getText().toString().equals(" Timer")){
                    userInputSecond.setVisibility(View.VISIBLE);
                    nonTimerind=0;

                }
                else{
                    userInputSecond.setVisibility(View.GONE);
                    nonTimerind=1;
                }

            }
        });




       Okay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


                   if (!userInputSecond.getText().toString().isEmpty()) {
                       timer.setVisibility(View.VISIBLE);
                       progressBar.setVisibility(View.VISIBLE);
                       int a = Integer.parseInt(userInputSecond.getText().toString());
                       totalSecond = Integer.parseInt(userInputSecond.getText().toString());
                       new CountDownTimer(a * 1000, 1000) {
                           public void onTick(long millisUntilFinished) {

                               i += 1;

                               if (time == 0) {
                                   this.cancel();
                               }

                               NumberFormat f = new DecimalFormat("00");
                               long min = (millisUntilFinished / 60000) % 60;
                               long second = (millisUntilFinished / 1000) % 60;
                               timer.setText(f.format(min) + ":" + f.format(second));
                               progressBar.setProgress(i * 100 / (a * 1000 / 1000));
                           }

                           public void onFinish() {
                               timer.setText("00:00");
                               Toast.makeText(MainActivity.this, "Time Over...!!", Toast.LENGTH_SHORT).show();
                               scoreDeclare();

                           }
                       }.start();

                       dialog.dismiss();
                   }
                   else
                       userInputSecond.setError("Enter second");

               if (userInputSecond.getText().toString().isEmpty() && nonTimerind==1){
                   dialog.dismiss();
               }




           }
       });
       dialog.show();
   }

    private int randomNumberGenerate(){

        int random = new Random().nextInt((11 - 1) + 1) + 1;

        return random;
    }


}