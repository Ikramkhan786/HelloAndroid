package com.example.user.HelloAndroid;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * This method opens Udacity website
     */
    public void udacityWebsite(View view) {
        final String url = "http://www.udacity.com";
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        webIntent.setData(Uri.parse(url));
        if (webIntent.resolveActivity(getPackageManager()) != null)
            startActivity(webIntent);

    }

    /*
    * This method open Calling software
     */
    public void callToUdacity(View view) {
        final String number = "6505555555";
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null));
        if (callIntent.resolveActivity(getPackageManager()) != null)
            startActivity(callIntent);


    }

    /*
    * This method open location of udacity center in map
     */
    public void udacityLocation(View view) {
        final String address = "2465 Latham St, Mountain View, CA 94043";
        String uri = "geo:37.3999133,-122.10836334?q=" + address;
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null)
            startActivity(mapIntent);

    }
}

