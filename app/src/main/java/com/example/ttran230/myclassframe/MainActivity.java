package com.example.ttran230.myclassframe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements MyFragment.ConversationFA{





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMainActivity = (Button) findViewById(R.id.btnMainActivity);



            btnMainActivity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"btnMainActivity",Toast.LENGTH_SHORT).show();
                    Bundle b1 = new Bundle();
                    b1.putString("name","minhthe");

                    Fragment myFragment = new MyFragment();
                    myFragment.setArguments(b1);

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.ln1,myFragment);
                    fragmentTransaction.commit();

                }
            });

    }

    @Override
    public void sendMessage(String text) {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("MainActivity : " + text);
    }
}
