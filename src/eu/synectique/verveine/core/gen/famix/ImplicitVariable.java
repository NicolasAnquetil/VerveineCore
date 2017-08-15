// Automagically generated code, please do not change
package eu.synectique.verveine.core.gen.famix;

import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FAMIX")
@FameDescription("ImplicitVariable")
public class ImplicitVariable extends StructuralEntity {



    private BehaviouralEntity parentBehaviouralEntity;
    
    @FameProperty(name = "parentBehaviouralEntity", opposite = "implicitVariables", container = true)
    public BehaviouralEntity getParentBehaviouralEntity() {
        return parentBehaviouralEntity;
    }

    public void setParentBehaviouralEntity(BehaviouralEntity parentBehaviouralEntity) {
        if (this.parentBehaviouralEntity != null) {
            if (this.parentBehaviouralEntity.equals(parentBehaviouralEntity)) return;
            this.parentBehaviouralEntity.getImplicitVariables().remove(this);
        }
        this.parentBehaviouralEntity = parentBehaviouralEntity;
        if (parentBehaviouralEntity == null) return;
        parentBehaviouralEntity.getImplicitVariables().add(this);
    }

    @Override
	public ContainerEntity getBelongsTo() {
		return getParentBehaviouralEntity();
	}
    
    @Override
    public void setBelongsTo(ContainerEntity container) {
    	if (container instanceof BehaviouralEntity) {
    		setParentBehaviouralEntity((BehaviouralEntity) container);
    	}
    }


}

