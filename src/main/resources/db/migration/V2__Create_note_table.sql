create table if not exists "note"
(
    id uuid primary key default gen_random_uuid(),
    title varchar(100),
    body TEXT,
    user_id UUID not null,
    created_at timestamp not null,
    last_updated_at timestamp not null,

    constraint fk_user foreign key (user_id) references "user"(id) on delete cascade
)




