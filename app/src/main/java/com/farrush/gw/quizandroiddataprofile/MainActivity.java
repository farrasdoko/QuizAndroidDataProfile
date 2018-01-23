package com.farrush.gw.quizandroiddataprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText etnama;
    EditText etemail;
    EditText etaddress;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText)findViewById(R.id.etnama);
        etemail = (EditText)findViewById(R.id.etemail);
        etaddress = (EditText)findViewById(R.id.etaddress);
        txt = (TextView)findViewById(R.id.txt);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nnama = etnama.getText().toString();
                String nemail = etemail.getText().toString();
                String naddress = etaddress.getText().toString();

                if (nnama.isEmpty()){
                    etnama.setError("Wajib Diisi");
                }else if(nemail.isEmpty()){
                    etemail.setError("Wajib Diisi");
                }else if(naddress.isEmpty()){
                    etaddress.setError("Wajib Diisi");
                }else{
                    txt.setText("Nama Anda: " + nnama + ", Dengan Email: " + nemail + ", Beralamat Di: " + naddress);
                }
            }
        });
    }
}
