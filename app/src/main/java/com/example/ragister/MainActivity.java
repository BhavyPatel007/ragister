package com.example.ragister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    EditText Name,Email;
    Switch Branch;
    RadioGroup Group;
    RadioButton Gender;
    Button Login;
    Spinner City;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.etName);
        Email=(EditText)findViewById(R.id.etEmail);
        Branch=(Switch)findViewById(R.id.Branch);
        City=(Spinner)findViewById(R.id.city);
        Login=(Button)findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f_name,email,city,brch,gender;
                f_name=Name.getText().toString();
                email=Email.getText().toString();
                brch=Branch.getText().toString();
                Group=findViewById(R.id.rdb_group);
                int id=Group.getCheckedRadioButtonId();
                Gender=findViewById(id);
                gender=Gender.getText().toString();

                city=City.getSelectedItem().toString();

                Intent intent =  new Intent(MainActivity.this,Welcome.class);
                intent.putExtra("Name",f_name);
                intent.putExtra("Email",email);
                intent.putExtra("Branch",brch);
                intent.putExtra("Gender",gender);
                intent.putExtra("City",city);
                startActivity(intent);
            }
        });
    }
}