// Automagically generated code, please do not change
package eu.synectique.verveine.core.gen.file;

import eu.synectique.verveine.core.gen.famix.Entity;
import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FILE")
@FameDescription("AbstractFile")
public class AbstractFile extends Entity {



    private String name;
    
    @FameProperty(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    


}

