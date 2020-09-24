package com.example.ragister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView  Name,Email,Gender,Branch,Group,City,Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Name=findViewById(R.id.fname_set);
        Email=findViewById(R.id.email_set);
        Branch=findViewById(R.id.branch_set);
        Gender=findViewById(R.id.gender_set);
        City=findViewById(R.id.city_set);

        Intent intent=getIntent();
        String firstname_set=intent.getStringExtra("f_name");
        String email_set=intent.getStringExtra("email");
        String brc_set=intent.getStringExtra("brch");
        String cy_set=intent.getStringExtra("city");
        String gn_set=intent.getStringExtra("gender");


        Name.setText("First Name:"+firstname_set);
        Email.setText("Email:"+email_set);
        Branch.setText("Branch:"+brc_set);
        Gender.setText("City:"+cy_set);
        City.setText("Gender:"+gn_set);
    }
}