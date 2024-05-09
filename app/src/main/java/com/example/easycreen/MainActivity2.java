package com.example.easycreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button btn_login, btn_sing;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_login = findViewById(R.id.btn_log);
        btn_sing = findViewById(R.id.btn_sing);
        email = findViewById(R.id.correo);
        password = findViewById(R.id.contrasena);

        btn_sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica para manejar el clic del botón de inicio de sesión
                // Por ejemplo, puedes obtener los valores de los campos de correo electrónico y contraseña
                String emailUser = email.getText().toString().trim();
                String passUser = password.getText().toString().trim();

                // Luego puedes realizar acciones como validar los datos ingresados y mostrar mensajes de Toast
                if (emailUser.isEmpty() || passUser.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Ingrese todos los datos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí podrías poner la lógica para iniciar sesión con los datos ingresados
                }
            }
        });
    }
}
