package com.jk.service;



import com.jk.model.AoaUser;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<Map<String,Object>> userList(AoaUser aoaUser);
}
