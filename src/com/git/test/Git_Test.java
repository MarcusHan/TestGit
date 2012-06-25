package com.git.test;

import android.app.Activity;
import android.widget.Toast;
import android.os.Bundle;
import android.content.Context;

public class Git_Test extends Activity
{	
	Context gitContext;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        gitContext = this;
        
        Toast.makeText(gitContext, "Git Testing, PHJ. WOW!", 0).show();
    }
}