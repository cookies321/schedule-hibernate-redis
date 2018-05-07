package admin.hnsd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "holyrobot_routepriceinfo")
public class HolyrobotRoutepriceinfo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
   	@Column(length=36)
	private String id;

    @Column(name="routeid",length=36)
    private String routeid;

    @Column(name="pricedate")
    private String pricedate;

    @Column(name="dayofweek")
    private String dayofweek;
    
    @Column(name="lowestprice")
    private String lowestprice;

    @Column(name="createdate")
    private String createdate;

    @Column(name="creator")
    private String creator;

    @Column(name="creatorid")
    private String creatorid;

    @Column(name="remark")
    private String remark;

    public String getId() {
        return id;
        
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    public String getPricedate() {
        return pricedate;
    }

    public void setPricedate(String pricedate) {
        this.pricedate = pricedate == null ? null : pricedate.trim();
    }

    public String getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(String dayofweek) {
        this.dayofweek = dayofweek == null ? null : dayofweek.trim();
    }

    public String getLowestprice() {
        return lowestprice;
    }

    public void setLowestprice(String lowestprice) {
        this.lowestprice = lowestprice == null ? null : lowestprice.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}