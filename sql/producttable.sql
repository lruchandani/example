create database if not exists productsaledb;
use productsaledb;

-- create product table
CREATE TABLE producttable (
  ProductID INT NOT NULL AUTO_INCREMENT,
  ProductName VARCHAR(45) NOT NULL,
  PRIMARY KEY (ProductID));

--create salesentry
  CREATE TABLE salesentry (
  SalesID INT NOT NULL AUTO_INCREMENT,
  DateOfSale DATETIME NULL,
  ProductID INT NULL,
  SalesAmount DECIMAL(12,2) NULL,
  SalesEntrycol VARCHAR(45) NULL,
  PRIMARY KEY (SalesID),
  INDEX FK_ProductID_idx (ProductID ASC),
  CONSTRAINT FK_ProductID
    FOREIGN KEY (ProductID)
    REFERENCES producttable (ProductID));

--populate producttable
insert into producttable(ProductName)values('Product1');
insert into producttable(ProductName)values('Product2');
insert into producttable(ProductName)values('Product3');
insert into producttable(ProductName)values('Product4');
insert into producttable(ProductName)values('Product5');
insert into producttable(ProductName)values('Product6');
insert into producttable(ProductName)values('Product7');
insert into producttable(ProductName)values('Product8');
insert into producttable(ProductName)values('Product9');
insert into producttable(ProductName)values('Product10');

--populate salesentry
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-31',1,10);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-31',1,10);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-31',1,20);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-11-29',1,30);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-11-30',2,40);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-28',2,50);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-12',3,60);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-11',3,70);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-09',4,80);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-08',5,90);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-04',6,100);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-07',6,10);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-06',7,20);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-16',7,30);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-17',8,40);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-18',8,50);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-22',8,60);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-23',9,70);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-24',9,80);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-29',9,90);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-11-14',10,100);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-10-31',10,10);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-01',10,20);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-02',1,30);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-10',2,40);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-12',4,50);
insert into salesentry(DateOfSale,ProductID,SalesAmount)values('2014-12-11',5,60);

commit;