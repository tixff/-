CREATE TABLE `department` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '部门名称',
  `parent_id` int(11) DEFAULT NULL COMMENT '上一级部门id ',
  `is_parent` int(255) DEFAULT NULL COMMENT '是否为父 0:不是 1:是',
  PRIMARY KEY (`id`)
);

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(255)  DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `join_time` datetime DEFAULT NULL COMMENT '入职时间',
  `image` varchar(255)  DEFAULT NULL,
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  `sex` int(255) DEFAULT NULL COMMENT '0:男  1:女',
  `position` varchar(255)  DEFAULT NULL COMMENT '职位',
  `dept_id` int(11) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
);

CREATE TABLE `manager` (
  `id` int(11) NOT NULL,
  `name` varchar(255)  DEFAULT NULL COMMENT '管理员名字',
  PRIMARY KEY (`id`)
);

CREATE TABLE `mission` (
  `id` int(11) NOT NULL,
  `name` varchar(255)  DEFAULT NULL COMMENT '任务名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `content` text  COMMENT '任务内容',
  `manger_id` int(11) DEFAULT NULL COMMENT '管理员id',
  PRIMARY KEY (`id`)
);