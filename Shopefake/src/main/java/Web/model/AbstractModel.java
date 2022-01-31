/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web.model;

import java.sql.Timestamp;

/**
 *
 * @author ADMIN
 */
public class AbstractModel {
    private long id;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private String createDby;
    private String modifieDby;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreateDby() {
        return createDby;
    }

    public void setCreateDby(String createDby) {
        this.createDby = createDby;
    }

    public String getModifieDby() {
        return modifieDby;
    }

    public void setModifieDby(String modifieDby) {
        this.modifieDby = modifieDby;
    }
}
