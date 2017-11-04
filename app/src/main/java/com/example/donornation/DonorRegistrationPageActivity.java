package com.example.donornation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class DonorRegistrationPageActivity extends AppCompatActivity {

    EditText nameText, ageText, genderText, bloodGroupText, cityText, contactNoText;
    Button submit;
    DatabaseReference rootRef,demoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donor_registration_page);

        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);
        rootRef = FirebaseDatabase.getInstance().getReference("donors");
        nameText = (EditText) findViewById(R.id.name);
        ageText = (EditText) findViewById(R.id.age);
        genderText = (EditText) findViewById(R.id.gender);
        bloodGroupText = (EditText) findViewById(R.id.bloodgroup);
        cityText = (EditText) findViewById(R.id.city);
        contactNoText = (EditText) findViewById(R.id.contactno);

        submit = (Button) findViewById(R.id.submit_button);

            submit.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    addDonor();

                }
            });
    }
    private void addDonor() {
        String name = nameText.getText().toString();
        String age = ageText.getText().toString();
        String gender = genderText.getText().toString();
        String bloodGroup = bloodGroupText.getText().toString();
        String city = cityText.getText().toString();
        String contactNo = contactNoText.getText().toString();

        String donorID = rootRef.push().getKey();

        Donors donor = new Donors(donorID, name, age, gender, bloodGroup, city, contactNo);


        rootRef.child(donorID).setValue(donor);

        Toast.makeText(getBaseContext(), "You are registered!", Toast.LENGTH_SHORT).show();

        Intent myIntent = new Intent(DonorRegistrationPageActivity.this, MainActivity.class);
        startActivity(myIntent);

    }
}
