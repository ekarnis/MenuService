-- ******* DATABASE CONFIGURATION *******

CONNECT SA AS SYSDBA;

CREATE TABLESPACE PRICKLYPEAR_tablespace
DATAFILE 'C:\TEST\MENUSERVICE_DATABASE_FILE.dbf'
SIZE 20M AUTOEXTEND ON;

CREATE USER PRICKLYPEAR
IDENTIFIED BY PRICKLYPEAR
DEFAULT TABLESPACE PRICKLYPEAR_tablespace
/

GRANT DBA TO PRICKLYPEAR
/

CONNECT PRICKLYPEAR/PRICKLYPEAR

