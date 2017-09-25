package com.hfad.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiveMessageActivity extends AppCompatActivity {
    public final static String MESSAGE1 = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String received_message = intent.getStringExtra(MESSAGE1);
        TextView messageView = (TextView) findViewById(R.id.received_text);
        messageView.setText(received_message);
    }
}
