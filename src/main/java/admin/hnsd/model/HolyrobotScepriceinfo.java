package admin.hnsd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "holyrobot_scepriceinfo")
public class HolyrobotScepriceinfo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length=36)
	private String id;

    @Column(name="scenicid",length=36)
    private String scenicid;

    @Column(name="urlid",length=36)
    private String urlid;

    @Column(name="pricetype")
    private String pricetype;

    @Column(name="tickettype")
    private String tickettype;

    @Column(name="priceitem")
    private String priceitem;

    @Column(name="marketingprice")
    private String marketingprice;

    @Column(name="salecondition")
    private String salecondition;

    @Column(name="saleprice")
    private String saleprice;

    @Column(name="discountinfo")
    private String discountinfo;

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

    public String getScenicid() {
        return scenicid;
    }

    public void setScenicid(String scenicid) {
        this.scenicid = scenicid == null ? null : scenicid.trim();
    }

    public String getUrlid() {
        return urlid;
    }

    public void setUrlid(String urlid) {
        this.urlid = urlid == null ? null : urlid.trim();
    }

    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype == null ? null : pricetype.trim();
    }

    public String getTickettype() {
        return tickettype;
    }

    public void setTickettype(String tickettype) {
        this.tickettype = tickettype == null ? null : tickettype.trim();
    }

    public String getPriceitem() {
        return priceitem;
    }

    public void setPriceitem(String priceitem) {
        this.priceitem = priceitem == null ? null : priceitem.trim();
    }

    public String getMarketingprice() {
        return marketingprice;
    }

    public void setMarketingprice(String marketingprice) {
        this.marketingprice = marketingprice == null ? null : marketingprice.trim();
    }

    public String getSalecondition() {
        return salecondition;
    }

    public void setSalecondition(String salecondition) {
        this.salecondition = salecondition == null ? null : salecondition.trim();
    }

    public String getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(String saleprice) {
        this.saleprice = saleprice == null ? null : saleprice.trim();
    }

    public String getDiscountinfo() {
        return discountinfo;
    }

    public void setDiscountinfo(String discountinfo) {
        this.discountinfo = discountinfo == null ? null : discountinfo.trim();
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