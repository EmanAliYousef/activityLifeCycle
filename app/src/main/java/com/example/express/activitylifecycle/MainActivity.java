package com.example.express.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "on create is called", Toast.LENGTH_SHORT).show();

        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Second.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart(){

        super.onStart();
        Toast.makeText(MainActivity.this, "on Start is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this, "on resume is called", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause(){

       super.onPause();
        Toast.makeText(MainActivity.this, "on Pause is called", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onStop(){

       super.onStop();
        Toast.makeText(MainActivity.this, "on Stop is called", Toast.LENGTH_SHORT).show();


    }
    @Override
    public void onRestart(){

        super.onRestart();

        Toast.makeText(MainActivity.this, "on ReStart is called", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy(){

        super.onDestroy();

        Toast.makeText(MainActivity.this, "on Destroy is called", Toast.LENGTH_SHORT).show();

    }
}
