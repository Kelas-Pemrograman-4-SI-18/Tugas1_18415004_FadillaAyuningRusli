package com.fadilla.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTampil;
    EditText edtNpm, edtNama, edtJk, edtNotelp, edtNamaAyh, edtNamaIbu;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtBiodata);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtJk = (EditText) findViewById(R.id.edtJk);
        edtNotelp = (EditText) findViewById(R.id.edtNotelp);
        edtNamaAyh = (EditText) findViewById(R.id.edtNamaAyh);
        edtNamaIbu = (EditText) findViewById(R.id.edtNamaIbu);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJk = edtJk.getText().toString();
                String strNoTelp = edtNotelp.getText().toString();
                String strNamaAyh = edtNamaAyh.getText().toString();
                String strNamaIbu = edtNamaIbu.getText().toString();

                txtTampil.setText(strNpm + "\n" +strNama + "\n" +strJk +"\n" +strNoTelp + "\n" +strNamaAyh + "\n" +strNamaIbu);
            }
        });
    }
}