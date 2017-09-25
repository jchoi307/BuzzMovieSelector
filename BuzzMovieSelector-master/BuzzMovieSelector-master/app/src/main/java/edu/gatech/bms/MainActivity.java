package edu.gatech.bms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.backendless.Backendless;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Backendless.initApp(this, BackendSetting.APPLICATION_ID, BackendSetting.ANDROID_SECRET_KEY, BackendSetting.VERSION);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        final int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Send the user into the login screen
     * @param v the current view from application
     */
    public void onButtonLoginClick(View v) {
        if (v.getId() == R.id.loginButton) {
            final Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }
    }

    /**
     * Send the user into the registration screen
     * @param v the current view from application
     */
    public void onButtonRegisterClick(View v) {
        if (v.getId() == R.id.registerButton) {
            final Intent i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        }
    }


}