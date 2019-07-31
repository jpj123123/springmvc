package jpj.biz.entity;

import java.util.Date;

public class Name {
    private Long id;

    private String name;

    private Date createTime;

    private Date updaetTime;

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
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdaetTime() {
        return updaetTime;
    }

    public void setUpdaetTime(Date updaetTime) {
        this.updaetTime = updaetTime;
    }
}