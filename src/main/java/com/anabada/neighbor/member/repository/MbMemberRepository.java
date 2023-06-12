package com.anabada.neighbor.member.repository;

import com.anabada.neighbor.member.domain.Member;
import com.anabada.neighbor.used.domain.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface MbMemberRepository extends MemberRepository{

    @Override
    @Select("SELECT * FROM post" +
            " WHERE memberId=#{memberId}" +
            " ORDER BY postId desc" +
            " LIMIT #{criteria.amount} OFFSET #{criteria.offset}")
    List<Post> findMyPost(Map<String,Object> map);

    @Override
    @Select("SELECT count(*) FROM post WHERE memberId=#{memberId}")
    int getTotal(long memberId);

    @Override
    @Insert("insert into member (memberEmail, memberName, memberPWD, address, addressDetail, mbti, providerId, role) values (#{memberEmail}, #{memberName}, #{memberPWD}, #{address}, #{addressDetail}, #{mbti}, #{providerId}, #{role})")
    void save(Member member);

    @Override
    @Insert("insert into member (memberEmail, memberName, memberPWD, providerId, role) values (#{memberEmail}, #{memberName}, #{memberPWD}, #{providerId}, #{role})")
    void saveOAuth(Member member);

    @Override
    @Select("select memberName, memberPWD, providerId, role from member where providerId = #{providerId}")
    Member findByProviderId(String providerId);


    @Override
    @Select("select memberId from member where providerId = #{providerId}")
    long findMemberId(String providerId);

    @Override
    @Select("SELECT * FROM member WHERE memberId=#{memberId}")
    Member findMyInfo(long memberId);//내정보

    @Override
    @Select("SELECT profileImg FROM member WHERE memberId=#{memberId}")
    String findProfileImg(long memberId);
}

