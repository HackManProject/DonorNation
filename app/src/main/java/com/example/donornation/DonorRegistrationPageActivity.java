package com.example.donornation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class DonorRegistrationPageActivity extends Activity {

    EditText nameText;
    Button submit;
    DatabaseReference rootRef,demoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donor_registration_page);
    /*EditText name, age, gender, bloodgroup, city, contactno;
    Button submit;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donor_registration_page);
        final DBAdapter db = new DBAdapter(this);
        db.open();
        name=(EditText)findViewById(R.id.name);
        age=(EditText)findViewById(R.id.age);
        gender=(EditText)findViewById(R.id.gender);
        bloodgroup=(EditText)findViewById(R.id.bloodgroup);
        city=(EditText)findViewById(R.id.city);
        contactno=(EditText)findViewById(R.id.contactno);
        submit=(Button)findViewById(R.id.submit_button);
        submit.setOnClickListener(new OnClickListener(){


            @Override
            public void onClick(View v) {
                String editName=name.getText().toString();
                String editAge=age.getText().toString();
                String editGender=gender.getText().toString();
                String editBloodgroup=bloodgroup.getText().toString();
                String editCity=city.getText().toString();
                String editContactno=contactno.getText().toString();
                long result=db.insertTitle(editName, editAge, editGender, editBloodgroup, editCity, editContactno);

            }
        });
    }*/

        /*Button submit = (Button) findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText nameText = (EditText)findViewById(R.id.name);
                EditText ageText = (EditText)findViewById(R.id.age);
                EditText genderText = (EditText)findViewById(R.id.gender);
                EditText bloodGroupText = (EditText)findViewById(R.id.bloodgroup);
                EditText cityText = (EditText)findViewById(R.id.city);
                EditText contactNoText = (EditText)findViewById(R.id.contactno);

                Firebase myFirebaseRefName =
                new Firebase("https://donornation-ccbb7.firebaseio.com/");

                myFirebaseRefName.setValue(
                        nameText.getText().toString());

                Intent myIntent = new Intent(DonorRegistrationPageActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });*/




        nameText = (EditText) findViewById(R.id.name);
        submit = (Button) findViewById(R.id.submit_button);
        //database reference pointing to root of database
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("demo");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = nameText.getText().toString();
                //push creates a unique id in database
                demoRef.push().setValue(value);
            }
        });
    }
}
