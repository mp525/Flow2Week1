package dk.mparking.jpademo.entities;

import dk.mparking.jpademo.entities.Address;
import dk.mparking.jpademo.entities.Fee;
import dk.mparking.jpademo.entities.SwimStyle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-23T13:26:49")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile ListAttribute<Person, Fee> fees;
    public static volatile SingularAttribute<Person, Address> address;
    public static volatile SingularAttribute<Person, Integer> year;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile ListAttribute<Person, SwimStyle> styles;
    public static volatile SingularAttribute<Person, Long> p_id;

}