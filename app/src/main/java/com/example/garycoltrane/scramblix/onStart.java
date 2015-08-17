package com.example.garycoltrane.scramblix;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;


public class onStart extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_start);
        getSupportActionBar().hide();


        final Button arc = (Button) findViewById(R.id.arc);

       startArcade();

    }

private void startArcade(){
    final Button arc = (Button) findViewById(R.id.arc);

    arc.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent change = new Intent(onStart.this, canvas.class);
            onStart.this.startActivity(change);
        }

    });




}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_on_start, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}


