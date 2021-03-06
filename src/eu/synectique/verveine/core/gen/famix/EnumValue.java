// Automagically generated code, please do not change
package eu.synectique.verveine.core.gen.famix;

import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FAMIX")
@FameDescription("EnumValue")
public class EnumValue extends StructuralEntity {



    private Enum parentEnum;
    
    @FameProperty(name = "parentEnum", opposite = "values", container = true)
    public Enum getParentEnum() {
        return parentEnum;
    }

    public void setParentEnum(Enum parentEnum) {
        if (this.parentEnum != null) {
            if (this.parentEnum.equals(parentEnum)) return;
            this.parentEnum.getValues().remove(this);
        }
        this.parentEnum = parentEnum;
        if (parentEnum == null) return;
        parentEnum.getValues().add(this);
    }

    @Override
	public ContainerEntity getBelongsTo() {
		return getParentEnum();
	}
    
    @Override
    public void setBelongsTo(ContainerEntity container) {
    	if (container instanceof Enum) {
    		setParentEnum((Enum) container);
    	}
	}
    


}

