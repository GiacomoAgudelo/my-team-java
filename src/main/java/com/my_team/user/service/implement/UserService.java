package com.my_team.user.service.implement;

import com.my_team.user.model.dto.UserCreateResponseDto;
import com.my_team.user.service.interf.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {
    @Override
    public UserCreateResponseDto createUser() {
        /**
         * Qui viene fatta la logica del secondo livello di controlli (se esiste giù una mail o un username uguale), creazione entity e dto(Mapper)
         */
        return null;
    }
}
