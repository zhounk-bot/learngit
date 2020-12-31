package com.example.girl;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GirlService {

    public List<Girl> findByAge(Integer id);


}
