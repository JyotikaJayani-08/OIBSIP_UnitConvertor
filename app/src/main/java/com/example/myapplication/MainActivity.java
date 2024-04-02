package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
           private TextView unitConvertorTextView,enterAmountTextView,unitAmountEditText,inGramsTextView;
//           private TextView textView;
           private EditText editText;
           private Button convertbutton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView unitConverterTextView = findViewById(R.id.unitConverterTextView);
        TextView enterAmountTextView = findViewById(R.id.enterAmountTextView);
        TextView inGramsTextView = findViewById(R.id.inGramsTextView);
        EditText unitAmountEditText = findViewById(R.id.unitAmountEditText);
        Button convertButton = findViewById(R.id.convertButton);
        editText = findViewById(R.id.unitAmountEditText);
        convertButton = findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view){
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double grams = 1000 * kg;
                inGramsTextView.setText("The value of grams is "+grams );

            }
        });

        }
    }
