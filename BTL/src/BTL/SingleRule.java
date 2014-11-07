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
public class SingleRule {
    public int nIDCondition;
    public int nIDResult;
    public float CF;

    public SingleRule(int nIDCondition, int nIDResult, float CF) {
        this.nIDCondition = nIDCondition;
        this.nIDResult = nIDResult;
        this.CF = CF;
    }
    
    public boolean equals(Object s)
    {
        return nIDResult == ((SingleRule)s).nIDResult;
    }
}
