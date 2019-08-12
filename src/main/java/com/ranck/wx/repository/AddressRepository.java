package com.ranck.wx.repository;

import com.ranck.wx.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {

//    @Query(nativeQuery = true, value = "SELECT * from address where my_id = :myId")
//    List<Address> findList(@Param("myId") Integer myId);

    // address 应该和实体的Entity name 属性值保持一致
    @Query("SELECT o from address o where o.myId = :myId")
    List<Address> findList(@Param("myId") Integer myId);
//
//    @Query("DELETE FROM Address o where o.myId = :myId and o.friendId = :friendId")
//    Address removeAddressByMyIdAAndFriendId(@Param("myId") Integer myId, @Param("friendId") Integer friendId);

}
