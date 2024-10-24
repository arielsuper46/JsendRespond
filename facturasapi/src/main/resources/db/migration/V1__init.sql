Create table if no exists client(
    id serial,
    nui varchar(13) not null,
    fullname varchar(100) not null,
    addres varchar(50),
    primary key (id),
    unique(nui),

)