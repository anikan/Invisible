package com.AndroidDetOrientation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import java.util.List;

/**
 * Created by AnishKannan on 4/4/2015.
 */
public class MainPage extends Activity{
    Intent photoIntent;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_menu);
        photoIntent = new Intent(this, PhotoIntentActivity.class);

        Button picBtn = (Button) findViewById(R.id.button);

    }

    public void photo(View view)
    {
        startActivity(photoIntent);
    }
}
