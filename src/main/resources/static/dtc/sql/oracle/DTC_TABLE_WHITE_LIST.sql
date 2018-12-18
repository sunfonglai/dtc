-- Create table
create table DTC_TABLE_WHITE_LIST
(
  source_id          VARCHAR2(42) not null,
  source_name        VARCHAR2(42),
  table_name         VARCHAR2(50) not null,
  sync_nums_per_page NUMBER,
  is_use_params      CHAR(1),
  params             VARCHAR2(200),
  sync_seq           NUMBER,
  trg_table_name     VARCHAR2(50)
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
comment on table DTC_TABLE_WHITE_LIST
  is '来源数据源数据表白名单';
-- Add comments to the columns
comment on column DTC_TABLE_WHITE_LIST.source_id
  is '源数据库ID';
comment on column DTC_TABLE_WHITE_LIST.source_name
  is '源数据库名';
comment on column DTC_TABLE_WHITE_LIST.table_name
  is '源库白名单表';
comment on column DTC_TABLE_WHITE_LIST.sync_nums_per_page
  is '同步每页数据量';
comment on column DTC_TABLE_WHITE_LIST.is_use_params
  is '是否使用参数';
comment on column DTC_TABLE_WHITE_LIST.params
  is '参数内容';
comment on column DTC_TABLE_WHITE_LIST.sync_seq
  is '同步顺序';
comment on column DTC_TABLE_WHITE_LIST.trg_table_name
  is '目标库的数据表名';
-- Create/Recreate primary, unique and foreign key constraints
alter table DTC_TABLE_WHITE_LIST
  add constraint DTC_TABLE_WHITE_LIST_PK primary key (SOURCE_ID, TABLE_NAME)
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
insert into DTC_TABLE_WHITE_LIST (SOURCE_ID, SOURCE_NAME, TABLE_NAME, SYNC_NUMS_PER_PAGE, IS_USE_PARAMS, PARAMS, SYNC_SEQ, TRG_TABLE_NAME)
values ('1', '测试数据源', 'VW_GL_VOU_HEAD', '100', 'Y', 'VOU_NO=''GN-09-0007''', '1', 'GL_VOU_HEAD_TEST');

insert into DTC_TABLE_WHITE_LIST (SOURCE_ID, SOURCE_NAME, TABLE_NAME, SYNC_NUMS_PER_PAGE, IS_USE_PARAMS, PARAMS, SYNC_SEQ, TRG_TABLE_NAME)
values ('3', '测试数据源', 'GL_VOU_DETAIL_ASS', '100', 'Y', 'FISCAL=2018 AND FIS_PERD=5 AND CO_CODE=440199', '2', null);