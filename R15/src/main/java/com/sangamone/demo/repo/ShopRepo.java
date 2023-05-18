package com.sangamone.demo.repo;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sangamone.demo.model.Shop;

public interface ShopRepo extends CrudRepository<Shop, Integer> {

	@Query(value="Select  sum(amount) from transactions where shop_name=?1", nativeQuery=true)
	float findByShopName(String shopName);

}
