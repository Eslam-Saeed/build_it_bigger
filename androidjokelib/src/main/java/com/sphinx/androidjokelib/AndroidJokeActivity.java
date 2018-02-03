package com.sphinx.androidjokelib;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class AndroidJokeActivity extends AppCompatActivity {
    private TextView txtJokeToTell;
    private String jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_joke_activity);
        txtJokeToTell = findViewById(R.id.txtJokeToTell);
        if (getIntent() != null)
            jokeText = getIntent().getStringExtra("JOKE");

        if (!TextUtils.isEmpty(jokeText))
            txtJokeToTell.setText(jokeText);
    }

    public static void startActivity(Context context, String jokeText) {
        Intent intent = new Intent(context, AndroidJokeActivity.class);
        intent.putExtra("JOKE", jokeText);
        context.startActivity(intent);
    }
}
