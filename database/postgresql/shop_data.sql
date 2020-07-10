CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

SELECT
    uuid_generate_v4();

-- 85c82463-bde6-49c5-b341-db7cc7375825
--87c47a84-239d-416b-99e4-04eb07cdbe42
INSERT INTO
    public.users (
        id,
        username,
        "password",
        role_id,
        active,
        created_by,
        updated_by
    )
VALUES
(
        '9b13c173-9226-4a9f-b9f2-c701cbd72669',
        'admin@shop.com',
        '$2a$10$plE8TJetXjyKUx30wxXIwu6HDcbhsD1Y.iLg84S3R0Fx9dUk/xFre',
        '85c82463-bde6-49c5-b341-db7cc7375825',
        1,
        'SYSTEM',
        'SYSTEM'
    ),
    (
        'e3a2c612-471c-47ed-8f85-d88cd3d4cfc9',
        'user@shop.com',
        '$2a$10$plE8TJetXjyKUx30wxXIwu6HDcbhsD1Y.iLg84S3R0Fx9dUk/xFre',
        '87c47a84-239d-416b-99e4-04eb07cdbe42',
        1,
        'SYSTEM',
        'SYSTEM'
    );

INSERT INTO
    public."role" (
        id,
        "name",
        active,
        created_by,
        updated_by,
        created_at,
        updated_at
    )
VALUES
(
        '85c82463-bde6-49c5-b341-db7cc7375825',
        'ADMIN',
        1,
        'SYSTEM',
        'SYSTEM',
        CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP
    ),
    (
        '87c47a84-239d-416b-99e4-04eb07cdbe42',
        'USER',
        1,
        'SYSTEM',
        'SYSTEM',
        CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP
    );