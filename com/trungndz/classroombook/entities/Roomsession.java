package com.trungndz.classroombook.entities;
// Generated 12-Dec-2018 00:21:12 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Roomsession generated by hbm2java
 */
@Entity
@Table(name = "roomsession", schema = "public")
public class Roomsession implements java.io.Serializable {

	private RoomsessionId id;
	private Integer subscriber;
	private Integer creator;
	private Integer approver;
	private Date date;

	public Roomsession() {
	}

	public Roomsession(RoomsessionId id) {
		this.id = id;
	}

	public Roomsession(RoomsessionId id, Integer subscriber, Integer creator, Integer approver, Date date) {
		this.id = id;
		this.subscriber = subscriber;
		this.creator = creator;
		this.approver = approver;
		this.date = date;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idroom", column = @Column(name = "idroom", nullable = false)),
			@AttributeOverride(name = "idsession", column = @Column(name = "idsession", nullable = false)) })
	public RoomsessionId getId() {
		return this.id;
	}

	public void setId(RoomsessionId id) {
		this.id = id;
	}

	@Column(name = "subscriber")
	public Integer getSubscriber() {
		return this.subscriber;
	}

	public void setSubscriber(Integer subscriber) {
		this.subscriber = subscriber;
	}

	@Column(name = "creator")
	public Integer getCreator() {
		return this.creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	@Column(name = "approver")
	public Integer getApprover() {
		return this.approver;
	}

	public void setApprover(Integer approver) {
		this.approver = approver;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", length = 29)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}