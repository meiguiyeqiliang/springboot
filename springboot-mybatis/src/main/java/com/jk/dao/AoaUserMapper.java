package com.jk.dao;




import com.jk.model.AoaUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface AoaUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(AoaUser record);

    int insertSelective(AoaUser record);

    AoaUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(AoaUser record);

    int updateByPrimaryKey(AoaUser record);

    /**
     * 用户列表查询
     * @param aoaUser
     * @return
     */
    public List<Map<String,Object>> userList(AoaUser aoaUser);
}