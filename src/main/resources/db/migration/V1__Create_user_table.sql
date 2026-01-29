create table if not exists "user"
(
    id uuid primary key default gen_random_uuid(),
    email varchar(50) not null ,
    password varchar(20) not null,
    created_at timestamp not null
)