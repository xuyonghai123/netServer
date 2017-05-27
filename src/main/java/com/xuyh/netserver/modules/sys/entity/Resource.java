package com.xuyh.netserver.modules.sys.entity;

import java.io.Serializable;

/**
 * Created by Thinkpad on 17/05/07.
 **/
public class Resource implements Serializable{
    private Long id;
    private String name;
    private ResourceType type = ResourceType.menu;
    private String url;
    private String permission;
    private Long paraentId;
    private String paraentIds;
    private Boolean available = Boolean.FALSE;

    public static enum ResourceType {
        menu("菜单"), button("按钮");

        private final String info;
        private ResourceType(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }
    }
}
