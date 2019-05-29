package cays.conditional;

/**
 * @ClassName LinuxListService
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/29 14:55
 * @Version 1.0
 **/
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
