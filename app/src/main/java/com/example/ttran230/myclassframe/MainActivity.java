package com.example.ttran230.myclassframe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements MyFragment.ConversationFA{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.ln1,new MyFragment());
//        fragmentTransaction.add(R.id.ln2,new MyFragment2());
        fragmentTransaction.commit();




    }

    @Override
    public void sendMessage(String text) {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("change: "+text);
    }
}
