use master;

create database SimpleCarDealership;

use SimpleCarDealership;

create table tblCustomers(
CustomerID int not null primary key identity(1,1)
CustomerName varchar(50) not null,
CustomerMobile int not null,
CustomerEmail varchar(50) not null,
);

create table tblSalespersons (
SalespersonID int not null primary key identity(1,1),
SalespersonName varchar(50) not null,
SalespersonMobile int not null,
SalespersonEmail varchar(50) not null,
);

create table tblPaymentTypes (
PaymentTypeID int not null primary key identity(1,1),
PaymentType varchar(10) not null,
);

create table tblParts (
PartID int not null primary key identity(1,1),
PartName varchar(50) not null,
PartPrice int not null,
);

create table tblMechanics (
MechanicID int not null primary key identity(1,1),
MechanicName varchar(50) not null,
MechanicMobile int not null,
MechanicEmail varchar(50) not null,
);

create table tblCars (
CarID int not null primary key identity(1,1),
CarMaker varchar(50) not null,
CarModel varchar(50) not null,
CarYear int not null,
);

create table tblPurposes (
PurposeID int not null primary key identity(1,1),
Purpose varchar(16) not null,
);

create table tblServiceJobs (
ServiceJobID int not null primary key identity(1,1),
ServiceJobName varchar(50) not null,
ServiceJobCost int not null,
Parts_PartID int foreign key references tblParts(PartID)
);

create table tblSales (
SalesInvoiceID int not null primary key identity(1,1),
SalesAmount int not null,
Salespersons_SalespersonID int not null foreign key references tblSalespersons(SalespersonID),
PaymentTypes_PaymentTypeID int not null foreign key references tblPaymentTypes(PaymentTypeID)
);

create table tblServiceReceipts(
ServiceReceiptID int not null primary key identity(1,1),
ServiceReceiptAmount int not null
);

create table tblServiceTasks (
ServiceTaskID int not null primary key identity(1,1),
Mechanics_MechanicID int not null foreign key references tblMechanics(MechanicID),
ServiceJobs_ServiceJobID int not null foreign key references tblServiceJobs(ServiceJobID),
ServiceReciepts_ServiceReceiptID int not null foreign key references tblServiceReceipts(ServiceReceiptID)
);

create table tblInteractions (
InteractionID int not null primary key identity(1,1),
Customers_CustomerID int not null foreign key references tblCustomers(CustomerID),
Cars_CarID int not null foreign key references tblCars(CarID),
Purposes_PurposeID int not null foreign key references tblPurposes(PurposeID),
Sales_SalesInvoiceID int foreign key references tblSales(SalesInvoiceID),
ServiceReceipts_ServiceReceiptID int foreign key references tblServiceReceipts(ServiceReceiptID)
);