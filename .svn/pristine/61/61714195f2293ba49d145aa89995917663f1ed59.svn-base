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
@Table(name = "holyrobot_commentinfo")
public class HolyrobotCommentinfo implements Serializable{
	
    private static final long serialVersionUID = 1L;

    @Id
	@Column(length=36)
	private String id;

    @Column(name="infoid",length=36)
    private String infoid;

    @Column(name="type")
    private Integer type;

    @Column(name="score")
    private String score;

    @Column(name="commentdate")
    private String commentdate;

    @Column(name="createdate")
    private String createdate;

    @Column(name="creator")
    private String creator;

    @Column(name="creatorid")
    private String creatorid;

    @Column(name="content")
    private String content;
    
    @Column(name="datasource")
    private String datasource;
    
	public String getDatasource() {
		return datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}

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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(String commentdate) {
        this.commentdate = commentdate == null ? null : commentdate.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}