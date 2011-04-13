// Automagically generated code, please do not change
package fr.inria.verveine.core.gen.famix;

import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FAMIX")
@FameDescription("EnumValue")
public class EnumValue extends StructuralEntity {



    private Enum parentEnum;
    
    @FameProperty(name = "parentEnum", opposite = "values")
    public Enum getParentEnum() {
        return parentEnum;
    }

    @Override
	public ContainerEntity getBelongsTo() {
		return getParentEnum();
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
    


}

