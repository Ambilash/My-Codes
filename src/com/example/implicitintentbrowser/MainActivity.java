package com.example.implicitintentbrowser;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button b1;
	EditText e1;
	String a="";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                                                                                              
        b1=(Button)findViewById(R.id.button1);
        e1=(EditText)findViewById(R.id.editText1);
        a=e1.getText().toString();
        	
        b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a=e1.getText().toString();
				Intent i=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+a));			
				startActivity(i);
			}
		});
	}
}
