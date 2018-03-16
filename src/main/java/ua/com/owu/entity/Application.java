package ua.com.owu.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(noClassnameStored = true,value = "application")
public class Application {


    @Id
    private ObjectId id;
//    @DateTimeFormat
    private Date appReciveDate;
    private String source;
    private String commnetFromClient;
    private String commentFromManager;
    @Indexed
    private Set<String> tagsAboutApplication = new HashSet<>();
    private String futureCourse;
    private String appCloseDate;
    private Integer discount;
    private Double priceWithDiscount;
    @Reference
    private Client client;

    @Reference
    private Course course;
}
