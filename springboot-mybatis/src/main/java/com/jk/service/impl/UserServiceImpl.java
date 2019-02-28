package com.jk.service.impl;


import com.jk.dao.AoaUserMapper;
import com.jk.model.AoaUser;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AoaUserMapper aoaUserMapper;
    @Override
    public List<Map<String, Object>> userList(AoaUser aoaUser) {
        return aoaUserMapper.userList(aoaUser);
    }
}
