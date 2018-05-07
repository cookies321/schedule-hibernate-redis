package admin.hnsd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "holyrobot_pictureinfo")
public class HolyrobotPictureinfo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
   	@Column(length=36)
	private String id;

   	@Column(name="infoid",length=36)
    private String infoid;

   	@Column(name="imgurl")
    private String imgurl;

   	@Column(name="sort")
    private Integer sort;

   	@Column(name="type")
    private Integer type;

   	@Column(name="imgaddress")
    private String imgaddress;

   	@Column(name="download")
    private Integer download;

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

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImgaddress() {
        return imgaddress;
    }

    public void setImgaddress(String imgaddress) {
        this.imgaddress = imgaddress == null ? null : imgaddress.trim();
    }

    public Integer getDownload() {
        return download;
    }

    public void setDownload(Integer download) {
        this.download = download;
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