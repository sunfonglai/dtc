-- Create table
create table DTC_COMPLETED_TASK
(
  task_id            VARCHAR2(42) not null,
  table_name         VARCHAR2(30),
  sync_nums_per_page NUMBER,
  total_nums         NUMBER,
  current_page_no    NUMBER,
  total_pages        NUMBER,
  batch_no           VARCHAR2(42)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table DTC_COMPLETED_TASK
  is '当前任务列表';
-- Add comments to the columns
comment on column DTC_COMPLETED_TASK.task_id
  is '主键';
comment on column DTC_COMPLETED_TASK.table_name
  is '表名';
comment on column DTC_COMPLETED_TASK.sync_nums_per_page
  is '每页同步数量';
comment on column DTC_COMPLETED_TASK.total_nums
  is '同步数据总量';
comment on column DTC_COMPLETED_TASK.current_page_no
  is '当前页数';
comment on column DTC_COMPLETED_TASK.total_pages
  is '总页数';
comment on column DTC_COMPLETED_TASK.batch_no
  is '批次号';
-- Create/Recreate primary, unique and foreign key constraints
alter table DTC_COMPLETED_TASK
  add constraint DTC_COMPLETED_TASK_PK primary key (TASK_ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

--测试数据