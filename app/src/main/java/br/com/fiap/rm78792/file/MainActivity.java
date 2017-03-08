package br.com.fiap.rm78792.file;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//OnCreate
    public void criar(View v){
        try {
            FileOutputStream fos =  openFileOutput("Teste.txt",MODE_PRIVATE);
            String texto = "Bom dia!";
            fos.write(texto.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//criar

    public void ler(View view) {

        try {
            FileInputStream fis = openFileInput("teste.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String texto = br.readLine();
            fis.close();
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
        }

    }//Ler

}//Main Class