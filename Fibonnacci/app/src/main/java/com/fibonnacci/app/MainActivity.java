package com.fibonnacci.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText fiboNumber;
    TextView fiboResult;
    StringBuilder fiboResultString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fiboNumber = (EditText) findViewById(R.id.fiboNumber);
        fiboResult = (TextView) findViewById(R.id.fiboResult);
        fiboResultString = new StringBuilder();
    }

    public void calcFibonnacci(View v){

        String number = fiboNumber.getText().toString();

        Intent fiboResultActivity = new Intent(MainActivity.this,MainActivity2.class);
        fiboResultActivity.putExtra("febCount", number);

        startActivity(fiboResultActivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
