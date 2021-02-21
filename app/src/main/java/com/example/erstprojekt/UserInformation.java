package com.example.erstprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.erstprojekt.db.AppDatabase;
import com.example.erstprojekt.db.User;

public class UserInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        final EditText firstNameInt = findViewById(R.id.firstNameInput);
        final EditText lastNameInt = findViewById(R.id.lastNameInput);
        final EditText skillSetInt = findViewById(R.id.skillSetInput);
        Button onSaveBtn = findViewById(R.id.buttonInput);
        onSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveUser(firstNameInt.getText().toString(), lastNameInt.getText().toString(), skillSetInt.getText().toString());


            }
        });
    }
    private void saveUser(String firstName, String lastName, String skillSet) {
        AppDatabase db = AppDatabase.getDbInstance(this.getApplicationContext());

        User user = new User();
        user.firstName = firstName;
        user.lastName = lastName;
        user.skillSet = skillSet;
        db.userDao().InsertUser(user);

        finish();

    }


}