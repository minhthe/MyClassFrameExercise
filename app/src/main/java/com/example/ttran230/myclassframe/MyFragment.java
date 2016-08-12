package com.example.ttran230.myclassframe;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ttran230 on 8/12/2016.
 */
public class MyFragment extends Fragment {

    Button btn;
    ConversationFA cv;
    public interface ConversationFA{
        public void sendMessage(String text);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.myfragment,container,false);
        cv = (ConversationFA) getActivity();
        btn = (Button) view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.sendMessage("from the fragment1");
            }
        });
        return view;
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        cv = (ConversationFA) getActivity();
//    }
}
