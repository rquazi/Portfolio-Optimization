/*
 * Constants.java
 *
 * Created on November 10, 2007, 10:41 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Rumana;

/**
 *
 * @author Quazi
 */

public interface Constants{
    
    
    int gLowerLimit=0;
    int gUpperLimit=1;
    
    final int gParamNo = 4;
    final int gPopSize = 4;  // need to decide
    final  int gMaxNoEvaluation= 1000;//gParamNo*10000; //500000;

final  double gCrossRate=  0.9;// 0.8;// {0.1, 0.3, 0.6, 0.8, 1.0}
 final  double gAmpFact = 0.9;// 0.5;// {0.1, 0.5, 0.8, 1.2, 1.6, 1.9}
}
    