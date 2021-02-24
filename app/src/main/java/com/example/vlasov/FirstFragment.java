package com.example.vlasov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onStart(){
        super.onStart();
        ((Button) getActivity().findViewById(R.id.first_btn_next)).setOnClickListener((View.OnClickListener) v -> {
            ((MainActivity) getActivity()).navController.navigate(R.id.action_firstFragment_to_secondFragment);
        });


    }
}