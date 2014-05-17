package com.skyworks.hello;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {

	SeekBar pgseekbar;
	TextView pgtext,riText;
	Button riMinus,riAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pgseekbar = (SeekBar)findViewById(R.id.pgseekbar);
        riMinus = (Button)findViewById(R.id.riminus);
        riAdd = (Button)findViewById(R.id.riadd);
        pgtext = (TextView) findViewById(R.id.pgtext);
        riText = (TextView) findViewById(R.id.ritext);
        
        //riMinus action
        riMinus.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int tmp = Integer.valueOf(String.valueOf(riText.getText()));
				if (tmp!=0) tmp--;
				riText.setText(String.valueOf(tmp));
			}
        	
        });
        //riAdd action
        riAdd.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int tmp = Integer.valueOf(String.valueOf(riText.getText()));
				if (tmp!=255) tmp++;
				riText.setText(String.valueOf(tmp));
			}
        	
        });
        pgseekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				pgtext.setText(String.valueOf(arg0.getProgress()));
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
        	
        });
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
