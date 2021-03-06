package cays.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @ClassName AwareService
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 21:37
 * @Version 1.0
 **/
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }
    public void outputResult(){
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("classpath:cays/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
