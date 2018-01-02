package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_busi_cog_knowl_base")
public class TBusiCogKnowlBase {
    @Id
    @Column(name = "BASE_ID")
    private String baseId;

    @Column(name = "BASE_CODE")
    private String baseCode;

    @Column(name = "BASE_NAME")
    private String baseName;

    @Column(name = "BASE_CLASSIFY")
    private String baseClassify;

    @Column(name = "MATCH_DEGREE")
    private Double matchDegree;

    @Column(name = "OWNER")
    private String owner;

    @Column(name = "SERVICE_URL")
    private String serviceUrl;

    @Column(name = "CRT_DT")
    private Date crtDt;

    @Column(name = "UPD_DT")
    private Date updDt;

    @Column(name = "NT")
    private String nt;

    @Column(name = "ICON")
    private String icon;

    /**
     * @return BASE_ID
     */
    public String getBaseId() {
        return baseId;
    }

    /**
     * @param baseId
     */
    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }

    /**
     * @return BASE_CODE
     */
    public String getBaseCode() {
        return baseCode;
    }

    /**
     * @param baseCode
     */
    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    /**
     * @return BASE_NAME
     */
    public String getBaseName() {
        return baseName;
    }

    /**
     * @param baseName
     */
    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    /**
     * @return BASE_CLASSIFY
     */
    public String getBaseClassify() {
        return baseClassify;
    }

    /**
     * @param baseClassify
     */
    public void setBaseClassify(String baseClassify) {
        this.baseClassify = baseClassify;
    }

    /**
     * @return MATCH_DEGREE
     */
    public Double getMatchDegree() {
        return matchDegree;
    }

    /**
     * @param matchDegree
     */
    public void setMatchDegree(Double matchDegree) {
        this.matchDegree = matchDegree;
    }

    /**
     * @return OWNER
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return SERVICE_URL
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * @param serviceUrl
     */
    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    /**
     * @return CRT_DT
     */
    public Date getCrtDt() {
        return crtDt;
    }

    /**
     * @param crtDt
     */
    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    /**
     * @return UPD_DT
     */
    public Date getUpdDt() {
        return updDt;
    }

    /**
     * @param updDt
     */
    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    /**
     * @return NT
     */
    public String getNt() {
        return nt;
    }

    /**
     * @param nt
     */
    public void setNt(String nt) {
        this.nt = nt;
    }

    /**
     * @return ICON
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}