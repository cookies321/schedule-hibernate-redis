package admin.hnsd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "holyrobot_addressinfo")
public class HolyrobotAddressinfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=36)
	private String id;

	@Column(name="infoid",length=36)
	private String infoid;

	@Column(name="type")
	private Integer type;

	@Column(name="country")
	private String country;

	@Column(name="province")
	private String province;

	@Column(name="city")
	private String city;

	@Column(name="zone")
	private String zone;

	@Column(name="detailaddress")
	private String detailaddress;

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

	public String getInfoid() {
		return infoid;
	}

	public void setInfoid(String infoid) {
		this.infoid = infoid == null ? null : infoid.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone == null ? null : zone.trim();
	}

	public String getDetailaddress() {
		return detailaddress;
	}

	public void setDetailaddress(String detailaddress) {
		this.detailaddress = detailaddress == null ? null : detailaddress.trim();
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
		this.creatorid = creatorid;
	}
}