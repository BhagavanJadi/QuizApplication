package com.example.quizapplication;

public class AnswerClass {
    private int optionA,optionB,optionC,optionD,answerID,questionId;

    public AnswerClass(int questionId,int optionA, int optionB, int optionC, int optionD, int answerID) {
        this.questionId = questionId;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answerID = answerID;

    }

    public int getOptionA() {
        return optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public int getOptionC() {
        return optionC;
    }

    public int getOptionD() {
        return optionD;
        
    }

    public int getAnswerID() {
        return answerID;
    }

    public int getQuestionId() {
        return questionId;
    }
}
