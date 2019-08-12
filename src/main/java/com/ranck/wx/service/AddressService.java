package com.ranck.wx.service;

import com.ranck.wx.domain.Address;
import com.ranck.wx.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public List<Address> getAddressList (Integer id) {
        return addressRepository.findList(id);
    }

    public Boolean joinAddress (Integer myId, Integer friendId) {
        Address address = new Address();
        address.setMyId(myId);
        address.setFriendId(friendId);
        addressRepository.save(address);
        return true;
    }

//    public Boolean removeAddress (Integer myId, Integer friendId) {
//        addressRepository.removeAddressByMyIdAAndFriendId(myId, friendId);
//        return true;
//    }

}
