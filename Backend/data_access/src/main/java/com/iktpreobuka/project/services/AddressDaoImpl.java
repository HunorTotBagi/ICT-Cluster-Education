package com.iktpreobuka.project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iktpreobuka.project.entities.AddressEntity;
import com.iktpreobuka.project.repositories.AddressRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
public class AddressDaoImpl implements AddressDao {

	@PersistenceContext
	protected EntityManager em;
	
	@Autowired
	protected AddressRepository addressRepository;

	/*
	 * 
	 * This is currently not working, need fixing
	 * 
	 */
	
	@Override
	public List<AddressEntity> findAddressesByUsername(String username) {
		// TODO Auto-generated method stub

		/*
		 * In SQL this would look like this
		 * 
		 * SELECT a.id, a.city, a.country, a.street, a.version FROM AddressEntity a left
		 * outer UserEntity u WHERE a.id == u.address AND u.usernme == 'username'
		 * 
		 * HQL
		 * 
		 * SELECT a FROM AddressEntity a left join fetch UserEntity u WHERE u.name =
		 * :username
		 * 
		 */

		String sql = "SELECT a" + 
		"FROM AddressEntity a left join fetch a.users u	"
				+ "WHERE u.name = :username";
		Query query = em.createQuery(sql);
		// First param: name of the variable in HQL ; Second param: name of the variable
		// from Java code that is used as filter (from method)
		query.setParameter("username", username);

		List<AddressEntity> result = new ArrayList<>();
		result = query.getResultList();
		return result;
	}

	@Override
	public Iterable<AddressEntity> findAll() {
		return addressRepository.findAll();
	}

	@Override
	public AddressEntity createAddress(String city, String country, String street) {
		AddressEntity newAddress = new AddressEntity();
		newAddress.setCity(city);
		newAddress.setCountry(country);
		newAddress.setStreet(street);
		addressRepository.save(newAddress);
		return newAddress;
	}

}
