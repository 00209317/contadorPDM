package com.example.cartapresentation;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button addBoton_action;
    private Button outBoton_action;
    private TextView numeroT;
    private int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBoton_action = findViewById(R.id.button_add);

        addBoton_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroT = findViewById(R.id.text_addn);
                numero = Integer.parseInt(numeroT.getText().toString()) + 1;
                numeroT.setText("" + numero);
            }
        });

        outBoton_action = findViewById(R.id.button_out);

        outBoton_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroT = findViewById(R.id.text_outn);
                numero = Integer.parseInt(numeroT.getText().toString()) + 1;
                numeroT.setText("" + numero);
            }
        });
    }
}