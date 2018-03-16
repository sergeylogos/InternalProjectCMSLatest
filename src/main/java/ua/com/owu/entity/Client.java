package ua.com.owu.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Reference;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(noClassnameStored = true,value = "client")
@ToString(exclude = {"group"})
public class Client {
    @Id
    private ObjectId id;

    @Indexed
    private String name;
    @Indexed
    private String surname;
    @Indexed
    private String phoneNumber;
    @Indexed
    private String email;
    private String city;
    private String commentAboutClient;
    private Set<String> tagsAboutClient = new HashSet<>();
//    private Map<String, String> socials = new HashMap<>();
    @Reference
    private Client recomendation;

    @Reference
    private Group group;



}
