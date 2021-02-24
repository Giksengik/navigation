package com.example.vlasov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override
    public void onStart(){
        super.onStart();
        ((Button) getActivity().findViewById(R.id.second_btn_next)).setOnClickListener((View.OnClickListener) v -> {
            ((MainActivity) getActivity()).navController.navigate(R.id.action_secondFragment_to_thirdFragment);
        });
        ((Button) getActivity().findViewById(R.id.second_btn_back)).setOnClickListener((View.OnClickListener) v -> {
            ((MainActivity) getActivity()).navController.navigate(R.id.action_secondFragment_to_firstFragment);
        });
    }
}