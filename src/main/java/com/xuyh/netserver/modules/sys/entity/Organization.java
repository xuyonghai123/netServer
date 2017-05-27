package com.xuyh.netserver.modules.sys.entity;

import java.io.Serializable;

/**
 * Created by Thinkpad on 17/05/07.
 **/
public class Organization  implements Serializable{
    private Long id;
    private String name;
    private Long paraentId;
    private String paraentIds;
    private Boolean available = Boolean.FALSE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParaentId() {
        return paraentId;
    }

    public void setParaentId(Long paraentId) {
        this.paraentId = paraentId;
    }

    public String getParaentIds() {
        return paraentIds;
    }

    public void setParaentIds(String paraentIds) {
        this.paraentIds = paraentIds;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }


}
