/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etoile.javaapi.question;

import java.util.LinkedList;


/**
 *
 * @author Rui
 */
public abstract class Question {
    
    public abstract void setCorrectAnswer(String correctAnswer);
   
    public abstract boolean setCorrectAnswers(LinkedList<String> correctAnswers);
    
    public abstract String getCorrectAnswer();
    
    public abstract QuestionType getQuestionType();
    
    public abstract String getText();
    
    public abstract int getId();
       
    public abstract boolean setAnswer(String userAnswer);
    
    public abstract boolean setAnswer(LinkedList<String> userAnswer);
    
    public abstract LinkedList<String> getPossibleAnswers();
   
    public abstract LinkedList<String> getCorrectAnswers();
    
    public abstract boolean setPossibleAnswers(LinkedList<String> possibleAnswers);
    
    public abstract boolean addPossibleAnswser(String possibleAnswer);
}