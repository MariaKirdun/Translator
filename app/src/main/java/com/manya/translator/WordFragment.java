package com.manya.translator;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class WordFragment extends Fragment {

    private ImageView wordImageView;
    private TextView engTextView;
    private TextView transcription;
    private TextView rusTextView;


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.word_fragment, container, false);
    }


    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        wordImageView = (ImageView) view.findViewById(R.id.wordImageView);
        engTextView = (TextView) view.findViewById(R.id.engWordTextView);
        transcription = (TextView) view.findViewById(R.id.transciptionTextView);
        rusTextView = (TextView) view.findViewById(R.id.rusWordTextView);



    }

    @Override
    public void onStart() {
        super.onStart();
        wordImageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.capybara));
        engTextView.setText("Capybara");
        transcription.setText("[kapɪ'bɑ:rə]");
        rusTextView.setText("Водосвинка");
    }
}

