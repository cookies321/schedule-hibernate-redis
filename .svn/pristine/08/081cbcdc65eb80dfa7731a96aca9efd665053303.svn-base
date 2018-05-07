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
@Table(name = "holyrobot_url")
public class HolyrobotUrl implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
	@GenericGenerator(name = "generator", strategy = "uuid")
    @GeneratedValue(generator = "generator")
	@Column(length=36)
	private String id;
    
    @Column(name="url")
    private String url;

    @Column(name="level")
    private Integer level;

    @Column(name="parentid")
    private String parentid;

    @Column(name="datasource")
    private String datasource;

    @Column(name="xtype")
    private Integer xtype;

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

    @Column(name="remark")
    private String remark;

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
        this.url = url == null ? null : url.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    public Integer getXtype() {
        return xtype;
    }

    public void setXtype(Integer xtype) {
        this.xtype = xtype;
    }

    public String getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(String lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HolyrobotUrl [id=");
		builder.append(id);
		builder.append(", url=");
		builder.append(url);
		builder.append(", level=");
		builder.append(level);
		builder.append(", parentid=");
		builder.append(parentid);
		builder.append(", datasource=");
		builder.append(datasource);
		builder.append(", xtype=");
		builder.append(xtype);
		builder.append(", lastupdatetime=");
		builder.append(lastupdatetime);
		builder.append(", status=");
		builder.append(status);
		builder.append(", createdate=");
		builder.append(createdate);
		builder.append(", creator=");
		builder.append(creator);
		builder.append(", creatorid=");
		builder.append(creatorid);
		builder.append(", remark=");
		builder.append(remark);
		builder.append("]");
		return builder.toString();
	}
}