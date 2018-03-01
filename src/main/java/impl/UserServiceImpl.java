package impl;

import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void process() {
        System.out.println("User srvice process.");
    }
}
