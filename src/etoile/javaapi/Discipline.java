/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etoile.javaapi;

import etoile.javaapi.forum.Forum;
import java.io.Serializable;
import java.util.LinkedList;


/**
 *
 * @author Rui
 */
public class Discipline implements Serializable{
    public String name;
    public int id;
    public String description;
    
    public LinkedList<Module> modules= new LinkedList<Module>();
    public Forum forum;

    public Discipline(int id, String description,String name) {
        this.name = name;
        this.id = id;
        this.description=description;
    }
    
    public void setForum(Forum f){
        this.forum=f;
    }
    
    public Forum getForum(){
        return forum;
    }

    public String getDescription(){
        return description;
    }
    
    public int getId() {
        return id;
    }

    public LinkedList<Module> getModules() {
        return modules;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModules(LinkedList<Module> modules) {
        this.modules = modules;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setModules(Module module) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void addModule(Module m) {
        modules.add(m);
    }

    public void cleanForum() {
        forum = null;
    }
    
}
