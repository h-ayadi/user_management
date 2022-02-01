package ma.hay.usermanagement.domain.service;

import ma.hay.usermanagement.domain.dto.UserDto;
import ma.hay.usermanagement.domain.dto.UserResponse;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserResponse getAllUsers(int pageNo, int pageSize, String sortBy, String sortDir);
}
