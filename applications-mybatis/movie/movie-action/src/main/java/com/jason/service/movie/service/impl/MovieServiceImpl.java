package com.jason.service.movie.service.impl;

import com.jason.service.movie.dto.UserDTO;
import com.jason.service.movie.service.MovieService;
import com.jason.service.movie.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jason
 * @date 2018/10/12
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {

    @Autowired
    private UserFeignService userFeignService;


    @Override
    public String getUserNameByUserId(String userId) {
        return userFeignService.getUserNameByUserId(userId).getUserName();
    }
}
