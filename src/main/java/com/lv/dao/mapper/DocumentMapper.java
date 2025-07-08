package com.lv.dao.mapper;

import com.lv.bean.entity.Document;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentMapper {
    void insertDoc(Document document);
}
