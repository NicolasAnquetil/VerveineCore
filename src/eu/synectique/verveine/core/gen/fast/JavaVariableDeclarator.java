// Automagically generated code, please do not change
package eu.synectique.verveine.core.gen.fast;

import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FAST")
@FameDescription("JavaVariableDeclarator")
public class JavaVariableDeclarator extends Entity {



    private Expression expression;
    
    @FameProperty(name = "expression")
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private NamedEntity variable;
    
    @FameProperty(name = "variable")
    public NamedEntity getVariable() {
        return variable;
    }

    public void setVariable(NamedEntity variable) {
        this.variable = variable;
    }
    


}

