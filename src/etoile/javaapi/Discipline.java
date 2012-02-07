/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etoile.javaapi;

import java.util.LinkedList;


/**
 *
 * @author Rui
 */
public class Discipline {
    public String name;
    public int id;
    
    public LinkedList<Module> modules= new LinkedList<Module>();

    public Discipline(String name, int id) {
        this.name = name;
        this.id = id;
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

    void addModule(Module m) {
        modules.add(m);
    }
    
}