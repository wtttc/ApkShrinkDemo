package com.example.testlibrary2;

import android.app.Activity;
import android.os.Bundle;

import com.example.uselessdemo2.R;

public class LibraryJarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_jar);
        findViewById(R.id.iv_used_in_activity_library_jar).setBackgroundResource(R.drawable.used_in_activity_library_activity_jar);
    }

}
