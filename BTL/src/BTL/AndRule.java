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
public class AndRule {
    public int nIDCondition1;
    public int nIDCondition2;
    public int nIDResult;
    public float CF;

    public AndRule(int nIDCondition1, int nIDCondition2, int nIDResult, float CF) {
        this.nIDCondition1 = nIDCondition1;
        this.nIDCondition2 = nIDCondition2;
        this.nIDResult = nIDResult;
        this.CF = CF;
    }
    
    public boolean equals(Object s)
    {
        return nIDResult == ((AndRule)s).nIDResult;
    }
}
