package com.anabada.neighbor.chat.repository;

import com.anabada.neighbor.chat.domain.Chat;
import com.anabada.neighbor.chat.domain.ChattingMember;
import com.anabada.neighbor.chat.domain.ChattingMessage;
import com.anabada.neighbor.chat.domain.ChattingRoom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChattingRepository {
    ChattingRoom roomCheck(ChattingRoom chattingRoom);

    void insertRoom(ChattingRoom chattingRoom);

    void insertChatMember(long roomId, long memberId);

    void insertMessage(Chat chat);

    String lastMessage(long roomId);

    List<ChattingMessage> chattingMessageList(long roomId, long memberId, long messageId);

    ChattingRoom findChatRoomByRoomId(long roomId);

    List<Long> findChatMemberIdByRoomId(long roomId);

    List<Long> findRoomIdByMemberId(long memberId);

    int check(ChattingMember chattingMember);

    String findTypeByRoomId(long roomId);

    int chatMemberCount(long roomId);

    void chatOutUsed(long roomId, long memberId);

    int checkCreator(long roomId, long memberId);

    void closeRoom(long roomId);

    List<ChattingMember> findChatMemberByRoomId(long roomId);

    String chatMemberStatus(long roomId, long memberId);

    void updateStatus(long roomId);

    long findLineMessageId(long roomId, long memberId);
}
