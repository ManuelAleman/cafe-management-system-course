package com.maleman.cafe.service;

import com.maleman.cafe.POJO.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CategoryService {
    ResponseEntity<String> addNewCategory(Map<String, String> requestMap);

    ResponseEntity<List<Category>> getAllCategory(String filterV);

    ResponseEntity<String> updateCategory(Map<String, String> requestMap);
}
