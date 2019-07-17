package com.sg.r36a.bharuchdairy;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment {
    Button loginbutton;
    AppCompatEditText editmobile;
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.login_fragment,container,false);
        loginbutton = (Button) v.findViewById(R.id.login_button);
        editmobile = (AppCompatEditText) v.findViewById(R.id.editmobile);

        return v;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }

}
