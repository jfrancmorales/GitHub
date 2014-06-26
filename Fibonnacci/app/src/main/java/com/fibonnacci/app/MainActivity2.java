package com.fibonnacci.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2 extends Activity {

    TextView fiboResult;
    StringBuilder fiboResultString;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Intent i = getIntent();
        number = i.getStringExtra("febCount");

        fiboResult = (TextView) findViewById(R.id.fiboResult);
        fiboResultString = new StringBuilder();
    }

    @Override
    protected void onResume() {
        super.onResume();
        calcFibonnacci();
    }

    public void calcFibonnacci(){
        int febCount = Integer.parseInt(number);
        int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< febCount; i++){

            fiboResultString.append(feb[i] + " ");
            System.out.print(feb[i] + " ");
        }

        fiboResult.setText(fiboResultString.toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
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
