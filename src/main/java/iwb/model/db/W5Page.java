package iwb.model.db;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Immutable;

import iwb.util.GenericUtil;



/**
 * WTemplate generated by hbm2java
 */
@Entity
@Immutable
@Table(name="w5_template",schema="iwb")
public class W5Page implements java.io.Serializable, W5Base {
/*TABLE_ID: 63*/
	
	private static final long serialVersionUID = 223312314121L;

	private int pageId;
	
	private short pageType;

	private String dsc;

	private int objectId;

	private short objectType;

	private short localeMsgFlag;

	private String code;
	private String cssCode;
	private int versionNo;
	private String tag;
	

	private List<W5PageObject> _pageObjectList;
	
	public W5Page() {
	}

	@Id
	@Column(name="template_id")
	public int getPageId() {
		return this.pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	@Column(name="template_tip")
	public short getPageType() {
		return this.pageType;
	}

	public void setPageType(short pageType) {
		this.pageType = pageType;
	}

	@Column(name="dsc")
	public String getDsc() {
		return this.dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	@Column(name="object_id")
	public int getObjectId() {
		return this.objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	@Column(name="object_tip")
	public short getObjectType() {
		return this.objectType;
	}

	public void setObjectType(short objectType) {
		this.objectType = objectType;
	}


	@Column(name="code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Transient
	public List<W5PageObject> get_pageObjectList() {
		return _pageObjectList;
	}

	public void set_pageObjectList(List<W5PageObject> _pageObjectList) {
		this._pageObjectList = _pageObjectList;
	}
	
	@Column(name="locale_msg_flag")
	public short getLocaleMsgFlag() {
		return localeMsgFlag;
	}

	public void setLocaleMsgFlag(short localeMsgFlag) {
		this.localeMsgFlag = localeMsgFlag;
	}


	@Transient
	public boolean safeEquals(W5Base q){
		if(q==null)return false;
		W5Page t = (W5Page)q;
		boolean b =  
			this.pageId == t.getPageId() &&
			this.pageType == t.getPageType() &&
			GenericUtil.safeEquals(this.dsc, t.getDsc()) &&
			this.objectId == t.getObjectId() &&
			this.objectType == t.getObjectType() &&
			this.localeMsgFlag == t.getLocaleMsgFlag() &&
			GenericUtil.safeEquals(this.code, t.getCode());
		
		if(!b)return false;
		if(!GenericUtil.safeEquals(this._pageObjectList, t._pageObjectList))return false;
/*		if(this._pageObjectList!=null && t.get_pageObjectList()!=null){
			if(this._pageObjectList.size()==t.get_pageObjectList().size())return false;
			for(int i=0;i<this._pageObjectList.size();i++){
				W5TemplateObject c1 = this._pageObjectList.get(i); 
				W5TemplateObject c2 = t.get_pageObjectList().get(i);
				if(!c1.equals(c2))return false;
			}			
		} else if(this._pageObjectList!=null ^ t.get_pageObjectList()!=null) return false;*/
		
		return true;
	}

	private String projectUuid;
	@Id
	@Column(name="project_uuid")
	public String getProjectUuid() {
		return projectUuid;
	}

	public void setProjectUuid(String projectUuid) {
		this.projectUuid = projectUuid;
	}

	@Column(name="css_code")
	public String getCssCode() {
		return cssCode;
	}

	public void setCssCode(String cssCode) {
		this.cssCode = cssCode;
	}

	@Column(name="version_no")
	public int getVersionNo() {
		return versionNo;
	}
	
	@Column(name="tag")
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void setVersionNo(int versionNo) {
		this.versionNo = versionNo;
	}

	public boolean equals(Object o) {
		if(o==null || !(o instanceof W5Page))return false;
		W5Page c = (W5Page)o;
		return c!=null && c.getPageId()==getPageId() && c.getProjectUuid().equals(projectUuid);
	}
	
	public int hashCode() {
		return projectUuid.hashCode() + 100*getPageId();
	}	
}