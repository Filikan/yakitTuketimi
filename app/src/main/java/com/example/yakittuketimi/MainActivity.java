package com.example.yakittuketimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double km,ltFiyat,ortTük;
    double ltHesap=0,fiyatHesap=0;
    String sonuc="";

    TextView tv;
    EditText etMesafe;
    EditText etOrtTuk;
    EditText etLitreFiyat;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        etMesafe = (EditText) findViewById(R.id.etMesafe);
        etOrtTuk = (EditText) findViewById(R.id.etOrtTuk);
        etLitreFiyat = (EditText) findViewById(R.id.etLitreFiyat);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                km = Double.valueOf(etMesafe.getText().toString());
                ortTük = Double.valueOf(etOrtTuk.getText().toString());
                ltFiyat = Double.valueOf(etLitreFiyat.getText().toString());

                ltHesap = (ortTük*km)/100;
                fiyatHesap = ltFiyat*ltHesap;
                sonuc="Yakılan tutar :" + fiyatHesap + "TL'dir.";

                Toast.makeText(MainActivity.this, sonuc,Toast.LENGTH_LONG).show();
            }
        });

        /*
        System.out.println("Mesafe(km):");
        Scanner scanner= new Scanner(System.in);
        km= scanner.nextDouble();

        System.out.println("1/100km Ortalama Tüketim:");
        ortTük= scanner.nextDouble();

        System.out.println("Yakıtın Litre Fiyatı:");
        ltFiyat= scanner.nextDouble();

        ltHesap=(ortTük*km)/100;
        fiyatHesap = (ltFiyat*ltHesap)/1;
        System.out.println("Yakılan yakıt fiyatı:"+fiyatHesap);*/

    }
}