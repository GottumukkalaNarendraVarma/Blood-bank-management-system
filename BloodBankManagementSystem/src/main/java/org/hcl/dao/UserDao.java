package org.hcl.dao;

import java.util.List;

import org.hcl.entities.ApproveRequest;
import org.hcl.entities.BloodAvailability;
import org.hcl.entities.DonateBlood;
import org.hcl.entities.RequestBlood;
import org.hcl.entities.User;

public interface UserDao {
	Integer insert(User user);

	Integer insert(BloodAvailability bloodAvailability);

	List<User> getUsers();

	Integer insert(RequestBlood requestBlood);

	Integer insert(DonateBlood donateBlood);

	List<DonateBlood> getDonors();

	Integer insert(ApproveRequest approveRequest);

	List<RequestBlood> getDetails();

}
