create table if not exists "user_token"
(
    id uuid primary key default gen_random_uuid(),
    user_id UUID unique not null,
    refresh_token TEXT,
    created_at timestamp not null,
    expires_at timestamp not null,

    constraint fk_token foreign key (user_id) references "user"(id) on delete cascade
)



