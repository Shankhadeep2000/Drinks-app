package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
int quantity = 2;
String priceMessage="Total";
EditText dash = (EditText) findViewById(R.id.name);
String value= dash.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void sendMessage(View view){
String priceMessage = value +"Total:" +   quantity * 5  +  "\n Thank You!";
CheckBox addwhipped= (CheckBox) findViewById(R.id.whipped);
boolean checked =addwhipped.isChecked();
priceMessage += "\n whipped cream added" + checked;

        EditText dash = (EditText) findViewById(R.id.name);
        String value= dash.getText().toString();
        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean sure = chocolate.isChecked();
        priceMessage+="\n chocolate chip added"+ sure;
displa(priceMessage,checked,value,sure);
    }


    //    private void displa(String , int number){
//        TextView quantityTextView=(TextView) findViewById(R.id.quantity_text_view);
//        quantityTextView.setText(" " +number);
//    }


    private void displa(String message,  boolean checked , String name,boolean sure) {
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(String.format("%s%s", message, checked,name,sure));
    }


    public void add(View view) {
quantity = quantity + 1;
        display(quantity);
    }
    private void display(int number){
        TextView quantityTextView=(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ number);

    }

    public void substrat(View view) {
        quantity = quantity -1;
        displayprice(quantity);
    }
    private void displayprice(int number){
        TextView quantityTextView=(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ number);
    }


    public void addWhipped(View view) {
        CheckBox whipped= (CheckBox) findViewById(R.id.whipped);
        boolean checked =whipped.isChecked();
        priceMessage += "\n whipped cream added" + checked;
    }

    public void chip(View view) {
        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean sure = chocolate.isChecked();
        priceMessage+="\n chocolate chip added"+ sure;
    }
}