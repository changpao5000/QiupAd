package com.guang.client.mode;

import java.util.List;
import java.util.Map;

import com.guang.client.tools.GTools;


public class GOffer {
	private String id = "";
    private String packageName = "";
    private String appName = "";
    private String appDesc = "";
    private String size = "";
    private String iconUrl = "";
    private String imageUrl = "";
    private int type = 1;
    private long time;
    private String urlApp;
    
	private int picNum;
	
	
	private String adm;//html
	private List<String> imgtrackings;
	private List<String> thclkurls;

	private List<GOfferEs> ess;
	private int act;//1 =>页 2 =>下载
	private List<String> surl;
	private List<String> furl;
	private List<String> iurl;
	private List<String> ourl;
    
    public GOffer(){};
    public GOffer(String id, String adm,List<String> imgtrackings,List<String> thclkurls,List<GOfferEs> ess)
    {
    	this.id = id;
    	this.adm = adm;
    	this.imgtrackings = imgtrackings;
    	this.thclkurls = thclkurls;
    	this.ess = ess;
    	this.time = GTools.getCurrTime();
    }

	public GOffer(String id, String adm,List<String> imgtrackings,List<String> thclkurls)
    {
    	this.id = id;
    	this.adm = adm;
    	this.imgtrackings = imgtrackings;
    	this.thclkurls = thclkurls;
    }
    public GOffer(String id, String packageName, String appName,
			String appDesc, String size, String iconUrl, String imageUrl,String urlApp) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.appName = appName;
		this.appDesc = appDesc;
		this.size = size;
		this.iconUrl = iconUrl;
		this.imageUrl = imageUrl;
		this.urlApp = urlApp;
		this.picNum = 0;
		this.time = GTools.getCurrTime();
	}
	public GOffer(String id, String packageName, String appName,
			String appDesc, String size, String iconUrl, String imageUrl,
			int type) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.appName = appName;
		this.appDesc = appDesc;
		this.size = size;
		this.iconUrl = iconUrl;
		this.imageUrl = imageUrl;
		this.type = type;
		this.time = GTools.getCurrTime();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppDesc() {
		return appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	public String getUrlApp() {
		return urlApp;
	}
	public void setUrlApp(String urlApp) {
		this.urlApp = urlApp;
	}
	public boolean isTimeOut()
	{
		return GTools.getCurrTime() - time < 60*60*1000;
	}
	public int getPicNum() {
		return picNum;
	}
	public void setPicNum(int picNum) {
		this.picNum = picNum;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getAdm() {
		return adm;
	}
	public void setAdm(String adm) {
		this.adm = adm;
	}
	public List<String> getImgtrackings() {
		return imgtrackings;
	}
	public void setImgtrackings(List<String> imgtrackings) {
		this.imgtrackings = imgtrackings;
	}
	public List<String> getThclkurls() {
		return thclkurls;
	}
	public void setThclkurls(List<String> thclkurls) {
		this.thclkurls = thclkurls;
	}
	public List<GOfferEs> getEss() {
		return ess;
	}
	public void setEss(List<GOfferEs> ess) {
		this.ess = ess;
	}
	public List<String> getSurl() {
		return surl;
	}
	public void setSurl(List<String> surl) {
		this.surl = surl;
	}
	public List<String> getFurl() {
		return furl;
	}
	public void setFurl(List<String> furl) {
		this.furl = furl;
	}
	public List<String> getIurl() {
		return iurl;
	}
	public void setIurl(List<String> iurl) {
		this.iurl = iurl;
	}
	public List<String> getOurl() {
		return ourl;
	}
	public void setOurl(List<String> ourl) {
		this.ourl = ourl;
	}
	public int getAct() {
		return act;
	}
	public void setAct(int act) {
		this.act = act;
	}
	

}
