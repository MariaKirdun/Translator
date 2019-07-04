package com.manya.translator;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {

    public MainFragment() {
        super();
    }

    private Button learnButton;
    private Button quizButton;

    private View.OnClickListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (View.OnClickListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        learnButton = (Button) view.findViewById(R.id.learnWordsButton);
        quizButton = (Button) view.findViewById(R.id.quizButton);
    }

    @Override
    public void onStart() {
        super.onStart();
        learnButton.setOnClickListener(listener);
        quizButton.setOnClickListener(listener);
    }
}
