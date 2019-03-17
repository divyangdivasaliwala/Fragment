package com.example.admin.fragment;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment_2 extends Fragment implements View.OnClickListener {

    Button button1,button2,button3,button4;
    String str;
    Communicator com;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_2,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (Communicator) getActivity();
        button1 = (Button)getActivity().findViewById(R.id.btn1);
        button2 = (Button)getActivity().findViewById(R.id.btn2);
        button3 = (Button)getActivity().findViewById(R.id.btn3);
        button4 = (Button)getActivity().findViewById(R.id.btn4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1 :
                str = (String) button1.getText();
                com.Respond(str);
                break;
            case R.id.btn2 :
                str = (String) button2.getText();
                com.Respond(str);
                break;
            case R.id.btn3 :
                str = (String) button3.getText();
                com.Respond(str);
                break;
            case R.id.btn4 :
                str = (String) button4.getText();
                com.Respond(str);
                break;
        }
    }
}
