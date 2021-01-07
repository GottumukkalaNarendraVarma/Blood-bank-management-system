package org.hcl.services;

import java.util.List;

import org.hcl.entities.ApproveRequest;
import org.hcl.entities.BloodAvailability;
import org.hcl.entities.DonateBlood;
import org.hcl.entities.RequestBlood;
import org.hcl.entities.User;

public interface UserService {
	Integer addUser(User user);

	Integer addAvailability(BloodAvailability bloodAvailability);

	List<User> getAll();

	Integer addRequest(RequestBlood requestBlood);

	Integer addDonate(DonateBlood donateBlood);

	List<DonateBlood> getDonorDetails();

	Integer approveRequest(ApproveRequest approveRequest);

	List<RequestBlood> showDetails();

}
