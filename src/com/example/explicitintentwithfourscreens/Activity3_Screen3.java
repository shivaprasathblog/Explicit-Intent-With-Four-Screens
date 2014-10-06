package com.example.explicitintentwithfourscreens;

import com.example.explicitintentwithtwoscreens.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity3_Screen3 extends Activity
{
	// Define and declare a button here 
		Button b1,b2,b3;
		@Override
		protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.screen3);
			//Refer the button from xml with the id of button b1 which is "button1"
			b1=(Button)findViewById(R.id.button1);
			b2=(Button)findViewById(R.id.button2);
			b3=(Button)findViewById(R.id.button3);
			// Set the listener for button , we are using on click listener for button
			b1.setOnClickListener(new OnClickListener() 
			{
				
				@Override
				public void onClick(View arg0) 
				{
					// TODO Auto-generated method stub
					//Intent for switching to Activity 2
					/**
					Syntax:
						   Intent userdefinedvariable = new Intent(CurrentActivity.this,DesiredActivity.class);
						   startActivity(userdefinedvariable);
					**/
					Intent i= new Intent(Activity3_Screen3.this,Activity4_Screen4.class);
					startActivity(i);
					
				}
			});
			b2.setOnClickListener(new OnClickListener() 
			{
				
				@Override
				public void onClick(View arg0) 
				{
					// TODO Auto-generated method stub
					//Intent for switching to Activity 3
				
				
					Intent i= new Intent(Activity3_Screen3.this,Activity2_Screen2.class);
					startActivity(i);
				
				}
			});
			b3.setOnClickListener(new OnClickListener() 
			{
				
				@Override
				public void onClick(View arg0) 
				{
					// TODO Auto-generated method stub
					//Intent for switching to Activity 3
				
					Intent i= new Intent(Activity3_Screen3.this,Activity1_Screen1.class);
					startActivity(i);
				}
			});
		}

		

	}

