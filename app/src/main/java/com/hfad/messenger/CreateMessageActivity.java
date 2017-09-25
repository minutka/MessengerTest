package com.hfad.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        EditText textView = (EditText) findViewById(R.id.edit_text);
        String content = textView.getText().toString();
        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.MESSAGE1,content);
        Intent intent = new Intent(Intent.ACTION_SEND);
        String title = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, title);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,content);
        startActivity(chosenIntent);
    }
}
