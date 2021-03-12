create table web_member(
email varchar2(500) , 
pw varchar2(500) , 
tel varchar2(500) , 
address varchar2(500)
)

select * from web_member;
select * from Message;

create table Message(
num number,
send varchar2(500), 
receive varchar2(500), 
content varchar2(500),
send_date date
)

create sequence num start with 1 increment by 1;

insert into message values(num.nextval,'아이유', '이기성', '이번 주 금요일에 뭐해요?', sysdate);
insert into message values(num.nextval,'마동석', '김동일', '차 빼 이 친구야....', sysdate);



