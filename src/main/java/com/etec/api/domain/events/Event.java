package com.etec.api.domain.events;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "events")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Event {
    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String description;

    private String imgUrl;

    private String EventUrl;

    private Boolean remote;

    private Date date;
    
}
