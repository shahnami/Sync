/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recognition;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 *
 * @author Nami
 */
@Root(name="Param")
public class Param {
    public Param(){
        
    }
    @Attribute(required=false)
    private String value="";
    
    public String getValue(){
        return value;
    }
}