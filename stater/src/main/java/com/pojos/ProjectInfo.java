package com.pojos;

import lombok.*;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "ProjectInfo")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class ProjectInfo extends BaseEntity{
    @Column(name = "ProjectTitle", length = 20)
    private String title;
    @Column(name = "Description", length = 20)
    private String description;
    @Column(name = "SRS", length = 20)
    @Lob
    private Blob srs;
    @Lob
    private Blob ppt;
    @Lob
    private Byte report;
    @Enumerated(EnumType.STRING)
    @Column(name = "projectStatus", length = 10)
    private Status projectStatus;

}
