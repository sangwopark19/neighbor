package com.anabada.neighbor.reply.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarryReply {
    private long replyId; //댓글번호
    private long memberId; //멤버아이디
    private long postId; //게시글번호
    private String comment; //댓글
    private Date replyDate; //작성일자
    private Date replyUpdate; //수정일자
    private long parentId; //부모 게시글 번호
    private int depth; //댓글 깊이

    private String memberName;      //닉네임
}
