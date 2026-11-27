INSERT INTO "user" (id, email, username)
VALUES
    ('11111111-1111-1111-1111-111111111111', 'john@example.com', 'john'),
    ('22222222-2222-2222-2222-222222222222', 'alice@example.com', 'alice'),
    ('33333333-3333-3333-3333-333333333333', 'bob@example.com', 'bob');

INSERT INTO song (id, name, yt_url, user_id)
VALUES
    ('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaa1', 'Dummy Song One', 'https://www.youtube.com/watch?v=aaaaaaaaaaa', '11111111-1111-1111-1111-111111111111'),
    ('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaa2', 'Dummy Song Two', 'https://www.youtube.com/watch?v=bbbbbbbbbbb', '11111111-1111-1111-1111-111111111111'),
    ('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaa3', 'Dummy Song Three', 'https://www.youtube.com/watch?v=ccccccccccc', '11111111-1111-1111-1111-111111111111');