package admin.hnsd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "holyrobot_flighttransferinfo")
public class HolyrobotFlighttransferinfo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length=36)
	private String id;

    @Column(name="inputid",length=36)
    private String inputid;

    @Column(name="flightid1",length=36)
    private String flightid1;

    @Column(name="flightid2",length=36)
    private String flightid2;

    @Column(name="flightdate")
    private String flightdate;

    @Column(name="flightarrivedate")
    private String flightarrivedate;

    @Column(name="minfare")
    private String minfare;

    @Column(name="discount")
    private String discount;

    @Column(name="createdate")
    private String createdate;

    @Column(name="creator")
    private String creator;

    @Column(name="creatorid")
    private String creatorid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInputid() {
        return inputid;
    }

    public void setInputid(String inputid) {
        this.inputid = inputid == null ? null : inputid.trim();
    }

    public String getFlightid1() {
        return flightid1;
    }

    public void setFlightid1(String flightid1) {
        this.flightid1 = flightid1 == null ? null : flightid1.trim();
    }

    public String getFlightid2() {
        return flightid2;
    }

    public void setFlightid2(String flightid2) {
        this.flightid2 = flightid2 == null ? null : flightid2.trim();
    }

    public String getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(String flightdate) {
        this.flightdate = flightdate == null ? null : flightdate.trim();
    }

    public String getFlightarrivedate() {
        return flightarrivedate;
    }

    public void setFlightarrivedate(String flightarrivedate) {
        this.flightarrivedate = flightarrivedate == null ? null : flightarrivedate.trim();
    }

    public String getMinfare() {
        return minfare;
    }

    public void setMinfare(String minfare) {
        this.minfare = minfare == null ? null : minfare.trim();
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }
    

    public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }
}