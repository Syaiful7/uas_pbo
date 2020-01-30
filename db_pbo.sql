/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     1/30/2020 6:40:13 PM                         */
/*==============================================================*/


/*==============================================================*/
/* Table: Dosen                                                 */
/*==============================================================*/
create table Dosen
(
   npp                  varchar(254) not null  comment '',
   nama                 varchar(254)  comment '',
   tanggal_lahir        datetime  comment '',
   tempat_lahir         varchar(254)  comment '',
   no_telpon            int  comment '',
   alamat               varchar(254)  comment '',
   primary key (npp)
);

/*==============================================================*/
/* Table: Fakultas                                              */
/*==============================================================*/
create table Fakultas
(
   Id_fakultas          varchar(254) not null  comment '',
   nama_fakultas        varchar(254)  comment '',
   primary key (Id_fakultas)
);

/*==============================================================*/
/* Table: Jabatan                                               */
/*==============================================================*/
create table Jabatan
(
   Id_jabatan           int not null  comment '',
   Id_fakultas          varchar(254)  comment '',
   npp                  varchar(254)  comment '',
   nama_jabatan         varchar(254)  comment '',
   primary key (Id_jabatan),
   constraint FK_JABATAN_ASSOCIATI_DOSEN foreign key (npp)
      references Dosen (npp) on delete restrict on update restrict,
   constraint FK_JABATAN_ASSOCIATI_FAKULTAS foreign key (Id_fakultas)
      references Fakultas (Id_fakultas) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Prodi                                                 */
/*==============================================================*/
create table Prodi
(
   Id_prodi             varchar(254) not null  comment '',
   Id_fakultas          varchar(254)  comment '',
   Id_jabatan           int  comment '',
   nama_prodi           varchar(254)  comment '',
   primary key (Id_prodi),
   constraint FK_PRODI_ASSOCIATI_FAKULTAS foreign key (Id_fakultas)
      references Fakultas (Id_fakultas) on delete restrict on update restrict,
   constraint FK_PRODI_ASSOCIATI_JABATAN foreign key (Id_jabatan)
      references Jabatan (Id_jabatan) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Program_kerja                                         */
/*==============================================================*/
create table Program_kerja
(
   Id_proker            int not null  comment '',
   Id_prodi             varchar(254)  comment '',
   nama_proker          varchar(254)  comment '',
   tgl_pelaksanaan      datetime  comment '',
   tgl_selesai          datetime  comment '',
   angg_digunakan       numeric(8,0)  comment '',
   lokasi_proker        varchar(254)  comment '',
   uraian               varchar(254)  comment '',
   status               varchar(254)  comment '',
   primary key (Id_proker),
   constraint FK_PROGRAM__ASSOCIATI_PRODI foreign key (Id_prodi)
      references Prodi (Id_prodi) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   username             varchar(254) not null  comment '',
   password             varchar(254)  comment '',
   tipeLogin            varchar(254)  comment '',
   primary key (username)
);

