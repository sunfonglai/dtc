-- Create table
create table DTC_CURRENT_TASK_DETAIL
(
  task_detail_id     VARCHAR2(42) not null,
  table_name         VARCHAR2(30),
  sync_nums_per_page NUMBER,
  total_nums         NUMBER,
  current_page_no    NUMBER,
  total_pages        NUMBER,
  main_task_id       VARCHAR2(42),
  opt_type           VARCHAR2(10),
  task_desc          VARCHAR2(50),
  opt_params         VARCHAR2(200),
  opt_seq            NUMBER,
  is_ref_beforre     CHAR(1),
  source_id          VARCHAR2(42),
  create_date        DATE,
  trg_table_name     VARCHAR2(30)
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
comment on table DTC_CURRENT_TASK_DETAIL
  is '当前任务列表';
-- Add comments to the columns
comment on column DTC_CURRENT_TASK_DETAIL.task_detail_id
  is '主键';
comment on column DTC_CURRENT_TASK_DETAIL.table_name
  is '表名';
comment on column DTC_CURRENT_TASK_DETAIL.sync_nums_per_page
  is '每页同步数量';
comment on column DTC_CURRENT_TASK_DETAIL.total_nums
  is '同步数据总量';
comment on column DTC_CURRENT_TASK_DETAIL.current_page_no
  is '当前页数';
comment on column DTC_CURRENT_TASK_DETAIL.total_pages
  is '总页数';
comment on column DTC_CURRENT_TASK_DETAIL.main_task_id
  is '主任务ID';
comment on column DTC_CURRENT_TASK_DETAIL.opt_type
  is '操作类型, check delete insert';
comment on column DTC_CURRENT_TASK_DETAIL.task_desc
  is '任务描述';
comment on column DTC_CURRENT_TASK_DETAIL.opt_params
  is '任务参数';
comment on column DTC_CURRENT_TASK_DETAIL.opt_seq
  is '执行顺序';
comment on column DTC_CURRENT_TASK_DETAIL.is_ref_beforre
  is '是否依赖上个任务';
comment on column DTC_CURRENT_TASK_DETAIL.source_id
  is '数据源ID';
comment on column DTC_CURRENT_TASK_DETAIL.create_date
  is '创建时间';
comment on column DTC_CURRENT_TASK_DETAIL.trg_table_name
  is '目标表名';
-- Create/Recreate primary, unique and foreign key constraints
alter table DTC_CURRENT_TASK_DETAIL
  add constraint DTC_CURRENT_TASK_DETAIL_PK primary key (TASK_DETAIL_ID)
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
