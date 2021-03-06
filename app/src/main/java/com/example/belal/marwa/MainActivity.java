package com.example.belal.marwa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=0;
    // Method called when the order button is clickec.
    public void submitOrder(View view){
        display(quantity);
        displayPrice(quantity*5);
    }
    public void display(int number){
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity );
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    public void increment (View view){
        quantity+=1;
        display(quantity);
    }
    public void decrement (View view){
        quantity -=1;
        display(quantity);
    }
}
