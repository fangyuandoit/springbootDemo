DROP TABLE IF EXISTS tb_user;
DROP TABLE IF EXISTS tb_role;
DROP TABLE IF EXISTS tb_permission;

CREATE TABLE tb_user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  account VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  role_id int (250) DEFAULT NULL
);

create table tb_role (
  role_id int  primary  key ,
  role_name  VARCHAR(250) NOT NULL
);

create  table tb_permission(
  permission_id int   primary  key ,
  permission_name varchar (250) not null ,
  role_id  int not  null
);



INSERT INTO tb_user (account, password, role_id) VALUES
  ('1', '1', 1),
  ('2', '2', '2');

insert  into tb_role(role_id,role_name)values
(1,'visitor'),
(2,'manager');

insert  into  tb_permission(permission_id,permission_name,role_id)values
(1,'tokne:select',1),
(2,'token:*',2);