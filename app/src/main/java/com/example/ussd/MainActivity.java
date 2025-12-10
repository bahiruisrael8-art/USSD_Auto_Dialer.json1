package com.example.ussd;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String ussd = "*806*0930483121*5#";
        String encoded = Uri.encode(ussd);
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + encoded));
        startActivity(intent);
        finish();
    }
}
