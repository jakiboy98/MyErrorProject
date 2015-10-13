package com.example.jwil9706.myerrorproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ErrorActivity extends ActionBarActivity
{

    private Bundle;
    private Button RedButton;
    private Button BlueButton;
    private EditText Text1;
    private EditText RightText;
    private EditText WrongText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        Text1 = (EditText) findViewById(R.id.Text1);
        RightText = (EditText) findViewById(R.id.RightText);
        WrongText = (EditText) findViewById(R.id.WrongText);
        RedButton = (Button) findViewById(R.id.RedButton);
        BlueButton = (Button) findViewById(R.id.BlueButton);
        setupListeners();
    }


    private void setupListeners()
    {
        RedButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonClickView)
            {
                if()
                {
                    RightText.setVisibility(View.INVISIBLE);
                }
                else
                {
                    WrongText.setVisibility(View.VISIBLE);
                }
            }
        });

        BlueButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonClickView)
            {
                if()
                {
                    RightText.setVisibility(View.VISIBLE);
                }
                else
                {
                    WrongText.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
