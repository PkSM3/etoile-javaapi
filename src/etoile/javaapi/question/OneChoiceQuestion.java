/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etoile.javaapi.question;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Rui
 */
public class OneChoiceQuestion extends Question implements Serializable {

    public String text;
    public int id;
    public LinkedList<String> possibleAnswers = new LinkedList<String>();
    public String userAnswer="";
    public String correctAnswer;
    public QuestionType questionType = QuestionType.ONE_CHOICE;
    private LinkedList<URL> urls = new LinkedList<URL>();
    private boolean isFirst = false;
    private boolean isLast = false;
    private boolean isOneChoice = true;
    private boolean isMultipleChoice = false;
    private boolean isOpen = false;
    private int number;
    private int answer_id;
    

    public boolean isIsMultipleChoice() {
        return isMultipleChoice;
    }

    public void setIsMultipleChoice(boolean isMultipleChoice) {
        this.isMultipleChoice = isMultipleChoice;
    }

    public boolean isIsOneChoice() {
        return isOneChoice;
    }

    public void setIsOneChoice(boolean isOneChoice) {
        this.isOneChoice = isOneChoice;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isIsFirst() {
        return isFirst;
    }

    public boolean isIsLast() {
        return isLast;
    }

    public void setIsFirst(boolean isFirst) {
        this.isFirst = isFirst;
    }

    public void setIsLast(boolean isLast) {
        this.isLast = isLast;
    }

    public OneChoiceQuestion(int id, String text) {
        this.text = text;
        this.id = id;
    }

    public OneChoiceQuestion(String text, int id, LinkedList<String> possibleAnswers, String correctAnswer) {
        this.text = text;
        this.id = id;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    public boolean addPossibleAnswser(String possibleAnswer) {
        possibleAnswers.add(possibleAnswer);
        return true;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
        return true;
    }

    @Override
    public QuestionType getQuestionType() {
        return questionType;
    }

    public LinkedList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    @Override
    public boolean setPossibleAnswers(LinkedList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
        return true;
    }

    @Override
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public boolean setAnswers(LinkedList<String> userAnswer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setCorrectAnswers(LinkedList<String> correctAnswers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LinkedList<String> getCorrectAnswers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LinkedList<URL> getURLS() {
        return urls;
    }

    @Override
    public boolean setURLS(LinkedList<URL> urls) {
        this.urls = urls;
        return true;
    }

    @Override
    public void addURL(URL url) {
        urls.add(url);
    }

    @Override
    public String getUserAnswer() {
        return userAnswer;
    }

    @Override
    public LinkedList<String> getAnswers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFirst() {
        return isFirst;
    }

    @Override
    public boolean isLast() {
        return isLast;
    }

    @Override
    public int getNumber() {
       return number;
    }

    @Override
    public void setNumber(int number) {
        this.number=number;
    }

    @Override
    public void setAnswerId(int aInt) {
       this.answer_id=aInt;
    }
}
