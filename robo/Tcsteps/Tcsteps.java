/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo.Tcsteps;

public class Tcsteps {

    private int tcstep_id; 
    private String notes; 
    private String status;
    private int execution_tcstep_id;
    
    public Tcsteps(int tcstep_id, String notes, String status) {
        this.tcstep_id = tcstep_id;
        this.notes = notes;
        this.status = status;
    }
    
   

    public int getTcstep_id() {
        return tcstep_id;
    }

    public void setTcstep_id(int tcstep_id) {
        this.tcstep_id = tcstep_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getExecution_tcstep_id() {
        return execution_tcstep_id;
    }

    public void setExecution_tcstep_id(int execution_tcstep_is) {
        this.execution_tcstep_id = execution_tcstep_is;
    }
    
    
    
    
}
