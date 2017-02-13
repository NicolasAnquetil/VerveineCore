// Automagically generated code, please do not change
package eu.synectique.verveine.core.gen.famix;

import ch.akuhn.fame.internal.MultivalueSet;
import java.util.*;
import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FAMIX")
@FameDescription("NamedEntity")
public class NamedEntity extends SourcedEntity {


    
    @FameProperty(name = "isAbstract", derived = true)
    public Boolean getIsAbstract() {
        return hasModifier("abstract");
    }
                
    @FameProperty(name = "isPrivate", derived = true)
    public Boolean getIsPrivate() {
        return hasModifier("private");
    }

    @FameProperty(name = "isPackage", derived = true)
    public Boolean getIsPackage() {
        return hasModifier("package");
    }
    
    private Package parentPackage;
    
    @FameProperty(name = "parentPackage", opposite = "childNamedEntities")
    public Package getParentPackage() {
        return parentPackage;
    }

    public void setParentPackage(Package parentPackage) {
        if (this.parentPackage != null) {
            if (this.parentPackage.equals(parentPackage)) return;
            this.parentPackage.getChildNamedEntities().remove(this);
        }
        this.parentPackage = parentPackage;
        if (parentPackage == null) return;
        parentPackage.getChildNamedEntities().add(this);
    }
    
    private String name;
    
    @FameProperty(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private Boolean isStub;
    
    @FameProperty(name = "isStub")
    public Boolean getIsStub() {
        return isStub;
    }

    public void setIsStub(Boolean isStub) {
        this.isStub = isStub;
    }
    
    @FameProperty(name = "isPublic", derived = true)
    public Boolean getIsPublic() {
        return hasModifier("public");
    }
                
    @FameProperty(name = "isProtected", derived = true)
    public Boolean getIsProtected() {
        return hasModifier("protected");
    }
    
    private Collection<Invocation> receivingInvocations; 

    @FameProperty(name = "receivingInvocations", opposite = "receiver", derived = true)
    public Collection<Invocation> getReceivingInvocations() {
        if (receivingInvocations == null) {
            receivingInvocations = new MultivalueSet<Invocation>() {
                @Override
                protected void clearOpposite(Invocation e) {
                    e.setReceiver(null);
                }
                @Override
                protected void setOpposite(Invocation e) {
                    e.setReceiver(NamedEntity.this);
                }
            };
        }
        return receivingInvocations;
    }
    
    public void setReceivingInvocations(Collection<? extends Invocation> receivingInvocations) {
        this.getReceivingInvocations().clear();
        this.getReceivingInvocations().addAll(receivingInvocations);
    }                    
    
        
    public void addReceivingInvocations(Invocation one) {
        this.getReceivingInvocations().add(one);
    }   
    
    public void addReceivingInvocations(Invocation one, Invocation... many) {
        this.getReceivingInvocations().add(one);
        for (Invocation each : many)
            this.getReceivingInvocations().add(each);
    }   
    
    public void addReceivingInvocations(Iterable<? extends Invocation> many) {
        for (Invocation each : many)
            this.getReceivingInvocations().add(each);
    }   
                
    public void addReceivingInvocations(Invocation[] many) {
        for (Invocation each : many)
            this.getReceivingInvocations().add(each);
    }
    
    public int numberOfReceivingInvocations() {
        return getReceivingInvocations().size();
    }

    public boolean hasReceivingInvocations() {
        return !getReceivingInvocations().isEmpty();
    }
    
/*    
    @FameProperty(name = "nameLength", derived = true)
    public Number getNameLength() {
        // TODO: this is a derived property, implement this method manually.
        throw new UnsupportedOperationException("Not yet implemented!");  
    }
*/    
    private Collection<AnnotationInstance> annotationInstances; 

    @FameProperty(name = "annotationInstances", opposite = "annotatedEntity", derived = true)
    public Collection<AnnotationInstance> getAnnotationInstances() {
        if (annotationInstances == null) {
            annotationInstances = new MultivalueSet<AnnotationInstance>() {
                @Override
                protected void clearOpposite(AnnotationInstance e) {
                    e.setAnnotatedEntity(null);
                }
                @Override
                protected void setOpposite(AnnotationInstance e) {
                    e.setAnnotatedEntity(NamedEntity.this);
                }
            };
        }
        return annotationInstances;
    }
    
    public void setAnnotationInstances(Collection<? extends AnnotationInstance> annotationInstances) {
        this.getAnnotationInstances().clear();
        this.getAnnotationInstances().addAll(annotationInstances);
    }                    
    
        
    public void addAnnotationInstances(AnnotationInstance one) {
        this.getAnnotationInstances().add(one);
    }   
    
    public void addAnnotationInstances(AnnotationInstance one, AnnotationInstance... many) {
        this.getAnnotationInstances().add(one);
        for (AnnotationInstance each : many)
            this.getAnnotationInstances().add(each);
    }   
    
    public void addAnnotationInstances(Iterable<? extends AnnotationInstance> many) {
        for (AnnotationInstance each : many)
            this.getAnnotationInstances().add(each);
    }   
                
    public void addAnnotationInstances(AnnotationInstance[] many) {
        for (AnnotationInstance each : many)
            this.getAnnotationInstances().add(each);
    }
    
    public int numberOfAnnotationInstances() {
        return getAnnotationInstances().size();
    }

    public boolean hasAnnotationInstances() {
        return !getAnnotationInstances().isEmpty();
    }
    
    
    private Collection<String> modifiers; 

    protected Boolean hasModifier(String mod) {
    	for (String m : this.getModifiers()) {
    		if (m.equals(mod))
    			return true;
    	}
    	return false;
    }

    @FameProperty(name = "modifiers")
    public Collection<String> getModifiers() {
        if (modifiers == null) modifiers = new HashSet<String>();
        return modifiers;
    }
    
    public void setModifiers(Collection<? extends String> modifiers) {
        this.getModifiers().clear();
        this.getModifiers().addAll(modifiers);
    }                    

    public void addModifiers(String one) {
        this.getModifiers().add(one);
    }   
    
    public void addModifiers(String one, String... many) {
        this.getModifiers().add(one);
        for (String each : many)
            this.getModifiers().add(each);
    }   
    
    public void addModifiers(Iterable<? extends String> many) {
        for (String each : many)
            this.getModifiers().add(each);
    }   
                
    public void addModifiers(String[] many) {
        for (String each : many)
            this.getModifiers().add(each);
    }
    
    public int numberOfModifiers() {
        return getModifiers().size();
    }

    public boolean hasModifiers() {
        return !getModifiers().isEmpty();
    }
    
    private Collection<eu.synectique.verveine.core.gen.fast.NamedEntity> fastNamedEntities; 

    @FameProperty(name = "fastNamedEntities", opposite = "famixNamedEntity")
    public Collection<eu.synectique.verveine.core.gen.fast.NamedEntity> getFastNamedEntities() {
        if (fastNamedEntities == null) {
            fastNamedEntities = new MultivalueSet<eu.synectique.verveine.core.gen.fast.NamedEntity>() {
                @Override
                protected void clearOpposite(eu.synectique.verveine.core.gen.fast.NamedEntity e) {
                    e.setFamixNamedEntity(null);
                }
                @Override
                protected void setOpposite(eu.synectique.verveine.core.gen.fast.NamedEntity e) {
                    e.setFamixNamedEntity(eu.synectique.verveine.core.gen.famix.NamedEntity.this);
                }
            };
        }
        return fastNamedEntities;
    }
    
    public void setFastNamedEntities(Collection<? extends eu.synectique.verveine.core.gen.fast.NamedEntity> fastNamedEntities) {
        this.getFastNamedEntities().clear();
        this.getFastNamedEntities().addAll(fastNamedEntities);
    }                    
    
        
    public void addFastNamedEntities(eu.synectique.verveine.core.gen.fast.NamedEntity one) {
        this.getFastNamedEntities().add(one);
    }   
    
    public void addFastNamedEntities(eu.synectique.verveine.core.gen.fast.NamedEntity one, eu.synectique.verveine.core.gen.fast.NamedEntity... many) {
        this.getFastNamedEntities().add(one);
        for (eu.synectique.verveine.core.gen.fast.NamedEntity each : many)
            this.getFastNamedEntities().add(each);
    }   
    
    public void addFastNamedEntities(Iterable<? extends eu.synectique.verveine.core.gen.fast.NamedEntity> many) {
        for (eu.synectique.verveine.core.gen.fast.NamedEntity each : many)
            this.getFastNamedEntities().add(each);
    }   
                
    public void addFastNamedEntities(eu.synectique.verveine.core.gen.fast.NamedEntity[] many) {
        for (eu.synectique.verveine.core.gen.fast.NamedEntity each : many)
            this.getFastNamedEntities().add(each);
    }
    
    public int numberOfFastNamedEntities() {
        return getFastNamedEntities().size();
    }

    public boolean hasFastNamedEntities() {
        return !getFastNamedEntities().isEmpty();
    }
    
                
    @FameProperty(name = "belongsTo", derived = true)
    public ContainerEntity getBelongsTo() {
        // this is a derived property, implement this method manually.
        throw new UnsupportedOperationException("NamedEntity.getBelongsTo() not implemented in class "+this.getClass().getName()); 
    }
                
    @FameProperty(name = "isFinal", derived = true)
    public Boolean getIsFinal() {
        return hasModifier("final");
    }
    

	@Override
	public String toString() {
		// mainly for debugging purposes (in Eclipse debugger)
		return "a " + this.getClass().getSimpleName() + " named: " + this.getName();
	}
    

}
