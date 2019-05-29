package cays.conditional;

/**
 * @ClassName WindowsListService
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/29 14:41
 * @Version 1.0
 **/
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
