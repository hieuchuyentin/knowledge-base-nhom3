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
import java.util.*;
public class Calculate {
    ArrayList<Event> listEvent = new ArrayList<Event>();
    ArrayList<Event> listEventBase = new ArrayList<Event>();
    ArrayList<SingleRule> listSingleRule = new ArrayList<SingleRule>();
    ArrayList<SingleRule> listSingleRuleBase = new ArrayList<SingleRule>();
    ArrayList<AndRule> listAndRule = new ArrayList<AndRule>();
    ArrayList<AndRule> listAndRuleBase = new ArrayList<AndRule>();
    ArrayList<OrRule> listOrRule = new ArrayList<OrRule>();
    ArrayList<OrRule> listOrRuleBase = new ArrayList<OrRule>();
    
    public Calculate(ArrayList<Event> listEventStart, 
            ArrayList<SingleRule> listSingleRuleStart, 
            ArrayList<AndRule> listAndRuleStart, 
            ArrayList<OrRule> listOrRuleStart)
    {
        listEventBase.clear();
        listSingleRuleBase.clear();
        listAndRuleBase.clear();
        listOrRuleBase.clear();
        
        listEventBase.addAll(listEventStart);
        listSingleRuleBase.addAll(listSingleRuleStart);
        listAndRuleBase.addAll(listAndRuleStart);
        listOrRuleBase.addAll(listOrRuleStart);
    }
    public void InitCalculate()
    {
        listEvent.clear();
        listSingleRule.clear();
        listAndRule.clear();
        listOrRule.clear();
        
        listEvent.addAll(listEventBase);
        listSingleRule.addAll(listSingleRuleBase);
        listAndRule.addAll(listAndRuleBase);
        listOrRule.addAll(listOrRuleBase);
    }
    private float Abs(float a)
    {
        if (a < 0)
            return -a;
        else
            return a;             
    }
    private float Max(float a, float b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
    private float Min(float a, float b)
    {
        if (a < b)
            return a;
        else
            return b;
    }
    private float CalculateCF(float CF1, float CF2)
    {
        if ((CF1 == 0) || (CF2 == 0))
            return CF1 + CF2;
        
        if ((CF1 < 0) && (CF2 < 0))
            return CF1 + CF2 + CF1 * CF2;
        
        if ((CF1 > 0) && (CF2 > 0))
            return CF1 + CF2 - CF1 * CF2;
        
        float d = 1 - Min(Abs(CF1), Abs(CF2));
        if (d != 0)
            return (CF1 + CF2) / d;
        else
            return 0;
    }
    public float RecuresiveCalculate(int nIDEvent)
    {
        Event s = new Event(nIDEvent, 0.0f);
        SingleRule sS = new SingleRule(0, nIDEvent, 0.0f);
        AndRule sA = new AndRule(0, 0, nIDEvent, 0.0f);
        OrRule sO = new OrRule( 0, 0, nIDEvent, 0.0f);
        
        float dCF = 0, dTemp;
        int nIndex;
        SingleRule ruleSingle;
        AndRule ruleAnd;
        OrRule ruleOr;
        
        if (listEvent.contains(s))
            return listEvent.get(listEvent.indexOf(s)).CF;
        
        listEvent.add(s);
        
        //Tinh toan voi cac luat don
        do
        {
            nIndex = listSingleRule.indexOf(sS);
            if (nIndex == -1)
                break;
            
            ruleSingle = listSingleRule.get(nIndex);
            listSingleRule.remove(nIndex);
            
            dTemp = ruleSingle.CF * RecuresiveCalculate(ruleSingle.nIDCondition);
            dCF = CalculateCF(dCF, dTemp);
        }
        while (true);
        
        //Tinh toan voi cac luat And
        do
        {
            nIndex = listAndRule.indexOf(sA);
            if (nIndex == -1)
                break;
            
            ruleAnd = listAndRule.get(nIndex);
            listAndRule.remove(nIndex);
            
            dTemp = ruleAnd.CF * 
                    Min(RecuresiveCalculate(ruleAnd.nIDCondition1), 
                            RecuresiveCalculate(ruleAnd.nIDCondition2));
            dCF = CalculateCF(dCF, dTemp);
        }
        while (true);
        
        //Tinh toan voi cac luat Or
        do
        {
            nIndex = listOrRule.indexOf(sO);
            if (nIndex == -1)
                break;
            
            ruleOr = listOrRule.get(nIndex);
            listOrRule.remove(nIndex);
            
            dTemp = ruleOr.CF * 
                    Max(RecuresiveCalculate(ruleOr.nIDCondition1), 
                            RecuresiveCalculate(ruleOr.nIDCondition2));            
            dCF = CalculateCF(dCF, dTemp);
        }
        while (true);
        
        return dCF;
    }
    public float CalculateProbability(int nIDEvent)
    {
        InitCalculate();
        return RecuresiveCalculate(nIDEvent);
    }
}
