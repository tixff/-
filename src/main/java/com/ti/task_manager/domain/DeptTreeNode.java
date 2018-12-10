package com.ti.task_manager.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Ti
 * @date 2018/12/4
 */

@Data
public class DeptTreeNode implements Serializable {
    private String text;
    private ArrayList<DeptTreeNode> children;
}
