create table tbl_Comment
(
    fld_CommentID   int not null
        constraint tbl_comment_pk
            primary key nonclustered,
    fld_CommentTime date,
    fld_CommentText varchar(30),
    fld_Author      varchar(30)
)
    go

create table tbl_Event
(
    fld_EventID   int not null
        constraint tbl_Event_pk
            primary key nonclustered,
    fld_EventDate date,
    fld_ChapterNo int,
    fld_Role      varchar(30),
    fld_Location  varchar(80),
    fld_QuickNote varchar(130)
)
    go

create table tbl_Note
(
    fld_NoteID   int not null
        constraint tbl_Note_pk
            primary key nonclustered,
    fld_NoteText varchar(2000)
)
    go

create table tbl_EventCard
(
    fld_EventCardID      int not null
        constraint tbl_EventCard_pk
            primary key nonclustered,
    fld_EventName        varchar(30),
    fld_AuthorName       varchar(30),
    fld_EventID          int
        constraint tbl_EventCard_tbl_Event_fld_EventID_fk
            references tbl_Event,
    fld_NoteID           int
        constraint tbl_EventCard_tbl_Note_fld_NoteID_fk
            references tbl_Note,
    fld_CommentID        int
        constraint tbl_EventCard_tbl_Comment_fld_CommentID_fk
            references tbl_Comment,
    fld_PreEventCardID   int,
    fld_AfterEventCardID int,
    fld_EditDate         date
)
    go

create table tbl_User
(
    fld_UserID   int not null
        constraint tbl_User_pk
            primary key nonclustered,
    fld_UserName varchar(30),
    fld_Password varchar(30),
    fld_Identity int default 0
)
    go

