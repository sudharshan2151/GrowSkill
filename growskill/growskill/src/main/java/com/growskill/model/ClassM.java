package com.growskill.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ClassM {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private LocalDateTime date;
	    private String topic;
	    private String zoomLink;
	    @ManyToOne(cascade = CascadeType.ALL)
	    private Course course;
	    @ManyToOne(cascade = CascadeType.ALL)
	    private Customer customer;
	    
		public ClassM(LocalDateTime date, String topic, String zoomLink) {
			super();
			this.date = date;
			this.topic = topic;
			this.zoomLink = zoomLink;
		}
	    
	    
}
