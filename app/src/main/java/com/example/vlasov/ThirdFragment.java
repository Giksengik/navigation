package com.example.vlasov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
    @Override
    public void onStart(){
        super.onStart();
        ((Button) getActivity().findViewById(R.id.third_btn_back)).setOnClickListener((View.OnClickListener) v -> {
            ((MainActivity) getActivity()).navController.navigate(R.id.action_thirdFragment_to_secondFragment);
        });
    }
}