package admin.hnsd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "holyrobot_routeinfo")
public class HolyrobotRouteinfo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
	@Column(length=36)
	private String id;

    @Column(name="urlid",length=36)
    private String url;

    @Column(name="routetype")
    private String routetype;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private String price;

    @Column(name="itemno")
    private String itemno;

    @Column(name="suppliername")
    private String suppliername;

    @Column(name="departure")
    private String departure;
    
    @Column(name="destination")
    private String destination;

    @Column(name="grade")
    private String grade;

    @Column(name="gradenum")
    private String gradenum;

    @Column(name="beennum")
    private String beennum;

    @Column(name="whantto")
    private String whantto;

    @Column(name="datasource")
    private String datasource;

    @Column(name="createdate")
    private String createdate;

    @Column(name="creator")
    private String creator;

    @Column(name="creatorid")
    private String creatorid;

    @Column(name="teamtype")
    private String teamtype;
    
    @Column(name="productoutline")
    private String productoutline;
    
    @Column(name="featureservice")
    private String featureservice;

    @Column(name="itineraryoutline")
    private String itineraryoutline;

    @Column(name="productrecommend")
    private String productrecommend;

    @Column(name="reducedprice")
    private String reducedprice;

    @Column(name="productfeature")
    private String productfeature;

    @Column(name="itinerarydetails")
    private String itinerarydetails;

    @Column(name="expense")
    private String expense;

    @Column(name="reserveinfo")
    private String reserveinfo;
    
    public String getProductoutline() {
		return productoutline;
	}

	public void setProductoutline(String productoutline) {
		this.productoutline = productoutline;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

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

	public String getRoutetype() {
        return routetype;
    }

    public void setRoutetype(String routetype) {
        this.routetype = routetype == null ? null : routetype.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure == null ? null : departure.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getGradenum() {
        return gradenum;
    }

    public void setGradenum(String gradenum) {
        this.gradenum = gradenum == null ? null : gradenum.trim();
    }

    public String getBeennum() {
        return beennum;
    }

    public void setBeennum(String beennum) {
        this.beennum = beennum == null ? null : beennum.trim();
    }

    public String getWhantto() {
        return whantto;
    }

    public void setWhantto(String whantto) {
        this.whantto = whantto == null ? null : whantto.trim();
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
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

    public String getTeamtype() {
        return teamtype;
    }

    public void setTeamtype(String teamtype) {
        this.teamtype = teamtype == null ? null : teamtype.trim();
    }

	public String getFeatureservice() {
		return featureservice;
	}

	public void setFeatureservice(String featureservice) {
		this.featureservice = featureservice;
	}

	public String getItineraryoutline() {
		return itineraryoutline;
	}

	public void setItineraryoutline(String itineraryoutline) {
		this.itineraryoutline = itineraryoutline;
	}

	public String getProductrecommend() {
		return productrecommend;
	}

	public void setProductrecommend(String productrecommend) {
		this.productrecommend = productrecommend;
	}

	public String getReducedprice() {
		return reducedprice;
	}

	public void setReducedprice(String reducedprice) {
		this.reducedprice = reducedprice;
	}

	public String getProductfeature() {
		return productfeature;
	}

	public void setProductfeature(String productfeature) {
		this.productfeature = productfeature;
	}

	public String getItinerarydetails() {
		return itinerarydetails;
	}

	public void setItinerarydetails(String itinerarydetails) {
		this.itinerarydetails = itinerarydetails;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getReserveinfo() {
		return reserveinfo;
	}

	public void setReserveinfo(String reserveinfo) {
		this.reserveinfo = reserveinfo;
	}
}