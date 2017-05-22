package com.xuyh.netserver.modules.sys;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Thinkpad on 17/05/07.
 **/
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String role;
    private String description;
    private List<Long> resourceIds;
    private Boolean available = Boolean.FALSE;

    public Role(String role, String description, Boolean available) {
        this.role = role;
        this.description = description;
        this.available = available;
    }
}
