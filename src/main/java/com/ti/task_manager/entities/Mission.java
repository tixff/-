package com.ti.task_manager.entities;

import java.util.Date;

public class Mission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission.id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission.name
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission.create_time
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission.update_time
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission.manger_id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private Integer mangerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission.content
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.id
     *
     * @return the value of mission.id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.id
     *
     * @param id the value for mission.id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.name
     *
     * @return the value of mission.name
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.name
     *
     * @param name the value for mission.name
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.create_time
     *
     * @return the value of mission.create_time
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.create_time
     *
     * @param createTime the value for mission.create_time
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.update_time
     *
     * @return the value of mission.update_time
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.update_time
     *
     * @param updateTime the value for mission.update_time
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.manger_id
     *
     * @return the value of mission.manger_id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public Integer getMangerId() {
        return mangerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.manger_id
     *
     * @param mangerId the value for mission.manger_id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setMangerId(Integer mangerId) {
        this.mangerId = mangerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.content
     *
     * @return the value of mission.content
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.content
     *
     * @param content the value for mission.content
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}