package com.example.zetsubou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public int turno=0,letra=0;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) (findViewById(R.id.button1));
        button2=(Button) (findViewById(R.id.button2));
        button3=(Button) (findViewById(R.id.button3));
        button4=(Button) (findViewById(R.id.button4));
        button5=(Button) (findViewById(R.id.button5));
        button6=(Button) (findViewById(R.id.button6));
        button7=(Button) (findViewById(R.id.button7));
        button8=(Button) (findViewById(R.id.button8));
        button9=(Button) (findViewById(R.id.button9));

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);


    }
    public void onClick(View visitas){

        if(letra==0)
        {

        }

        //Jugador X
        if(turno ==0)
        {
            if(visitas.getId()==R.id.button1)
            {
                button1.setText("x");
                button1.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button2)
            {
                button2.setText("x");
                button2.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button3)
            {
                button3.setText("x");
                button3.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button4)
            {
                button4.setText("x");
                button4.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button5)
            {
                button5.setText("x");
                button5.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button6)
            {
                button6.setText("x");
                button6.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button7)
            {
                button7.setText("x");
                button7.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button8)
            {
                button8.setText("x");
                button8.setEnabled(false);
                turno++;
            }
            else if(visitas.getId()==R.id.button9)
            {
                button9.setText("x");
                button9.setEnabled(false);
                turno++;
            }
        }
        else if(turno==1)
        {
            if(visitas.getId()==R.id.button1)
            {
                button1.setText("O");
                button1.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button2)
            {
                button2.setText("O");
                button2.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button3)
            {
                button3.setText("O");
                button3.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button4)
            {
                button4.setText("O");
                button4.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button5)
            {
                button5.setText("O");
                button5.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button6)
            {
                button6.setText("O");
                button6.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button7)
            {
                button7.setText("O");
                button7.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button8)
            {
                button8.setText("O");
                button8.setEnabled(false);
                turno--;
            }
            else if(visitas.getId()==R.id.button9)
            {
                button9.setText("O");
                button9.setEnabled(false);
                turno--;
            }
        }
    }

    public void resus(){
        if(button1.getTag().toString().equals("x") && button2.getTag().toString().equals("x") && button3.getTag().toString().equals("x"))
        {

        }
        if(button1.getTag().toString().equals("x") && button4.getTag().toString().equals("x") && button7.getTag().toString().equals("x"))
        {

        }
        if(button1.getTag().toString().equals("x") && button5.getTag().toString().equals("x") && button9.getTag().toString().equals("x"))
        {

        }
        if(button9.getTag().toString().equals("x") && button8.getTag().toString().equals("x") && button7.getTag().toString().equals("x"))
        {

        }
        if(button9.getTag().toString().equals("x") && button6.getTag().toString().equals("x") && button3.getTag().toString().equals("x"))
        {

        }
    }
}