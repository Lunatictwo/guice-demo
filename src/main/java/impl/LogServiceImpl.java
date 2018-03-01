package impl;

import service.LogService;

public class LogServiceImpl implements LogService {
    @Override
    public void log(String log) {
        System.out.println("-------LOG:" + log);
    }
}
