create database gallery;
use gallery;
create table gallery(
    idGallery int(11) auto_increment primary key not null,
    tittleGallery LONGTEXT not null,
    descGallery LONGTEXT not null,
    imgFullNameGallery LONGTEXT not null,
    orderGallery int(11) not null
)