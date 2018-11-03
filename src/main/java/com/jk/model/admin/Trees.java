package com.jk.model.admin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 *权限树表
 * 吴洋洋
 */
public class Trees implements Serializable {


    private static final long serialVersionUID = 378419032576753216L;

    private Integer tid;

    private String text;

    private String href;

    private Integer pid;

    /**
     * 表示是否是子节点
     */
    private Boolean leaf;

    /**
     * 表示该节点能否被选中
     */
    private Boolean selectable;

    private List<Trees> nodes;

    private Boolean checked;

    private List<Trees> children;


    public List<Trees> getChildren() {
        return children;
    }

    public void setChildren(List<Trees> children) {
        this.children = children;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }


    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public List<Trees> getNodes() {
        return nodes;
    }

    public void setNodes(List<Trees> nodes) {
        this.nodes = nodes;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
