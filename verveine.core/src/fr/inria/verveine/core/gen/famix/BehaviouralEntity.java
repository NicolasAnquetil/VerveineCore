// Automagically generated code, please do not change
package fr.inria.verveine.core.gen.famix;

import ch.akuhn.fame.internal.MultivalueSet;
import java.util.*;
import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FAMIX")
@FameDescription("BehaviouralEntity")
public class BehaviouralEntity extends ContainerEntity {


	private int cyclo = 0;  // metric: Cyclomatic complexity
	private int nos = 0;    // metric Number Of Statement


    private Collection<Access> accesses; 

    @FameProperty(name = "accesses", opposite = "accessor", derived = true)
    public Collection<Access> getAccesses() {
        if (accesses == null) {
            accesses = new MultivalueSet<Access>() {
                @Override
                protected void clearOpposite(Access e) {
                    e.setAccessor(null);
                }
                @Override
                protected void setOpposite(Access e) {
                    e.setAccessor(BehaviouralEntity.this);
                }
            };
        }
        return accesses;
    }
    
    public void setAccesses(Collection<? extends Access> accesses) {
        this.getAccesses().clear();
        this.getAccesses().addAll(accesses);
    }                    
    
        
    public void addAccesses(Access one) {
        this.getAccesses().add(one);
    }   
    
    public void addAccesses(Access one, Access... many) {
        this.getAccesses().add(one);
        for (Access each : many)
            this.getAccesses().add(each);
    }   
    
    public void addAccesses(Iterable<? extends Access> many) {
        for (Access each : many)
            this.getAccesses().add(each);
    }   
                
    public void addAccesses(Access[] many) {
        for (Access each : many)
            this.getAccesses().add(each);
    }
    
    public int numberOfAccesses() {
        return getAccesses().size();
    }

    public boolean hasAccesses() {
        return !getAccesses().isEmpty();
    }
    
                
    private Collection<Invocation> outgoingInvocations; 

    @FameProperty(name = "outgoingInvocations", opposite = "sender", derived = true)
    public Collection<Invocation> getOutgoingInvocations() {
        if (outgoingInvocations == null) {
            outgoingInvocations = new MultivalueSet<Invocation>() {
                @Override
                protected void clearOpposite(Invocation e) {
                    e.setSender(null);
                }
                @Override
                protected void setOpposite(Invocation e) {
                    e.setSender(BehaviouralEntity.this);
                }
            };
        }
        return outgoingInvocations;
    }
    
    public void setOutgoingInvocations(Collection<? extends Invocation> outgoingInvocations) {
        this.getOutgoingInvocations().clear();
        this.getOutgoingInvocations().addAll(outgoingInvocations);
    }                    
    
        
    public void addOutgoingInvocations(Invocation one) {
        this.getOutgoingInvocations().add(one);
    }   
    
    public void addOutgoingInvocations(Invocation one, Invocation... many) {
        this.getOutgoingInvocations().add(one);
        for (Invocation each : many)
            this.getOutgoingInvocations().add(each);
    }   
    
    public void addOutgoingInvocations(Iterable<? extends Invocation> many) {
        for (Invocation each : many)
            this.getOutgoingInvocations().add(each);
    }   
                
    public void addOutgoingInvocations(Invocation[] many) {
        for (Invocation each : many)
            this.getOutgoingInvocations().add(each);
    }
    
    public int numberOfOutgoingInvocations() {
        return getOutgoingInvocations().size();
    }

    public boolean hasOutgoingInvocations() {
        return !getOutgoingInvocations().isEmpty();
    }
    
                
    private Type declaredType;
    
    @FameProperty(name = "declaredType")
    public Type getDeclaredType() {
        return declaredType;
    }

    public void setDeclaredType(Type declaredType) {
        this.declaredType = declaredType;
    }
    
    private Collection<Invocation> incomingInvocations; 

    @FameProperty(name = "incomingInvocations", opposite = "candidates", derived = true)
    public Collection<Invocation> getIncomingInvocations() {
        if (incomingInvocations == null) {
            incomingInvocations = new MultivalueSet<Invocation>() {
                @Override
                protected void clearOpposite(Invocation e) {
                    e.getCandidates().remove(BehaviouralEntity.this);
                }
                @Override
                protected void setOpposite(Invocation e) {
                    e.getCandidates().add(BehaviouralEntity.this);
                }
            };
        }
        return incomingInvocations;
    }
    
    public void setIncomingInvocations(Collection<? extends Invocation> incomingInvocations) {
        this.getIncomingInvocations().clear();
        this.getIncomingInvocations().addAll(incomingInvocations);
    }
    
    public void addIncomingInvocations(Invocation one) {
        this.getIncomingInvocations().add(one);
    }   
    
    public void addIncomingInvocations(Invocation one, Invocation... many) {
        this.getIncomingInvocations().add(one);
        for (Invocation each : many)
            this.getIncomingInvocations().add(each);
    }   
    
    public void addIncomingInvocations(Iterable<? extends Invocation> many) {
        for (Invocation each : many)
            this.getIncomingInvocations().add(each);
    }   
                
    public void addIncomingInvocations(Invocation[] many) {
        for (Invocation each : many)
            this.getIncomingInvocations().add(each);
    }
    
    public int numberOfIncomingInvocations() {
        return getIncomingInvocations().size();
    }

    public boolean hasIncomingInvocations() {
        return !getIncomingInvocations().isEmpty();
    }
    
                
    private Collection<LocalVariable> localVariables; 

    @FameProperty(name = "localVariables", opposite = "parentBehaviouralEntity", derived = true)
    public Collection<LocalVariable> getLocalVariables() {
        if (localVariables == null) {
            localVariables = new MultivalueSet<LocalVariable>() {
                @Override
                protected void clearOpposite(LocalVariable e) {
                    e.setParentBehaviouralEntity(null);
                }
                @Override
                protected void setOpposite(LocalVariable e) {
                    e.setParentBehaviouralEntity(BehaviouralEntity.this);
                }
            };
        }
        return localVariables;
    }
    
    public void setLocalVariables(Collection<? extends LocalVariable> localVariables) {
        this.getLocalVariables().clear();
        this.getLocalVariables().addAll(localVariables);
    }                    
    
        
    public void addLocalVariables(LocalVariable one) {
        this.getLocalVariables().add(one);
    }   
    
    public void addLocalVariables(LocalVariable one, LocalVariable... many) {
        this.getLocalVariables().add(one);
        for (LocalVariable each : many)
            this.getLocalVariables().add(each);
    }   
    
    public void addLocalVariables(Iterable<? extends LocalVariable> many) {
        for (LocalVariable each : many)
            this.getLocalVariables().add(each);
    }   
                
    public void addLocalVariables(LocalVariable[] many) {
        for (LocalVariable each : many)
            this.getLocalVariables().add(each);
    }
    
    public int numberOfLocalVariables() {
        return getLocalVariables().size();
    }

    public boolean hasLocalVariables() {
        return !getLocalVariables().isEmpty();
    }
    
                
    private Collection<Parameter> parameters; 

    @FameProperty(name = "parameters", opposite = "parentBehaviouralEntity", derived = true)
    public Collection<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new MultivalueSet<Parameter>() {
                @Override
                protected void clearOpposite(Parameter e) {
                    e.setParentBehaviouralEntity(null);
                }
                @Override
                protected void setOpposite(Parameter e) {
                    e.setParentBehaviouralEntity(BehaviouralEntity.this);
                }
            };
        }
        return parameters;
    }
    
    public void setParameters(Collection<? extends Parameter> parameters) {
        this.getParameters().clear();
        this.getParameters().addAll(parameters);
    }                    
    
        
    public void addParameters(Parameter one) {
        this.getParameters().add(one);
    }   
    
    public void addParameters(Parameter one, Parameter... many) {
        this.getParameters().add(one);
        for (Parameter each : many)
            this.getParameters().add(each);
    }   
    
    public void addParameters(Iterable<? extends Parameter> many) {
        for (Parameter each : many)
            this.getParameters().add(each);
    }   
                
    public void addParameters(Parameter[] many) {
        for (Parameter each : many)
            this.getParameters().add(each);
    }
    
    public int numberOfParameters() {
        return getParameters().size();
    }

    public boolean hasParameters() {
        return !getParameters().isEmpty();
    }
    
                
    private String signature;
    
    @FameProperty(name = "signature")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setCyclo(int cyclo) {
		this.cyclo = cyclo;
	}

	@FameProperty(name = "CYCLO")
	public int getCyclo() {
		return cyclo;
	}

    @FameProperty(name = "NOS")
	public int getNOS() {
		return nos;
	}

	public void setNOS(int nos) {
		this.nos = nos;
	}
    


}

