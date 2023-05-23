package com.anabada.neighbor.used.domain;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reply {
    private long replyId; //댓글번호
    private long memberId; //멤버아이디
    private long postId; //게시글번호
    private String comment; //댓글
    private Date replyDate; //작성일자
    private Date replyUpdate; //수정일자
    private long parentId; //부모 게시글 번호
    private int depth; //댓글 깊이
}