drop table if exists students;
create table students
(
    id             int primary key auto_increment,
    name           varchar(40)                        not null,
    sex            varchar(1)                         not null comment 'M:男,F:女',
    japanese_score int unsigned                       not null,
    math_score     int unsigned                       not null,
    science_score  int unsigned                       not null,
    society_score  int unsigned                       not null,
    english_score  int unsigned                       not null,
    created_at     datetime default CURRENT_TIMESTAMP not null,
    updated_at     datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
);