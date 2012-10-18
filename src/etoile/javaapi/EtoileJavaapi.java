/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etoile.javaapi;

import etoile.javaapi.forum.Forum;
import etoile.javaapi.forum.Topic;
import etoile.javaapi.forum.TopicAnswer;
import etoile.javaapi.question.*;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rui
 */
public class EtoileJavaapi {

    /**
     * @param args the command line arguments
     */
    //TEST
    int student_id = 1;

    public static void main(String[] args) throws NoSuchAlgorithmException, InstantiationException {
        new EtoileJavaapi().run();
    }

    private void run() throws NoSuchAlgorithmException, InstantiationException {
        try {
            ServiceManager manager = new ServiceManager();
//            System.out.println(manager.setAuthentication("rui", "40bd001563085fc35165329ea1ff5c5ecbdbbeef"));
//            
//            
//            
//            //Student student = new Student("teste", "40bd001563085fc35165329ea1ff5c5ecbdbbeef", "Ruben", "Paixao", "r@r.r");
////           manager.userService().getNews();
////            for(News n: manager.current_student.getNews()){
////                System.out.println(n.getProfessor());
////               System.out.println(n.getTitle());
////                System.out.println(n.getText());
////                System.out.println(n.getUrl());
////            }
//            
//           manager.userService().updateCourses(student_id);
//
//            for (Course c : manager.current_student.getCourses()) {
//                System.out.println("CURSO: " + c.getName());
//
//                manager.userService().updateDisciplines(c);
//                for (Discipline d : c.getDisciplines()) {
//                    manager.userService().updateModules(d);
//                    if(d.getName().equals("es")){
//                    System.out.println("\nDISCIPLINA: " + d.getName());
//                    for (Module m : d.getModules()) {
//                        System.out.println("*MODULO: " + m.getName());
//                        manager.userService().updateTests(m);
//                        for (Test t : m.getTests()) {
//                            System.out.println("**TESTE : " + t.getName() + " ->" + t.showURLS);
//                            manager.userService().updateQuestions(t);
//                            for( Question q: t.getQuestions()){
//                                for(URL u : q.getURLS()){
//                                    System.out.println("URL:" + u.getName() + " - AVERAGE:" + u.getAverage());
//                                    
//                                    manager.userService().setVotes(u, 4);
//                                }
//                        }
//                        }
//                    }
//                    }
//                }
//            }
//            try {
                //manager.userService().addStudent(student);

                //        Student st=new Student("Rui","123","rui@iscte.pt");
                //        st.setFirstname("Rui");
                //        st.setLastname("Lopes da Silva");
                //        
                //        System.out.println("Users:");
                //        System.out.println("Student Username:"+st.getUsername());
                //        System.out.println("Student Password:"+st.getPassword());
                //        System.out.println("Student First Name:"+st.getFirstname());
                //        System.out.println("Student Last Name:"+st.getLastname());
                //        
                //        Course c=new Course("Curso de Matemática", 1);
                //        
                //        Discipline d= new Discipline("Matematica I",1);
                //        
                //        Module m= new Module("SUM", 1);
                //        
                //        Test t= new Test("Teste da Soma", 1, "Professor de Matematica");
                //        
                //        Question q= new OpenQuestion("Qual é o resultado da Soma 1+1?", 1);
                //        Question q2= new OpenQuestion("Qual é o resultado da Soma 2+2?", 2);
                //        //hipoteses
                //        LinkedList<String> h= new LinkedList<String>();
                //        h.add("3");
                //        h.add("5");
                //        h.add("5");
                //        Question q3= new OneChoiceQuestion("Qual o resultado de 3+3?", 3, h, "6");
                //        
                //        //Correctas
                //        LinkedList<String> co= new LinkedList<String>();
                //        co.add("5");
                //        co.add("5");
                //        Question q4= new MultipleChoiceQuestion("Qual o Resultado de 2+3?", 4, h, co);
                //        
                //        
                //        
                //        
                //        t.addQuestion(q);
                //        t.addQuestion(q2);
                //        t.addQuestion(q3);
                //        t.addQuestion(q4);
                //        
                //        m.addTest(t);
                //        
                //        d.addModule(m);
                //        
                //        c.addDiscipline(d);
                //        
                //        st.addCourse(c);
                //        
                //        System.out.println("Curso: "+st.getCourses().getFirst().getName());
                //        System.out.println("Disciplina: "+st.getCourses().getFirst().getDisciplines().getFirst().getName());
                //        System.out.println("Modulo: "+st.getCourses().getFirst().getDisciplines().getFirst().getModules().getFirst().getName());
                //        System.out.println("Test: "+st.getCourses().getFirst().getDisciplines().getFirst().getModules().getFirst().getTests().getFirst().getName());
                //        
                //        
                //        int size =st.getCourses().getFirst().getDisciplines().getFirst().getModules().getFirst().getTests().getFirst().getQuestions().size();
                //            System.out.println("Numero de perguntas: "+size);
                //        for (Question ql: st.getCourses().getFirst().getDisciplines().getFirst().getModules().getFirst().getTests().getFirst().getQuestions()){
                //            
                //            switch (ql.getQuestionType()){
                //                case MULTIPLE_CHOICE:
                //                    System.out.println("Escolha Multipla");
                //                    System.out.println("Pergunta "+ ql.getText());
                //                    System.out.println("Hipoteses: ");
                //                    for (String s: ql.getPossibleAnswers()){
                //                        System.out.print("  "+s);
                //                    }
                //                    System.out.println();
                //                    System.out.println("Respostas Correctas: ");
                //                    for (String s: ql.getCorrectAnswers()){
                //                        System.out.print("  "+s);
                //                    }
                //                     System.out.println();
                //                    break;
                //                case ONE_CHOICE:
                //                    System.out.println("Uma Escolha");
                //                    System.out.println("Pergunta "+ ql.getText());
                //                    System.out.print("Hipoteses:");
                //                    for (String s: ql.getPossibleAnswers()){
                //                        System.out.print("  "+s);
                //                    }
                //                    System.out.println();
                //                    System.out.println("Resposta Correcta: "+ql.getCorrectAnswer());
                //                    break;
                //                case OPEN:
                //                    System.out.println("Pergunta Aberta");
                //                    System.out.println("Pergunta "+ ql.getText());
                //                    break;
                //            }
                //        }
                
                //manager.userService().addStudent(new Student("Rpaixao15", "123", "R", "P", "ruben.npaixao@gmail.com"));
                //manager.userService().resetPassword("ruben.npaixao@gmail.com");

                manager.setAuthentication("rls", "40bd001563085fc35165329ea1ff5c5ecbdbbeef");
//                manager.userService().changePassword("123");
                //manager.userService().resetPassword("asdasd.npaixao@gmail.com");
                System.out.println(manager.current_student.getUsername());
                manager.userService().updateCourses(student_id);
                  for (Course c : manager.current_student.getCourses()) {
                System.out.println("CURSO: " + c.getName());

                manager.userService().updateDisciplines(c);
                for (Discipline d : c.getDisciplines()) {
                    System.out.println(d.getId());
                    if(d.getId()==1){
                     manager.userService().updateForum(d);
                    System.out.println(d.getForum().getTitle());
                     Forum f = d.getForum();
                     System.out.println("ESTOU CA");

                     //
//                        manager.userService().addForumTopic(f, "FirstRunTest");
                     //   
                        System.out.println(f.getTitle());
                        System.out.println("TopicsSIZE: "+f.getTopics().size());
                        for(Topic t: f.getTopics()){
                            System.out.println("Topic: "+t.getTitle());
                            System.out.println("AnswersSIZE: "+t.getAnswers().size());
                            System.out.println("Topic N Answers:" + t.getN_answers());
                                for(TopicAnswer ta:t.getAnswers()){
                                    System.out.println("Answer: "+ta.getAnswer());
                                }
                                
                                if(t.getId()==6){
                                    System.out.println("ANTES: "+t.getN_answers());
                                    manager.userService().addTopicAnswer(t, "Answer 3");
                                    System.out.println("DEPOIS: "+t.getN_answers());
                                
                    }
                    
                    }
                       
                    
                }
                
                }
                
                
                
//            } catch (NoSuchAlgorithmException ex) {
//                Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (InstantiationException ex) {
//            Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
//        }

//    }
                  }

    }
        catch (SQLException ex) {
            Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EtoileJavaapi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}