-- Create table
create table DTC_DATA_SOURCE
(
  db_type      VARCHAR2(20),
  db_url       VARCHAR2(200),
  db_user_name VARCHAR2(50),
  db_password  VARCHAR2(50),
  source_id    VARCHAR2(42) not null,
  source_name  VARCHAR2(50),
  app_version  VARCHAR2(10)
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
-- Add comments to the columns
comment on column DTC_DATA_SOURCE.db_type
  is '数据库类型';
comment on column DTC_DATA_SOURCE.db_url
  is '数据库连接字符串';
comment on column DTC_DATA_SOURCE.db_user_name
  is '数据库用户名';
comment on column DTC_DATA_SOURCE.db_password
  is '数据库密码';
comment on column DTC_DATA_SOURCE.source_id
  is '主键';
comment on column DTC_DATA_SOURCE.source_name
  is '数据源名称';
comment on column DTC_DATA_SOURCE.app_version
  is '应用版';
-- Create/Recreate primary, unique and foreign key constraints
alter table DTC_DATA_SOURCE
  add constraint DTC_DATA_SOURCE_PK primary key (SOURCE_ID)
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
insert into DTC_DATA_SOURCE (DB_TYPE, DB_URL, DB_USER_NAME, DB_PASSWORD, SOURCE_ID, SOURCE_NAME, APP_VERSION)
values ('Oracle', 'jdbc:oracle:thin:@192.168.29.134:1521:orcl', 'dc', '1', '1', '测试数据源', '6.2');