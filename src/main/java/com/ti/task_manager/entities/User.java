package com.ti.task_manager.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ti
 * @date 2018/12/14
 */

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    private Integer id;
    private String name;
    private String password;
}
