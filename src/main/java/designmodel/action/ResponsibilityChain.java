package designmodel.action;

import java.util.ArrayList;
import java.util.List;

public class ResponsibilityChain {
    
    public class Log{
        
    }
    public interface LogProcessor{
        public void log(Log log);
    }
    
    
    public class LogProcessChain{
        List<LogProcessor> logProcessorList = new ArrayList<>();
        
        public void log(Log log){
            for (LogProcessor logProcessor : logProcessorList) {
                logProcessor.log(log);
            }
        }
    }
}
