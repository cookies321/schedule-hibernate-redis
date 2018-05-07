package admin.hnsd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "holyrobot_flightinputinfo")
public class HolyrobotFlightinputinfo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length=36)
	private String id;

    @Column(name="urlid")
    private String url;

    @Column(name="flightdate")
    private String flightdate;

    @Column(name="begincity")
    private String begincity;

    @Column(name="endcity")
    private String endcity;

    @Column(name="flightnum")
    private String flightnum;

    @Column(name="lastupdatetime")
    private String lastupdatetime;

    @Column(name="status")
    private Integer status;

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


    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFlightdate() {
		return flightdate;
	}

	public void setFlightdate(String flightdate) {
		this.flightdate = flightdate;
	}

	public String getBegincity() {
        return begincity;
    }

    public void setBegincity(String begincity) {
        this.begincity = begincity == null ? null : begincity.trim();
    }

    public String getEndcity() {
        return endcity;
    }

    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    public String getFlightnum() {
        return flightnum;
    }

    public void setFlightnum(String flightnum) {
        this.flightnum = flightnum == null ? null : flightnum.trim();
    }

   

    public String getLastupdatetime() {
		return lastupdatetime;
	}

	public void setLastupdatetime(String lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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