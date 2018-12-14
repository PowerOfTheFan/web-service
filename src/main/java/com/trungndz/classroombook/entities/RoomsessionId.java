package com.trungndz.classroombook.entities;
// Generated 14-Dec-2018 15:20:34 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RoomsessionId generated by hbm2java
 */
@Embeddable
public class RoomsessionId implements java.io.Serializable {

	private int idroom;
	private int idsession;
	private Date date;

	public RoomsessionId() {
	}

	public RoomsessionId(int idroom, int idsession, Date date) {
		this.idroom = idroom;
		this.idsession = idsession;
		this.date = date;
	}

	@Column(name = "idroom", nullable = false)
	public int getIdroom() {
		return this.idroom;
	}

	public void setIdroom(int idroom) {
		this.idroom = idroom;
	}

	@Column(name = "idsession", nullable = false)
	public int getIdsession() {
		return this.idsession;
	}

	public void setIdsession(int idsession) {
		this.idsession = idsession;
	}

	@Column(name = "date", nullable = false, length = 13)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoomsessionId))
			return false;
		RoomsessionId castOther = (RoomsessionId) other;

		return (this.getIdroom() == castOther.getIdroom()) && (this.getIdsession() == castOther.getIdsession())
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdroom();
		result = 37 * result + this.getIdsession();
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		return result;
	}

}
