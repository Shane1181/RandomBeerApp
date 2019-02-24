package beer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*Using ORM her to map each attribute on the entity to a corresponding column on the database table*/
@Entity
public class Beer {
    @Id
    @Column(name = "ID")
    private  Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "abv")
    private float abv;

    @Column(name = "LOCATION")
    private String location;

    public Beer(){}

    public Beer(long id, String name, String description, float abv, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.abv = abv;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAbv() {
        return abv;
    }

    public void setAbv(float abv) {
        this.abv = abv;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
