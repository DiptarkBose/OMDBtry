package com.example.android.omdbtry;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 711602b7f18475f86e0879dac83aeeac9e4c6fe5
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
=======
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
>>>>>>> 711602b7f18475f86e0879dac83aeeac9e4c6fe5
    EditText et;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        et = (EditText) findViewById(R.id.editText);
        btn=(Button) findViewById(R.id.search);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Intent i= new Intent(MainActivity.this, Movie.class);
        i.putExtra("Movie name", et.getText().toString());
        startActivity(i);
    }

=======
        et=(EditText) findViewById(R.id.editText);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=et.getText().toString();
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });
    }
>>>>>>> 711602b7f18475f86e0879dac83aeeac9e4c6fe5
}
