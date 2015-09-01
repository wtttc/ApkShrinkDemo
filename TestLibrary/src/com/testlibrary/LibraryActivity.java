package com.testlibrary;

import android.app.Activity;
import android.os.Bundle;

import com.testlibrary.R;


public class LibraryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        findViewById(R.id.iv_used_in_activity_library).setBackgroundResource(R.drawable.used_in_activity_library_activity);
    }

}
