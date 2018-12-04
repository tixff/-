package com.ti.task_manager.entities;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.name
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.parent_id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.is_parent
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    private Integer isParent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.id
     *
     * @param id the value for department.id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.name
     *
     * @return the value of department.name
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.name
     *
     * @param name the value for department.name
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.parent_id
     *
     * @return the value of department.parent_id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.parent_id
     *
     * @param parentId the value for department.parent_id
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.is_parent
     *
     * @return the value of department.is_parent
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public Integer getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.is_parent
     *
     * @param isParent the value for department.is_parent
     *
     * @mbg.generated Mon Dec 03 21:32:44 CST 2018
     */
    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }
}