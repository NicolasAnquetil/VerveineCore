// Automagically generated code, please do not change
package eu.synectique.verveine.core.gen.famix;

import ch.akuhn.fame.FameProperty;
import ch.akuhn.fame.FameDescription;
import ch.akuhn.fame.FamePackage;


@FamePackage("FAMIX")
@FameDescription("Comment")
public class Comment extends SourcedEntity {



    private String content;
    
    @FameProperty(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    private SourcedEntity container;
    
    @FameProperty(name = "container", opposite = "comments")
    public SourcedEntity getContainer() {
        return container;
    }

    public void setContainer(SourcedEntity container) {
        if (this.container != null) {
            if (this.container.equals(container)) return;
            this.container.getComments().remove(this);
        }
        this.container = container;
        if (container == null) return;
        container.getComments().add(this);
    }
    


}

