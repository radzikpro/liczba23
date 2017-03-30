package com.example.bojko.radoslaw.liczba23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int liczba1 = 1;
    int liczba2 = 1;
    int wynik ;

    int zmienna = 0;

    double liczb1 = 1.67;
    double liczb2 = 2.67;
    double wynk;

    String tablica[];

    tablica = new String{"Kasia", "Marysia", "Zosia", "Agata"}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> huhuihihi = new ArrayList <String>();

        huhuihihiu.add(el.getText().toString);
        Log.d("Tablica : "huhuihihiu);

        wynik = liczba1 + liczba2;
        wynk = liczb1 + liczb2;


        int flaga = 0;

        String tekst= "Ala ma kota";

        Log.d("Wynik ;", String.valueOf(wynik));

        Log.e("test", "ala ma kota");

        TextView e1;

        e1 = (TextView) findViewById(R.id.textview);

        e1.setText (String.valueOf(wynik));

       for(int i=0; i<tablica.length; i++)
        if(flaga == 0)
        {
            Log.d("Jestem :", "Mężczyzną");
            flaga = 1;
            Log.d("Jestem :", "Kobieta");
            flaga = 0;
        }
        zmienna++;
    }
}
