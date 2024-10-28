package com.yuxi.xiao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface PainterRepo extends JpaRepository<Painter, Long> {
}
