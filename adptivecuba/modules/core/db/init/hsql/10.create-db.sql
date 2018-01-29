-- begin ADPTIVECUBA_NOTICIA
create table ADPTIVECUBA_NOTICIA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITULO varchar(255) not null,
    TEXTO longvarchar not null,
    IS_DESTAQUE boolean not null,
    --
    primary key (ID)
)^
-- end ADPTIVECUBA_NOTICIA
