package com.trungndz.classroombook.entities;
// Generated 14-Dec-2018 15:20:34 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * Room generated by hbm2java
 */
@Entity
@Table(name = "room", schema = "public")
public class Room implements java.io.Serializable {

	private int idroom;
	private String roomname;
	private Integer seatamount;
	private Set<Roomsession> roomsessions = new HashSet<Roomsession>(0);

	public Room() {
	}

	public Room(int idroom) {
		this.idroom = idroom;
	}

	public Room(int idroom, String roomname, Integer seatamount, Set<Roomsession> roomsessions) {
		this.idroom = idroom;
		this.roomname = roomname;
		this.seatamount = seatamount;
		this.roomsessions = roomsessions;
	}

	@Id

	@Column(name = "idroom", unique = true, nullable = false)
	public int getIdroom() {
		return this.idroom;
	}

	public void setIdroom(int idroom) {
		this.idroom = idroom;
	}

	@Column(name = "roomname", length = 50)
	public String getRoomname() {
		return this.roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	@Column(name = "seatamount")
	public Integer getSeatamount() {
		return this.seatamount;
	}

	public void setSeatamount(Integer seatamount) {
		this.seatamount = seatamount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
	@JsonBackReference
	public Set<Roomsession> getRoomsessions() {
		return this.roomsessions;
	}

	public void setRoomsessions(Set<Roomsession> roomsessions) {
		this.roomsessions = roomsessions;
	}

}
