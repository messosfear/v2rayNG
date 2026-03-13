package com.v2ray.ang.ui

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.v2ray.ang.R

/**
 * @Author sleepchild
 * @Date 2026/03/13 14:39
 */
public class SActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sact);
        Toast.makeText(this,"hooks", 500).show();
    }

}
