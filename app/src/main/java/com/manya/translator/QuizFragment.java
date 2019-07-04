package com.manya.translator;


import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizFragment extends Fragment implements View.OnClickListener {

    private ImageView wordImageView;
    private TextView engTextView;
    private Button answerButton1;
    private Button answerButton2;
    private Button answerButton3;
    private Button answerButton4;

    private View.OnClickListener listener = this;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.quiz_fragment, container, false);
    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        wordImageView = (ImageView) view.findViewById(R.id.quizWordImageView);
        engTextView = (TextView) view.findViewById(R.id.quizWordTextView);
        answerButton1 = (Button) view.findViewById(R.id.quizAnswerButton1);
        answerButton2 = (Button) view.findViewById(R.id.quizAnswerButton2);
        answerButton3 = (Button) view.findViewById(R.id.quizAnswerButton3);
        answerButton4 = (Button) view.findViewById(R.id.quizAnswerButton4);


        answerButton1.setOnClickListener(this);
        answerButton2.setOnClickListener(this);
        answerButton3.setOnClickListener(this);
        answerButton4.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        wordImageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.capybara));
        engTextView.setText("Capybara");
        answerButton1.setText("Водосвинка");
        answerButton2.setText("Свинка");
        answerButton3.setText("Кот");
        answerButton4.setText("Хорек");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.quizAnswerButton1:
                view.setBackgroundColor(Color.GREEN);
                break;
            case R.id.quizAnswerButton2:
            case R.id.quizAnswerButton3:
            case R.id.quizAnswerButton4:
                view.setBackgroundColor(Color.RED);
        }
    }
}
