package com.example.easycreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity3 extends AppCompatActivity {

    Button btn_add;
    EditText corre, contrasenaa, conf_contraa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        corre = findViewById(R.id.corre);
        contrasenaa = findViewById(R.id.contrasenaa);
        conf_contraa = findViewById(R.id.conf_contraa);
        btn_add = findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correuser = corre.getText().toString().trim();
                String contrauser = contrasenaa.getText().toString().trim();
                String cofconuser = conf_contraa.getText().toString().trim();

                if (correuser.isEmpty() || contrauser.isEmpty() || cofconuser.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Ingrese todos los datos", Toast.LENGTH_SHORT).show();
                } else if (!contrauser.equals(cofconuser)) {
                    Toast.makeText(getApplicationContext(), "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí puedes poner la lógica para guardar los datos, por ejemplo, en una base de datos local o en un servidor remoto
                    // Puedes implementar tu propia lógica para manejar los datos según tus necesidades
                    // Por ejemplo, podrías mostrar un mensaje de éxito o error después de guardar los datos
                }
            }
        });
    }
}
