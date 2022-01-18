package com.example.topquiz.model;

import java.io.Serializable;
import java.util.List;

public class QuestionBank implements Serializable {
    private final List<Question> mQuestionList;
    private int mQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;
    }

    public Question getCurrentQuestion() {
        return mQuestionList.get(mQuestionIndex);
    }

    public Question getNextQuestion(){
        mQuestionIndex++;
        return getCurrentQuestion();
    }

}
