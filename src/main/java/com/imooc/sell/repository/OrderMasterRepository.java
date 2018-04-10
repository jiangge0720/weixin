package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jiang-gege
 * 2018/3/2910:46
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String>{

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
