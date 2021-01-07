package org.hcl.dao;

import java.util.List;

import org.hcl.entities.ApproveRequest;
import org.hcl.entities.BloodAvailability;
import org.hcl.entities.DonateBlood;
import org.hcl.entities.RequestBlood;
import org.hcl.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public Integer insert(User user) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer) session.save(user);
		return i;

	}

	@Transactional
	@Override
	public Integer insert(BloodAvailability bloodAvailability) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer) session.save(bloodAvailability);
		return i;
	}

	@Transactional
	@Override
	public List<User> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from org.hcl.entities.User as u");
		List<User> users = query.list();
		return users;
	}

	@Transactional
	@Override
	public Integer insert(RequestBlood requestBlood) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer) session.save(requestBlood);
		return i;
	}

	@Transactional
	@Override
	public Integer insert(DonateBlood donateBlood) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer) session.save(donateBlood);
		return i;

	}

	@Transactional
	@Override
	public Integer insert(ApproveRequest approveRequest) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer) session.save(approveRequest);
		return i;

	}

	@Transactional
	@Override
	public List<RequestBlood> getDetails() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select r from org.hcl.entities.RequestBlood as r");
		List<RequestBlood> details = query.list();
		return details;

	}

	@Transactional
	@Override
	public List<DonateBlood> getDonors() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select d from org.hcl.entities.DonateBlood as d");
		List<DonateBlood> donors = query.list();
		return donors;

	}
}
