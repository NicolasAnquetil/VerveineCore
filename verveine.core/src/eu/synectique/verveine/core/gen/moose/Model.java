// Automagically generated code, please do not change
package eu.synectique.verveine.core.gen.moose;

import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;
import eu.synectique.verveine.core.gen.famix.SourceLanguage;


@FamePackage("Moose")
@FameDescription("Model")
public class Model extends AbstractGroup {



    private Number numberOfPackages;
    
    @FameProperty(name = "numberOfPackages")
    public Number getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(Number numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }
    
    private SourceLanguage sourceLanguage;
    
    @FameProperty(name = "sourceLanguage")
    public SourceLanguage getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(SourceLanguage sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }
    


}
