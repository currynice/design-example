package org.cxy.demo;

import org.cxy.demo.question.AnswerQuestion;
import org.cxy.demo.question.ChoiceQuestion;
import org.cxy.demo.util.Topic;
import org.cxy.demo.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Description:   </br>
 * Date: 2021/8/18 14:05
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class QuestionBank implements Cloneable {


    private String candidate;

    private String number;

    // 选择题
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<>();

    //问答题
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<>();


    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    protected QuestionBank clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();

        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>)choiceQuestionList.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>)answerQuestionList.clone();


        //题目乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionList);


        //选择题答案乱序
        ArrayList<ChoiceQuestion> temp = questionBank.choiceQuestionList;

        for(ChoiceQuestion question : temp){
            Topic random = TopicRandomUtil.random(question.getOption(),question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }

        return questionBank;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<ChoiceQuestion> getChoiceQuestionList() {
        return choiceQuestionList;
    }

    public ArrayList<AnswerQuestion> getAnswerQuestionList() {
        return answerQuestionList;
    }
}
