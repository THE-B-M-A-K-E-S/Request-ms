package com.thebmakes.requestms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Document("Requests")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    private String id;
    private String state;
    private Date startdate;
    private Date enddate;
    private String reason;

}
