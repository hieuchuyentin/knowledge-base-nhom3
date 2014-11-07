/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTL;

/**
 *
 * @author Administrator
 */
public class Event {
    public int nID;
    public float CF;
    public String sDetail;

    public Event(int nID, float CF) {
        this.nID = nID;
        this.CF = CF;
        this.sDetail = "";
    }

    public Event(int nID, float CF, String sDetail) {
        this.nID = nID;
        this.CF = CF;
        this.sDetail = sDetail;
    }
    
    
    public boolean equals(Object s)
    {
        return nID == ((Event)s).nID;
    }
}
