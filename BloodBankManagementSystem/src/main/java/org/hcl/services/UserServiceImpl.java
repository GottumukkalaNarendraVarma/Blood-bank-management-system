package org.hcl.services;

import java.util.List;

import org.hcl.dao.UserDao;
import org.hcl.entities.ApproveRequest;
import org.hcl.entities.BloodAvailability;
import org.hcl.entities.DonateBlood;
import org.hcl.entities.RequestBlood;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Integer addUser(User user) {
		return userDao.insert(user);

	}

	@Override
	public List<User> getAll() {

		return userDao.getUsers();
	}

	@Override
	public Integer addAvailability(BloodAvailability bloodAvailability) {

		return userDao.insert(bloodAvailability);
	}

	@Override
	public Integer addRequest(RequestBlood requestBlood) {
		return userDao.insert(requestBlood);
	}

	@Override
	public Integer addDonate(DonateBlood donateBlood) {
		return userDao.insert(donateBlood);
	}

	@Override
	public List<RequestBlood> showDetails() {
		return userDao.getDetails();
	}

	@Override
	public List<DonateBlood> getDonorDetails() {

		return userDao.getDonors();
	}

	@Override
	public Integer approveRequest(ApproveRequest approveRequest) {
		return userDao.insert(approveRequest);
	}

}
